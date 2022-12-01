package tdit.utils;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropConfig {
	
	
	Properties prop;
	
	public static PropConfig propconfig1;
	
	
	
	private PropConfig() {
		
	}

	
	
	public static PropConfig getInstance() {
		
		if(propconfig1==null) {
			propconfig1=new PropConfig();
			return propconfig1;
		}
		else {
			return propconfig1;
		}
	}
	
	
	
		
		public static Properties load_prop(String env) throws IOException
		{
			String fullPath="";
			if(env.equals("QA"))
			{
			System.out.println(System.getProperty("user.dir"));
			String basePath = System.getProperty("user.dir");
			 fullPath = basePath + "\\src\\main\\resources\\config\\qa_configra.properties";
			System.out.println(fullPath);
			                            
			}
			else if (env.equals("UAT"))
			{
				System.out.println(System.getProperty("user.dir"));
				String basePath = System.getProperty("user.dir");
				 fullPath = basePath + "\\src\\main\\resources\\config\\uat_configra.properties";
				System.out.println(fullPath);  
			} 
			
			FileReader file = new FileReader(new File(fullPath));
			Properties prop =new Properties();
			prop.load(file);
			return prop;
		
//		System.out.println(System.getProperty("user.dir"));
//		String basepath=System.getProperty("user.dir");
//		String fullpath=basepath+"\\src\\test\\resources\\testdata\\TestData.xlsx";
//		File file=new File(fullpath);
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		Properties prop=new Properties();
//		prop.load(fis);
//		return prop;
	}

}
