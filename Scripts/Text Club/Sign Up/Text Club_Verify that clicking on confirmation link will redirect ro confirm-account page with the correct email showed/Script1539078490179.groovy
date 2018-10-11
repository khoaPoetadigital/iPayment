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

CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_TextClubSignup_URL)

WebUI.setText(findTestObject('Por_TextClub inf/txt_FirstName_Por_TextClub_Step1'), 'test')

WebUI.setText(findTestObject('Por_TextClub inf/txt_LastName_Por_TextClub_Step1'), 'tester')

WebUI.setText(findTestObject('Por_TextClub inf/txt_City_Por_TextClub_Step1'), 'HCMC')

'Input new email\r\n'
WebUI.setText(findTestObject('Por_TextClub inf/txt_Email_Por_TextClub_Step1'), 'thuat25@yopmail.com')

WebUI.setText(findTestObject('Por_TextClub inf/txt_Phone_Por_TextClub_Step1'), '+84123456789')

WebUI.setText(findTestObject('Por_TextClub inf/txt_PostalCode_Por_TextClub_Step1'), '70000')

WebUI.setText(findTestObject('Por_TextClub inf/txt_StreetAddress_Por_TextClub_Step1'), '123 street')

WebUI.setText(findTestObject('Por_TextClub inf/txt_BusinessName_Por_TextClub_Step1'), 'ipayment')

WebUI.click(findTestObject('Por_TextClub inf/btn_NextStep_Por_TextClub_Step1'))

WebUI.check(findTestObject('Por_TextClub inf/chx_SameAsBusiness_Por_TextClub_Step2'))

WebUI.setText(findTestObject('Por_TextClub inf/txt_CreditCardNumber_Por_TextClub_Step2'), GlobalVariable.var_CreditCardStaging)

WebUI.setText(findTestObject('Por_TextClub inf/txt_CVV_Por_TextClub_Step2'), '123')

WebUI.selectOptionByIndex(findTestObject('Por_TextClub inf/drp_Date_Por_TextClub_Step2'), 3)

WebUI.selectOptionByIndex(findTestObject('Por_TextClub inf/drp_Year_Por_TextClub_Step2'), 10)

WebUI.click(findTestObject('Por_TextClub inf/btn_SubmitPayment_Por_TextClub_Step2'))

'Complete create text club'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_Congratulations_Por_TextClub_Step3'), 1)

WebUI.navigateToUrl('yopmail.com', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Yopmail/txt_inputemail_HomePage'), 'thuat25@yopmail.com')

WebUI.click(findTestObject('Yopmail/btn_Checkinbox_HomePage'))

WebUI.click(findTestObject('Yopmail/lnk_TextClubSignupMail_Inbox'))

WebUI.click(findTestObject('Yopmail/lnk_activate_Inbox'))

'TC line 109\r\n'
WebUI.verifyElementPresent(findTestObject('Sys_ConfirmAccount inf/txt_SetPassword_Sys_ConfirmAccount'), 1)

WebUI.setText(findTestObject('Sys_ConfirmAccount inf/txt_SetPassword_Sys_ConfirmAccount'), '123456')

WebUI.setText(findTestObject('Sys_ConfirmAccount inf/txt_ConfirmPassword_Sys_ConfirmAccount'), '123456')

WebUI.click(findTestObject('Sys_ConfirmAccount inf/btn_Confirm_Sys_ConfirmAccount'))

'TC line 110\r\n'
WebUI.verifyElementPresent(findTestObject('Sys_ConfirmAccount inf/lbl_8characterError_Sys_ConfirmAccount'), 1)

WebUI.setText(findTestObject('Sys_ConfirmAccount inf/txt_SetPassword_Sys_ConfirmAccount'), '12345678')

WebUI.setText(findTestObject('Sys_ConfirmAccount inf/txt_ConfirmPassword_Sys_ConfirmAccount'), '12345678')

WebUI.click(findTestObject('Sys_ConfirmAccount inf/btn_Confirm_Sys_ConfirmAccount'))

'TC line 111\r\n'
WebUI.verifyElementPresent(findTestObject('Sys_ConfirmAccount inf/lbl_1alphabetError_Sys_ConfirmAccount'), 1)

WebUI.setText(findTestObject('Sys_ConfirmAccount inf/txt_SetPassword_Sys_ConfirmAccount'), '123456?a')

WebUI.setText(findTestObject('Sys_ConfirmAccount inf/txt_ConfirmPassword_Sys_ConfirmAccount'), '123456?aaa')

WebUI.click(findTestObject('Sys_ConfirmAccount inf/btn_Confirm_Sys_ConfirmAccount'))

'TC line 112\r\n'
WebUI.verifyElementPresent(findTestObject('Sys_ConfirmAccount inf/lbl_Passwordnotmatch_Sys_ConfirmAccount'), 1)

WebUI.setText(findTestObject('Sys_ConfirmAccount inf/txt_SetPassword_Sys_ConfirmAccount'), '123456?a')

WebUI.setText(findTestObject('Sys_ConfirmAccount inf/txt_ConfirmPassword_Sys_ConfirmAccount'), '123456?a')

WebUI.click(findTestObject('Sys_ConfirmAccount inf/btn_Confirm_Sys_ConfirmAccount'))

'TC line 113\r\n'
WebUI.verifyElementPresent(findTestObject('Sys_Dashboard inf/lnk_Dashboard_System_Dashboard'), 1)

