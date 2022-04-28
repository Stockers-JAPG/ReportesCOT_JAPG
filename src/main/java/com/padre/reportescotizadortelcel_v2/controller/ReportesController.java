package com.padre.reportescotizadortelcel_v2.controller;

import com.padre.reportescotizadortelcel_v2.domain.CotizacionesFuerzaVentaDat;
import com.padre.reportescotizadortelcel_v2.domain.DetalleCotizacionDats;
import com.padre.reportescotizadortelcel_v2.mapper.CotizacionesFuerzaVentaDatMapper;
import com.padre.reportescotizadortelcel_v2.poi.CreateExcel;
import com.padre.reportescotizadortelcel_v2.util.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/getReports")
public class ReportesController {

    private CotizacionesFuerzaVentaDatMapper cotizacionesFuerzaVentaDatMapper;

    public ReportesController(CotizacionesFuerzaVentaDatMapper cotizacionesFuerzaVentaDatMapper){
        this.cotizacionesFuerzaVentaDatMapper=cotizacionesFuerzaVentaDatMapper;
    }

    private CreateExcel CreateExcel = new CreateExcel();

    @GetMapping("/all_1")
    public List<CotizacionesFuerzaVentaDat> getCotizacionesFuerzaVentaDat() throws IOException {
        List<CotizacionesFuerzaVentaDat> list = cotizacionesFuerzaVentaDatMapper.findCotizacionesFuerzaVentaDat();
        String excelFilePath = "CotizacionesFuerzaVentaDat.xls";
        List<Object> listObject = Utils.convertObjectToList(list);
        CreateExcel.writeExcel(listObject, excelFilePath);
        return list;
    }

    @GetMapping("/all_2")
    public List<DetalleCotizacionDats> getDetalleCotizacionDats() throws IOException {
        List<DetalleCotizacionDats> list = cotizacionesFuerzaVentaDatMapper.findDetalleCotizacionDats();
        String excelFilePath = "DetalleCotizacionDats.xls";
        List<Object> listObject = Utils.convertObjectToList(list);
        CreateExcel.writeExcel(listObject, excelFilePath);
        return list;
    }


}
