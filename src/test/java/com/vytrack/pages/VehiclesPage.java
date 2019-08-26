package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage extends NavigationBar {

    public VehiclesPage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css = "input[type='number']")
    public WebElement pageCount;

    public WebElement gridSettingsCheckbox(String header) {
        String xpath = "//label[.='"+header+"']/../../td[last()]/input";
        return Driver.get().findElement(By.xpath(xpath));
    }

}









