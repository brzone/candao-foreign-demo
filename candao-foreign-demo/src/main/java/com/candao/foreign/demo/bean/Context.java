package com.candao.foreign.demo.bean;

import java.util.List;

/**
 * 请求的context内容
 * @author Jone Li
 *
 * @Date 2016年8月8日 下午6:20:54
 */
public class Context {
	private List<Integer> ids ;
	private int storeId  ;
	private boolean flag ;
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Context [ids=" + ids + ", storeId=" + storeId + ", flag=" + flag + "]";
	}
}
