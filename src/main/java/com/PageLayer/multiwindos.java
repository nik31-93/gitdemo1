package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.Baseclass;



public class multiwindos extends Baseclass {
	@FindBy (id="name")
	WebElement username;
	
	@FindBy (id="pass")
	WebElement password;
	
	@FindBy (linkText="submit")
	WebElement submit;
	
	@FindBy (linkText="New Window Frame")
	WebElement New_Window_Frame;
	
	public multiwindos(){
		PageFactory.initElements(driver, this);
	}
	
	// for username textbox
	public boolean unametextboxdisplayed(){
		return username.isDisplayed();
	}
	
	public boolean unametextboxEnabled(){
		return username.isEnabled();
	}
	
	public void unametextbox(String name){
		username.sendKeys(name);
	}
	
	// for password textbox
	public boolean passtextboxdisplayed(){
		return password.isDisplayed();
	}
	
	public boolean passtextboxEnabled(){
		return password.isEnabled();
	}
	
	public void passtextbox(String pass){
		password.sendKeys(pass);
	}
	
	// for submit link
	public void submitbtn(){
		submit.click();
	}
	
	// for new window frame link
	public void newWindowFramebtn(){
		New_Window_Frame.click();
	}

}
