package com.example.demo.util;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @Description:
 * @Author: Hanzao
 * @Date: 2022/03/24/22:21
 */
public class CreateJava {
    public static void main(String[] args) {
        String url= "jdbc:mysql://10.255.6.203:3306/demo?useUnicode=true";
        String username = "yonyouadmin";
        String password = "yl2sOVHT2mtPVBxj";
        //        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.POSTGRE_SQL);
//        dataSourceConfig.setDriverName("org.postgresql.Driver");
//        dataSourceConfig.setUsername("postgres");
//        dataSourceConfig.setPassword("12345678qq");
//        dataSourceConfig.setUrl("jdbc:postgresql://10.255.0.113:5432/chanjet_pay_union?autosave=conservative");
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("SJQUの魂") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\ce"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.baomidou") // 设置父包名
                            .moduleName("FATHER") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D:\\ce\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("sys_job") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}


