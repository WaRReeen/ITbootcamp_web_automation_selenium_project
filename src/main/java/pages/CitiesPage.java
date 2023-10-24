package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CitiesPage extends BasicPage {
    public CitiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getTheNewItemButton() {
        return driver.findElement(By.className("btnNewItem"));
    }

    public void clickOnTheNewItemButton() {
        getTheNewItemButton().click();
    }

    public WebElement getTheSearchInput() {
        return driver.findElement(By.id("search"));
    }

    public void clearAndTypeInSearchInput(String searchItem) {
        getTheSearchInput().clear();
        getTheSearchInput().sendKeys(searchItem);
    }

    public void waitForNewItemDialogToBeVisible() {
        wait.withMessage("After clicking on the new item button the dialog should be visible.")
                .until(ExpectedConditions.visibilityOf
                        (driver.findElement(By.cssSelector("div[tabindex='0'].v-dialog__content .v-card"))));
    }

    public WebElement getInputFromNewItemDialog() {
        return driver.findElement(By.id("name"));
    }
}
