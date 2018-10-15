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

WebUI.comment('Steps')

'Open text club sign up page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_TextClubSignup_URL)

'input first name'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_FirstName_Por_TextClub_Step1'), 'first name')

'input last name'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_LastName_Por_TextClub_Step1'), 'last name')

'input city'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_City_Por_TextClub_Step1'), 'HCMC')

'input wrong email format'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_Email_Por_TextClub_Step1'), 'testemail')

'input wrong phone'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_Phone_Por_TextClub_Step1'), '123456')

'input postal code'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_PostalCode_Por_TextClub_Step1'), '70000')

'input street'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_StreetAddress_Por_TextClub_Step1'), '123 street')

'input business name'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_BusinessName_Por_TextClub_Step1'), 'ipayment')

WebUI.click(findTestObject('Text Club/Por_TextClub inf/btn_NextStep_Por_TextClub_Step1'))

'verify "You must provide a valid email address" appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingEmail_Por_TextClub_Step1'), 1)

'verify "You must provide a valid phone number." appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingPhone_Por_TextClub_Step1'), 1)

'verify "Please provide a direct contact number. We will call you at this number to confirm your sign up." appears'
WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_WrongPhone_Por_TextClub_Step1'), 1)

WebUI.closeBrowser()

