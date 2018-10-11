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

'Go to Login page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_LoginConsumer_URL)

'Go to Forgot password page'
WebUI.click(findTestObject('Por_Consumer inf/lnk_ForgotPassword_Portal_Login'))

'Input Valid Email'
WebUI.setText(findTestObject('Por_Consumer_ForgotPassword inf/txt_Email_Portal_ForgotPassword'), GlobalVariable.var_ConsumerEmail)

'Click Reset Password button'
WebUI.click(findTestObject('Por_Consumer_ForgotPassword inf/btn_ResetPassword_Portal_ForgotPassword'))

'Verify point: error message'
WebUI.verifyElementPresent(findTestObject('Por_Consumer_ForgotPassword inf/lbl_Success_Portal_ForgotPassword'), 10)

WebUI.closeBrowser()