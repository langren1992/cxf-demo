package com.zhwl.webservice.cxf.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ctc.smscloud.json.JSONHttpClient;
import com.zhwl.webservice.cxf.SendMessage;

public class SendMessageImpl implements SendMessage{
	
	private static final Log LOG = LogFactory.getLog(SendMessageImpl.class);
	private static String account = "dh8528";// 用户名（必填）
	private static String password = "***.com";// 密码（必填）
	public static String sign = "【中骅国际物流】"; // 短信签名（必填）
	public static String subcode = "85281234"; // 子号码（选填）
	public static String msgid = ""; // 短信id，查询短信状态报告时需要，（可选）
	public static String sendtime = ""; // 定时发送时间（可选）

	@Override
	public boolean onePhoneOneContent(String phoneNumber, String content) {
		JSONHttpClient jsonHttpClient = JSONHttpClient.getInstance("wt.3tong.net");
		String sendSms = jsonHttpClient.sendSms(account, password, phoneNumber, content, sign, subcode);
		return false;
	}

	@Override
	public boolean morePhonesOneContent(List<String> phoneNumbers,
			String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean morePhonesMoreContents(Map<String, String> messages) {
		// TODO Auto-generated method stub
		return false;
	}

}