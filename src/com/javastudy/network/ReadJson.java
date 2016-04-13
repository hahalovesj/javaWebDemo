package com.javastudy.network;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

//极客学院 java基础，7 网络通信 之 java中的json操作。
//通过引入JSON外部库，实现在 Java 语言中高效解析JSON 格式数据，包括 JSON 对象与JSON 数组的处理方法。


public class ReadJson {


public static void main(String[] args) {
	
	JsonParser parser = new JsonParser();
	try {
		//处理json对象
		JsonObject object = (JsonObject) parser.parse(new FileReader("test.json"));
		System.out.println("cat="+object.get("cat").getAsString());
		System.out.println("pop="+object.get("pop").getAsBoolean());
		//处理json数组
		JsonArray array = object.get("languages").getAsJsonArray();
		for(int i=0;i<array.size();i++){
			System.out.println("------------------------");
			JsonObject subObject = array.get(i).getAsJsonObject();
			System.out.println("id="+subObject.get("id").getAsInt());
			System.out.println("ide="+subObject.get("ide").getAsString());
			System.out.println("name="+subObject.get("name").getAsString());
		}		
		
		
	} catch (JsonIOException e) {
		e.printStackTrace();
	} catch (JsonSyntaxException e) {
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}