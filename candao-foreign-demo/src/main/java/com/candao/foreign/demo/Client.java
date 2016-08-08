package com.candao.foreign.demo;

import java.util.Arrays;

import com.candao.foreign.demo.bean.Context;
import com.candao.foreign.demo.bean.Req;
import com.google.gson.Gson;

/**
 * 测试
 * @author Jone Li
 *
 * @Date 2016年8月8日 下午6:22:26
 */
public class Client {
	
	private static Gson gson = new Gson();

	public static void main(String[] args) {
		
		//json中的context参数
		Context context = new Context();
		context.setIds(Arrays.asList(1,2,3));
		context.setStoreId(1);
		context.setFlag(true);
		
		//data中的总json
		Req req = new Req();
		req.setServiceIdName("EProduct");
		req.setActionId(4);
		req.setContent(context);
		//参数都设置ok，便初始化sign值
		req.setSign();
		
		String url = "http://qc.can-dao.com:180/ForeignAction?data=" + gson.toJson(req);
		System.out.println("url:" + url);
		String result = HttpUtil.get(url);
		//解析result即可
		System.out.println(result);
		
		System.out.println("--------------------------------------------------------- ");
	}
}
