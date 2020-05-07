package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCrudApp {

    @Test
    public void myTest() {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://emicoder.github.io/");
        String xpath = "/html/body/h1";
        WebElement element = driver.findElement(By.xpath(xpath));
        System.out.println(element.getText());
    }
}
