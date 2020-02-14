package com.paysuper.appmanager.pages;

import com.paysuper.appmanager.helpers.Locators;
import org.openqa.selenium.WebDriver;


public class PayFormPage extends AbstractPage{
    public PayFormPage(WebDriver driver){
        super(driver);
        waitForPageLoad("DemoFormPage.formLayout");
    }

    public void selectCountry(){
        if(isElementPresent("DemoFormPage.formWarningArea") & isElementPresent("DemoFormPage.countrySelectField")){
            driver.findElement(Locators.get("DemoFormPage.countrySelectField")).click();
        }
    }

    public void selectLanguage(){
        String lang = driver.findElement(Locators.get("DemoFormPage.languageSelectField")).getText();
        System.out.println(lang);

    }

//_______________QA_________

    public void cliackNumbercard(){
        driver.findElement(Locators.get("DemoFormPage.numbercardSelectedField")).click();
    }

    public void enterNumbercard(String visaIdcard){
        driver.findElement(Locators.get("DemoFormPage.numbercardSelectedField")).sendKeys(visaIdcard);
    }

    public void cliackdatacard(){
        driver.findElement(Locators.get("DemoFormPage.datacardSelectField")).click();
    }

    public void enterdatacard(String datacard){
        driver.findElement(Locators.get("DemoFormPage.datacardSelectField")).sendKeys(datacard);
    }

    public void cliackcvvcard(){
        driver.findElement(Locators.get("DemoFormPage.cvvcardSelectField")).click();
    }

    public void entercvvcard(String cvvcard){
        driver.findElement(Locators.get("DemoFormPage.cvvcardSelectField")).sendKeys(cvvcard);
    }

    public void cliackemailcard(){
        driver.findElement(Locators.get("DemoFormPage.emailcardSelectField")).click();
    }

    public void enteremailcard(String emailcard){
        driver.findElement(Locators.get("DemoFormPage.emailcardSelectField")).sendKeys(emailcard);
    }

    public void cliackbuyButton(){
        driver.findElement(Locators.get("DemoFormPage.buyButton")).click();
    }

    // Перенаправление и нужно ожидание загрузки
    /*public void cliackSucsses(){
        if(isElementPresent("DemoFormPage.emulatorOk") & isElementPresent("DemoFormPage.emulatorOk")){
            driver.findElement(Locators.get("DemoFormPage.emulatorOk")).click();
        }
    }*/

    public void cliackOkBuy(){
        //if(isElementPresent("DemoFormPage.okBuy") & isElementPresent("DemoFormPage.okBuy"))
        {
            driver.findElement(Locators.get("DemoFormPage.okBuy")).click();
        }
    }

    public PayFormPage inputUserData (String visaIdcard, String datacard, String cvvcard, String emailcard){

        selectLanguage();
        cliackNumbercard();
        enterNumbercard(visaIdcard);
        cliackdatacard();
        enterdatacard(datacard);
        cliackcvvcard();
        entercvvcard(cvvcard);
        cliackemailcard();
        enteremailcard(emailcard);
        cliackbuyButton();
        cliackOkBuy();


        return new PayFormPage(driver);
    }


}
