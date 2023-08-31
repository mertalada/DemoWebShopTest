import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;

public class NegativeTest {
    @Test
    public static void LognInNegativeTest(){

        driver.get("https://demowebshop.tricentis.com/");


        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();

        WebElement email = driver.findElement(By.name("Email")); //Mail kutusu boş
        email.click();

        WebElement password = driver.findElement(By.name("Password")); //password kutusu boş
        password.click();

        WebElement loginbtn = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginbtn.click();


        MyFunction.Wait(3);
         LoginNegativeTest2();
         MyFunction.Wait(3);
         LoginNegativeTest3();
         MyFunction.Wait(3);
         LoginNegativeTest4();
         MyFunction.Wait(3);
    }

    @Test
        public static void LoginNegativeTest2(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();

        WebElement email = driver.findElement(By.name("Email"));
        email.sendKeys("testingteam4@outlook.com");

        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("");

        WebElement loginbtn = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginbtn.click();

    }

    @Test
        public static void LoginNegativeTest3(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();

        WebElement email=driver.findElement(By.name("Email"));
        email.click();

        WebElement password= driver.findElement(By.name("Password"));
        password.sendKeys("Testing.123");

        WebElement loginbtn=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginbtn.click();

    }

    @Test
    public static void LoginNegativeTest4(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement login= driver.findElement(By.className("ico-login"));
        login.click();

        WebElement email=driver.findElement(By.name("Email"));
        email.sendKeys("testingteam4@outlook.com");

        WebElement password= driver.findElement(By.name("Password"));
        password.sendKeys("team456");

        WebElement loginbtn=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        loginbtn.click();


    }


}
