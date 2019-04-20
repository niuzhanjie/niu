package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StudentEntity;

@Component
public interface StudentMapper {

	List<StudentEntity> getAll();
	
//	@Select("SELECT * FROM student")
//	@Results({
//		@Result(property = "id",  column = "id"),
//		@Result(property = "ages",  column = "ages"),
//		@Result(property = "sex",  column = "sex"),
//		@Result(property = "name", column = "name")
//	})
//	List<StudentEntity> getAll();
//	
//	  @Select("SELECT * FROM student WHERE id = #{id}")
//	    @Results({
//	    	@Result(property = "id",  column = "id"),
//			@Result(property = "ages",  column = "ages"),
//			@Result(property = "sex",  column = "sex"),
//			@Result(property = "name", column = "name")
//	    })
//	  StudentEntity getOne(Integer id);
//
//	    @Insert("INSERT INTO student(name,sex,ages) VALUES(#{name}, #{sex}, #{ages})")
//	    void insert(StudentEntity user);
//
//	    @Update("UPDATE student SET sex=#{sex},ages=#{ages} WHERE id =#{id}")
//	    void update(StudentEntity user);
//
//	    @Delete("DELETE FROM student WHERE id =#{id}")
//	    void delete(Integer id);
	
}
