package Selenium.B8_CheckboxRadiobuttonDropdownList;
import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

//https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html
//Dropdown tĩnh:khi chọn giá trị số lượng giá trị không thay đổi
//Dropdown động:option có thể thay đổi qua việc search

public class DropdownDong extends BaseTest {
    public static void main(String[] args) {

        createDriver();
        //Mở trang
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        //click vào category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        //search giá trị
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hight"); //từ thẻ span, lấy cha nó là thẻ a, sau đó dùng following-sibling lấy div cùng cấp với a, rồi lấy input bên trong thẻ div
        //click chọn gía trị cần chọn sau khi search, class chứa hightlighted là chứa giá trị đầu tiên
        driver.findElement(By.xpath("//li[@class='active-result result-hightlighted']")).click();
        //hoặc ấn enter để chọn giá trị, class chứa hightlighted là chứa giá trị đầu tiên
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform(); //perform() là hàm xác nhậnn cuoi cung (chấp nhân thực hiện)


        closedriver();
    }
}
