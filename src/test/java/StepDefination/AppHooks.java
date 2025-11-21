package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.Base;
import org.openqa.selenium.WebDriver;

public class AppHooks  {
   public Base base;
   private WebDriver driver;

   @Before
   public void setup(){
       base=new Base();
       driver= base.init();
       driver.get(" https://www.saucedemo.com/v1");
   }
@After
    public void teardown(){
       driver.close();
}
}
