package com.bjpowernode.mybatis.mapper;

import com.bjpowernode.mybatis.pojo.cpCheckFile;
import com.bjpowernode.mybatis.pojo.cpCheckFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cpCheckFileMapper {
    long countByExample(cpCheckFileExample example);

    int deleteByExample(cpCheckFileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(cpCheckFile record);

    int insertSelective(cpCheckFile record);

    List<cpCheckFile> selectByExample(cpCheckFileExample example);

    cpCheckFile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") cpCheckFile record, @Param("example") cpCheckFileExample example);

    int updateByExample(@Param("record") cpCheckFile record, @Param("example") cpCheckFileExample example);

    int updateByPrimaryKeySelective(cpCheckFile record);

    int updateByPrimaryKey(cpCheckFile record);
}