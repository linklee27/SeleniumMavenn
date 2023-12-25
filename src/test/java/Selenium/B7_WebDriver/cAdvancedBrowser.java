package Selenium.B7_WebDriver;

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.WindowType;

public class cAdvancedBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        // Mở tab mới trong trình duyệt
        driver.get("https://anhtester.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");

        //Mở cửa sổ mới trong trình duyệt
        driver.get("https://anhtester.com");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://google.com");

        //Xử lý các Tab hoặc Window Popup


        sleep(2);
        closedriver();
    }
}
