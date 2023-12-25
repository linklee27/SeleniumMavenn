package Selenium.B8_CheckboxRadiobuttonDropdownList;

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //kiểm tra xem checkbox đã được check hay chưa
        WebElement Checkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean CheckboxStatus = Checkbox.isSelected();
        System.out.println(CheckboxStatus);
        //Nếu chưa check thì thực hiện check checkbox
        if(CheckboxStatus == false){
            Checkbox.click();
        }
        //Khi click rồi thì kiểm tra lại 1 lần nữa xem đã chọn hay chưa
        boolean CheckboxStatusAfter = Checkbox.isSelected();
        System.out.println(CheckboxStatusAfter);

        //spec-khi chọn checkbox thì hiển thị text "Success - Check box is checked".
        // kiểm tra có hiển thị text không, lấy ra text?
        WebElement message = driver.findElement(By.id("txtAge"));
        System.out.println(message.isDisplayed());
        System.out.println(message.getText());




        closedriver();

    }

}
