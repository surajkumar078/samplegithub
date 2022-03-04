package testpackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mainpackage.MainClass;
import objectpackage.PageObject;
@Listeners(listenerpackage.TestNGListeners.class)
public class TestClass extends MainClass{
@Test
	public void search() throws Exception
	{
	    logger=extent.startTest("search");
        PageObject obj=new PageObject(driver);
		obj.data();
	}
}
