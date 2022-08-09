package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cookieButton = By.id("rcc-confirm-button");

    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }

    private By firstQuestion = By.id("accordion__heading-0");
    private By firstAnswerText = By.xpath(".//div[@id='accordion__panel-0']/p");

    public void clickFirstQuestion() {
        driver.findElement(firstQuestion).click();
    }

    public String getFirstAnswerText() {
        return driver.findElement(firstAnswerText).getText();
    }


    private By secondQuestion = By.id("accordion__heading-1");
    private By secondAnswerText = By.xpath(".//div[@id='accordion__panel-1']/p");

    public void clickSecondQuestion() {
        driver.findElement(secondQuestion).click();
    }

    public String getSecondAnswerText() {
        return driver.findElement(secondAnswerText).getText();
    }

    private By thirdQuestion = By.id("accordion__heading-2");
    private By thirdAnswerText = By.xpath(".//div[@id='accordion__panel-2']/p");

    public void clickThirdQuestion() {
        driver.findElement(thirdQuestion).click();
    }

    public String getThirdAnswerText() {
        return driver.findElement(thirdAnswerText).getText();
    }

    private By fourthQuestion = By.id("accordion__heading-3");
    private By fourthAnswerText = By.xpath(".//div[@id='accordion__panel-3']/p");

    public void clickFourthQuestion() {
        driver.findElement(fourthQuestion).click();
    }

    public String getFourthAnswerText() {
        return driver.findElement(fourthAnswerText).getText();
    }

    private By fifthQuestion = By.id("accordion__heading-4");
    private By fifthAnswerText = By.xpath(".//div[@id='accordion__panel-4']/p");

    public void clickFifthQuestion() {
        driver.findElement(fifthQuestion).click();
    }

    public String getFifthAnswerText() {
        return driver.findElement(fifthAnswerText).getText();
    }

    private By sixthQuestion = By.id("accordion__heading-5");
    private By sixthAnswerText = By.xpath(".//div[@id='accordion__panel-5']/p");

    public void clickSixthQuestion() {
        driver.findElement(sixthQuestion).click();
    }

    public String getSixthAnswerText() {
        return driver.findElement(sixthAnswerText).getText();
    }

    private By seventhQuestion = By.id("accordion__heading-6");
    private By seventhAnswerText = By.xpath(".//div[@id='accordion__panel-6']/p");

    public void clickSeventhQuestion() {
        driver.findElement(seventhQuestion).click();
    }

    public String getSeventhAnswerText() {
        return driver.findElement(seventhAnswerText).getText();
    }

    private By eighthQuestion = By.id("accordion__heading-7");
    private By eighthAnswerText = By.xpath(".//div[@id='accordion__panel-7']/p");

    public void clickEighthQuestion() {
        driver.findElement(eighthQuestion).click();
    }

    public String getEighthAnswerText() {
        return driver.findElement(eighthAnswerText).getText();
    }


    private By TopButtonOfOrder = By.className("Button_Button__ra12g");

    public void clickTopButtonOfOrder() {
        driver.findElement(TopButtonOfOrder).click();
    }

    private By BottomButtonOfOrder = By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button");

    public void clickBottomButtonOfOrder() {
        driver.findElement(BottomButtonOfOrder).click();
    }
}