package com.javastudy.advance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//极客学院，java基础，4 语言进阶，java集合类，collection常用子类：List，Set，Queue
//List常用子类：ArrayList，Vector；掌握List的应用，掌握List的子类实例化。
public class ListDemo1 {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		
		List a1 = new ArrayList();
		a1.add(0, "a");
		a1.add(1, "b");
		System.out.println(a1);
		
		//TODO LinkList 学习
		List<String> l2 = new LinkedList<String>();// 利用LinkedList类实例化List集合
		
		List<String> lists = new ArrayList<String>();// 利用ArrayList类实例化List集合			
		 
		//增加list某个元素
		lists.add("A");
		lists.add("B");
		lists.add("C");
		for(int i =0; i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		System.out.println("------删除之后----");
		//删除list中某个元素
		lists.remove(0);
		for(int i =0; i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		//集合是否为空
		System.out.println("集合是否为空："+lists.isEmpty());
		//返回此列表第一次出现指定元素的索引，若此列表不包含指定元素，则返回－1
		System.out.println("B是否存在："+lists.indexOf("B")+"序列");
	}

}
