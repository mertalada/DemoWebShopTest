import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static Utility.BaseDriver.driver;

public class SedaTest {
    static Actions aksiyonlar = new Actions(driver);
    static JavascriptExecutor js = (JavascriptExecutor) driver;
    @org.junit.Test

    public static void Login() {
        driver.get("https://demowebshop.tricentis.com/");


        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();

        WebElement email = driver.findElement(By.xpath("//*[@id='Email']"));
        email.sendKeys("testingdeneme2@outlook.com");
        MyFunction.Wait(1);

        WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));
        password.sendKeys("Testing.123");
        MyFunction.Wait(1);

        WebElement loginbutton = driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        loginbutton.click();
        MyFunction.Wait(1);
    }
    @org.junit.Test

    public static void Ürün_Listesinden_Ürün_Secimi() {

        Login();

        WebElement jewellery = driver.findElement(By.xpath("//*[@class='top-menu']/li[6]/a"));
        jewellery.click();


        new Actions(driver).scrollByAmount(0, 300).build().perform();
        MyFunction.Wait(1);

        //bileklikleri seçtin.
        WebElement secim1tıkla = driver.findElement(By.xpath("//*[contains(@onclick,'catalog/71/1/1')] "));
        secim1tıkla.click();

        //scroll yaptın
        new Actions(driver).scrollByAmount(0, 200).build().perform();
        MyFunction.Wait(2);

        WebElement materialmenu = driver.findElement(By.id("product_attribute_71_9_15"));
        Select materialmenüolustur = new Select(materialmenu);
        materialmenüolustur.selectByValue("46");
        MyFunction.Wait(2);

        WebElement length = driver.findElement(By.xpath("//*[@id='product_attribute_71_10_16']"));
        length.sendKeys("25");

        WebElement pendantsecim = driver.findElement(By.xpath("//*[@class='option-list']/li[2]/label"));
        pendantsecim.click();
        MyFunction.Wait(2);

        WebElement quantity = driver.findElement(By.xpath("//*[@id='addtocart_71_EnteredQuantity']"));
        aksiyonlar.moveToElement(quantity).click().sendKeys(Keys.BACK_SPACE).build().perform();
        quantity.sendKeys("2");
        MyFunction.Wait(2);

        WebElement secim1 = driver.findElement(By.xpath("//*[@id='add-to-cart-button-71']"));
        secim1.click();

        MyFunction.Wait(2);


        js.executeScript("window.scrollTo(0,0)");
        MyFunction.Wait(2);
    }
    @org.junit.Test
    public static void Sepet_Kontrolü() {

        Ürün_Listesinden_Ürün_Secimi();

        //sepete gidip ürünler eklenmiş mi,kontrol ediyorum.
        WebElement shoppingcard = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingcard.click();

        MyFunction.Wait(2);

    }
    @org.junit.Test
    public static void Kargo_Bilgileri_Girisi() {

        Sepet_Kontrolü();
        //sayfanın sonuna geldim.
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        MyFunction.Wait(2);

        WebElement countrybox = driver.findElement(By.xpath("//*[@id='CountryId']"));
        aksiyonlar.moveToElement(countrybox).click().sendKeys("T").build().perform();
        MyFunction.Wait(2);
        new Actions(driver).scrollByAmount(0, 200).build().perform();
        MyFunction.Wait(2);

        Select country = new Select(countrybox);
        country.selectByValue("77");
        MyFunction.Wait(2);

        WebElement agreebutton = driver.findElement(By.xpath("//*[@id='termsofservice']"));
        agreebutton.click();
        MyFunction.Wait(2);

        WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
        checkout.click();
        MyFunction.Wait(2);
    }
    @org.junit.Test
    public static void Adres_Bilgileri_İlk_Adresi_Tanımlama(){

        Kargo_Bilgileri_Girisi();

        WebElement BillingCountryId =driver.findElement(By.xpath("//*[@id='BillingNewAddress_CountryId']"));
        aksiyonlar.moveToElement(BillingCountryId).click().sendKeys("T").build().perform();

        MyFunction.Wait(2);
        new Actions(driver).scrollByAmount(0,200).build().perform();
        MyFunction.Wait(2);

        Select BillingCountry =new Select(BillingCountryId);
        BillingCountry.selectByValue("77");
        MyFunction.Wait(2);

        WebElement BillingCity =driver.findElement(By.xpath("//*[@id='BillingNewAddress_City']"));
        BillingCity.sendKeys("İstanbul");
        MyFunction.Wait(2);

        WebElement Adress1 =driver.findElement(By.xpath("//*[@id='BillingNewAddress_Address1']"));
        Adress1.sendKeys("mahmutbey yolu 2.sokak");
        MyFunction.Wait(2);

        WebElement postacode =driver.findElement(By.xpath("//*[@id='BillingNewAddress_ZipPostalCode']"));
        postacode.sendKeys("34000");
        MyFunction.Wait(2);

        WebElement phonenumber =driver.findElement(By.xpath("//*[@id='BillingNewAddress_PhoneNumber']"));
        phonenumber.sendKeys("05350356773");
        MyFunction.Wait(2);

        WebElement continuee = driver.findElement(By.xpath("//*[@onclick='Billing.save()']"));
        continuee.click();
        MyFunction.Wait(2);

        //burada bilgiler kaydedilsin mi diye bir alert çıkıyor,bunu nasıl kaydet butonuna tıklayabilirim.
    }
    @org.junit.Test
    public static void AdAdres_Bilgileri_Kayıtlı_Adresten_Devam_Etme(){

        Kargo_Bilgileri_Girisi();

        WebElement adressselect = driver.findElement(By.xpath("//*[@id='billing-address-select']"));
        adressselect.click();

        Select newadress = new Select(adressselect);
        newadress.selectByIndex(0);
        MyFunction.Wait(2);

        WebElement continuee = driver.findElement(By.xpath("//*[@onclick='Billing.save()']"));
        continuee.click();
        MyFunction.Wait(2);
    }
    @org.junit.Test
    public static void AdAdres_Bilgileri_Yeni_Adres_Kaydetme(){

        Kargo_Bilgileri_Girisi();

        WebElement adressselect = driver.findElement(By.xpath("//*[@id='billing-address-select']"));
        adressselect.click();

        Select newadress = new Select(adressselect);
        newadress.selectByVisibleText("New Address");
        MyFunction.Wait(2);

        WebElement BillingCountryId =driver.findElement(By.xpath("//*[@id='BillingNewAddress_CountryId']"));
        aksiyonlar.moveToElement(BillingCountryId).click().sendKeys("T").build().perform();

        MyFunction.Wait(2);
        new Actions(driver).scrollByAmount(0,200).build().perform();
        MyFunction.Wait(2);

        Select BillingCountry =new Select(BillingCountryId);
        BillingCountry.selectByValue("77");
        MyFunction.Wait(2);

        WebElement BillingCity =driver.findElement(By.xpath("//*[@id='BillingNewAddress_City']"));
        BillingCity.sendKeys("İstanbul");
        MyFunction.Wait(2);

        WebElement Adress1 =driver.findElement(By.xpath("//*[@id='BillingNewAddress_Address1']"));
        Adress1.sendKeys("mahmutbey yolu 2.sokak");
        MyFunction.Wait(2);

        WebElement postacode =driver.findElement(By.xpath("//*[@id='BillingNewAddress_ZipPostalCode']"));
        postacode.sendKeys("34000");
        MyFunction.Wait(2);

        WebElement phonenumber =driver.findElement(By.xpath("//*[@id='BillingNewAddress_PhoneNumber']"));
        phonenumber.sendKeys("05350356773");
        MyFunction.Wait(2);

        WebElement continuee = driver.findElement(By.xpath("//*[@onclick='Billing.save()']"));
        continuee.click();
        MyFunction.Wait(2);
    }
    @org.junit.Test
    public static void Magaza_teslim_Secenegi_Secimi(){

        AdAdres_Bilgileri_Kayıtlı_Adresten_Devam_Etme();

        WebElement InStorepickUp = driver.findElement(By.xpath("//*[@id='PickUpInStore']"));
        InStorepickUp.click();
        MyFunction.Wait(2);

        WebElement continue2 = driver.findElement(By.xpath("//*[@onclick='Shipping.save()']"));
        continue2.click();
        MyFunction.Wait(2);

    }

    @org.junit.Test
    public static void Ödeme_Yöntemi(){

        Magaza_teslim_Secenegi_Secimi();

        WebElement paymentmethod = driver.findElement(By.xpath("//*[text()='Cash On Delivery (COD) (7.00)']"));
        paymentmethod.click();
        MyFunction.Wait(2);

        new Actions(driver).scrollByAmount(0, 300).build().perform();
        MyFunction.Wait(2);

        WebElement continue3 = driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']"));
        continue3.click();
        MyFunction.Wait(2);

    }

    @org.junit.Test
    public static void Ödeme_Yöntemi_Dogrulama(){

        Ödeme_Yöntemi();

        new Actions(driver).scrollByAmount(0, 400).build().perform();
        MyFunction.Wait(1);


        WebElement contınue4 = driver.findElement(By.xpath("//*[@onclick='PaymentInfo.save()']"));
        contınue4.click();
        MyFunction.Wait(2);

        //buraya kontrol eklenmeli.
    }
    @org.junit.Test
    public static void Siparis_Dogrulama(){

        Ödeme_Yöntemi_Dogrulama();

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        MyFunction.Wait(2);

        WebElement confirm = driver.findElement(By.xpath("//*[@onclick='ConfirmOrder.save()']"));
        confirm.click();
        MyFunction.Wait(2);

        //kontrol eklenmeli.
    }

    @org.junit.Test
    public static void Anket_Yanıtlama(){

        driver.get("https://demowebshop.tricentis.com/");


        WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
        login.click();

        WebElement email = driver.findElement(By.xpath("//*[@id='Email']"));
        email.sendKeys("testingdeneme2@outlook.com");
        MyFunction.Wait(1);

        WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));
        password.sendKeys("Testing.123");
        MyFunction.Wait(1);

        WebElement loginbutton = driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        loginbutton.click();
        MyFunction.Wait(1);

        new Actions(driver).scrollByAmount(0, 400).build().perform();
        MyFunction.Wait(2);

        WebElement anketyaniti = driver.findElement(By.xpath("//*[@id='pollanswers-1']"));
        anketyaniti.click();
        MyFunction.Wait(2);

        WebElement submitbutton = driver.findElement(By.xpath("//*[@id='vote-poll-1']"));
        submitbutton.click();
        MyFunction.Wait(2);


    }
}
