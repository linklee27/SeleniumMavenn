package Selenium.A_BAITAP;

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BT5_Locartor15 extends BaseTest {
    public static void main(String[] args) {
        //Khởi tạo browser với Chrome
        createDriver();

        //Mở trang ecommerce
        driver.get("https://crm.anhtester.com/admin/authentication");
        sleep(2);

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

        //Bắt xpath menu Customer ----------------------
        WebElement customers = driver.findElement(By.xpath("//span[normalize-space()='Customers']"));
        customers.click();
        WebElement newcustomer = driver.findElement(By.xpath("//a[normalize-space()='New Customer']"));
        newcustomer.click();

        //Bắt xpath hết Form của trang New Customer
        WebElement Company = driver.findElement(By.id("company"));
        Company.sendKeys("Paditech");

        WebElement VAT = driver.findElement(By.id("vat"));
        VAT.sendKeys("20");

        WebElement phonenumber = driver.findElement(By.id("phonenumber"));
        phonenumber.sendKeys("0987890987");

        WebElement Website = driver.findElement(By.id("website"));
        Website.sendKeys("abc.com");

        By byGroup = By.xpath("(//div[@class='filter-option-inner'])[1]");
        WebElement Group = driver.findElement(byGroup);
        Group.click();
        WebElement comboboxGroup = driver.findElement(By.xpath("(//input[@aria-label='Search'])[1]"));
        comboboxGroup.sendKeys("abc");

        WebElement selectAll = driver.findElement(By.xpath("//button[text()='Select All']"));
        selectAll.click();
        WebElement DeselectAll = driver.findElement(By.xpath("//button[text()='Deselect All']"));
        DeselectAll.click();
        WebElement iconadd = driver.findElement(By.xpath("//div[@class='input-group-btn']/a"));
        iconadd.click();
        WebElement close = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
        close.click();

//        WebElement Currency = driver.findElement(By.xpath("(//button[@title='System Default'])[1]"));
//        Currency.click();
//        WebElement comboboxCurrency = driver.findElement(By.xpath("(//input[@aria-label='Search'])[1]"));
//        comboboxCurrency.sendKeys("usd");

        WebElement DefaultLanguage = driver.findElement(By.xpath("(//div[normalize-space()='System Default'])[6]"));
        DefaultLanguage.click();

        WebElement Address = driver.findElement(By.id("address"));
        Address.sendKeys("abc");

        WebElement City = driver.findElement(By.id("city"));
        City.sendKeys("abc");

        WebElement State = driver.findElement(By.id("state"));
        State.sendKeys("abc");

        WebElement zip = driver.findElement(By.id("zip"));
        zip.sendKeys("abc");

        WebElement Country = driver.findElement(By.xpath("((//button[@type='button'])[1]"));
        Country.click();
        WebElement ComboboxCountry = driver.findElement(By.xpath("((//input[@type='search'])[1]"));
        ComboboxCountry.sendKeys("abc");

//        WebElement save = driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]"));
//        save.click();
//        WebElement saveandcreate = driver.findElement(By.xpath("(//button[normalize-space()='Save and create contact'])[1]"));
//        saveandcreate.click();

        sleep(2);
        closedriver();
    }
}