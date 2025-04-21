package com.tesing.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormValidationTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://your-fd-form-url.com"); // Replace with actual form URL

        WebElement deposit = driver.findElement(By.id("depositAmount"));
        System.out.println("Deposit required? " + deposit.getAttribute("required"));

        Select tenureDropdown = new Select(driver.findElement(By.id("tenure")));
        for (WebElement option : tenureDropdown.getOptions()) {
            System.out.println("Dropdown option: " + option.getText());
        }

        WebElement submitBtn = driver.findElement(By.id("submitBtn"));
        System.out.println("Submit button enabled? " + submitBtn.isEnabled());

        deposit.sendKeys("10000");
        driver.findElement(By.id("rate")).sendKeys("7");
        tenureDropdown.selectByIndex(2);

        System.out.println("Submit button enabled after valid input? " + submitBtn.isEnabled());

        driver.quit();
    }
}
