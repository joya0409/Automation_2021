package Day6_032121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class mortgageCalcTestScenerio {
    public static void main(String[] args) throws InterruptedException {
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
        driver.navigate().to("https://mortgagecalculator.org");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //verify that the title with your expected
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Mortgage Calculator")) {
            System.out.println("Title matches");
        }else {
            System.out.println("Title doesn't match. " + actualTitle);

            //store home value first
            WebElement homeValue = driver.findElement(By.xpath("//*@id='homeval']"));
            //clear the previous data
            homeValue.clear();
            //enter the new home value
            homeValue.sendKeys("350000");

            //store down payment first
            WebElement dPayment = driver.findElement(By.xpath("//*@id='downpayment']"));
            //clear the previous data
            dPayment.clear();
            //enter the new down payment
            dPayment.sendKeys("220000");

            //select april on month dropdown
            WebElement startMonth = driver.findElement(By.xpath("//*@name='param[start_month]']"));
            //select the locator using select command
            Select dropdown = new Select(startMonth);
            //using by visible text command select month April
            dropdown.selectByVisibleText("Apr");

            //if dropdown is not under select tag then you have to use click command twice
            //click on dropdown
            //startMonth.click();
            //click on dropdown value by text
           // driver.findElement(By.xpath("//*[text()='May']")).click();

            //click on calculate button
            driver.findElement(By.xpath("//*@value='Calculate']")).click();

            Thread.sleep(3000);

            //capture the monthly payment using findElements with first index
            String mntPayment = driver.findElements(By.xpath("//div[@class='left-call']")).get(0).getText();
            System.out.println("My monthly payment is " + mntPayment);






        }//end of condition








    }//end of main







}//end of java
