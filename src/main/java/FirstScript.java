import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstScript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //open google webpage
        driver.get("https://google.com");
        //to maximize the window
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if(title.equals("Google")){
            System.out.println("correct title");
        }else {
            System.out.println("incorrect title");
        }
        //print all the links on this page
        List<WebElement> elm = driver.findElements(By.tagName("a"));
        for(WebElement e: elm){
            System.out.println(e.getText());
        }


    }
}
