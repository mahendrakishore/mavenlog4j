package com.AutomationPractice;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	static Logger log = Logger.getLogger(Login.class.getName());
	
	WebDriver driver  ;
	
	String url = "http://automationpractice.com/index.php";
	
	WebElement signin = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
	WebElement creatAccout = driver.findElement(By.xpath(".//*[@id='SubmitCreate']"));
	WebElement newEmail = driver.findElement(By.xpath(".//*[@id='email_create']"));
	WebElement alrEmail = driver.findElement(By.xpath(".//*[@id='email']"));
	WebElement alrPassword = driver.findElement(By.xpath(".//*[@id='passwd']"));
	WebElement alrSignIn = driver.findElement(By.xpath(".//*[@id='SubmitLogin']"));
	public void clickOnSignIn(){
		log.info("click on signin");
		signin.click();
	}
	
	public void enterEmailAddress(String email){
		log.info("click on email ");
		newEmail.sendKeys(email);
		
	}
	
	public void alreadyRegisterEmail(String id){
		log.info("enter email");
		alrEmail.sendKeys(id);
	}
	public void alrRegisteredPassword(String pass){
		log.info("enter pass");
		alrPassword.sendKeys(pass);
	}
	public void alrSignedIn(){
		log.info("already regester sign in");
		alrSignIn.click();
	}
}
