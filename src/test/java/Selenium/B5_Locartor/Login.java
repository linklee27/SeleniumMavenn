package Selenium.B5_Locartor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang ecommerce
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);

        //điền email - tìm locartor theo id với By.id
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //điền pass - tìm locartor theo name với By.name
        driver.findElement(By.name("password")).sendKeys("123456");

        //click link forgot password -  By.linkText()
        driver.findElement(By.linkText("Forgot password ?")).click();

        //click link forgot password -  By.partialLinkText (1 phần cua linktext)
        driver.findElement(By.partialLinkText("Forgot")).click();

        //driver.findElement(By.tagName(a))
        //driver.findElement(By.className(" "))

        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
