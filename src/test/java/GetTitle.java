
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTitle {

    @Test
    void getTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\API or Server or Browser Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://automationstepbystep.com/");
        driver.get("https://kp.org");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(),"Custom Care & Coverage Just For You | Kaiser Permanente");

        Thread.sleep(1000);
        driver.quit();

    }

    @Test
    void checkTitle_Learn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\API or Server or Browser Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://automationstepbystep.com/");
        driver.get("https://kp.org");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//header/div[@id='kp_global_menu']/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
        Assert.assertEquals(driver.getTitle(),"Learn About Health Care");

        Thread.sleep(1000);
        driver.quit();
    }
}
