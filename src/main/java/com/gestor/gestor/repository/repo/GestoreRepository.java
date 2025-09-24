package com.gestor.gestor.repository.repo;

import com.gestor.gestor.repository.entity.Gestore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public interface GestoreRepository extends JpaRepository<Gestore, Long> {
    @Query(value = """
        SELECT
            GES.REGIONAL AS regional,
            COUNT(1) AS cantidad,
            SUM(CASE WHEN ALT.COMISIONA = 'NO' THEN 0 ELSE TAR.TARIFA END) AS monto,
            SUM(CASE WHEN ALT.COMISIONA = 'NO' THEN 0 ELSE TAR.TARIFA END) * 0.3 AS comisionNueva,
            SUM((TAR.TARIFA * 0.3) - (CASE WHEN ALT.COMISIONA = 'NO' THEN 0 ELSE TAR.TARIFA END) * 0.3) AS penalizacion
        FROM
            COMGES_ALTA_SERVICIO ALT
            INNER JOIN COMGES_SERVICIO_TARIFAS TAR ON ALT.ID_SERVICIO_TARIFA = TAR.ID_SERVICIO_TARIFA
            INNER JOIN COMGES_GESTORES GES ON ALT.ID_GESTOR = GES.ID_CLIENTE
        WHERE
            TAR.TARIFA > 0
            AND GES.ID_CLIENTE NOT IN ('1000','171311487','171064362')
            AND ALT.FECHA_INSTALACION_INS LIKE CONCAT('%', :fecha, '%')
            AND GES.FECHA_BAJA IS NULL
        GROUP BY GES.REGIONAL
        ORDER BY GES.REGIONAL
        """, nativeQuery = true)
    List<Object[]> consultaReporte(@Param("fecha") String fecha);
}
