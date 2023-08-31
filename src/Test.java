import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;


public class Test {

    @org.junit.Test
    public void DemoWebShop(){

        driver.get("https://demowebshop.tricentis.com/");

        WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        MyFunction.Wait(2);
        WebElement cinsiyet= driver.findElement(By.xpath("//input[@id='gender-male']"));
        cinsiyet.click();

        MyFunction.Wait(2);
        WebElement firstName= driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Team");

        MyFunction.Wait(2);
        WebElement lastName= driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Dört");

        MyFunction.Wait(2);
        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("testingteam4@outlook.com");

        MyFunction.Wait(2);
        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        String sifre="Testing.123";
        password.sendKeys(sifre);

        MyFunction.Wait(2);
        WebElement confirmPassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys(sifre);

        MyFunction.Wait(2);
        WebElement registerBtn=driver.findElement(By.xpath("//input[@id='register-button']"));
        registerBtn.click();

        MyFunction.Wait(2);
        WebElement devamBtn=driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
        devamBtn.click();

        MyFunction.Wait(1);


        WebElement logOut= driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
        logOut.click();

        MyFunction.Wait(1);

        WebElement logIn= driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
        logIn.click();

        MyFunction.Wait(2);
        email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("testingteam4@outlook.com");

        MyFunction.Wait(2);
        WebElement pswrd= driver.findElement(By.cssSelector("#Password"));
        pswrd.sendKeys("Testing.123");

        MyFunction.Wait(1);
        WebElement logInLast= driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
        logInLast.click();








    }
}
