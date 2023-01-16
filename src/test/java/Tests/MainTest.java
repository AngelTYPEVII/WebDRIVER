package Tests;


import Steps.PageButtons;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    WebDriver driver;
    PageButtons pageButtons;
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver","/home/timur/Документы/chromedriver");
        driver = new ChromeDriver();
        pageButtons=new PageButtons(driver);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }
    @AfterEach
    public void teardown() {
        driver.close();
    }
}
