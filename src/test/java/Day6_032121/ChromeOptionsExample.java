package Day6_032121;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //define the ChromeOptions arguments
        ChromeOptions options = new ChromeOptions();
        //maximize my driver
       // options.addArguments("start=maximized");
        //set the driver to incognito(private)
        options.addArguments("incognito");
        //set it to headless
        //options.addArguments("headless");


        //define the WebDriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo page
        driver.navigate().to("https://www.yahoo.com");
        driver.manage().window().maximize();




    }//end of main


}//end of java
