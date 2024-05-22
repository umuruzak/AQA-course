import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

public class MTSTest {
    private static WebDriver driver;
    private static WebDriverWait driverWait;
    private static WebElement optionSelector;
    private static WebElement connectionSelector;
    private String phoneNumber = "297777777";
    private String sum = "100.00";
    private String email = "xoyomaj958@em2lab.com";

    @BeforeAll
    static void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookieAcceptButton = driver.findElement(By.xpath("//button[@class=\"btn btn_black cookie__ok\"]"));
        cookieAcceptButton.click();

        optionSelector = driver.findElement(By.xpath("//div[@class=\"pay__form\"]//button[@class=\"select__header\"]"));
        connectionSelector = driver.findElement(By.xpath("//div[@class=\"pay__form\"]//ul[@class=\"select__list\"]//p[contains(text(), \"Услуги связи\")]"));
    }

    @Test
    @DisplayName("Test connection service fields")
    @Description("Checking the fields of the communication service payment form")
    void connectionFieldsCheck(){
        optionSelector.click();
        connectionSelector.click();

        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class=\"select__now\"]"), "Услуги связи"));
        assertEquals("Номер телефона",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"phone\"]")).getAttribute("placeholder"));
        assertEquals("Сумма",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"total_rub\"]")).getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"email\"]")).getAttribute("placeholder"));
    }

    @Test
    @DisplayName("Test internet service fields")
    @Description("Checking the fields of internet service payment form")
    void internetFieldsCheck(){
        WebElement internetSelector = driver.findElement(By.xpath("//div[@class=\"pay__form\"]//ul[@class=\"select__list\"]//p[contains(text(), \"Домашний интернет\")]"));
        optionSelector.click();
        internetSelector.click();

        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class=\"select__now\"]"), "Домашний интернет"));
        assertEquals("Номер абонента",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"phone\"]")).getAttribute("placeholder"));
        assertEquals("Сумма",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"total_rub\"]")).getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"email\"]")).getAttribute("placeholder"));
    }

    @Test
    @DisplayName("Test instalment service fields")
    @Description("Checking the fields of instalment service payment form")
    void instalmentFieldsCheck(){
        WebElement instalmentSelector = driver.findElement(By.xpath("//div[@class=\"pay__form\"]//ul[@class=\"select__list\"]//p[contains(text(), \"Рассрочка\")]"));
        optionSelector.click();
        instalmentSelector.click();

        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class=\"select__now\"]"), "Рассрочка"));
        assertEquals("Номер счета на 44",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"score\"]")).getAttribute("placeholder"));
        assertEquals("Сумма",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"total_rub\"]")).getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"email\"]")).getAttribute("placeholder"));
    }

    @Test
    @DisplayName("Test arrears service fields")
    @Description("Checking the fields of arrears service payment form")
    void arrearsFieldsCheck(){
        WebElement arrearsSelector = driver.findElement(By.xpath("//div[@class=\"pay__form\"]//ul[@class=\"select__list\"]//p[contains(text(), \"Задолженность\")]"));
        optionSelector.click();
        arrearsSelector.click();

        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class=\"select__now\"]"), "Задолженность"));
        assertEquals("Номер счета на 2073",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"score\"]")).getAttribute("placeholder"));
        assertEquals("Сумма",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"total_rub\"]")).getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека",
                driver.findElement(By.xpath("//div[@class=\"pay__form\"]//form[@class=\"pay-form opened\"]//input[@class=\"email\"]")).getAttribute("placeholder"));
    }

    @Test
    @DisplayName("Test payment frame")
    @Description("Checking the fields of payment frame")
    void payFrameFieldsAndIconsCheck(){
        optionSelector.click();
        connectionSelector.click();
        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@class=\"select__now\"]"), "Услуги связи"));

        WebElement inputPhone = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//form[@class=\"pay-form opened\"]//input[@class=\"phone\"]"));
        WebElement inputSum = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//form[@class=\"pay-form opened\"]//input[@class=\"total_rub\"]"));
        WebElement inputEmail = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//form[@class=\"pay-form opened\"]//input[@class=\"email\"]"));
        WebElement submit = driver.findElement(By.xpath("//div[@id=\"pay-section\"]//form[@class=\"pay-form opened\"]/button"));

        inputPhone.click();
        inputPhone.sendKeys(phoneNumber);
        inputSum.click();
        inputSum.sendKeys(sum);
        inputEmail.click();
        inputEmail.sendKeys(email);
        submit.click();
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class=\"bepaid-app\"]/div/iframe")));

        assertEquals(sum, driver.findElement(By.xpath("/html//div[@class=\"pay-description__cost\"]/span[1]")).getAttribute("innerText").split(" ")[0]);
        assertEquals(sum, driver.findElement(By.xpath("/html/body/app-root//button[@type=\"submit\"]")).getAttribute("innerText").split(" ")[1]);
        String phoneNumberToCompare = driver.findElement(By.xpath("/html/body/app-root//span[@class=\"pay-description__text\"]")).getAttribute("innerText");
        assertEquals("375" + phoneNumber, phoneNumberToCompare.substring(phoneNumberToCompare.length()-12, phoneNumberToCompare.length()));

        assertEquals("Номер карты",
                driver.findElement(By.xpath("/html//input[@formcontrolname=\"creditCard\"]/../label")).getAttribute("innerText"));
        assertEquals("Срок действия",
                driver.findElement(By.xpath("/html//input[@formcontrolname=\"expirationDate\"]/../label")).getAttribute("innerText"));
        assertEquals("CVC",
                driver.findElement(By.xpath("/html//input[@formcontrolname=\"cvc\"]/../label")).getAttribute("innerText"));
        assertEquals("Имя держателя (как на карте)",
                driver.findElement(By.xpath("/html//input[@formcontrolname=\"holder\"]/../label")).getAttribute("innerText"));

        List<WebElement> imgList = driver.findElements(By.xpath("/html//input[@formcontrolname=\"creditCard\"]/../..//img"));
        for(int i = 0; i < 3; i++){
            assertTrue(imgList.get(i).isDisplayed());
        }
        driverWait.until(ExpectedConditions.visibilityOf(imgList.get(3)));
        assertTrue(imgList.get(3).isDisplayed());
        driverWait.until(ExpectedConditions.visibilityOf(imgList.get(4)));
        assertTrue(imgList.get(4).isDisplayed());

        WebElement closeButton = driver.findElement(By.xpath("/html//app-back-navigation//svg-icon"));
        closeButton.click();
        driver.switchTo().defaultContent();
    }

    @AfterAll
    static void close(){
        driver.quit();
    }
}
