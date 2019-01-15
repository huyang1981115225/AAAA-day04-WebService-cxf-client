package cn.tedu.client;

import cn.tedu.ws.HelloWS;
import cn.tedu.ws.HelloWSImplService;
/**
 * 演示CXF版WebService
 * @author HY
 *
 */
public class ClientTest {
	public static void main(String[] args) {
		HelloWSImplService factory = new HelloWSImplService();
		HelloWS helloWS = factory.getHelloWSImplPort();
		
		String name = "CXF";
		String result = helloWS.sayHello(name);
		System.out.println(result);
		
		Integer age = 28;
		result = helloWS.introduce(name, age);
		System.out.println(result);
		
	}
}
