package com.example.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Test {

public static void main(String[] args) {

	entitySort2();
}



/**
 * 对象多属性升序，降序排序
 */
private static void entitySort2(){
 
    //Student 的 list 集合
    List<Student> students = new ArrayList<>();
    students.add(new Student("张三",90,180,"电气学院","北京"));
    students.add(new Student("李四",80,165,"计算机学院","上海"));
    students.add(new Student("王五",91,170,"财经学院","上海"));
    students.add(new Student("赵明",80,182,"计算机学院","北京"));
    students.add(new Student("钱海",75,181,"计算机学院","广州"));
    students.add(new Student("孙理",82,172,"财经学院","上海"));
    students.add(new Student("周伟",90,168,"电气学院","广州"));
    students.add(new Student("郑亮",80,178,"财经学院","广州"));
 
    System.out.println("原始数据：");
    students.forEach(s ->{
      System.out.println(s.getName()+" "+ s.getScore()+" "+s.getHeight()+" "+s.getCollege()+""+s.getAddress());});
// 
//    System.out.println("按照分数降序排序,当分数相同时, 按照身高升序排序");
//    students.sort(comparing(Student::getScore).reversed().thenComparing(Student::getHeight));
//    students.forEach(s ->{
//      System.out.println(s.getName()+" "+ s.getScore()+" "+s.getHeight()+" "+s.getCollege()+""+s.getAddress());});
 
    System.out.println("按照分数降序排序,当分数相同时, 按照身高降序排序");
    Collections.sort(students, new Comparator<Student>()
    {
        public int compare(Student student1, Student student2)
        {
            if(student1.getScore().equals(student2.getScore())){
                return student2.getHeight() - student1.getHeight();
            }else{
                return student2.getScore() - student1.getScore();
            }
        }
    });
 
    students.forEach(s ->{
      System.out.println(s.getName()+" "+ s.getScore()+" "+s.getHeight()+" "+s.getCollege()+""+s.getAddress());});

}
}
