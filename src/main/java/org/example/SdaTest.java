package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanss\\Desktop\\Software Development Academy\\Kody\\SdaFinalTest\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void sdaTest() {
        //Toto mi na jede na stranku tutorialpoint
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        //Toto mi zvetsi obrazovku
        driver.manage().window().setSize(new Dimension(1936, 1048));
        //Toto mi najde na strance prvek a vepise jmeno
        driver.findElement(By.id("name")).sendKeys("Jenda");
        //Toto mi najde na strance prvek a vepise mail
        driver.findElement(By.id("email")).sendKeys("email@email.cz");
    }


}
