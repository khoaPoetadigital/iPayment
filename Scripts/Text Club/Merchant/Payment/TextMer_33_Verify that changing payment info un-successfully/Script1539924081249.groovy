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
CustomKeywords.'customkeyword.CommonKeyword.LoginMerchant'('alantextclub1016@yopmail.com', '123456?a')

'Close welcome form if appear'
if (WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/btn_WelcomeForm_CreateIncentive'), 1, FailureHandling.STOP_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('Text Club/Sys_Dashboard inf/btn_WelcomeForm_Close'))
}

WebUI.comment('Steps:')

WebUI.waitForElementClickable(findTestObject('Text Club/Sys_Dashboard inf/lnk_Payment_tab'), 5)

'Open Payment'
WebUI.click(findTestObject('Text Club/Sys_Dashboard inf/lnk_Payment_tab'))

'Clear card holder name\r\n'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_cardholderName'))

'Clear card number'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_cardNumber'))

'clear CVV'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_cardCVV'))

'clear first name'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_firstname'))

'clear last name'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_lastname'))

'clear address 1'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_address1'))

'clear address 2'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_address2'))

WebUI.scrollToElement(findTestObject('Text Club/Sys_Dashboard inf/btn_payment_SaveChanges'), 5)

'clear city'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_City'), FailureHandling.STOP_ON_FAILURE)

'clear zip code'
WebUI.clearText(findTestObject('Text Club/Sys_Dashboard inf/txt_payment_zipcode'))

'Submit save changes without data'
WebUI.click(findTestObject('Text Club/Sys_Dashboard inf/btn_payment_SaveChanges'))

'Verify error \'\'Credit card type is not accepted by this merchant account.\'\' appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/lbl_payment_error_unacceptedCard'), 5)

'Verify error \'Credit card number must be 12-19 digits.\' appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/lbl_payment_error_cardBelow12'), 5)

'Verify error \'\'CVV must be 4 digits for American Express and 3 digits for other card types.\' appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/lbl_payment_error_invalidCVV'), 5)

'Verify error \'Postal code is required.\' appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/lbl_payment_error_missingZipCode'), 5)

'Verify error \'Street address is required.\' appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/lbl_payment_error_missingAdress1'), 5)

WebUI.closeBrowser()

