/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author 18477
 */
public class JcPenneyLoginTest {
    
    private WebDriver driver;
    private String baseUrl;
    
    public JcPenneyLoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    public void testJcpenneyLogin() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c://data//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jcpenney.com/");

        driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
        driver.get("https://www.jcpenney.com/");
        driver.findElement(By.xpath("//*[@id=\"accountBlock\"]/div/div/div/button/div/div/p[2]")).click();
        driver.findElement(By.id("loginEmail")).click();
        driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("nene4y@yahoo.com");
        Thread.sleep(3000); 
        driver.findElement(By.id("pwd")).click();
        driver.findElement(By.xpath("//main[@id='mainContainerBlock']/div[6]/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("Ireoluwa@101");
        driver.findElement(By.xpath("//*[@id=\"mainContainerBlock\"]/div[6]/div/div[2]/div/div[1]/div[2]/form/div/div/div[5]/button")).click();
        driver.findElement(By.id("mainContainerBlock")).click();
        driver.findElement(By.id("searchInputId")).click();
        driver.findElement(By.id("searchInputId")).clear();
        driver.findElement(By.id("searchInputId")).sendKeys("suit");
        driver.findElement(By.cssSelector(".typeaheadFocusInputContent")).submit();
        driver.findElement(By.xpath("//img[@alt='JF J. Ferrar® 360 Stretch Slim Fit Suit Jacket']")).click();
        driver.findElement(By.xpath("//div[@id='product-options-false']/div[2]/div/section/ul/li/button")).click();
        driver.findElement(By.xpath("//div[@id='product-options-false']/div[2]/div/section/ul/li/button")).click();
        
        //driver.findElement(By.id("//*[@id=\"gallery-product-list\"]/div[2]/div/ul/li[9]/div/div/div/div/div[1]/div/a/div/div/div/img")).click();
        //driver.findElement(By.id("mainContainerBlock")).click();
        //driver.findElement(By.xpath("//*[@id=\"product-image-wrapper\"]/div/div[2]/div[1]/div/a/div/div/img")).click();
        //driver.findElement(By.xpath("//div[@id='GlobalOptions-AddToCart']/button/div/p[2]")).click();
       // driver.findElement(By.xpath("//div[@id='atPanelContent']/div/div/section/section/section/div[2]/div/button")).click();

        Thread.sleep(6000);     	// Waits for 4 seconds before closing google browser
        //driver.close();         	// closes the browser

    }

    private void assertEquals(String jf_j_Ferrar_360_Stretch_Slim_Fit_Suit_Jac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(String jf_j_Ferrar_360_Stretch_Slim_Fit_Suit_Jac, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
