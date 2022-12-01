package tditsolutions.DataProvider;

import org.testng.annotations.DataProvider;

import tdit.utils.ExcelReader;

public class DataProvideClass {
	
	@DataProvider
	public Object[][]createAccount(){
		
		ExcelReader reader=new ExcelReader("AddAccount");
		return reader.getAllData();

}
	
	@DataProvider
	public Object [][]CreateAddSecurity(){
		
		ExcelReader Reader=new ExcelReader("AddSecurity");
		return Reader.getAllData();
	}
}