package com.qa.util;

import java.net.MalformedURLException;
import java.net.URL;
import com.qa.base.TestBase;
import br.eti.kinoshita.testlinkjavaapi.TestLinkAPI;


public class TestlinkUtil {
	
	/**
	 * 连接testlink方法
	 */
	public static TestLinkAPI connect() {
		
		TestBase base = new TestBase();
		
		String url = base.prop.getProperty("TestLinkUrl");
	    String devKey = base.prop.getProperty("DEVKEY");
	    TestLinkAPI api = null;
	     
	    URL testlinkURL = null;
	     
	    try {
	            testlinkURL = new URL(url);
	    } catch ( MalformedURLException mue )   {
	            mue.printStackTrace( System.err );
	            System.exit(-1);
	    }
	     
	    try {
	    	
	           api = new TestLinkAPI(testlinkURL, devKey);
	           
	    } catch( Exception te) {
	            te.printStackTrace( System.err );
	            System.exit(-1);
	    }
	     
	    System.out.println(api.ping());
		return api;
	}
	
}
