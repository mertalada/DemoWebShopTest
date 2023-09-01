import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
        email.sendKeys("testingdeneme2@outlook.com");

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
        WebElement email1 = driver.findElement(By.xpath("//input[@id='Email']"));
        email1.sendKeys("testingdeneme2@outlook.com");

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

        WebElement adressselect=driver.findElement(By.name("billing_address_id"));
        adressselect.sendKeys("New Address");

        WebElement country0= driver.findElement(By.name("BillingNewAddress.CountryId"));
        country0.click();

        Select countryselect4 = new Select(country0);
        countryselect4.selectByValue("77");

        WebElement city0= driver.findElement(By.cssSelector("#BillingNewAddress_City"));
        city0.sendKeys("Adana");

        WebElement adress0= driver.findElement(By.id("BillingNewAddress_Address1"));
        adress0.sendKeys("hürriyet mahallesi Adana/Turkey");

        WebElement postalcode0= driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        postalcode0.sendKeys("01000");

        WebElement phonenumber0= driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phonenumber0.sendKeys("05446675434");

        MyFunction.Wait(1);

        WebElement continuebutton0=driver.findElement(By.xpath("//input[@title='Continue']"));
        continuebutton0.click();

        MyFunction.Wait(1);

        WebElement continuebutton01=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        continuebutton01.click();

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

        MyFunction.Wait(1);

        WebElement computers= driver.findElement(By.linkText("Computers"));
        computers.click();

        MyFunction.Wait(1);

        WebElement notebooks= driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.sub-category-grid > div:nth-child(2) > div > div > a > img"));
        notebooks.click();

        MyFunction.Wait(1);

        WebElement laptop= driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div.page.category-page > div.page-body > div.product-grid > div > div > div.details > h2 > a"));
        laptop.click();

        WebElement addtocart2= driver.findElement(By.id("add-to-cart-button-31"));
        addtocart2.click();

        MyFunction.Wait(1);

        WebElement shoppingcart2=driver.findElement(By.className("ico-cart"));
        shoppingcart2.click();

        MyFunction.Wait(1);

        WebElement coupon = driver.findElement(By.name("discountcouponcode"));
        coupon.sendKeys("kupondeneme");

        WebElement applycoupon=driver.findElement(By.name("applydiscountcouponcode"));
        applycoupon.click();

        MyFunction.Wait(1);

        WebElement giftcart= driver.findElement(By.name("giftcardcouponcode"));
        giftcart.sendKeys("hediyekartıdeneme");

        MyFunction.Wait(1);

        WebElement addgiftcart= driver.findElement(By.name("applygiftcardcouponcode"));
        addgiftcart.click();

        MyFunction.Wait(1);

        WebElement Country1 = driver.findElement(By.id("CountryId"));
        Country1.click();

        Select countryselect3 = new Select(Country1);
        countryselect3.selectByValue("77");

        WebElement postalcode3=driver.findElement(By.name("ZipPostalCode"));
        postalcode3.sendKeys("01000");

        WebElement agreebutton3= driver.findElement(By.id("termsofservice"));
        agreebutton3.click();

        MyFunction.Wait(1);

        WebElement checkout3= driver.findElement(By.id("checkout"));
        checkout3.click();

        MyFunction.Wait(1);

        WebElement adressselect1=driver.findElement(By.name("billing_address_id"));
        adressselect1.sendKeys("New Address");

        WebElement country4= driver.findElement(By.name("BillingNewAddress.CountryId"));
        country4.click();

        Select countryselect0 = new Select(country4);
        countryselect0.selectByValue("77");

        WebElement city3= driver.findElement(By.cssSelector("#BillingNewAddress_City"));
        city3.sendKeys("Adana");

        WebElement adress3= driver.findElement(By.id("BillingNewAddress_Address1"));
        adress3.sendKeys("hürriyet mahallesi Adana/Turkey");

        WebElement postalcode4= driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        postalcode4.sendKeys("01000");

        WebElement phonenumber3= driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phonenumber3.sendKeys("05446675434");

        MyFunction.Wait(1);

        WebElement continuebutton1=driver.findElement(By.xpath("//input[@title='Continue']"));
        continuebutton1.click();

        MyFunction.Wait(1);

        WebElement continuebutton21=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
        continuebutton21.click();

        MyFunction.Wait(1);

        WebElement continuebutton31=driver.findElement(By.cssSelector("[onclick='ShippingMethod.save()']"));
        continuebutton31.click();

        MyFunction.Wait(1);

        WebElement continuebutton41=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        continuebutton41.click();

        MyFunction.Wait(1);

        WebElement continuebutton51=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
        continuebutton51.click();

        MyFunction.Wait(1);

        WebElement confirmbutton3=driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        confirmbutton3.click();

        WebElement logOut2= driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
        logOut2.click();




    }

}
