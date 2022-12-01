package tdit.utils;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String path=System.getProperty("user.dir");
		String filepath="\\src\\test\\resources\\TestData1\\TestData.xlsx";
		String fullpath=path+filepath;
		System.out.println(fullpath);
		
		
		ExcelReader excelreader=new ExcelReader("AddAccount");
		
                Object[][] obj=excelreader.getAllData();
               
	
	}
}
