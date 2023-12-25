package Selenium.A_Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    //Khởi tạo browser với Chrome
    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //chờ đợi ngầm 10s cho mỗi câu lệnh findElement để tìm kiếm
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//time chờ đợi trang load là 30s
    }

    //Đóng browser
    public static void closedriver() {
        sleep(2);
        driver.quit();
    }

    //hàm đổi từ ms => s
    public static void sleep (double seconds){
        try
        {
            Thread.sleep((long) (1000 * seconds));
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
