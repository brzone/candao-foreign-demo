package com.candao.foreign.demo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * @author Jone Li
 *
 * @Date 2016年8月8日 下午6:09:51
 */
public class Md5Util {
	/**
	 * 32位md5加密
	 * @param str
	 */
	public static String get32MD5(String str) {
		StringBuilder buf = new StringBuilder("");
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte b[] = md.digest();

			int i;

			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return buf.toString();// 32位的加密
	}
}
