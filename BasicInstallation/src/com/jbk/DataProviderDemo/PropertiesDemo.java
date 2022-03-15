package com.jbk.DataProviderDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		 FileInputStream fis = new FileInputStream("abcd.properties");
		 Properties properties = new Properties();
		 properties.load(fis);
		 String val=properties.getProperty("url");
		 System.out.println("val>>"+val);
		 Properties prop= new Properties();
		 prop.put("uname", "kiran@gmail.com");
		 prop.put("password", "123456");
		 Set<Object> s= prop.keySet();
		 Iterator<Object> itr= s.iterator();
		 while( itr.hasNext()) {
			 
			String str=(String) prop.get((String) itr.next());
			System.out.println(str);
		 }
		 
	}

}
