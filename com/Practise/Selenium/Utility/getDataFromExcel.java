package com.Practise.Selenium.Utility;

import java.util.ArrayList;

public class getDataFromExcel {
	static ExcelAPI excelapi;
	
	public static ArrayList<Object[]> getTestdata()
	{
		ArrayList<Object[]> testdata= new ArrayList<Object[]>();
		try
		{
			 excelapi= new ExcelAPI("F:\\Workspace_Selenium\\NovemberSelenium\\FacebookReg.xlsx");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 for (int rownum=2; rownum<=excelapi.getRowCount("RegisterData"); rownum++)
		 {
			 String firstname=excelapi.getCellData("RegisterData", "firstname", rownum);
			 String surname=excelapi.getCellData("RegisterData", "surname", rownum);
			 String email=excelapi.getCellData("RegisterData", "email", rownum);
			 String password=excelapi.getCellData("RegisterData", "password", rownum);
			 String gender=excelapi.getCellData("RegisterData", "gender", rownum);
			 String dob=excelapi.getCellData("RegisterData", "dob", rownum);
			 Object []ob ={firstname,surname,email,password,gender,dob};
			 testdata.add(ob);
		 }
		 return testdata;
	}

}
