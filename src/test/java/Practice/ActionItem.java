package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class ActionItem {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        ChromeOptions options= new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver= new ChromeDriver(options);

            String[] PurchasePrice = new String[]{"450000", "550000", "650000"};
            String[] DownPayment = new String[]{"30", "40", "60"};
            String[] MortgageTerm = new String[]{"2", "4", "5"};
            String[] InterestRate = new String[]{"2.5", "3.5", "4.5"};
            String[] PMI = new String[]{".20", ".30", ".40"};
            String[] StartMonth = new String[]{"Apr", "May", "Jun"};
            String[] StartYear = new String[]{"2021", "2022", "2023"};
            for (int i = 0; i < PurchasePrice.length; i++) {

                driver.navigate().to("https://www.mlcalc.com");
                Thread.sleep(2000);

                String actualTitle = driver.getTitle();
                if(actualTitle.equals("Auto loan Calculator")) {
                    System.out.println("Title matches");
                }else {
                    System.out.println("Title doesn't match. " + actualTitle);

                WebElement PP = driver.findElement(By.xpath("//input[@id='ma']"));
                PP.clear();
                PP.sendKeys(PurchasePrice[i]);

                WebElement dp = driver.findElement(By.xpath("//input[@id='dp']"));
                dp.clear();
                dp.sendKeys(DownPayment[i]);


                WebElement mt = driver.findElement(By.xpath("//input[@id='mt']"));
                mt.clear();
                mt.sendKeys(MortgageTerm[i]);

                WebElement ir = driver.findElement(By.xpath("//input[@id='ir']"));
                ir.clear();
                ir.sendKeys(InterestRate[i]);

                WebElement pm = driver.findElement(By.xpath("//input[@id='mi']"));
                pm.clear();
                pm.sendKeys(PMI[i]);

                WebElement month = driver.findElement(By.xpath("//select[@name='sm']"));
                Select dropdown1 = new Select(month);
                dropdown1.selectByVisibleText(StartMonth[i]);

                WebElement year = driver.findElement(By.xpath("//select[@name='sy']"));
                Select dropdown2 = new Select(year);
                dropdown2.selectByVisibleText(StartYear[i]);

                driver.findElement(By.xpath("//input@type='submit']")).click();

                String result= driver.findElements(By.xpath("//td[@class='big']")).get(0).getText();

                System.out.println("Monthly Payment "+ StartYear[i]);
                System.out.println(result+".");



            }//end of for loop


        }






    }//end of main



}//end of java
