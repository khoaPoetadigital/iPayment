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

'open text club sign up page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_TextClubSignup_URL)

'input first name'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_FirstName_Por_TextClub_Step1'), 'first name')

'input last name'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_LastName_Por_TextClub_Step1'), 'last name')

'input city'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_City_Por_TextClub_Step1'), 'HCMC')

'Generate email'
GlobalVariable.var_TextSignedUpEmail = CustomKeywords.'customkeyword.CommonKeyword.GenerateEmail'('TextClub')

'Input new email\r\n'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_Email_Por_TextClub_Step1'), GlobalVariable.var_TextSignedUpEmail)

'input phone'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_Phone_Por_TextClub_Step1'), '+84123456789')

'input postal code'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_PostalCode_Por_TextClub_Step1'), '70000')

'input street'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_StreetAddress_Por_TextClub_Step1'), '123 street')

'input business name'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_BusinessName_Por_TextClub_Step1'), 'ipayment')

'submit form'
WebUI.click(findTestObject('Text Club/Por_TextClub inf/btn_NextStep_Por_TextClub_Step1'))

'check same as business checkbox'
WebUI.check(findTestObject('Text Club/Por_TextClub inf/chx_SameAsBusiness_Por_TextClub_Step2'))

'input card number '
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_CreditCardNumber_Por_TextClub_Step2'), GlobalVariable.var_CreditCardStaging)

'input card CVV'
WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_CVV_Por_TextClub_Step2'), '123')

'input card date'
WebUI.selectOptionByIndex(findTestObject('Text Club/Por_TextClub inf/drp_Date_Por_TextClub_Step2'), 2)

'input card year'
WebUI.selectOptionByIndex(findTestObject('Text Club/Por_TextClub inf/drp_Year_Por_TextClub_Step2'), 10)

'submit step 2'
WebUI.click(findTestObject('Text Club/Por_TextClub inf/btn_SubmitPayment_Por_TextClub_Step2'))

'verify Success message "Congratulations!"'
WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_Congratulations_Por_TextClub_Step3'), 5)

WebUI.closeBrowser()

