package Selenium.A_BAITAP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BT5_Locartor610 {
    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang ecommerce
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);

        //Bắt xpath của trang Login
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");

        WebElement inputPass = driver.findElement(By.id("password"));
        inputPass.sendKeys("123456");

        WebElement checkbox = driver.findElement(By.id("remember"));
        checkbox.click();

        WebElement buttonlogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        buttonlogin.click();

        //WebElement linkforgotpass = driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']']"));
        //linkforgotpass.click();

        //Bắt xpath menu Project
        WebElement Project = driver.findElement(By.xpath("//span[normalize-space()='Project']"));
        Project.click();
        WebElement NewProject = driver.findElement(By.xpath("//a[normalize-space()='New Project']"));
        NewProject.click();

        //Bắt xpath màn new project
        WebElement PName = driver.findElement(By.id("name"));
        PName.sendKeys("name");

        WebElement customer = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        customer.click();
        WebElement comboboxcustomer = driver.findElement(By.xpath("(//div[@class='bs-searchbox']/input)[1]"));
        comboboxcustomer.sendKeys("abc");

        WebElement checkboxs = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        checkboxs.click();

        WebElement Billing = driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select bs3 dropup']/button"));
        Billing.click();















        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}

