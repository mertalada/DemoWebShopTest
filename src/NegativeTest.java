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

    @Test
    public static void SingUpNegativeTest(){
//İsim girilmeme durumu
        driver.get("https://demowebshop.tricentis.com/");

        WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        MyFunction.Wait(2);
        WebElement firtName= driver.findElement(By.xpath("//input[@id='FirstName']"));
        firtName.sendKeys(" ");

        WebElement kayit=driver.findElement(By.xpath("//input[@id='register-button']"));
        kayit.click();
        MyFunction.Wait(2);
        WebElement alertText = driver.findElement(By.xpath("//span[@for='FirstName']"));

        if (alertText.getText().contains("First name is required.")) {
            System.out.println("Test fail ");
            System.out.println("İsim girlmelidir");
        }else{
            System.out.println("Test passed");
            System.out.println("çalışıyor");
        }
        SingUpNegativeTest2();
        SingUpNegativeTest3();
        SingUpNegativeTest4();
        SingUpNegativeTest5();
        SingUpNegativeTest6();
        SingUpNegativeTest7();
    }

    @Test
    public static void SingUpNegativeTest2() {
        MyFunction.Wait(2);
        //Soyad girilmeme durumu
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        MyFunction.Wait(2);
        WebElement lastName= driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys(" ");

        WebElement kayit=driver.findElement(By.xpath("//input[@id='register-button']"));
        kayit.click();
        MyFunction.Wait(2);
        WebElement alertText = driver.findElement(By.xpath("//span[@for='LastName']"));

        if (alertText.getText().contains("Last name is required.")) {
            System.out.println("Test fail ");
            System.out.println("Soyad girilmelidir");
        }else
            System.out.println("Test passed");
        System.out.println("Çalışıyor");
    }
    @Test
    public static void SingUpNegativeTest3() {
        MyFunction.Wait(2);
        //HATALI MAİL GİRİLME durumu
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        MyFunction.Wait(2);
        WebElement mail= driver.findElement(By.xpath("//input[@id='Email']"));
        mail.sendKeys("a");
        WebElement kayit=driver.findElement(By.xpath("//input[@id='register-button']"));
        kayit.click();
        WebElement hataliEmail = driver.findElement(By.xpath("//span[@for='Email']"));
        if (hataliEmail.getText().contains("Wrong email")) {
            System.out.println("Test Passed ");
            System.out.println("Mail girilmemesi hatası kontrol edildi");
        }else
        {
            System.out.println("Test fail");
            System.out.println("Mail girilince hata vermiyor kontrol edildi");
        }
    }
    @Test
    public static void SingUpNegativeTest4() {
        MyFunction.Wait(2);
        //mail girilmeme durumu
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        MyFunction.Wait(2);
        WebElement mail= driver.findElement(By.xpath("//input[@id='Email']"));
        mail.sendKeys("");
        WebElement kayit=driver.findElement(By.xpath("//input[@id='register-button']"));
        kayit.click();
        MyFunction.Wait(2);
        WebElement alertText = driver.findElement(By.xpath("//span[@for='Email']"));

        if (alertText.getText().contains(" Email is required.")) {
            System.out.println("mail eksik");
        }else
        {
            System.out.println("Test passed");
            System.out.println("Çalışıyor");
        }
    }

    @Test
    public static void SingUpNegativeTest5() {
        //şifre girilmeme durumu
        MyFunction.Wait(2);
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        MyFunction.Wait(2);
        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("");
        WebElement kayit=driver.findElement(By.xpath("//input[@id='register-button']"));
        kayit.click();
        MyFunction.Wait(2);
        WebElement alertText = driver.findElement(By.xpath("//span[@for='Password']"));

        if (alertText.getText().contains("  Password is required."))
        {
            System.out.println("şifre eksik");
        }else
        {
            System.out.println("Test passed");
            System.out.println("Çalışıyor");
        }
    }
    @Test
    public static void SingUpNegativeTest6() {
        MyFunction.Wait(2);
        //şifrenin eksik girilme durumu durumu
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        MyFunction.Wait(2);
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("a");
        WebElement kayit = driver.findElement(By.xpath("//input[@id='register-button']"));
        kayit.click();
        MyFunction.Wait(2);
        WebElement alertText = driver.findElement(By.xpath("//span[@for='Password']"));
        if (alertText.getText().contains("The password should have at least 6 characters.")) {
            System.out.println("şifre eksik");
        }
        else{
            System.out.println("Test passed");
            System.out.println("Çalışıyor");
        }

    }
    @Test
    public static void SingUpNegativeTest7() {
        MyFunction.Wait(2);
        //şifrelerin aynısının girilmeme durumu
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        MyFunction.Wait(2);
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("aaaaaaa");
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("aaaaab");
        WebElement kayit = driver.findElement(By.xpath("//input[@id='register-button']"));
        kayit.click();
        MyFunction.Wait(2);
        WebElement alertText = driver.findElement(By.xpath("//span[@for='ConfirmPassword']"));
        if (password.getText()==confirmPassword.getText()) {
            System.out.println("şifreler aynı");
        }
        else if(alertText.getText().contains("The password and confirmation password do not match."))
        {
            System.out.println("Şifreler Aynı Değil");
        }
        else
        {
            System.out.println("TEST PASSED");
        }
    }


    }
