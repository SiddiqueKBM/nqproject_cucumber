package pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import util.Base;

import java.util.List;

public class ClientPage extends Base {

    //******************** WebElements Defined *****************************
    @FindBy(xpath = "")
    WebElement clientField;

    @FindBy(xpath = "")
    WebElement mullinTBGCodeField;

    @FindBy(xpath = "")
    WebElement activeCheckBox;

    @FindBy(xpath = "")
    WebElement reportNameField;

    @FindBy(xpath = "")
    WebElement taxIDField;

    @FindBy(xpath = "")
    WebElement uniqueIDDropdown;

    @FindBy(xpath = "")
    WebElement commonIDCheckBox;

    @FindBy(xpath = "")
    WebElement vestedBalanceCheckBox;

    @FindBy(xpath = "")
    WebElement streetNameField;

    @FindBy(xpath = "")
    WebElement phoneNumberField;

    @FindBy(xpath = "")
    WebElement faxNumberField;

    @FindBy(xpath = "")
    WebElement cityNameField;

    @FindBy(xpath = "")
    WebElement stateNameField;

    @FindBy(xpath = "")
    WebElement zipCodeField;

    @FindBy(xpath = "")
    WebElement contactField;

    @FindBy(xpath = "")
    WebElement countryField;

    @FindBy(xpath = "")
    WebElement emailField;

    @FindBy(xpath = "")
    WebElement consultantDropdown;

    @FindBy(xpath = "")
    WebElement faMGRDropdown;

    @FindBy(xpath = "")
    WebElement fa1Dropdown;

    @FindBy(xpath = "")
    WebElement crmDropdown;

    @FindBy(xpath = "")
    WebElement fa2dropdown;

    @FindBy(xpath = "")
    WebElement stlDropdown;

    @FindBy(xpath = "")
    WebElement dropdown;

    @FindBy(xpath = "")
    WebElement accountManageDropdown;

    @FindBy(xpath = "")
    WebElement auditor1Dropdown;

    @FindBy(xpath = "")
    WebElement auditor2Dropdown;

    @FindBy(xpath = "")
    WebElement invesmentAnalystDropdown;

    @FindBy(xpath = "")
    WebElement ssoUniqueIDDropdown;

    @FindBy(xpath = "")
    WebElement doNotAllowAdditionsCheckBox;

    @FindBy(xpath = "")
    WebElement ssoHomeField;

    @FindBy(xpath = "")
    WebElement ssoContactUsField;

    @FindBy(xpath = "")
    WebElement pssHomeField;

    @FindBy(xpath = "")
    WebElement saveBtn;


    //******************** Methods ***************************************8

    public void testClientField(){
        clientField.sendKeys("Test Client 1");
    }

    public void testMullinTBGCodeField(){
        mullinTBGCodeField.sendKeys("TBGC01");
    }

    public boolean testActiveCheckBox(){
        boolean status = activeCheckBox.isSelected();
        if(status){activeCheckBox.click();}
        return status;
    }

    public void testReportNameField(){
        reportNameField.sendKeys("Test Client 1 - Report Name");
    }

    public void testTaxIDField(){
        taxIDField.sendKeys("1111111");
    }

    public void clickUniqueIDDropdown(){
        uniqueIDDropdown.click();
    }

    public boolean testUniqueIDDropdownOptions(){
        boolean flag = false;
        String [] expectedOptions = {"SSN","Employment ID","Participant ID","Other"};
        Select drpUniqueID = new Select(uniqueIDDropdown);
        List<WebElement> options = drpUniqueID.getOptions();
        while (expectedOptions.length == options.size()) {
            for (int i = 0; i <= options.size(); i++) {
                if (options.get(i).getText() == expectedOptions[i])
                    flag = true;
            }
        }

        return flag;
    }

    public void selectRecordUniqueIDDropdown(){
        uniqueIDDropdown.click();
        Select record = new Select(uniqueIDDropdown);
        record.selectByIndex(1);
    }

    public void checkCommonIDCheckBox(){
        if(!commonIDCheckBox.isSelected())commonIDCheckBox.click();
    }

    public void checkVestedBalanceCheckBox(){
        if(!vestedBalanceCheckBox.isSelected())vestedBalanceCheckBox.click();
    }

    public void testStreetNameField(){
        streetNameField.sendKeys("125 13th Street");
    }

    public void testPhoneNumberField(){
        phoneNumberField.sendKeys("3101234567");
    }

    public void testFaxNumberField(){
        faxNumberField.sendKeys("3109999999");
    }

    public void testCityNameField(){
        cityNameField.sendKeys("El Segundo");
    }

    public void testStateNameField(){
        stateNameField.sendKeys("CA");
    }

    public void testContactField(){
        contactField.sendKeys("QE Team");
    }

    public void testZipField(){
        zipCodeField.sendKeys("12345");
    }

    public void testCountryNameField(){
        countryField.sendKeys("USA");
    }

    public void testEmailField(){
        emailField.sendKeys("nqtesting@prudential.com");
    }

    public void testConsultantDropdown(){
        consultantDropdown.click();
        Select record = new Select(consultantDropdown);
        record.selectByIndex(1);
    }

    public void testFaMgrDropdown(){
        faMGRDropdown.click();
        Select record = new Select(faMGRDropdown);
        record.selectByIndex(9);
    }

    public void testFa1Dropdown(){
        fa1Dropdown.click();
        Select record = new Select(fa1Dropdown);
        record.selectByIndex(9);
    }

    public void testCRMDropdown(){
        crmDropdown.click();
        Select record = new Select(crmDropdown);
        record.selectByIndex(9);
    }


    public void testFa2Dropdown(){
        fa2dropdown.click();
        Select record = new Select(fa2dropdown);
        record.selectByIndex(9);
    }


    public void testStlDropdown(){
        stlDropdown.click();
        Select record = new Select(stlDropdown);
        record.selectByIndex(9);
    }


    public void testAccountManageDropdown(){
        accountManageDropdown.click();
        Select record = new Select(accountManageDropdown);
        record.selectByIndex(9);
    }


    public void testAuditor1Dropdown(){
        auditor1Dropdown.click();
        Select record = new Select(auditor1Dropdown);
        record.selectByIndex(9);
    }


    public void testAuditor2Dropdown(){
        auditor2Dropdown.click();
        Select record = new Select(auditor2Dropdown);
        record.selectByIndex(9);
    }

    public void testInvestmentAnalystDropdown(){
        invesmentAnalystDropdown.click();
        Select record = new Select(invesmentAnalystDropdown);
        record.selectByIndex(9);
    }

    public void checkDoNotAllowAdditionsCheckBox(){
        if(!doNotAllowAdditionsCheckBox.isSelected())doNotAllowAdditionsCheckBox.click();
    }

    public void testSSOUniqueIDDropdown(){
        ssoUniqueIDDropdown.click();
        Select record = new Select(ssoUniqueIDDropdown);
        record.selectByIndex(0);
    }


    public void testSSOHomepageField(){
        ssoHomeField.sendKeys("SSO Home Page");
    }


    public void testSSOContactUsField(){
        ssoContactUsField.sendKeys("SSO Contact Us");
    }


    public void testPSSHomeField(){
        pssHomeField.sendKeys("PSS Home Page");
    }

    public void clickSaveButton(){
        saveBtn.click();
    }

    public void verifyWindowTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Client Information - {client id} [VIEW]";
        Assert.assertEquals(actualTitle, expectedTitle);
    }



}
