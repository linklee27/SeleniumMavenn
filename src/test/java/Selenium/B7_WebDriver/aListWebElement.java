package Selenium.B7_WebDriver;

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class aListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
        Thread.sleep(7000);

        //lấy ra danh sách menu
        List<WebElement> listmenu = driver.findElements(By.xpath("//ul[@class='aiz-side-nav-list metismenu']/li"));
        for (int i = 0; i < listmenu.size(); i++) {
            System.out.println(listmenu.get(i).getText());  //get(i) lấy ra phần tử, vị trí trong listmenu, gettext() lấy ra text của vị trí đó.
        }

        //lấy ra text của menu vị trí thu 4
        System.out.println(listmenu.get(4).getText());

        //lấy ra vị trí menu thứ 3, và click vào nó
        listmenu.get(3).click();


        closedriver();

    }
}
