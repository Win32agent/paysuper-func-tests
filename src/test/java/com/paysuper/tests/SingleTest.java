package com.paysuper.tests;

import com.paysuper.appmanager.pages.PayFormPage;
import org.testng.annotations.Test;




public class SingleTest extends TestBase {

    @Test()
    public void test() {
        String payment_form_url = app.restAPI.createOrder(
                app.getProperties.value("projectid"),
                Integer.parseInt(app.getProperties.value("amount")),
                app.getProperties.value("currency"),
                app.getProperties.value("ApiUrlCheckout")).jsonPath().get("payment_form_url");
        System.out.println(payment_form_url);
        app.driver.get(payment_form_url);
        PayFormPage payFormPage =new PayFormPage(app.driver);
        payFormPage.selectLanguage();
        payFormPage.cliackNumbercard();
        payFormPage.enterNumbercard(app.getProperties.value("visaIdcard"));
        payFormPage.cliackdatacard();
        payFormPage.enterdatacard(app.getProperties.value("datacard"));
        payFormPage.cliackcvvcard();
        payFormPage.entercvvcard(app.getProperties.value("cvvcard"));
        payFormPage.cliackemailcard();
        payFormPage.enteremailcard(app.getProperties.value("emailcard"));
        payFormPage.cliackbuyButton();
        //payFormPage.cliackSucsses();
        payFormPage.cliackOkBuy();

    }
}
