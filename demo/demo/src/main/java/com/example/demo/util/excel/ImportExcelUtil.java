package com.example.demo.util.excel;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import io.micrometer.core.instrument.util.StringUtils;

public class ImportExcelUtil {

	public static void  exportInfos(List<?> dataList,String fileName,Class<?> em,Object infoEntity,
			HttpServletRequest request,HttpServletResponse response) {
		
		if(em.isEnum()) {
			try {
				Method method=em.getMethod("values");
				Object[] objs=(Object[]) method.invoke(null);
				Method getKey=em.getMethod("getKey");
				Method getValue=em.getMethod("getValue");
				Workbook wb=new HSSFWorkbook();
				Sheet st=wb.createSheet(fileName);
				Row row=st.createRow(0);
				for(int i=0;i<objs.length;i++) {//设置表头信息
					st.setColumnWidth(i, 30*256);
					Cell cell=row.createCell(i);
					cell.setCellValue((String)getKey.invoke(objs[i]));
				}
				st.createFreezePane(0,1,0,1);//冻结首行
				if(dataList !=null && dataList.size()>0) {
					for(int i=0;i<dataList.size();i++) {
						Row rowForData=st.createRow(i+1);
						for(int j=0;j<objs.length;j++) {
							Cell cell=rowForData.createCell(j);
							String s=null;
							s=ClassUtil.getValueFormEntity((String)getValue.invoke(objs[j]), dataList.get(i), infoEntity.getClass());
							cell.setCellValue(s);
						}
					}
				}
				exportFileType(fileName,wb,request,response);
			}  catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public  static void exportFileType(String fileName,Workbook wb,HttpServletRequest request,HttpServletResponse response) {
		if(StringUtils.isNotEmpty(fileName)) {
			fileName+=".xls";
		}else {
			fileName+="TestFile.xls";
		}
		 try {
			// 输出Excel文件
			 OutputStream output = response.getOutputStream();
			 response.reset();
			 // 设置文件头
			 response.setHeader("Content-Disposition",
			 "attchement;filename=" + new String(fileName.getBytes("gb2312"), "ISO8859-1"));
			 response.setContentType("application/msexcel");
			 wb.write(output);
			 wb.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		
	}
	
	
	
}
