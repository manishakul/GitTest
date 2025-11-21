package PagesCode;

import Utilities.Utils;
import org.example.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userid;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement login;


    @FindBy(xpath = "//div//a[@id='item_4_title_link']")
    WebElement listitem;

    public PageLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void dologin(String username, String pass)  {
        userid.sendKeys(username);
        password.sendKeys(pass);
        login.click();
       // Utils.scroll(driver);
        listitem.click();
    }

}
