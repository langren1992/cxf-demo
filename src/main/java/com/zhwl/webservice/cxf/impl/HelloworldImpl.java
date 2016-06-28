package com.zhwl.webservice.cxf.impl;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.zhwl.webservice.cxf.Helloworld;

@WebService(endpointInterface="com.zhwl.webservice.cxf.Helloworld",serviceName = "Helloworld")
public class HelloworldImpl implements Helloworld {

	public String sayhello(@WebParam(name = "username") String username) {
		JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
        svr.setServiceClass(Helloworld.class);
        svr.setAddress("http://localhost:8080/cxf-demo/webservice/helloWorld");
        Helloworld hw = (Helloworld) svr.create();
        System.out.println(hw.sayhello("111111111"));
		return "say hello " + username;
	}

}
