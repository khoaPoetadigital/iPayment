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

'Input TextClub Username and password for first login then Click Login button\r\n'
CustomKeywords.'customkeyword.CommonKeyword.LoginMerchant'(GlobalVariable.textclubUsername, GlobalVariable.textclubPassword)

'verify user is logged in successfully to dashboard page'
WebUI.verifyElementPresent(findTestObject('Sys_Dashboard inf/lnk_Dashboard_System_Dashboard'), 1)

WebUI.closeBrowser()

