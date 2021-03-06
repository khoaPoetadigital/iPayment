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

'Go to Consumer sign up email'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_ConsumerSignup_URL)

'Input valid email'
GlobalVariable.var_ConsumerNewSignUpEmail = CustomKeywords.'customkeyword.CommonKeyword.GenerateEmail'('Consumer')

WebUI.comment(GlobalVariable.var_ConsumerNewSignUpEmail)

'Set text email'
WebUI.setText(findTestObject('Consumer/Por_Consumer inf/txt_Email_Portal_Signup'), GlobalVariable.var_ConsumerNewSignUpEmail)

'Click create account button'
WebUI.click(findTestObject('Consumer/Por_Consumer inf/btn_CreateAccount_Portal_Signup'))

'Verify point'
WebUI.verifyElementPresent(findTestObject('Consumer/Por_Consumer inf/lbl_SuccessSignup_Portal_Signup'), 5)

WebUI.closeBrowser()

