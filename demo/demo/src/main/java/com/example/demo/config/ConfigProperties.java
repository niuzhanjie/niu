//package com.example.demo.config;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
//@Component
//@PropertySource("config.properties")
//public class ConfigProperties {
//
//    @Value("${spring.datasource.jmuv3.jdbc-url}")
//    private String jmuv3Url;
//
//    @Value("${spring.datasource.jmuv3.driver-class-name}")
//    private String jmuv3DriverClassName;
//
//    @Value("${spring.datasource.jmuv3.username}")
//    private String jmuv3Username;
//
//    @Value("${spring.datasource.jmuv3.password}")
//    private String jmuv3Password;
//
//    @Value("${spring.datasource.ccjoin-settlement.jdbc-url}")
//    private String ccjoinSettlementUrl;
//
//    @Value("${spring.datasource.ccjoin-settlement.driver-class-name}")
//    private String ccjoinSettlementDriverClassName;
//
//    @Value("${spring.datasource.ccjoin-settlement.username}")
//    private String ccjoinSettlementUsername;
//
//    @Value("${spring.datasource.ccjoin-settlement.password}")
//    private String ccjoinSettlementPassword;
//
//    @Value("${spring.datasource.ccjoin-settlement.type}")
//    private String ccjoinSettlementType;
//
//    @Value("${spring.datasource.jmu-mp.jdbc-url}")
//    private String jmuMpUrl;
//
//    @Value("${spring.datasource.jmu-mp.driver-class-name}")
//    private String jmuMpDriverClassName;
//
//    @Value("${spring.datasource.jmu-mp.username}")
//    private String jmuMpUsername;
//
//    @Value("${spring.datasource.jmu-mp.password}")
//    private String jmuMpPassword;
//
//    /**
//     * jmuv3Url的取得
//     * 
//     * @return String jmuv3Url
//     */
//    public String getJmuv3Url() {
//        return jmuv3Url;
//    }
//
//    /**
//     * jmuv3Url的设定
//     * 
//     * @param jmuv3Url
//     *            jmuv3Url
//     */
//    public void setJmuv3Url(String jmuv3Url) {
//        this.jmuv3Url = jmuv3Url;
//    }
//
//    /**
//     * jmuv3DriverClassName的取得
//     * 
//     * @return String jmuv3DriverClassName
//     */
//    public String getJmuv3DriverClassName() {
//        return jmuv3DriverClassName;
//    }
//
//    /**
//     * jmuv3DriverClassName的设定
//     * 
//     * @param jmuv3DriverClassName
//     *            jmuv3DriverClassName
//     */
//    public void setJmuv3DriverClassName(String jmuv3DriverClassName) {
//        this.jmuv3DriverClassName = jmuv3DriverClassName;
//    }
//
//    /**
//     * jmuv3Username的取得
//     * 
//     * @return String jmuv3Username
//     */
//    public String getJmuv3Username() {
//        return jmuv3Username;
//    }
//
//    /**
//     * jmuv3Username的设定
//     * 
//     * @param jmuv3Username
//     *            jmuv3Username
//     */
//    public void setJmuv3Username(String jmuv3Username) {
//        this.jmuv3Username = jmuv3Username;
//    }
//
//    /**
//     * jmuv3Password的取得
//     * 
//     * @return String jmuv3Password
//     */
//    public String getJmuv3Password() {
//        return jmuv3Password;
//    }
//
//    /**
//     * jmuv3Password的设定
//     * 
//     * @param jmuv3Password
//     *            jmuv3Password
//     */
//    public void setJmuv3Password(String jmuv3Password) {
//        this.jmuv3Password = jmuv3Password;
//    }
//
//    /**
//     * ccjoinSettlementUrl的取得
//     * 
//     * @return String ccjoinSettlementUrl
//     */
//    public String getCcjoinSettlementUrl() {
//        return ccjoinSettlementUrl;
//    }
//
//    /**
//     * ccjoinSettlementUrl的设定
//     * 
//     * @param ccjoinSettlementUrl
//     *            ccjoinSettlementUrl
//     */
//    public void setCcjoinSettlementUrl(String ccjoinSettlementUrl) {
//        this.ccjoinSettlementUrl = ccjoinSettlementUrl;
//    }
//
//    /**
//     * ccjoinSettlementDriverClassName的取得
//     * 
//     * @return String ccjoinSettlementDriverClassName
//     */
//    public String getCcjoinSettlementDriverClassName() {
//        return ccjoinSettlementDriverClassName;
//    }
//
//    /**
//     * ccjoinSettlementDriverClassName的设定
//     * 
//     * @param ccjoinSettlementDriverClassName
//     *            ccjoinSettlementDriverClassName
//     */
//    public void setCcjoinSettlementDriverClassName(String ccjoinSettlementDriverClassName) {
//        this.ccjoinSettlementDriverClassName = ccjoinSettlementDriverClassName;
//    }
//
//    /**
//     * ccjoinSettlementUsername的取得
//     * 
//     * @return String ccjoinSettlementUsername
//     */
//    public String getCcjoinSettlementUsername() {
//        return ccjoinSettlementUsername;
//    }
//
//    /**
//     * ccjoinSettlementUsername的设定
//     * 
//     * @param ccjoinSettlementUsername
//     *            ccjoinSettlementUsername
//     */
//    public void setCcjoinSettlementUsername(String ccjoinSettlementUsername) {
//        this.ccjoinSettlementUsername = ccjoinSettlementUsername;
//    }
//
//    /**
//     * ccjoinSettlementPassword的取得
//     * 
//     * @return String ccjoinSettlementPassword
//     */
//    public String getCcjoinSettlementPassword() {
//        return ccjoinSettlementPassword;
//    }
//
//    /**
//     * ccjoinSettlementPassword的设定
//     * 
//     * @param ccjoinSettlementPassword
//     *            ccjoinSettlementPassword
//     */
//    public void setCcjoinSettlementPassword(String ccjoinSettlementPassword) {
//        this.ccjoinSettlementPassword = ccjoinSettlementPassword;
//    }
//
//    /**
//     * ccjoinSettlementType的取得
//     * 
//     * @return String ccjoinSettlementType
//     */
//    public String getCcjoinSettlementType() {
//        return ccjoinSettlementType;
//    }
//
//    /**
//     * ccjoinSettlementType的设定
//     * 
//     * @param ccjoinSettlementType
//     *            ccjoinSettlementType
//     */
//    public void setCcjoinSettlementType(String ccjoinSettlementType) {
//        this.ccjoinSettlementType = ccjoinSettlementType;
//    }
//
//    /**
//     * jmuMpUrl的取得
//     * 
//     * @return String jmuMpUrl
//     */
//    public String getJmuMpUrl() {
//        return jmuMpUrl;
//    }
//
//    /**
//     * jmuMpUrl的设定
//     * 
//     * @param jmuMpUrl
//     *            jmuMpUrl
//     */
//    public void setJmuMpUrl(String jmuMpUrl) {
//        this.jmuMpUrl = jmuMpUrl;
//    }
//
//    /**
//     * jmuMpDriverClassName的取得
//     * 
//     * @return String jmuMpDriverClassName
//     */
//    public String getJmuMpDriverClassName() {
//        return jmuMpDriverClassName;
//    }
//
//    /**
//     * jmuMpDriverClassName的设定
//     * 
//     * @param jmuMpDriverClassName
//     *            jmuMpDriverClassName
//     */
//    public void setJmuMpDriverClassName(String jmuMpDriverClassName) {
//        this.jmuMpDriverClassName = jmuMpDriverClassName;
//    }
//
//    /**
//     * jmuMpUsername的取得
//     * 
//     * @return String jmuMpUsername
//     */
//    public String getJmuMpUsername() {
//        return jmuMpUsername;
//    }
//
//    /**
//     * jmuMpUsername的设定
//     * 
//     * @param jmuMpUsername
//     *            jmuMpUsername
//     */
//    public void setJmuMpUsername(String jmuMpUsername) {
//        this.jmuMpUsername = jmuMpUsername;
//    }
//
//    /**
//     * jmuMpPassword的取得
//     * 
//     * @return String jmuMpPassword
//     */
//    public String getJmuMpPassword() {
//        return jmuMpPassword;
//    }
//
//    /**
//     * jmuMpPassword的设定
//     * 
//     * @param jmuMpPassword
//     *            jmuMpPassword
//     */
//    public void setJmuMpPassword(String jmuMpPassword) {
//        this.jmuMpPassword = jmuMpPassword;
//    }
//
//}