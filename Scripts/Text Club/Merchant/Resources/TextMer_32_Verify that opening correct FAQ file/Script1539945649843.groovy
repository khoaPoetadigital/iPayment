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

WebUI.waitForElementClickable(findTestObject('Text Club/Sys_Dashboard inf/lnk_Resources_tab'), 5)

'Open Resources page'
WebUI.click(findTestObject('Text Club/Sys_Dashboard inf/lnk_Resources_tab'))

'Open FAQ pdf file'
WebUI.click(findTestObject('Text Club/Sys_Dashboard inf/btn_Resources_DownloadFAQ'))

'wait FAQ page loading'
WebUI.waitForAngularLoad(15)

'Verify that switch to FAQ page successfully'
WebUI.switchToWindowTitle('Text-Club-FAQs.pdf')

WebUI.closeBrowser()

