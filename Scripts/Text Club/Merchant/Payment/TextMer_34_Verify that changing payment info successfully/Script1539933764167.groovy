import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Preconditions:')

'navigate to login merchant page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'('https://merchant.staging-1.pirq.com')

'Login text club account'
CustomKeywords.'customkeyword.CommonKeyword.LoginMerchant'(GlobalVariable.var_TextSignedUpEmail, GlobalVariable.var_TextClubPassword)

'Close welcome form if appear'
if (WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/btn_WelcomeForm_CreateIncentive')) == true) {
    WebUI.click(findTestObject('Text Club/Sys_Dashboard inf/btn_WelcomeForm_Close'))
}

WebUI.comment('Steps:')

WebUI.waitForElementClickable(findTestObject('Text Club/Sys_Dashboard inf/lnk_Payment_tab'), 5)

'Open Payment'
WebUI.click(findTestObject('Text Club/Sys_Dashboard inf/lnk_Payment_tab'))

'input card holder name\r\n'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_cardholderName'), 'card holder name')

'input card number'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_cardNumber'), GlobalVariable.var_CreditCardStaging)

'Select card month'
WebUI.selectOptionByIndex(findTestObject('Text Club/Sys_Dashboard inf/drp_payment_cardMonth'), 2)

'Select card year'
WebUI.selectOptionByIndex(findTestObject('Text Club/Sys_Dashboard inf/drp_payment_cardYear'), 5)

'input CVV'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_cardCVV'), '123')

'input first name'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_firstname'), 'first name')

'input last name'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_lastname'), 'last name')

'input address 1'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_address1'), 'this is address 1')

'input address 2'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_address2'), 'this is address 2')

WebUI.scrollToElement(findTestObject('Text Club/Sys_Dashboard inf/btn_payment_SaveChanges'), 5)

'input city'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_City'), 'HCMC')

'Select state'
WebUI.selectOptionByIndex(findTestObject('Text Club/Sys_Dashboard inf/drp_payment_State'), 2)

'input zip code'
WebUI.setText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_zipcode'), '70000')

'Submit save changes with valid data'
WebUI.click(findTestObject('Text Club/Sys_Dashboard inf/btn_payment_SaveChanges'))

'wait message appears'
WebUI.waitForElementPresent(findTestObject('Text Club/Sys_Dashboard inf/lbl_payment_SaveChangesSuccessfully'), 2)

'Verify "Successfully saved Payment Detail" toast message appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/lbl_payment_SaveChangesSuccessfully'), 5)

WebUI.closeBrowser()

