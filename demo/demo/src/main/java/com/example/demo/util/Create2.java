//package com.example.demo.util;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.annotation.FieldFill;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.po.TableFill;
//import com.baomidou.mybatisplus.generator.config.rules.DateType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
//import java.util.ArrayList;
//
///**
// * @Author nzj
// * @Date 2024/3/15 15:01
// */
//
//
//
//
//
//// 代码自动生成器
//
//public class Create2 {
//
//    public static void main(String[] args) {
//
//        // 需要构建一个 代码自动生成器 对象
//
//        AutoGenerator mpg = new AutoGenerator();
//
//
//
//        // 配置策略
//
//        // 1、全局配置
//
//        GlobalConfig gc = new GlobalConfig();
//
//        String projectPath = System.getProperty("user.dir");//user.dir获取当前工程的根目录
//
//        gc.setOutputDir( "D:\\ce");//输出目录
//
//        gc.setAuthor("XXX");
//
//        gc.setOpen(false);//是否打开资源管理器
//
//        gc.setFileOverride(false);//是否覆盖
//
//
//
//        // 默认的service接口都是I开头
//
//        gc.setServiceName("%sService"); //去掉I
//
//
//
//        gc.setIdType(IdType.AUTO);//主键策略，默认即可
//
//        gc.setDateType(DateType.ONLY_DATE);
//
//        gc.setSwagger2(true); //是否开启Swagger2
//
//        mpg.setGlobalConfig(gc);
//
//
//
//        //2、设置数据源（这里指定需要绑定的数据库）
//
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.POSTGRE_SQL);
//        dataSourceConfig.setDriverName("org.postgresql.Driver");
//        dataSourceConfig.setUsername("postgres");
//        dataSourceConfig.setPassword("12345678qq");
//        dataSourceConfig.setUrl("jdbc:postgresql://10.255.0.113:5432/chanjet_pay_union?autosave=conservative");
//
//        mpg.setDataSource(dataSourceConfig);
//
//
//
//        //3、包的配置
//
//        PackageConfig pc = new PackageConfig();
//
//        //只需要改实体类名字 和包名 还有 数据库配置即可
//
//        pc.setModuleName("blog");
//
//        pc.setParent("com.guohui");//生成com.guohui.blog
//
//        //各个包名
//
//        pc.setEntity("entity");
//
//        pc.setMapper("mapper");
//
//        pc.setService("service");
//
//        pc.setController("controller");
//
//        mpg.setPackageInfo(pc);
//
//
//
//        //4、策略配置
//
//        StrategyConfig strategy = new StrategyConfig();
//
//        strategy.setInclude("cp_un_order"); // 重点！！！这里绑定对应的表，多个表名用 , 隔开
//
//
//
//        // 设置要映射的表名
//
//        strategy.setNaming(NamingStrategy.underline_to_camel); //表的行，下划线转驼峰
//
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//表的列，下划线转驼峰
//
//        // 自动lombok；
//
//        strategy.setEntityLombokModel(true);
//
//        //配置逻辑删除的字段
//
//        strategy.setLogicDeleteFieldName("deleted");
//
//
//
//        // 自动填充配置
//
//        //创建表和更新表的时间自动填充
//
//        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
//
//        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
//
//        ArrayList<TableFill> tableFills = new ArrayList<>();
//
//        tableFills.add(gmtCreate);
//
//        tableFills.add(gmtModified);
//
//        strategy.setTableFillList(tableFills);
//
//
//
//        // 乐观锁
//
//        strategy.setVersionFieldName("version");
//
//        strategy.setRestControllerStyle(true);//开启RestFul风格驼峰命名
//
//        strategy.setControllerMappingHyphenStyle(true); //访问时候，支持Localhost:8080/hello_id_2
//
//        mpg.setStrategy(strategy);
//
//
//
//        mpg.execute(); //执行
//
//    }
//
//}
//
//
//
