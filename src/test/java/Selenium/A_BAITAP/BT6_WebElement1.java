package Selenium.A_BAITAP;

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BT6_WebElement1 extends BaseTest {

    public void login(String mail, String pass) {

        driver.get("https://crm.anhtester.com/admin/clients");
        //Bắt xpath của trang Login

        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys(mail);
        WebElement inputPass = driver.findElement(By.id("password"));
        inputPass.sendKeys(pass);
        WebElement buttonlogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        buttonlogin.click();
    }

    public void newCustomer() {
        WebElement customers = driver.findElement(By.xpath("//span[normalize-space()='Customers']"));
        customers.click();
        WebElement newcustomer = driver.findElement(By.xpath("//a[normalize-space()='New Customer']"));
        newcustomer.click();
    }

    public void company(String tenCongTy) {
        WebElement Company = driver.findElement(By.id("company"));
        Company.sendKeys(tenCongTy);
    }

    public void vat(String vatMST) {
        WebElement VAT = driver.findElement(By.id("vat"));
        VAT.sendKeys(vatMST);
    }

    public void phoneNumber(String SĐT) {
        WebElement phoneNumber = driver.findElement(By.id("phonenumber"));
        phoneNumber.sendKeys(SĐT);
    }

    public void website(String web) {
        WebElement Website = driver.findElement(By.id("website"));
        Website.sendKeys(web);
    }

    public void group(String tenGroup){
        WebElement Group = driver.findElement(By.xpath("(//div[normalize-space()='Nothing selected'])[3]"));
        Group.click();
        WebElement groupSearch = driver.findElement(By.xpath("(//div[normalize-space()='Nothing selected'])[3]/parent::div/parent::div/parent::button/following-sibling::div//input"));
        groupSearch.sendKeys(tenGroup);
        driver.findElement(By.xpath("(//li[normalize-space()='TEAM_TEST'])[1]")).click();
        sleep(2);
    }
    public void currency(String currentText){
        WebElement Currency = driver.findElement(By.xpath("(//div[normalize-space()='System Default'])[3]"));
        Currency.click();
        WebElement currencySearch = driver.findElement(By.xpath("(//div[normalize-space()='System Default'])[3]/parent::div/parent::div/parent::button/following-sibling::div//div//input"));
        currencySearch.sendKeys(currentText);
        driver.findElement(By.xpath("//a[@id='bs-select-2-1']")).click();


    }



//    WebElement selectAll = driver.findElement(By.xpath("//button[text()='Select All']"));
//        selectAll.click();
//    WebElement DeselectAll = driver.findElement(By.xpath("//button[text()='Deselect All']"));
//        DeselectAll.click();
//    WebElement iconadd = driver.findElement(By.xpath("//div[@class='input-group-btn']/a"));
//        iconadd.click();
//    WebElement close = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
//        close.click();
//
////        WebElement Currency = driver.findElement(By.xpath("(//button[@title='System Default'])[1]"));
////        Currency.click();
////        WebElement comboboxCurrency = driver.findElement(By.xpath("(//input[@aria-label='Search'])[1]"));
////        comboboxCurrency.sendKeys("usd");
//
//    WebElement DefaultLanguage = driver.findElement(By.xpath("(//div[normalize-space()='System Default'])[6]"));
//        DefaultLanguage.click();
//
//    WebElement Address = driver.findElement(By.id("address"));
//        Address.sendKeys("abc");
//
//    WebElement City = driver.findElement(By.id("city"));
//        City.sendKeys("abc");
//
//    WebElement State = driver.findElement(By.id("state"));
//        State.sendKeys("abc");
//
//    WebElement zip = driver.findElement(By.id("zip"));
//        zip.sendKeys("abc");
//
//    WebElement Country = driver.findElement(By.xpath("((//button[@type='button'])[1]"));
//        Country.click();
//    WebElement ComboboxCountry = driver.findElement(By.xpath("((//input[@type='search'])[1]"));
//        ComboboxCountry.sendKeys("abc");
//
////        WebElement save = driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]"));
////        save.click();
////        WebElement saveandcreate = driver.findElement(By.xpath("(//button[normalize-space()='Save and create contact'])[1]"));
////        saveandcreate.click();
//
    @Test(priority = 1)
    public void hamTong (){
        login("admin@example.com", "123456");
        newCustomer();
        company("paditech");
        vat("123123");
        phoneNumber("0987890987");
        website("abc.com");
        group("TEAM_TEST");
        currency("USD");
    }

    public static void main(String[] args) {
        createDriver();
        BT6_WebElement1 BT = new BT6_WebElement1();
        BT.hamTong();



        closedriver();

    }
}
