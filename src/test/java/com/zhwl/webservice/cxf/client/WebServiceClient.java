package com.zhwl.webservice.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.zhwl.webservice.cxf.Helloworld;

public class WebServiceClient {
	
	public static void main(String[] args) {
        JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
        svr.setServiceClass(Helloworld.class);
        svr.setAddress("http://localhost:8080/cxf-demo/webservice/helloWorld");
        Helloworld hw = (Helloworld) svr.create();
        System.out.println(hw.sayhello("111111111"));
	}

}
