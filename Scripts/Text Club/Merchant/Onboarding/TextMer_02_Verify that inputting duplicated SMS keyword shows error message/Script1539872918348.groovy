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

WebUI.comment('Account just signed up and not set up SMS keyword')

WebUI.comment('Duplicated SMS keyword: TEXT1016')

'1. Login Merchant Site'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_LoginMerchant_URL)

CustomKeywords.'customkeyword.CommonKeyword.LoginMerchant'(GlobalVariable.var_TextSignedUpEmail, GlobalVariable.var_TextClubPassword)

'2. Close video popup'
WebUI.click(findTestObject('Text Club/Onboarding/img_VideoClosePopup'))

'3. Verify required SMS keyword'
WebUI.verifyElementPresent(findTestObject('Text Club/Onboarding/lbl_ThisFieldIsRequired'), 3)

'Input duplicated SMS keyword'
WebUI.setText(findTestObject('Text Club/Onboarding/txt_TypeKeyword'), 'TEXT1016')

WebUI.verifyElementPresent(findTestObject('Text Club/Onboarding/lbl_KeywordAlreadyTaken'), 5)

WebUI.closeBrowser()

