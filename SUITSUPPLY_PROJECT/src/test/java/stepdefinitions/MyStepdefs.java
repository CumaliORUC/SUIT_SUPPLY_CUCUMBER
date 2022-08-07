package stepdefinitions;

import io.cucumber.java.en.*;
import org.apache.log4j.DailyRollingFileAppender;
import org.junit.Assert;
import org.openqa.selenium.*;
import page.SuitSupply_Page;
import utulities.ConfigReader;
import utulities.Driver;

import java.util.ArrayList;
import java.util.List;

public class MyStepdefs {
    SuitSupply_Page suitSupply_page=new SuitSupply_Page();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @When("Go to the {string}")
    public void goToThe(String pageUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(pageUrl));
    }

    @Then("Scroll Down the page to Custom suits")
    public void scroll_down_the_page_to_custom_suits() throws InterruptedException {
        //This will scroll the page till the element is found
        WebElement element = Driver.getDriver().findElement(By.xpath("(//p[@class='hero-display-subtitle-design cm-link'])[2]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(2000);
    }
    @Then("Click on Custom suits")
    public void click_on_custom_suits() {
        suitSupply_page.custom_Made_Element.click();
    }
    @Then("Scroll Down the page to Custom Made Coat")
    public void scroll_down_the_page_to_custom_made_coat() throws InterruptedException {
        WebElement element=Driver.getDriver().findElement(By.xpath("//*[contains(text(), 'Custom Made Coat')]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(2000);
    }
    @Then("Close cookies window")
    public void close_cookies_window() {
        suitSupply_page.cookies_Close_Button.click();
        if (suitSupply_page.switch_Location_close_Button.isDisplayed()) {
            suitSupply_page.switch_Location_close_Button.click();
        }
    }
    @Then("Click on Start Now")
    public void click_on_start_now() {
        suitSupply_page.custom_Made_Coat_StartNow.click();
    }
    @Then("Close message")
    public void close_message() {
        if(suitSupply_page.newForYou_Message_Close.isDisplayed()) {
            suitSupply_page.newForYou_Message_Close.click();
        }
    }
    @Then("Select {string}")
    public void select(String selection) throws InterruptedException {
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();

        shadow.findElement(By.cssSelector(".right-content")).click();
        List<String > searchList=new ArrayList<>();
        searchList.add("Blue");
        searchList.add("Pure Cashmere");
        searchList.add("Ferla (It)");
        searchList.add("White");
        searchList.add("Green");
        searchList.add("Plain");

        for (String each:searchList) {
            shadow.findElement(By.id("search-input")).clear();
            shadow.findElement(By.id("search-input")).sendKeys(each);
            Thread.sleep(2000);
        }
        shadow.findElement(By.id("search-input")).clear();
        shadow.findElement(By.id("search-input")).sendKeys(selection);
        Thread.sleep(2000);

    }
    @Then("Close Search box")
    public void close_search_box() throws InterruptedException {
        //This Element is inside 4 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = ".input-search.hydrated";
        String cssSelectorForHost3 = ".border-solid.body-small.size-small.shape-round.icon-only.background-light.hydrated";
        String cssSelectorForHost4 = ".hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".input-search.hydrated")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(".border-solid.body-small.size-small.shape-round.icon-only.background-light.hydrated")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow3.findElement(By.cssSelector(".susu-icons")).click();
    }
    @Then("Click to Filter")
    public void click_to_filter() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = ".filter-button.border-solid.body-small.size-regular.shape-squared.width-full.background-light.hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".filter-button.border-solid.body-small.size-regular.shape-squared.width-full.background-light.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector(".button")).click();
    }
    @Then("Click to checkboxes")
    public void click_to_checkboxes() throws InterruptedException {
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        Thread.sleep(500);
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        shadow.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmtm-filter-panel:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-filter:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ss-input-wrap:nth-child(2)")).click();
        shadow.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmtm-filter-panel:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-filter:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ss-input-wrap:nth-child(5)")).click();

        shadow.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmtm-filter-panel:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-filter:nth-child(1) > div:nth-child(3) > div:nth-child(2) > ss-input-wrap:nth-child(7)")).click();

        shadow.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmtm-filter-panel:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-filter:nth-child(1) > div:nth-child(4) > div:nth-child(2) > ss-input-wrap:nth-child(3)")).click();
        shadow.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmtm-filter-panel:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-filter:nth-child(1) > div:nth-child(4) > div:nth-child(2) > ss-input-wrap:nth-child(4)")).click();
    }
    @Then("Click to Next Button")
    public void click_to_next_button() throws InterruptedException {
        //This Element is inside 3 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = ".hydrated.size-l";
        String cssSelectorForHost3 = ".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".hydrated.size-l")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow2.findElement(By.cssSelector("span")).click();

    }
    @Then("Click Fit Box")
    public void click_fit_box() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "#b5f87861-824b-463b-99cb-fb78ade85fb8";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#b5f87861-824b-463b-99cb-fb78ade85fb8")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector("main")).click();
    }
    @Then("Select fit")
    public void select_fit() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "#_c470938d-928f-4b6e-8415-af479e20395d";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#_c470938d-928f-4b6e-8415-af479e20395d")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector(".lazyload")).click();
    }
    @Then("Click to Apply")
    public void click_to_apply() throws InterruptedException {
        //This Element is inside 3 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = " cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-modifier:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmtm-side-navigation:nth-child(1) > ss-side-sticky:nth-child(1)";
        String cssSelectorForHost3 = ".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-modifier:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmtm-side-navigation:nth-child(1) > ss-side-sticky:nth-child(1)")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow2.findElement(By.cssSelector("span")).click();
    }
    @Then("Click to Side Pocket Box")
    public void click_to_side_pocket_box() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = " cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(1) > div:nth-child(1) > ss-detail-button:nth-child(2)";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(1) > div:nth-child(1) > ss-detail-button:nth-child(2)")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector("main")).click();
    }
    @Then("Select Pocket Type")
    public void select_pocket_type() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "#_65c6d22e-f655-4fc1-9ac0-02d9203e41e5";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#_65c6d22e-f655-4fc1-9ac0-02d9203e41e5")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector(".lazyload")).click();
    }
    @Then("Click to Weistline Box")
    public void click_to_weistline_box() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = " cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(1) > div:nth-child(1) > ss-detail-button:nth-child(3)";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(1) > div:nth-child(1) > ss-detail-button:nth-child(3)")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector("main")).click();
    }
    @Then("Select Weistline Type")
    public void select_weistline_type() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "#_66b4b344-3f16-453d-8169-61284ec3128a";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#_66b4b344-3f16-453d-8169-61284ec3128a")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector(".lazyload")).click();
    }
    @Then("Click to Lenght Box")
    public void click_to_lenght_box() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = " cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(1) > div:nth-child(1) > ss-detail-button:nth-child(4)";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(1) > div:nth-child(1) > ss-detail-button:nth-child(4)")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector("main")).click();
    }
    @Then("Select Length Type")
    public void select_length_type() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "#_a34f8883-6f13-4fb5-9a5d-e2ed804424c0";
        Thread.sleep(1000);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#_a34f8883-6f13-4fb5-9a5d-e2ed804424c0")).getShadowRoot();
        Thread.sleep(1000);
        shadow1.findElement(By.cssSelector(".card-description")).click();
        Thread.sleep(2000);

        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost3 = "#_e127f69e-cf48-4d4f-af18-5d87e1374d8a";
        SearchContext shadow3 = shadow0.findElement(By.cssSelector("#_e127f69e-cf48-4d4f-af18-5d87e1374d8a")).getShadowRoot();
        Thread.sleep(1000);
        shadow3.findElement(By.cssSelector(".lazyload")).click();
    }
    @Then("Click to Lining Box")
    public void click_to_lining_box() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = " cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(1) > div:nth-child(1) > ss-detail-button:nth-child(5)";
        Thread.sleep(1000);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(1) > div:nth-child(1) > ss-detail-button:nth-child(5)")).getShadowRoot();
        Thread.sleep(1000);
        shadow1.findElement(By.cssSelector("main")).click();
    }
    @Then("Select Lining Type {string}")
    public void select_lining_type(String liningtype) throws InterruptedException {
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        Thread.sleep(1000);
        SearchContext shadow =  Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#search-input"));

        List<String > searchList=new ArrayList<>();
        searchList.add("Blue");
        searchList.add("Paisley Purple");
        searchList.add("Grey");
        searchList.add("White");
        searchList.add("Brown");
        searchList.add("Flower");

        for (String each:searchList) {
            shadow.findElement(By.id("search-input")).clear();
            shadow.findElement(By.id("search-input")).sendKeys(each);
            Thread.sleep(2000);
        }
        shadow.findElement(By.id("search-input")).clear();
        shadow.findElement(By.id("search-input")).sendKeys(liningtype);
        Thread.sleep(2000);

        //This Element is inside 2 nested shadow DOM.

        String cssSelectorForHost2 = "#_e1bd7bc1-0e77-49e2-85b1-8ee69f6f7353";
        Thread.sleep(1000);

        SearchContext shadow1 = shadow.findElement(By.cssSelector("#_e1bd7bc1-0e77-49e2-85b1-8ee69f6f7353")).getShadowRoot();
        Thread.sleep(1000);
        shadow1.findElement(By.cssSelector(".lazyload")).click();
    }
    @Then("Click to Buttons Box")
    public void click_to_buttons_box() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "#d20365b9-6a2e-4f88-9cca-40bd074a34c8";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#d20365b9-6a2e-4f88-9cca-40bd074a34c8")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector("main")).click();
    }
    @Then("Select the Button Type")
    public void select_the_button_type() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "#_1b7bd401-1b6f-4d30-b4ce-01b236704e13";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#_1b7bd401-1b6f-4d30-b4ce-01b236704e13")).getShadowRoot();
        Thread.sleep(500);
        js.executeScript("arguments[0].scrollIntoView();", shadow1.findElement(By.cssSelector(" div:nth-child(1) > div:nth-child(1)")));
        shadow1.findElement(By.cssSelector(" div:nth-child(1) > div:nth-child(1)")).click();
    }
    @When("Click to Get Start to create the size")
    public void click_to_get_start_to_create_the_size() throws InterruptedException {
        //This Element is inside 3 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-entry-page[class='hydrated']";
        String cssSelectorForHost3 = ".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-entry-page[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow2.findElement(By.cssSelector("span")).click();
    }
    @When("Click to Select Size")
    public void click_to_select_size() throws InterruptedException {
        //This Element is inside 3 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        String cssSelectorForHost3 = ".border-solid.body-small.dropdown.size-regular.shape-squared.width-full.background-light.hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(".border-solid.body-small.dropdown.size-regular.shape-squared.width-full.background-light.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow2.findElement(By.cssSelector("span")).click();
    }
    @When("Select {string} Size")
    public void select_size(String size_Number) throws InterruptedException {
        //This Element is inside 4 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        String cssSelectorForHost3 = ".grid.with-letters.cols-3.hydrated";
        String cssSelectorForHost4 = "ss-button[title='"+size_Number+"']";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(".grid.with-letters.cols-3.hydrated")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector("ss-button[title='"+size_Number+"']")).getShadowRoot();
        Thread.sleep(500);
        shadow3.findElement(By.cssSelector("span")).click();

    }
    @When("Click to Select Size Button")
    public void click_to_select_size_button() throws InterruptedException {
        //This Element is inside 4 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        String cssSelectorForHost3 = " ss-side-viewer:nth-child(1) > div:nth-child(2) > div:nth-child(1) > sp-size-picker:nth-child(2) > div:nth-child(3) > ss-side-sticky:nth-child(1)";
        String cssSelectorForHost4 = ".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(2) > div:nth-child(1) > sp-size-picker:nth-child(2) > div:nth-child(3) > ss-side-sticky:nth-child(1)")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow3.findElement(By.cssSelector(".button")).click();
    }
    @When("Change the scale size cm to inch and cm")
    public void change_the_scale_size_cm_to_inch_and_cm() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector(".toggle.toggle-off")).click();
        Thread.sleep(2000);
        shadow1.findElement(By.cssSelector(".toggle.toggle-on")).click();
    }
    @When("Click to Chest Width to How to measure Chest width")
    public void click_to_chest_width_to_how_to_measure_chest_width() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();

    }
    @When("Edit your selection and Apply")
    public void edit_your_selection_and_apply() throws InterruptedException {
        //This Element is inside 4 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        String cssSelectorForHost3 = " ss-side-viewer:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ss-side-sticky:nth-child(2) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1)";
        String cssSelectorForHost4 = " div:nth-child(1) > button:nth-child(3) > ss-icon:nth-child(1)";
        Thread.sleep(1000);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ss-side-sticky:nth-child(2) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(" div:nth-child(1) > button:nth-child(3) > ss-icon:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);
        shadow3.findElement(By.cssSelector(".susu-icons")).click();
        Thread.sleep(2000);
        //This Element is inside 4 nested shadow DOM.

        String cssSelectorForHost5 = " ss-side-viewer:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > ss-side-sticky:nth-child(2) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1)";
        String cssSelectorForHost6 = " div:nth-child(1) > button:nth-child(1) > ss-icon:nth-child(1)";

        Thread.sleep(1000);

        SearchContext shadow4 = shadow2.findElement(By.cssSelector(" div:nth-child(1) > button:nth-child(1) > ss-icon:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);
        shadow4.findElement(By.cssSelector(".susu-icons")).click();
        Thread.sleep(2000);
        shadow4.findElement(By.cssSelector(".susu-icons")).click();

        //This Element is inside 4 nested shadow DOM.

        String cssSelectorForHost7 = ".has-border-top.hydrated.size-l";
        String cssSelectorForHost8 = ".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated";
        Thread.sleep(500);

        SearchContext shadow5 = shadow1.findElement(By.cssSelector(".has-border-top.hydrated.size-l")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow6 = shadow5.findElement(By.cssSelector(".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow6.findElement(By.cssSelector(".button")).click();
    }
    @When("Click to Waist Width to How to measure Waist Width")
    public void click_to_waist_width_to_how_to_measure_waist_width() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();

    }
    @When("Click to Sleeve Length Left to How to measure it")
    public void click_to_sleeve_length_left_to_how_to_measure_it() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
    }
    @When("Click to Sleeve Length Right to How to measure it")
    public void click_to_sleeve_length_right_to_how_to_measure_it() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        js.executeScript("arguments[0].scrollIntoView();", shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1) > div:nth-child(1) > a:nth-child(1)")));
        shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
    }
    @When("Click to Coat Length to How to measure it")
    public void click_to_coat_length_to_how_to_measure_it() throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        js.executeScript("arguments[0].scrollIntoView();", shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1) > div:nth-child(1) > a:nth-child(1)")));

        shadow1.findElement(By.cssSelector(" ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > sp-size-detail-field:nth-child(1) > ss-numeric-range:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();

    }
    @When("Click to Save & Continue Button")
    public void click_to_save_continue_button() throws InterruptedException {
        //This Element is inside 4 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        String cssSelectorForHost3 = ".hydrated.size-l";
        String cssSelectorForHost4 = ".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(".hydrated.size-l")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow3.findElement(By.cssSelector("span")).click();
    }
    @When("Enter Your profile name {string} in the profile box")
    public void enter_your_profile_name_in_the_profile_box(String profile_Name) throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = "sp-editor[class='hydrated']";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("sp-editor[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector("#profile-name")).click();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector("#profile-name")).clear();
        Thread.sleep(500);
        shadow1.findElement(By.cssSelector("#profile-name")).sendKeys(profile_Name, Keys.ENTER);
    }
    @Then("Verify {string} is displayed at next Summary Page your selections")
    public void verify_is_displayed_at_next_summary_page_your_selections(String profile_Name) throws InterruptedException {
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = " cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(3) > div:nth-child(1) > sp-summary:nth-child(2)";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(" cmtm-tracking-layer:nth-child(1) > cmtm-configurator:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ss-side-viewer:nth-child(1) > div:nth-child(1) > div:nth-child(1) > cmtm-navigation:nth-child(1) > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > cmtm-section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > cmtm-section-group:nth-child(3) > div:nth-child(1) > sp-summary:nth-child(2)")).getShadowRoot();
        Thread.sleep(500);

        js.executeScript("arguments[0].scrollIntoView();", shadow1.findElement(By.cssSelector(" sp-summary-view:nth-child(1) > div:nth-child(3) > div:nth-child(1)")));

        System.out.println("My profile Name is ="+shadow1.findElement(By.cssSelector(" sp-summary-view:nth-child(1) > div:nth-child(3) > div:nth-child(1)")).getText());

        Assert.assertTrue(shadow1.findElement(By.cssSelector(" sp-summary-view:nth-child(1) > div:nth-child(3) > div:nth-child(1)")).getText().contains(profile_Name));

    }
    @Then("Click to Add Button")
    public void click_to_add_button() throws InterruptedException {
        //This Element is inside 3 nested shadow DOM.
        String cssSelectorForHost1 = "cmtm-root[class='hydrated']";
        String cssSelectorForHost2 = ".hydrated.size-l";
        String cssSelectorForHost3 = ".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated";
        Thread.sleep(500);
        SearchContext shadow0 = Driver.getDriver().findElement(By.cssSelector("cmtm-root[class='hydrated']")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".hydrated.size-l")).getShadowRoot();
        Thread.sleep(500);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(".border-solid.body-small.size-regular.shape-squared.width-full.background-dark.hydrated")).getShadowRoot();
        Thread.sleep(500);
        shadow2.findElement(By.cssSelector("span")).click();
    }
}
