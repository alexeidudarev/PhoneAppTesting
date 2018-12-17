package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsHelper extends HelperBase {
    public ElementsHelper(WebDriver dr) {
        super(dr);
    }
    public int getNumberOfContacts() {
        return  driver.findElements(By.xpath("//*[@name='selected[]']")).size();
    }
    public void searchItemOnEbaySite(String item_to_search){
        click(By.id("gh-ac"));
        clear(By.id("gh-ac"));
        type(By.id("gh-ac"), item_to_search);
        click(By.id("gh-btn"));
    }
    public int getNumbersOfItemExpected(){
        //click(By.cssSelector("div.srp-save-search__tooltip srp-save-search__tooltip--shown"));
        int num = Integer.valueOf(driver.findElement(By.cssSelector("span.rcnt")).getText());
        return num;
    }
    public int getNumbersOfItemActual(){
        return driver.findElements(By.partialLinkText("Appium essentials")).size();
    }
}
