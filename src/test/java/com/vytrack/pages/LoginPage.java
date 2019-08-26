package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name="_username")
    public WebElement username;

    @FindBy(name="_password")
    public WebElement password;

    @FindBy (id = "_submit")
    public WebElement submit;


    public void login(String usernameStr, String passwordStr){
        username.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
        submit.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        wait.until(ExpectedConditions.titleIs("Dashboard"));

    }

}
