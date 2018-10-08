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

'Open login page\r\n'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.LoginMerchant_URL)

'Input Username and password then Click Login button\r\n'
CustomKeywords.'customkeyword.CommonKeyword.LoginMerchant'(GlobalVariable.MerchantUsername, GlobalVariable.MerchantPassword)

WebUI.click(findTestObject('Sys_Merchant inf/btn_Logout_System_Merchant'))

WebUI.verifyElementPresent(findTestObject('Sys_Login inf/txt_Email_System_Login'), 1)

WebUI.acceptAlert()

