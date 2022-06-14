package com.TestLayer;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.multiwindos;





public class multiwindosTest extends BaseClass {
	private multiwindos mw;
	
	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();
	} 
	
	@Test (priority=1)
	public void unameIsDisplayed(){
		mw=new multiwindos();
		Assert.assertEquals(mw.unametextboxdisplayed(), true);
	}
	
	@Test(priority=2)
	public void unameIsEnabled(){
		Assert.assertEquals(mw.unametextboxEnabled(), true);
	}
	
	@Test(priority=3)
	public void unameTextbox(){
		mw.unametextbox("nikhil");
	}
	
	@Test (priority=4)
	public void passIsDisplayed(){
		Assert.assertEquals(mw.passtextboxdisplayed(), true);
	}
	
	@Test(priority=5)
	public void passIsEnabled(){
		Assert.assertEquals(mw.passtextboxEnabled(), true);
	}
	
	@Test(priority=6)
	public void passTextbox(){
		mw.passtextbox("nikhil123");
	}
	
	@Test(priority=7)
	public void submitBtn(){
		mw.submitbtn();
		Assert.assertEquals(driver.getCurrentUrl().contains("New"), true);
	}
	
	@Test(priority=8) 
	public void newWindowBtn(){
		driver.navigate().back();
		mw.newWindowFramebtn();
		Assert.assertEquals(driver.getTitle(), "Multiple Window code");
	}

}
