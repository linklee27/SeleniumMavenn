package Selenium.B7_WebDriver;

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class dInterfaceOption extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://anhtester.com");

        // Add a new cookie
        Cookie newCookie = new Cookie("customName", "123123234234");
        driver.manage().addCookie(newCookie);

        // Get name cookies
        System.out.println(driver.manage().getCookieNamed("customName"));

        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.toString());

        // Delete a cookie by name
        driver.manage().deleteCookieNamed("customName");

        // Delete all cookies
        driver.manage().deleteAllCookies();

        sleep(2);
        closedriver();
    }
}
