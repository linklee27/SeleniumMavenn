package Selenium.B7_WebDriver;

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;

public class bBasicBrower extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.navigate().to("https://anhtester.com/");
        driver.findElement(By.id("btn-login")).click();
        sleep(2);

        // Điều hướng về lịch sử trang trước đó
        driver.navigate().back();
        sleep(2);

        // Làm mới trang hiện tại
        driver.navigate().refresh();
        sleep(2);

        // Điều hướng đến trang tiếp sau
        driver.navigate().forward();
        sleep(2);

        // Lấy ra title của page
        String title = driver.getTitle();
        System.out.println(title);

        // Lấy ra URL hiện tại
        String url = driver.getCurrentUrl();
        System.out.println(url);

        // lấy ra page HTML source hiện tại
        String html = driver.getPageSource();
        System.out.println(html);






        closedriver();

    }
}
