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

'Go to Yopmail'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_InboxURL)

'Check User inbox'
CustomKeywords.'customkeyword.CommonKeyword.CheckYopmailLink'(GlobalVariable.var_ConsumerEmail, 'Your Pirq password reset link')

WebUI.switchToWindowTitle('Password Reset | Pirq')

'Verify point'
WebUI.verifyElementPresent(findTestObject('Consumer/Por_Consumer_ForgotPassword inf/lbl_ResetYourPassword_Portal_ForgotPassword'), 
    10)

WebUI.click(findTestObject('Consumer/Por_Consumer_ForgotPassword inf/btn_ChangePwd_Portal_ForgotPassword'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Consumer/Por_Consumer_ForgotPassword inf/lbl_PassTooShort_Portal_ForgotPassword'), 5)

WebUI.closeBrowser()

