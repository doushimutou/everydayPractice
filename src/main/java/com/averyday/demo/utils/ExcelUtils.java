package com.averyday.demo.utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Description
 * Author ayt  on
 */
public class ExcelUtils {

	static String path = "D:\\learn\\everydayPractice\\src\\main\\java\\com\\averyday\\demo\\utils\\测试报告模板.xlsx";
	//总行数
	static Integer rowNum = 0;
	//总列数
	private static Integer columnuNum = 0;
	//列的名字
	private static String[] columnuName;

	public static HashMap<Integer, String[]> readExcel(XSSFSheet sheet ,Integer n ) throws Exception {
		HashMap<Integer, String[]> hashMap = new HashMap<>();
		rowNum = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowNum - 1; i++) {
			XSSFRow hssfRow = sheet.getRow(i);
			columnuNum = hssfRow.getPhysicalNumberOfCells();
			columnuName = new String[columnuNum];
			int finalI = i;
			hssfRow.cellIterator().forEachRemaining(cell -> {
				columnuName[cell.getColumnIndex()] = cell.toString();
				try {
					//第一行数据不做修改
					if (finalI >0){
						columnuName[7] = String.valueOf(change(columnuName[7]));
					}

				} catch (ParseException e) {
					e.printStackTrace();
				}
			});
			hashMap.put(i, columnuName);
		}
		return hashMap;
	}
	public static void  write(HashMap<Integer, String[]> hashMap){


	}

	public static Long change(String s) throws ParseException {
		Date dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
		return dateFormat.getTime();
	}

	public static void main(String[] args) throws Exception {
		File file = new File(path);
		FileInputStream fileInputStream = new FileInputStream(path);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(0);
		readExcel(sheet);
		FileOutputStream outputStream = new FileOutputStream(path);


	}

	private static void readExcel(XSSFSheet sheet) {
	}


}
