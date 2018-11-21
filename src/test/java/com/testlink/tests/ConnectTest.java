package com.testlink.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import br.eti.kinoshita.testlinkjavaapi.TestLinkAPI;

public class ConnectTest {
	
	
	@Test
	public void connectTestlink() throws MalformedURLException {
		//api访问的url是固定格式，前面host部分换成你自己的就可以
		//devKey就是第一篇文章介绍的用户下点击new一个access token
		String testlink_Url = "http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
		String devKey = "e078360962c574959d0c1022ac461a27";
		
		//将字符串的url转换成URL对象
		URL testlinkURL = new URL(testlink_Url);
		//调用TestLinkAPI构造方法，这两个参数就是上面的url和devKey
		//api是一个TestLinkAPI对象，这个对象是我们操作testlink的核心部分
		//接下来用到的所有API都是这个api发起调用的
		TestLinkAPI api = new TestLinkAPI(testlinkURL,devKey);
		System.out.println(api.ping());
	}

}
