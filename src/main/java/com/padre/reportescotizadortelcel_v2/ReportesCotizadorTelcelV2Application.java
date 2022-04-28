package com.padre.reportescotizadortelcel_v2;

import com.padre.reportescotizadortelcel_v2.domain.CotizacionesFuerzaVentaDat;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(CotizacionesFuerzaVentaDat.class)
@MapperScan("com.padre.reportescotizadortelcel_v2.mapper")
@SpringBootApplication
public class ReportesCotizadorTelcelV2Application {

    public static void main(String[] args) {
        SpringApplication.run(ReportesCotizadorTelcelV2Application.class, args);
    }

}
