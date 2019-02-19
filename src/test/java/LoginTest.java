import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeTest
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Before login");

    }
    @Test
    public void login() throws Exception{

        driver.get("https://csc.ntta.org/olcsc/");
        System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("rajeevkk2001");
        WebElement psw = driver.findElement(By.name("password"));
        psw.sendKeys("B");
        WebElement loginBtn = driver.findElement(By.id("loginButton"));
        loginBtn.click();
        wait(2000);
    }

    @Test
    public void AccountTest() throws Exception{

        System.out.println("Account Details");
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("rajeevkk2001");
        WebElement psw = driver.findElement(By.name("password"));
        psw.sendKeys("Beauty123#");
        WebElement loginBtn = driver.findElement(By.id("loginButton"));
        loginBtn.click();
        wait(2000);


    }


    @AfterTest
    public void tearDown(){
       // driver.close();
        System.out.println("After login");
    }


}
