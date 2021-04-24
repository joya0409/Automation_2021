package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ActionItem_Usps {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");
        options.addArguments("incognito");
//define the webdriver
        ChromeDriver driver = new ChromeDriver(options);
        Actions mouseaction = new Actions(driver);


        String actualtitle = driver.getTitle();
        if (actualtitle.equals("Welcome | Usps")) {
            System.out.println("The title matches " + actualtitle + ".");
        } else {
            System.out.print("Title does not match, the actual title is " + actualtitle);

        }
        driver.navigate().to("https://www.usps.com/");

        ArrayList<String> findLocationByzip = new ArrayList<>();
        findLocationByzip.add("11232");
        findLocationByzip.add("11208");
        findLocationByzip.add("11214");

        ArrayList<String> locationType = new ArrayList<>();
        locationType.add("Collection Boxes");
        locationType.add("Self-Service Kiosks");
        locationType.add("Contract Postal Unit");

        ArrayList<String> locationMile = new ArrayList<>();
        locationMile.add("5");
        locationMile.add("10");
        locationMile.add("15");


        for (int i = 0; i < findLocationByzip.size(); i++) {

            try {
                WebElement send = driver.findElement(By.linkText("send"));
                mouseaction.moveToElement(send).perform();
            } catch (Exception e) {

                System.out.print("Error:" + e);
            }

            WebElement findusps = driver.findElement(By.linkText("Find USPS Locations"));
            mouseaction.moveToElement(findusps).click().perform();

            WebElement location = driver.findElement(By.id("city-state-input"));
            mouseaction.moveToElement(location).click().sendKeys(findLocationByzip.get(i)).perform();

            Thread.sleep(2000);
try {
            ArrayList<WebElement> links = new ArrayList<>(driver.findElements(By.xpath("//div@class='-item-location popover-trigger")));

            if(i==0){
                links.get(0).click();

            }else if(i==1){
                links.get(1).click();}
            else if(i==2){
                links.get(2).click();}}
catch (Exception t){
            System.out.println("Error:"+ t);
        }
        Thread.sleep(2000);

        try {
            String address = driver.findElement(By.xpath("//div[@class=' address-wrapper']")).getText();
            System.out.print("For zip code " + findLocationByzip.get(i) + ", The address is " + address);
        } catch (Exception f){
            System.out.println("Error:" + f);

        }

        try {
            String hours = driver.findElement(By.xpath("//div[@class='hours-flex-selection']")).getText();
            System.out.println(hours);
        } catch (Exception g){
            System.out.println("Error:" + g);

        }
        System.out.println("hours");





        }//end of for loop


    }//end of main method


}//end of java
