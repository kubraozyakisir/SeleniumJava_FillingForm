import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        WebElement elementsButton= driver.findElement((By.xpath("//h5[normalize-space()='Elements']")));
        elementsButton.click();

        WebElement webTables = driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
        webTables.click();



  try {
       Thread.sleep(2000);
   }
   catch(InterruptedException e){
       throw  new RuntimeException(e);
   }
//farklılık olarak css'e göre path alma;
        WebElement addButton = driver. findElement(By.cssSelector("#addNewRecordButton"));
        addButton.click();

        WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
        name.sendKeys("Kübra");

        WebElement surname = driver.findElement(By.xpath("//input[@id='lastName']"));
        surname.sendKeys("Özyakışır");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("kbrozyksr@gmail.com");

        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.sendKeys("24");

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            throw  new RuntimeException(e);
        }
        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.sendKeys("25000");

        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.sendKeys("Web and Front-end Department");

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        try {
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            throw  new RuntimeException(e);
        }

        driver.quit();
    }
}
