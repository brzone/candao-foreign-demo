package com.candao.foreign.demo.bean;

import com.candao.foreign.demo.Md5Util;
import com.google.gson.Gson;

/**
 * 
 * @author Jone Li
 *
 * @Date 2016年8月8日 下午5:44:49
 */
public class Req {
	
	private static final Gson gson = new Gson();
	
	public final String accessKey = RequestConstant.ACCESSKEY;
	
	private String serviceIdName;
	
	private int actionId;
	
	private String sign ;
	
	/**先阶段就设置为99*/
	private int clientType = 99;
	
	/**0为简体中文*/
	private int langType = 0;
	
	/**Api版本号，设置为1.0即可*/
	private String clientVersion = "1.0";
	
	private String content;
	
	public String getServiceIdName() {
		return serviceIdName;
	}
	public void setServiceIdName(String serviceIdName) {
		this.serviceIdName = serviceIdName;
	}
	public int getActionId() {
		return actionId;
	}
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	public String getSign() {
		return  this.sign; 
	}
	
	public void setSign() {
		this.sign = Md5Util.get32MD5(accessKey + serviceIdName + RequestConstant.SECRET + content);;
	}
	public int getClientType() {
		return clientType;
	}
	public void setClientType(int clientType) {
		this.clientType = clientType;
	}
	public int getLangType() {
		return langType;
	}
	public void setLangType(int langType) {
		this.langType = langType;
	}
	public String getClientVersion() {
		return clientVersion;
	}
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}
	public String getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = gson.toJson(content);
	}
	@Override
	public String toString() {
		return "Req [accessKey=" + accessKey + ", serviceIdName=" + serviceIdName + ", actionId=" + actionId + ", sign="
				+ sign + ", clientType=" + clientType + ", langType=" + langType + ", clientVersion=" + clientVersion
				+ ", content=" + content + "]";
	}
	
}
