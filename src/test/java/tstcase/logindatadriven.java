package tstcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.login;
import utilit.xlutils;

public class logindatadriven extends base {
	@Test(dataProvider="logindata")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		login lp= new login(driver);
lp.setUsername();
Thread.sleep(3000);

lp.setPassword();
Thread.sleep(3000);
	lp.ClickLoginbtn();
	}
	@DataProvider(name="logindata")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\tstdata\\logindata.xlsx";

		int rownum=xlutils.getRowCount(path, "Sheet1");
		int colcount=xlutils.getCellCount(path,"Sheet1",1);

		String logindata[][]=new String[rownum][colcount];

		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=xlutils.getCellData(path,"Sheet1", i,j);//1 0
			}

		}
		return logindata;
	}
}

