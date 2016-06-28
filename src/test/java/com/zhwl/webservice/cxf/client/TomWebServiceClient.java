package com.zhwl.webservice.cxf.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhwl.webservice.cxf.Helloworld;

public class TomWebServiceClient {
	
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application.xml");
        Helloworld client = (Helloworld)ac.getBean("client");
        System.out.println(client.sayhello("00000000"));
	}

}
