package Selenium.B8_CheckboxRadiobuttonDropdownList;
import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//https://demo.seleniumeasy.com/basic-select-dropdown-demo.html
//https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html
//Dropdown tĩnh:khi chọn giá trị số lượng giá trị không thay đổi
//Dropdown động:option có thể thay đổi qua việc search

public class DropdownTinh extends BaseTest {
    public static void main(String[] args) {

        createDriver();
        //Mở trang
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        //khai báo đối tuong select và giá trị là 1 webElement của thẻ select trong HTML
        WebElement dropdownTinh = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select = new Select(dropdownTinh);
        //kiểm tra giá trị chọn (mặc định)
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("kiem tra kieu của select" + select.isMultiple());
        System.out.println("số lượng option trong select" + select.getOptions().size());

        //lấy đối tượng select de gọi hàm hỗ trợ
        select.selectByVisibleText("Sunday"); //chọn text là sunday
        select.selectByValue("Tuesday");     //chọn value là Tuesday
        select.selectByIndex(6);           //chọn thứ tự 6

        //kiểm tra lại giá tri sau khi đã chọn
        System.out.println(select.getFirstSelectedOption().getText());  //lấy ra option đã chọn ở đầu tiên

        closedriver();
    }
}
