import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
    WebDriver driver;
    @BeforeTest
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @Test
    public void login(){

        driver.get("https://csc.ntta.org/olcsc/");
        System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");


    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }


}
