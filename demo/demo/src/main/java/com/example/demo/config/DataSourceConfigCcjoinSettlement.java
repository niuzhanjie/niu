//package com.example.demo.config;
//
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.env.Environment;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//@Configuration
//@MapperScan(basePackages = "com.jmu.ccjoin.dao.ccjoinSettlement", sqlSessionFactoryRef = "sqlSessionFactoryCcjoinSettlement")
//public class DataSourceConfigCcjoinSettlement {
//
//    @Autowired
//    private Environment env;
//
//    @Bean(name = "ccjoinSettlement")
//    @ConfigurationProperties(prefix = "spring.datasource.ccjoin-settlement")
//    public DataSource dataSourceCcjoinSettlement() {
//        // 使用DBCP2数据源(在配置文件配置所使用的数据源类型)
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "sqlSessionFactoryCcjoinSettlement")
//    public SqlSessionFactory createSqlSessionFactory(@Qualifier("ccjoinSettlement") DataSource ds) throws Exception {
//
//        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
//        fb.setDataSource(ds);
//
//        fb.setTypeAliasesPackage(env.getProperty("spring.mybatis.typeAliasPackage"));
//        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("spring.mybatis.mapper.ccjoinSettlement")));
//
//        return fb.getObject();
//    }
//
//    @Bean(name = "transactionManagerCcjoinSettlement")
//    @Primary
//    public DataSourceTransactionManager transactionManager(@Qualifier("ccjoinSettlement") DataSource ds) throws Exception {
//        return new DataSourceTransactionManager(ds);
//    }
//}