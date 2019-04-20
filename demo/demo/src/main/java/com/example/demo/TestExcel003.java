package com.example.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel003 {

    public static void main(String[] args) {

        FileInputStream in = null;  
        FileOutputStream out = null;
        //定义一个Workbook对象
        Workbook wb = null;  
        String IN_WORKBOOK_NAME = "D:/read.xlsx";
        String OUT_WORKBOOK_NAME = "D:/read.xlsx";

        try {  
            in = new FileInputStream(IN_WORKBOOK_NAME);  
            //输入流传入wb对象
            wb = new XSSFWorkbook(in);
            //如果是xls文件，则new HSSFWorkbook(in);
            //获取sheet
            Sheet sheet = wb.getSheetAt(0);
            int firstRow = sheet.getFirstRowNum();
            int lastRow = sheet.getLastRowNum();
            int rownum = 0;
            String str = null;
            //字符串拼接
            for(int i=firstRow;i<=lastRow;i++) {
            	int j=1;
                //获取行
                Row row = sheet.getRow(i);
                //获取单元格
                Cell cell = row.getCell(0);//第一列
                Cell cell1 = row.getCell(1);//第二列
                try {
                    //获取单元格的值
                    str = cell.getStringCellValue(); //第一列的值
                 String   str1=cell1.getStringCellValue();//第二列的值
                    String[] datas=str1.split("\n");//按照换行将第二列的值分割
                    for (String string : datas) {//遍历分割之后的数组
						String[] data2=string.split("-|\\.|\\s");
						
						   Row row2 = sheet.getRow(rownum);//从第一行开始获取
				              //如果获取不到现有的行，就新建一行
				              if(row2==null) {
				                  row2=sheet.createRow(rownum);
				              }
				              Cell cell2 = row2.getCell(2);//第三列
				              Cell cell3 = row2.getCell(3);//第四列
				              Cell cell4 = row2.getCell(4);//第五列
				              Cell cell5 = row2.getCell(5);//第6列
				              Cell cell6 = row2.getCell(6);//第7列
				              //同理
				              if(cell2==null) {
				                  cell2 = row2.createCell(2);
				              }  
				              if(cell3==null) {
				                  cell3 = row2.createCell(3);
				              } 
				              if(cell4==null) {
				                  cell4 = row2.createCell(4);
				              }
				              if(cell5==null) {
				                  cell5 = row2.createCell(5);
				              }
				              if(cell6==null) {
				                  cell6 = row2.createCell(6);
				              }
				              cell2.setCellValue(string);//赋值第二列
				              cell3.setCellValue(str);
				              cell4.setCellValue(j);
				              cell5.setCellValue(data2[0]);
				              cell6.setCellValue(data2[1]);
				              j++;
				              rownum++;
					}
                    
                    
                } catch (NullPointerException e) {
                    //如果单元格为空，就跳过此次循环
                    continue;
                }               
             
            }
            //先关闭输入流，再new一个输出流
            in.close(); 
            out = new FileOutputStream(OUT_WORKBOOK_NAME);
            //再用wb写到输出流
            wb.write(out);
            out.close();
        } catch (IOException e) {  
            System.out.println(e.toString());  
        }  finally {  
           try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        }  

        System.out.println("====================操作成功====================");  
    }
}

