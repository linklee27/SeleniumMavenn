package Selenium.A_BAITAP;
//https://rise.fairsketch.com/signin admin@demo.com/riseDemo
//viết các hàm rồi gọi xuống hàm main

import Selenium.A_Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class THUCHANH_1 extends BaseTest {
    //login hệ thống
    public static void Signin(String name, String pass) {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@name = 'email']")).clear(); //do hệ thống nhập sẵn tài khoản nên phải clear đi
        driver.findElement(By.xpath("//input[@name = 'password']")).clear();
        sleep(1);
        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
    }

    //Mở client page
    public static void openClientPage() {
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click(); ////div[@id='page-content']//a[normalize-space()='Clients']
        sleep(1);
    }

    public static void addClient(String nameCompany) {
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(nameCompany);
        driver.findElement(By.xpath("(//span[normalize-space()='John Doe'])[2]")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Sara Ann", Keys.ENTER);
        driver.findElement(By.id("address")).sendKeys("VTP");
        driver.findElement(By.id("city")).sendKeys("hanoi");
        driver.findElement(By.id("state")).sendKeys("thanhtri");
        driver.findElement(By.id("zip")).sendKeys("123123");
        driver.findElement(By.id("country")).sendKeys("Vietnam");
        driver.findElement(By.id("phone")).sendKeys("0359750721");
        driver.findElement(By.id("website")).sendKeys("abc.com");
        //cuộn chuột xuống dưới trường cuối (scroll) do bị che để nó thấy được cái element bị che
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));

        driver.findElement(By.id("vat_number")).sendKeys("0");
        driver.findElement(By.id("gst_number")).sendKeys("23123123");
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).click();
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("VIP",Keys.ENTER);
        driver.findElement(By.xpath("//span[normalize-space()='Keep it blank to use the default (USD)']")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("AED",Keys.ENTER);
        driver.findElement(By.xpath("//input[@placeholder='Keep it blank to use the default ($)']")).sendKeys("abc");
        driver.findElement(By.xpath("//div[@id='s2id_client_labels']//ul//li//input")).click();
        driver.findElement(By.xpath("//div[@id='s2id_client_labels']//ul//li//input")).sendKeys("Referral",Keys.ENTER);
        //kiểm tra xem checkbox check chưa, nếu chưa check thì click vào checkbox
        WebElement Checkbox = driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']/following-sibling::div/input"));
        boolean CheckboxStatus = Checkbox.isSelected();
        if(CheckboxStatus == false){
            Checkbox.click();
        }
        driver.findElement(By.xpath("//button[text()=' Save']")).click();
        sleep(2);
    }

    //sau khi thêm xong, thì search ở ngoài list danh sách
    public static void searchCheckAdd(String clientName){
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName);
        sleep(2);
        //kiểm tra thông tin
        String clientNameTable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr[1]/td[2]")).getText();
        System.out.println(clientNameTable);
    }
//    //kiểm tra khi chọn ngày trong carlendar
//    public static void  checkMonthName(){
//        for(int i =1; i<=12; i++){
//            driver.findElement(By.xpath(""));
//            String monthName = driver.findElement(By.xpath(""));
//            if(monthName.equals("FEB")){
//                //click chọn ngày
//                driver.findElement(By.xpath("")).click();
//                break;//thoát vòng lặp
//            }
//
//        }
//    }

    public static void main(String[] args) {
        createDriver();
        Signin("admin@demo.com","riseDemo");
        openClientPage();
        addClient("linh123");
        searchCheckAdd("linh123");


        closedriver();

    }
}
