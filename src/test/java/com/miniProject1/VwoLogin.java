package com.miniProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VwoLogin {

    @Test
    public void vwoLogin(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://google.com/");
        driver.get("https://app.vwo.com/");
        driver.get("https://smallpdf.com/pdf-converter");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(),"Login - VWO");

        WebElement username= driver.findElement(By.id("login-username"));
        username.sendKeys("vwo@1secmail.com");

        WebElement pass= driver.findElement(By.id("login-password"));
        pass.sendKeys("Vwo@1234");

        WebElement btn= driver.findElement(By.id("js-login-btn"));
        btn.click();

        //WebElement dashboardPage= driver.findElement(By.className("btn btn--small btn--negative btn--inverted Mend(10px) ng-scope"));
        //Assert.assertEquals(dashboardPage.getText(),"Verify Account");


        //Assert.assertEquals(driver.findElement(By.className("btn btn--small btn--negative btn--inverted Mend(10px) ng-scope"))," Verify Account");
        //Assert.assertEquals(driver.getCurrentUrl(),"dashboard");
        System.out.println(driver.getTitle());
// For allure report type command in terminal : allure serve allure-results


    }

}
