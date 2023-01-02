package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserOrderForm {
    private WebDriver driver;
    public UserOrderForm(WebDriver driver) {
        this.driver = driver;
    }

    private By name = By.xpath(".//input[@placeholder='* Имя']");
    public void setName (String userName) {
        driver.findElement(name).sendKeys(userName);
    }

    private By surname  = By.xpath(".//input[@placeholder='* Фамилия']");
    public void setSurname (String userSurname) {
        driver.findElement(surname).sendKeys(userSurname);
    }

    private By address  = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    public void setAddress (String userAddress) {
        driver.findElement(address).sendKeys(userAddress);
    }

    private By listOfMetro  = By.xpath(".//input[@class='select-search__input']");
    public void onClickListOfMetro() {
        driver.findElement(listOfMetro).click();
    }

    private By chooseStation  = By.xpath(".//button[@value='8']");
    public void onClickStation() {
        driver.findElement(chooseStation).click();
    }

    private By phone  = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    public void setPhone (String userPoneNumber) {
        driver.findElement(phone).sendKeys(userPoneNumber);
    }

    private By done = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public void onDone() {
        driver.findElement(done).click();
    }
}
