package com.example.demo.util.word.test2;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

public class FreemarkerUtil {
    /**
     * 生成word文件
     * @param dataMap word中需要展示的动态数据，用map集合来保存
     * @param templateName word模板名称，例如：model.ftl
     * @param filePath 文件生成的目标路径，例如：E:\\freemarker
     * @param fileName 生成的文件名称，例如：Test.doc
     */   public static void createWord(Map dataMap, String templateName, String filePath, String fileName, HttpServletResponse response) {
        try {
            //创建配置实例
            Configuration configuration = new Configuration();

            //设置编码
            configuration.setDefaultEncoding("utf-8");

            //ftl模板文件
            configuration.setClassForTemplateLoading(FreemarkerUtil.class, "/");

            //获取模板
            Template template = configuration.getTemplate(templateName);

            //输出文件
            File outFile = new File(filePath + File.separator + fileName);

            //如果输出目标文件夹不存在，则创建
            if (!outFile.getParentFile().exists()) {
                outFile.getParentFile().mkdirs();
            }
          //  OutputStream output = response.getOutputStream();
            //将模板和数据模型合并生成文件
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"));
          

            //生成文件
            template.process(dataMap, out);

            //关闭流
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
