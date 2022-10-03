package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName-value")
    WebElement userNameValue;

    @FindBy(id = "submit")
    WebElement lorOutBurron;

    public ProfilePage verifyUsername(String userName) {
        if(userNameValue.getText().equalsIgnoreCase(userName)) {
            System.out.println("Correst user name: " + userNameValue.getText());
        }else{
            System.out.println("Incorrect user name: "+userNameValue.getText());
        }
        return this;
    }

    public LoginPage logOut() {
        click(lorOutBurron);
        return new LoginPage(driver);
    }
}
