package com.qrs.springmvc.tools;

import java.util.UUID;

public class CommonUtils {
	/**
	 * 获取uuid
	 * @return
	 */
	public static String getUUid(){
//		UUID uuid = UUID.randomUUID();
//		byte[] data = DigestUtils.md5(uuid.toString());
//		String str = new String(Hex.encodeHex(data,false));
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
}
