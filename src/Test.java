import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utility.BaseDriver.driver;


public class Test {

    @org.junit.Test
    public void DemoWebShop(){

        driver.get("https://demowebshop.tricentis.com/");

        NegativeTest.SingUpNegativeTest();

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

        NegativeTest.LognInNegativeTest();

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

        MyFunction.Wait(1);

        WebElement electronic= driver.findElement(By.linkText("Electronics"));
        electronic.click();

        MyFunction.Wait(1);

        WebElement cellphone= driver.findElement(By.xpath("//a[@title='Show products in category Cell phones']"));
        cellphone.click();

        MyFunction.Wait(1);

        WebElement smartphone= driver.findElement(By.linkText("Smartphone"));
        smartphone.click();

        MyFunction.Wait(1);

        WebElement addtocart= driver.findElement(By.id("add-to-cart-button-43"));
        addtocart.click();

        MyFunction.Wait(1);

        WebElement shoppingcart = driver.findElement(By.className("ico-cart"));
        shoppingcart.click();

        WebElement country = driver.findElement(By.id("CountryId"));
        country.click();

        Select countryselect = new Select(country);
        countryselect.selectByValue("77");

        WebElement postalcode=driver.findElement(By.name("ZipPostalCode"));
        postalcode.sendKeys("01000");

        WebElement agreebutton= driver.findElement(By.id("termsofservice"));
        agreebutton.click();

        MyFunction.Wait(1);

        WebElement checkout= driver.findElement(By.id("checkout"));
        checkout.click();

        MyFunction.Wait(1);

        WebElement continuebutton=driver.findElement(By.xpath("//input[@title='Continue']"));
        continuebutton.click();

        MyFunction.Wait(1);

        WebElement adressselect=driver.findElement(By.name("shipping_address_id"));
        adressselect.sendKeys("New Address");


        WebElement country2= driver.findElement(By.id("ShippingNewAddress_CountryId"));
        country2.click();

        Select countryselect2 = new Select(country2);
        countryselect2.selectByValue("77");

        WebElement city= driver.findElement(By.id("ShippingNewAddress_City"));
        city.sendKeys("Adana");

        WebElement adress1= driver.findElement(By.id("ShippingNewAddress_Address1"));
        adress1.sendKeys("hürriyet mahallesi Adana/Turkey");

        WebElement postalcode1= driver.findElement(By.id("ShippingNewAddress_ZipPostalCode"));
        postalcode1.sendKeys("01000");

        WebElement phonenumber= driver.findElement(By.id("ShippingNewAddress_PhoneNumber"));
        phonenumber.sendKeys("05446675434");

        MyFunction.Wait(1);

        WebElement continuebutton2=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        continuebutton2.click();

        MyFunction.Wait(1);

        WebElement continuebutton3=driver.findElement(By.cssSelector("[onclick='ShippingMethod.save()']"));
        continuebutton3.click();

        MyFunction.Wait(1);

        WebElement continuebutton4=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        continuebutton4.click();

        MyFunction.Wait(1);

        WebElement continuebutton5=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        continuebutton5.click();

        MyFunction.Wait(1);

        WebElement confirmbutton=driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        confirmbutton.click();

        MyFunction.Wait(1);

        WebElement orderdetails= driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div > div > div.page-body.checkout-data > div > ul > li:nth-child(2) > a"));
        orderdetails.click();

        MyFunction.Wait(1);

        WebElement pdf=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div > div > div.page-title > a.button-2.pdf-order-button"));
        pdf.click();



    }
}
