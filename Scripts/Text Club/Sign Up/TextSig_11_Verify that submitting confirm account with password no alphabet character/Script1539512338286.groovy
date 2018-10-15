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

'open yopmail'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'('http://www.yopmail.com/en/')

'confirm email'
CustomKeywords.'customkeyword.CommonKeyword.CheckYopmailLink'(GlobalVariable.var_TextSignedUpEmail, 'Welcome to your Pirq Text Club')

'switch tab'
WebUI.switchToWindowTitle('Pirq')

'input password without alphabet'
WebUI.setText(findTestObject('Text Club/Sys_ConfirmAccount inf/txt_SetPassword_Sys_ConfirmAccount'), '12345678')

'input confirm password '
WebUI.setText(findTestObject('Text Club/Sys_ConfirmAccount inf/txt_ConfirmPassword_Sys_ConfirmAccount'), '12345678')

'submit password'
WebUI.click(findTestObject('Text Club/Sys_ConfirmAccount inf/btn_Confirm_Sys_ConfirmAccount'))

'verify Error message "Your password must contain at least 1 alphabet character."'
WebUI.verifyElementPresent(findTestObject('Text Club/Sys_ConfirmAccount inf/lbl_1alphabetError_Sys_ConfirmAccount'), 5)

WebUI.closeBrowser()

