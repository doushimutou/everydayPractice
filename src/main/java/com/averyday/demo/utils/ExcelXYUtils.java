//package com.averyday.demo.utils;
//
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.ss.util.CellAddress;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Map;
//
///**
// * Description
// * Author ayt  on
// */
//public class ExcelXYUtils {
//	static String path = "D:\\learn\\everydayPractice\\src\\main\\java\\com\\averyday\\demo\\utils\\测试报告模板.xlsx";
//
//	public static void main(String[] args) {
//
//	}
//	public void writeletter () throws IOException {
//		FileInputStream excelFileInputStream = new FileInputStream(path);
//		XSSFWorkbook workbook = new XSSFWorkbook(excelFileInputStream);
//		excelFileInputStream.close();
//		XSSFSheet sheet = workbook.getSheetAt(0);
//
//		for (Map.Entry<String, String> entry :  letter.Info.entrySet()) {//map映射<坐标>:<数据>
//			CellAddress address = new CellAddress(entry.getKey());
//			XSSFRow row = sheet.getRow(address.getRow());//得到行
//			XSSFCell cell = row.getCell(address.getColumn());//得到列
//
//			cell.setCellValue(entry.getValue());//改变数据
//		}
//		CellAddress address = new CellAddress("C17");//这样的构造方法可以直接拿到对应行和列下标
//		FileOutputStream excelFileOutPutStream = new FileOutputStream(fout);//写数据到这个路径上
//		workbook.write(excelFileOutPutStream);
//		excelFileOutPutStream.flush();
//		excelFileOutPutStream.close();
//
//
//	}
//}
