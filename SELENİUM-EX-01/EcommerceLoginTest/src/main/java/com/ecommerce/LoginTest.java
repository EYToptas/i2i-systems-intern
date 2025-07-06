package com.ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.saucedemo.com/");
            WebElement username = driver.findElement(By.id("user-name"));
            username.sendKeys("standard_user");

            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("secret_sauce");

            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("inventory")) {
                System.out.println("✅ Login successful!");
            } else {
                System.out.println("❌ Login failed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
