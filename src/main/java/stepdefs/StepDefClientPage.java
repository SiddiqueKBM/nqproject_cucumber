package stepdefs;

import cucumber.api.java.Before;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.ClientPage;
import util.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefClientPage extends Base {
    ClientPage clientPage;

    @Before
    public void initializingPageObject(){
        clientPage = PageFactory.initElements(driver, ClientPage.class);
    }

    @When("^enters 'Test Client (\\d+)' in 'Client' field$")
    public void enters_Test_Client_in_Client_field(int arg1) throws Throwable {
        clientPage.testClientField();
    }

    @When("^enters 'TBGC(\\d+)' in 'MullinTBG Code' field$")
    public void enters_TBGC_in_MullinTBG_Code_field(int arg1) throws Throwable {
        clientPage.testMullinTBGCodeField();
    }

    @When("^'Active' check box is unchedcked$")
    public void active_check_box_is_unchedcked() throws Throwable {
        boolean status = clientPage.testActiveCheckBox();
        Assert.assertTrue(!status);
    }

    @When("^enters 'Test Client (\\d+) - Report Name' in 'Report Name' field$")
    public void enters_Test_Client_Report_Name_in_Report_Name_field(int arg1) throws Throwable {
        clientPage.testReportNameField();
    }

    @When("^enters <Tax ID> in 'Tax ID' field$")
    public void enters_Tax_ID_in_Tax_ID_field() throws Throwable {
        clientPage.testTaxIDField();
    }

    @When("^click the 'Unique ID' dropdown$")
    public void click_the_Unique_ID_dropdown() throws Throwable {
        clientPage.clickUniqueIDDropdown();
    }

    @Then("^the 'Unique ID' values and order in the list should be:$")
    public void the_Unique_ID_values_and_order_in_the_list_should_be(DataTable arg1) throws Throwable {
        boolean flag = clientPage.testUniqueIDDropdownOptions();
        Assert.assertTrue(flag);
    }

//    @When("^user selects the (\\d+)nd record from then 'Unique ID' dropdown list$")
//    public void user_selects_the_nd_record_from_then_Unique_ID_dropdown_list(int arg1) throws Throwable {
//
//    }

    @When("^checks the 'Common ID' plan checkbox$")
    public void checks_the_Common_ID_plan_checkbox() throws Throwable {
        clientPage.checkCommonIDCheckBox();
    }

    @When("^checks the 'Don 't Display Vested Balance on Plan Sponsor Site' checkbox is checked$")
    public void checks_the_Don_t_Display_Vested_Balance_on_Plan_Sponsor_Site_checkbox_is_checked() throws Throwable {
        clientPage.checkVestedBalanceCheckBox();
    }

    @When("^enters '(\\d+) (\\d+)th Street' in 'Street Name' field$")
    public void enters_th_Street_in_Street_Name_field(int arg1, int arg2) throws Throwable {
        clientPage.testStreetNameField();
    }

    @When("^enters '(\\d+)' in 'Phone number' field$")
    public void enters_in_Phone_number_field(int arg1) throws Throwable {
        clientPage.testPhoneNumberField();
    }

    @When("^enters '(\\d+)' in 'Fax number' field$")
    public void enters_in_Fax_number_field(int arg1) throws Throwable {
        clientPage.testFaxNumberField();
    }

    @When("^enters 'El Segundo' in 'City Name' field$")
    public void enters_El_Segundo_in_City_Name_field() throws Throwable {
        clientPage.testCityNameField();
    }

    @When("^enters 'CA' in 'State' field$")
    public void enters_CA_in_State_field() throws Throwable {
        clientPage.testStateNameField();
    }

    @When("^enters 'QE Team' in 'Contact' field$")
    public void enters_QE_Team_in_Contact_field() throws Throwable {
        clientPage.testContactField();
    }

    @When("^enters '(\\d+)' in 'Zip' field$")
    public void enters_in_Zip_field(int arg1) throws Throwable {
        clientPage.testZipField();
    }

    @When("^enters 'USA' in 'Country' field$")
    public void enters_USA_in_Country_field() throws Throwable {
        clientPage.testCountryNameField();
    }

    @When("^enters 'nqtesting@prudential\\.com' in 'Email' field$")
    public void enters_nqtesting_prudential_com_in_Email_field() throws Throwable {
        clientPage.testEmailField();
    }

    @When("^selects the (\\d+)nd record form the 'Consultant' droposown list$")
    public void selects_the_nd_record_form_the_Consultant_droposown_list(int arg1) throws Throwable {
        clientPage.testConsultantDropdown();
    }

    @When("^selects the (\\d+)nd record form the 'FA Mgr' droposown list$")
    public void selects_the_nd_record_form_the_FA_Mgr_droposown_list(int arg1) throws Throwable {
        clientPage.testFaMgrDropdown();
    }

    @When("^selects the (\\d+)nd record form the 'FA (\\d+)' droposown list$")
    public void selects_the_nd_record_form_the_FA_droposown_list(int arg1, int arg2) throws Throwable {
        clientPage.testFa1Dropdown();
    }

    @When("^selects the (\\d+)nd record form the 'CRM' droposown list$")
    public void selects_the_nd_record_form_the_CRM_droposown_list(int arg1) throws Throwable {
        clientPage.testCRMDropdown();
    }

    @When("^selects the (\\d+)nd record form the 'STL' droposown list$")
    public void selects_the_nd_record_form_the_STL_droposown_list(int arg1) throws Throwable {
        clientPage.testStlDropdown();
    }

    @When("^selects the (\\d+)nd record form the 'Account Manage / Client Manager' droposown list$")
    public void selects_the_nd_record_form_the_Account_Manage_Client_Manager_droposown_list(int arg1) throws Throwable {
        clientPage.testAccountManageDropdown();
    }

    @When("^selects the (\\d+)nd record form the 'Auditor (\\d+)' droposown list$")
    public void selects_the_nd_record_form_the_Auditor_droposown_list(int arg1, int arg2) throws Throwable {
        clientPage.testAuditor1Dropdown();
    }

    @When("^selects the (\\d+)nd record form the 'Invesment Analist' droposown list$")
    public void selects_the_nd_record_form_the_Invesment_Analist_droposown_list(int arg1) throws Throwable {
        clientPage.testInvestmentAnalystDropdown();
    }

    @When("^checks the 'Do Not Allow Additions noor Edits to particiipant Bank Info form' checkbox$")
    public void checks_the_Do_Not_Allow_Additions_noor_Edits_to_particiipant_Bank_Info_form_checkbox() throws Throwable {
        clientPage.checkDoNotAllowAdditionsCheckBox();
    }

    @When("^selects the (\\d+)st record in 'SSO Unique ID' dropdown list$")
    public void selects_the_st_record_in_SSO_Unique_ID_dropdown_list(int arg1) throws Throwable {
        clientPage.testSSOUniqueIDDropdown();
    }

    @When("^enters 'SSO Home Page' in 'SSO Home Page label' field$")
    public void enters_SSO_Home_Page_in_SSO_Home_Page_label_field() throws Throwable {
        clientPage.testSSOHomepageField();
    }

    @When("^enters 'SSO Contact Us' in 'SSO contact US label' field$")
    public void enters_SSO_Contact_Us_in_SSO_contact_US_label_field() throws Throwable {
        clientPage.testSSOContactUsField();
    }

    @When("^enters 'PSS Home Page' in 'PSS Homepage label' field$")
    public void enters_PSS_Home_Page_in_PSS_Homepage_label_field() throws Throwable {
        clientPage.testPSSHomeField();
    }

    @When("^click same button$")
    public void click_save_button() throws Throwable {
        clientPage.clickSaveButton();
    }

    @Then("^the new Client ID should be displayed in the window title bar with 'Client Information - \\{client id\\} \\[VIEW\\]'$")
    public void the_new_Client_ID_should_be_displayed_in_the_window_title_bar_with_Client_Information_client_id_VIEW() throws Throwable {
        clientPage.verifyWindowTitle();
    }

    @Then("^the client window is in View mode with the same selected information during add mode$")
    public void the_client_window_is_in_View_mode_with_the_same_selected_information_during_add_mode() throws Throwable {

    }


}
