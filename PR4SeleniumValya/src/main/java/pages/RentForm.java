package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentForm {
    private WebDriver driver;
    public RentForm(WebDriver driver) {
        this.driver = driver;
    }

    private By date = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    public void onClickDate() {
        driver.findElement(date).click();
    }

    private By calendar = By.cssSelector(".react-datepicker__day--026");
    public void onClickCalendar() {
        driver.findElement(calendar).click();
    }

    private By listPeriod = By.cssSelector(".Dropdown-placeholder");
    public void onClickListPeriod() {
        driver.findElement(listPeriod).click();
    }

    private By period = By.xpath(".//div[text()='пятеро суток']");
    public void onClickPeriod() {
        driver.findElement(period).click();
    }

    private By done = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    public void onDone() {
        driver.findElement(done).click();
    }

    private By doneModal = By.xpath(".//button[text()='Да' and @class='Button_Button__ra12g Button_Middle__1CSJM']");
    public void onDoneModal() {
        driver.findElement(doneModal).click();
    }
}
