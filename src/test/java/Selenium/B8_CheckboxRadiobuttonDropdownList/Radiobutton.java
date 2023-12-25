package Selenium.B8_CheckboxRadiobuttonDropdownList;

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//https://demo.seleniumeasy.com/basic-radiobutton-demo.html
public class Radiobutton extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        //Mở trang
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        //kiem tra da click chua
        WebElement radiro = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/input"));
        System.out.println(radiro.isSelected());
        //neu chua thi thuc hien click
        if(radiro.isSelected() == false){
            radiro.click();
        }
        //kiem tra xem da click chua, (phai kiểm tra ở  input chứ k phải ở text)
        sleep(2);
        System.out.println(radiro.isSelected());

        //check RadioGroup
        WebElement radiroGroup = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='0 to 5']/input"));
        radiroGroup.click();
        System.out.println(radiro.isSelected());
        //kểm tra xem 2 radio còn lại không được chọn
        WebElement radiro515 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='5 to 15']/input"));
        WebElement radiro1550 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='15 to 50']/input"));
        System.out.println(radiro515.isSelected());  //sau dùng Assert của testNG kiểm tra
        System.out.println(radiro1550.isSelected());

        closedriver();
    }
}
