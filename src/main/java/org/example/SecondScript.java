package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondScript {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/test/resources");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("(//div[@class='inventory_item_name'])")).click();
        driver.navigate().back();
        WebElement element = driver.findElement(By.xpath("(//select[@class='product_sort_container'])"));
        Select select = new Select(element);
        select.selectByValue("lohi");
        WebElement firstop = select.getFirstSelectedOption();
        System.out.println(firstop.getText());
        //This is a comment



    }
}
