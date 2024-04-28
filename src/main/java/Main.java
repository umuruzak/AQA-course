import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
        WebElement cookieAcceptButton = driver.findElement(By.xpath("//button[@class=\"btn btn_black cookie__ok\"]"));
        cookieAcceptButton.click();

        //1)
        WebElement nameOfBlock = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//h2[contains(text(), \"пополнение\")]"));
        assertEquals("Онлайн пополнение\nбез комиссии", nameOfBlock.getText());

        //2)
        List<WebElement> payPartnersLogos = driver.findElements(By.xpath("//div[@id=\"pay-section\"]//div[@class=\"pay__partners\"]//li/img"));
        for(int i = 0; i < payPartnersLogos.size(); i++){
            assertTrue(payPartnersLogos.get(i).isDisplayed());
        }

        //3)
        WebElement link = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//a[contains(text(), \"Подробнее о сервисе\")]"));
        try {
            URL url = new URL(link.getAttribute("href"));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            int responseCode = connection.getResponseCode();
            connection.disconnect();
            assertEquals(200, responseCode);
        } catch (Exception e){
            System.err.println("Ошибка при переходе по ссылке " + e.getMessage());
        }

        //4)
        WebElement inputPhone = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//form[@id=\"pay-connection\"]//input[@class=\"phone\"]"));
        WebElement inputSum = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//form[@id=\"pay-connection\"]//input[@class=\"total_rub\"]"));
        WebElement inputEmail = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//form[@id=\"pay-connection\"]//input[@class=\"email\"]"));
        WebElement submit = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//form[@id=\"pay-connection\"]/button"));

        inputPhone.click();
        inputPhone.sendKeys("297777777");
        inputSum.click();
        inputSum.sendKeys("100");
        inputEmail.click();
        inputEmail.sendKeys("xoyomaj958@em2lab.com");
        submit.click();

        WebElement payWidget = driver.findElement(By.xpath("//div[@class=\"bepaid-app\"]"));
        assertTrue(payWidget.isDisplayed());

        driver.quit();

    }
}
