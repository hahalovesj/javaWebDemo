package com.javastudy.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TestGet {

	public static void main(String[] args) {
		new ReadByGet().start();

	}

}

class ReadByGet extends Thread {
	public void run() {

		try {
			URL url = new URL(
					//以有道词典API为例子
					"http://fanyi.youdao.com/openapi.do?keyfrom=jkxy-test-shane&key=1597200659&type=data&doctype=xml&version=1.1&q=welcome");
			URLConnection connection = url.openConnection();
			InputStream is = connection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			StringBuilder builder = new StringBuilder();
			while ((line = br.readLine()) != null) {
				builder.append(line);
			}
			br.close();
			isr.close();
			is.close();

			System.out.println(builder.toString());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}