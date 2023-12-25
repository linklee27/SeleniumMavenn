package Selenium.B8_CheckboxRadiobuttonDropdownList;
import Selenium.A_Common.BaseTest;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;

        import java.util.List;

public class CheckboxMultiple extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        sleep(1);

        //lấy ra danh sách list checkbox, in ra số lượng checkbox
        List<WebElement> listcheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        System.out.println(listcheckbox.size());

        //dùng for để lần lượt vào từng checkbox, cộng chuỗi " + i + "
        for (int i = 1; i <= listcheckbox.size(); i++) {
            sleep(1);
            driver.findElement(By.xpath("//label[normalize-space()='Option " + i + " ']")).click();
        }


//4 cách để lấy xpath list checkbox
//        //label[contains(normalize-space(),'Option')]/input
//        //input[@class='cb1-element']
//        //div[@class='checkbox']/following-sibling::div
//        //div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']
        closedriver();

    }
}

