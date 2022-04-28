package com.padre.reportescotizadortelcel_v2.poi;

import com.padre.reportescotizadortelcel_v2.domain.CotizacionesFuerzaVentaDat;
import com.padre.reportescotizadortelcel_v2.domain.DetalleCotizacionDats;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.ReflectionUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CreateExcel {

    public void writeExcel(List<Object> objectList, String excelFilePath) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        int rowCount = 0;

        for (Object list : objectList) {
            Row row = sheet.createRow(++rowCount);
            writeBook(list, row);
        }

        try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
            workbook.write(outputStream);
        }
    }

    private void writeBook(Object object, Row row) {

        final int[] valueCell = {1};
        ReflectionUtils.doWithFields(object.getClass(), field -> {
            field.setAccessible(true);
            Cell cell = row.createCell(valueCell[0]);
            cell.setCellValue(String.valueOf(field.get(object)));
            valueCell[0]++;
        });
    }
}
