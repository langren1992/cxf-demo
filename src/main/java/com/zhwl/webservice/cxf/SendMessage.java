package com.zhwl.webservice.cxf;

import java.util.List;
import java.util.Map;

public interface SendMessage {
	
	/** 
	 * @Title: sendMessage 
	 * @Description: 一条消息，一个模板(这里用一句话描述这个方法的作用) 
	 * @Author zhonghua
	 * @param @param phoneNumber
	 * @param @return    设定文件 
	 * @return boolean    返回类型 
	 * @throws 
	 */ 
	public boolean onePhoneOneContent(String phoneNumber,String content);
	
	/** 
	 * @Title: morePhonesOneContent 
	 * @Description: 多消息，一模板(这里用一句话描述这个方法的作用) 
	 * @Author zhonghua
	 * @param @param phoneNumbers
	 * @param @param content
	 * @param @return    设定文件 
	 * @return boolean    返回类型 
	 * @throws 
	 */ 
	public boolean morePhonesOneContent(List<String> phoneNumbers,String content);
	
	/** 
	 * @Title: morePhonesMoreContents 
	 * @Description: 多消息，多模板(这里用一句话描述这个方法的作用) 
	 * @Author zhonghua
	 * @param @param phoneNumber
	 * @param @param content
	 * @param @return    设定文件 
	 * @return boolean    返回类型 
	 * @throws 
	 */ 
	public boolean morePhonesMoreContents(Map<String, String> messages);

}
