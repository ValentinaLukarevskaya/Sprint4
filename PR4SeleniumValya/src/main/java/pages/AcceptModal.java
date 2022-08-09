package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcceptModal {
        private WebDriver driver;
        public AcceptModal(WebDriver driver) {
                this.driver = driver;
        }

        private By modalAccept = By.cssSelector(".Order_ModalHeader__3FDaJ");
        public String getTitleAcceptModel() {
                return driver.findElement(modalAccept).getText();
        }
}
