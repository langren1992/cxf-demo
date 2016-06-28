package com.zhwl.webservice.cxf.server;

import javax.xml.ws.Endpoint;

import com.zhwl.webservice.cxf.impl.HelloworldImpl;

public class WebServiceApp {

	public static void main(String[] args) {
		System.out.println("web service start");
		HelloworldImpl implementor = new HelloworldImpl();
		String address = "http://localhost:8080/helloworld";
		Endpoint.publish(address, implementor);
		System.out.println("web service started");
	}

}
