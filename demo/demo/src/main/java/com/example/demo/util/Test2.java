package com.example.demo.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import com.example.demo.util.reflect.Student;

public class Test2 {

public static void main(String[] args) {
	List<TestEntity> list1=new ArrayList<TestEntity>();
	TestEntity en1=new TestEntity();
	en1.setName("one");
	
	TestEntity en2=new TestEntity();
	en2.setName("two");
	
	TestEntity en3=new TestEntity();
	en3.setName("three");
	List<String> strList=new ArrayList<String>();
	strList.add("threeList");
	en3.setIds(strList);
	
	list1.add(en1);
	list1.add(en2);
	list1.add(en3);
	
	
	List<TestEntity> list2=new ArrayList<TestEntity>();
	TestEntity en4=new TestEntity();
	en4.setName("one");
	List<String> strList2=new ArrayList<String>();
	strList2.add("oneList");
	en4.setIds(strList2);	
	
	TestEntity en5=new TestEntity();
	en5.setName("two");
	List<String> strList3=new ArrayList<String>();
	strList3.add("twoList");
	en5.setIds(strList3);
	
	list2.add(en4);
	list2.add(en5);
//	List<TestEntity> l = getData(list1,list2);
//	System.out.print(l);
//	System.out.print(getData2(list1,list2));
	System.out.print(getData3(list1,list2));

}
public static List<TestEntity> getData(List<TestEntity>list1,List<TestEntity> list2) {
	 List<TestEntity> list = new ArrayList<>();
	for(int i=0;i<list1.size();i++) {

	  String name1 = 	list1.get(i).getName();
	  for (int j = 0; j < list2.size(); j++) {
		  String name2 = list2.get(j).getName();
		   if(name1.equals(name2)) {
//			list2
		   }
		  
		 
	}
	  
	}
	return list;
	
}
public static  List<TestEntity> getData2(List<TestEntity>list1,List<TestEntity> list2) {
	
	 List<TestEntity> list = new ArrayList<>();
	 list2.addAll(list1);
//	 list = list2.stream().distinct().collect(Collectors.toList());
	 //System.out.println(list1);
	 list2.stream().forEach(
             p -> {
                 if (!list.contains(p)) {
                	 list.add(p);
                 }
             }
     );

	return list;
}
public static List<TestEntity> getData3(List<TestEntity>list1,List<TestEntity> list2){
	Map<String,TestEntity> map = new HashMap<>();
	list1.forEach(l -> {
		map.put(l.getName(), l);
	});
	list2.forEach(l -> {
		map.put(l.getName(), l);
	});
	return map.values().stream().collect(Collectors.toList());
}

}
