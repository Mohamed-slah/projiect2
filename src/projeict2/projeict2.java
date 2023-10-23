package projeict2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class projeict2 {

	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void mySetup() {
		driver.get("https://www.saucedemo.com/");
		
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<WebElement> addtoCartButtons = driver.findElements(By.className("btn_primary"));
     
        List<WebElement> productNames = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> product_prices =driver.findElements(By.className("inventory_item_price"));

        for(int i = 0; i < addtoCartButtons.size(); i=i+2) {
            String productName = productNames.get(i).getText();
            addtoCartButtons.get(i).click();
            System.out.println("Product Name: " + productNames);
System.out.println(product_prices.get(i).getText() + "was added and the price of it is" + product_prices.get(i).getText()
);            
        }

        
	}

	@Test
	public void MyFirstTest() {

	}

	@AfterTest
	public void myPostTesting() {

	}
}
