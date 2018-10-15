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

WebUI.comment('steps')

'Navigate to merchant login page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_LoginMerchant_URL)

'input wrong email'
WebUI.setText(findTestObject('Sys_Login inf/txt_Email_System_Login'), 'ipaymenttestwrongemail@yopmail.com')

'input password'
WebUI.setText(findTestObject('Sys_Login inf/txt_Password_System_Login'), '123456?a')

'Click login button'
WebUI.click(findTestObject('Sys_Login inf/btn_Login_System_Login'))

'verify Error "Login failed." displays'
WebUI.verifyElementPresent(findTestObject('Sys_Login inf/lbl_Loginfailed_System_Login'), 5)

WebUI.closeBrowser()

