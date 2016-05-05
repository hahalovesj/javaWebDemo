package com.javastudy.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
//使用GSON提供的API高效的实现JSON数据的创建，包括构建JSON对象与JSON数组。

public class CreateJson {

	public static void main(String[] args) {

		//添加第一个对象
		JsonObject object = new JsonObject();
		object.addProperty("cat", "it");
	    //添加数组
		JsonArray array = new JsonArray();
		JsonObject lan1 = new JsonObject();
		lan1.addProperty("id", 1);
		lan1.addProperty("ide","eclipse");
		lan1.addProperty("name","java");
		array.add(lan1);
		
		JsonObject lan2 = new JsonObject();
		lan2.addProperty("id", 2);
		lan2.addProperty("ide","xcode");
		lan2.addProperty("name","swift");
		array.add(lan2);
		
		JsonObject lan3 = new JsonObject();
		lan3.addProperty("id", 3);
		lan3.addProperty("ide","Visual Studio");
		lan3.addProperty("name","C#");
		array.add(lan3);
		
		object.add("languanges", array);
		//添加最后一个对象
		object.addProperty("pop", "true");
		
		//输出json对象，使用toString
		System.out.println(object.toString());
	}
	

}
