package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.StartPage;

import static org.junit.Assert.assertEquals;

public class QuestionsList {

    private WebDriver driver;
    private String expectedFirstAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String expectedSecondAnswerText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String expectedThirdAnswerText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String expectedFourthAnswerText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String expectedFifthAnswerText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String expectedSixthAnswerText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String expectedSeventhAnswerText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String expectedEighthAnswerText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";



    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        }

    @Test
    public void FirstQuestion() {
        driver = new ChromeDriver();
        StartPage objectStartPage = new StartPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectStartPage.clickCookieButton();
        objectStartPage.clickFirstQuestion();
        String actualFirstAnswerText = objectStartPage.getFirstAnswerText();
        assertEquals(expectedFirstAnswerText, actualFirstAnswerText);
        System.out.println(actualFirstAnswerText);
    }

    @Test
    public void secondQuestion() {
        driver = new ChromeDriver();
        StartPage objectStartPage = new StartPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectStartPage.clickCookieButton();
        objectStartPage.clickSecondQuestion();
        String actualSecondAnswerText = objectStartPage.getSecondAnswerText();
        assertEquals(expectedSecondAnswerText, actualSecondAnswerText);
        System.out.println(actualSecondAnswerText);
    }

    @Test
    public void thirdQuestion() {
        driver = new ChromeDriver();
        StartPage objectStartPage = new StartPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectStartPage.clickCookieButton();
        objectStartPage.clickThirdQuestion();
        String actualThirdAnswerText = objectStartPage.getThirdAnswerText();
        assertEquals(expectedThirdAnswerText, actualThirdAnswerText);
        System.out.println(actualThirdAnswerText);
    }

    @Test
    public void fourthQuestion() {
        driver = new ChromeDriver();
        StartPage objectStartPage = new StartPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectStartPage.clickCookieButton();
        objectStartPage.clickFourthQuestion();
        String actualFourthAnswerText = objectStartPage.getFourthAnswerText();
        assertEquals(expectedFourthAnswerText, actualFourthAnswerText);
        System.out.println(actualFourthAnswerText);
    }

    @Test
    public void fifthQuestion() {
        driver = new ChromeDriver();
        StartPage objectStartPage = new StartPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectStartPage.clickCookieButton();
        objectStartPage.clickFifthQuestion();
        String actualFifthAnswerText = objectStartPage.getFifthAnswerText();
        assertEquals(expectedFifthAnswerText, actualFifthAnswerText);
        System.out.println(actualFifthAnswerText);
    }

    @Test
    public void sixthQuestion() {
        driver = new ChromeDriver();
        StartPage objectStartPage = new StartPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectStartPage.clickCookieButton();
        objectStartPage.clickSixthQuestion();
        String actualSixthAnswerText = objectStartPage.getSixthAnswerText();
        assertEquals(expectedSixthAnswerText, actualSixthAnswerText);
        System.out.println(actualSixthAnswerText);
    }

    @Test
    public void seventhQuestion() {
        driver = new ChromeDriver();
        StartPage objectStartPage = new StartPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectStartPage.clickCookieButton();
        objectStartPage.clickSeventhQuestion();
        String actualSeventhAnswerText = objectStartPage.getSeventhAnswerText();
        assertEquals(expectedSeventhAnswerText, actualSeventhAnswerText);
        System.out.println(actualSeventhAnswerText);
    }

    @Test
    public void eighthQuestion() {
        driver = new ChromeDriver();
        StartPage objectStartPage = new StartPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectStartPage.clickCookieButton();
        objectStartPage.clickEighthQuestion();
        String actualEighthAnswerText = objectStartPage.getEighthAnswerText();
        assertEquals(expectedEighthAnswerText, actualEighthAnswerText);
        System.out.println(actualEighthAnswerText);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
