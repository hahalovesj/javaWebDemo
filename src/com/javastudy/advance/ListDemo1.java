package com.javastudy.advance;

import java.util.ArrayList;
import java.util.List;
//极客学院，java基础，4 语言进阶，java集合类，
//掌握List的应用，掌握List的子类实例化。
public class ListDemo1 {

	public static void main(String[] args) {
		List<String> lists = null;
		lists = new ArrayList();		
		lists.add("A");
		lists.add("B");
		for(int i =0; i<lists.size();i++){
			System.out.println(lists.get(i));
		}
		
	}

}
