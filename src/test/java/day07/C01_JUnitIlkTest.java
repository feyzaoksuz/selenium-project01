package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_JUnitIlkTest {
    @Test
    public void test01() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));
    driver.get("https://techproeducation.com/");
    driver.close();
}
    @Test
    public void test02(){
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));
       driver.get("https://google.com/");
       driver.close();






    }

    }



