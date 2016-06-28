package com.zhwl.webservice.cxf;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Helloworld {
	
	public String sayhello(@WebParam(name = "username") String username);

}
