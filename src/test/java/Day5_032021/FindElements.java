package Day5_032021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {

        //set the property of the chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        //define the WebDriver

        WebDriver driver = new ChromeDriver();

        //navigate to google home
        driver.navigate().to("https://www.google.com");

        //maximize
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //using findelements click on store link form the class group
        driver.findElements(By.xpath("//*[@class='MV3Tnb']")).get(1).click();



    }



}//end of java
