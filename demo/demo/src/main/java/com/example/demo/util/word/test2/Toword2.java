//package com.example.demo.util.word.test2;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.URLEncoder;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Required;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@Controller
//public class Toword2 {
//
//	/**
//     * 下载协议到word模板
//     */
//    @RequestMapping("/downloadtest")
//    public String downloadtest( HttpServletRequest request, HttpServletResponse response) {
//        //数据赋值
//        Map<String, Object> dataMap = new HashMap<String, Object>();
//        dataMap.put("userName", "seawater");  
//  	  
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");  
////        dataMap.put("data", sdf.format(new Date()));  
////  
////        dataMap.put("content", "freeMark生成Word文档段落内容");  
////  
////        List<Map<String, Object>> listInfo = new ArrayList<Map<String, Object>>();  
////        for (int i = 1; i <= 10; i++) {  
////            Map<String, Object> map = new HashMap<String, Object>();  
////            map.put("title", "标题" + i);  
////            map.put("content", "内容" + i);  
////            map.put("author", "作者" + i);  
////            listInfo.add(map);  
////        }  
////        dataMap.put("listInfo", listInfo);  
//
//        String templateName = "test.ftl";
//        String filePath = "E:\\modelfile";
//        String fileName = "Test.doc";
//        try {
//            FreemarkerUtil.createWord(dataMap, templateName, filePath, fileName,response);//数据和模板合并生成word
//
//            //下载文件
//            // 本地资源路径
//            String localPath = filePath;
//            // 数据库资源地址
//            String downloadPath = "E:/modelfile/Test.doc";
//            // 下载名称
//            File file = new File(downloadPath);
//            String filename="Test.doc";
//            // 将文件写入输入流
//            FileInputStream fileInputStream = new FileInputStream(file);
//            InputStream fis = new BufferedInputStream(fileInputStream);
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer);
//            fis.close();
//
//            // 清空response
//            response.reset();
//            // 设置response的Header
//            response.setCharacterEncoding("UTF-8");
//            //Content-Disposition的作用：告知浏览器以何种方式显示响应返回的文件，用浏览器打开还是以附件的形式下载到本地保存
//            //attachment表示以附件方式下载   inline表示在线打开   "Content-Disposition: inline; filename=文件名.mp3"
//            // filename表示文件的默认名称，因为网络传输只支持URL编码的相关支付，因此需要将文件名URL编码后进行传输,前端收到后需要反编码才能获取到真正的名称
//            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
//            // 告知浏览器文件的大小
//            response.addHeader("Content-Length", "" + file.length());
//            OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
//            response.setContentType("application/octet-stream");
//            outputStream.write(buffer);
//            outputStream.flush();
//            outputStream.close();
//                                     
//    //        response.setCharacterEncoding("utf-8");
//   //         response.setContentType("multipart/form-data");
////            response.setHeader("Content-Disposition",
////                    "attachment;fileName=" + FileUtils.setFileDownloadHeader(request, downloadName));
////            FileUtils.writeBytes(downloadPath, response.getOutputStream());
//    //        response.setHeader("Content-Disposition","attachment;filename*=utf-8'zh_cn'"+ URLEncoder.encode(fileName,"utf-8"));
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("文件下载失败");
//        }
//        return "index";
//    }
//
//    //处理特殊字符 增加换行
//    public String handleData(String data) {
//        data = data.replaceAll("&", "&amp;")
//                .replaceAll("<", "&lt;").replaceAll(">", "&gt;")
//                .replaceAll("<LF>", "&lt;LF&gt;<w:p></w:p>");
//        return data;
//    }
//}
