package com.candao.foreign.demo;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;


/**
 * http请求工具类
 * @author Jone Li
 *
 * @Date 2016年8月8日 下午5:19:03
 */
public class HttpUtil {
	
	public static String get(String url){
		GetMethod getMethod = null;
		try {
			// 构造HttpClient的实例
			HttpClient httpClient = new HttpClient();
			
			getMethod = new GetMethod(url);
			// 执行getMethod
			int statusCode = httpClient.executeMethod(getMethod);
			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + getMethod.getStatusLine());
			}
			// 读取内容
			byte[] responseBody = getMethod.getResponseBody();
			return new String(responseBody);
		} catch (HttpException e) {
			// 发生致命的异常，可能是协议不对或者返回的内容有问题
			e.printStackTrace();
		} catch (IOException e) {
			// 发生网络异常
			e.printStackTrace();
		} finally {
			// 释放连接
			if (getMethod != null) {
				getMethod.releaseConnection();
			}
		}
		return null;
	}

}
