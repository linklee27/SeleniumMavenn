package Selenium.B6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException{
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login CMS
        driver.get("https://demo.activeitzone.com/ecommerce/login");

        //sendkeys() - Bắt web element Email (Object)
        WebElement inputEmail = driver.findElement(By.id("email"));        //khai báo element cách 1
        inputEmail.sendKeys("admin@example.com");

        //sendkeys() - Bắt web element Password (Object)
        driver.findElement(By.id("password")).sendKeys("123456");  //khai báo element cách 2

        //clear() - xóa text trong ô nhập
        //inputEmail.clear();

        //Get text của tiêu đề h1
        WebElement tieude = driver.findElement(By.xpath("//div[@class='mb-5 text-center']//h1"));
        System.out.println("tieu de:" + tieude.getText());

        //isDisplayed() - Kiểm tra xe button Copy có hiển thị hay không
        WebElement buttoncopy = driver.findElement(By.xpath("//button[normalize-space()='Copy']"));
        System.out.println("Trạng thái nut copy: " + buttoncopy.isDisplayed());

        //isDisplayed() - kiểm tra nếu button copy có tồn tại thì click button login
        //if (buttoncopy.isDisplayed() == true ){
        //    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        //}

        //sEnabled() - Kiểm tra button login có bật hay không (có hiển thị, có click được hoặc có hiển thị, không click được)
        WebElement buttonlogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        System.out.println(buttonlogin.isEnabled());

        //sEnabled() - Kiểm tra phần từ có bật hay không (ví dụ trên https://dofactory.com/html/button/disabled)
        //WebElement buttonclick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //System.out.println(buttonclick.isEnabled());

        //isSelected    - Kiểm tra đã chọn hay chưa (chỉ dành cho checkbox và radiobutton)
        driver.findElement(By.xpath("//span[text()='Remember Me']")).click(); //thực hiện chọn checkbox
        WebElement checkboxremember = driver.findElement(By.id("remember"));
        System.out.println("trang thai checkbox" + checkboxremember.isSelected());

        //getCssvalue  - kiểm tra màu button login
        System.out.println(buttonlogin.getCssValue("background-color"));  //trả về mã màu RGBA

        //getSize() - lấy ra kích thước dài, rộng của button login
        Dimension dimension = buttonlogin.getSize();
        System.out.println("hight buttonlogin" + dimension.height + "width buttonlogin" + dimension.width);

        //submit  - thực hiện nút enter
        buttonlogin.submit();










        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}

