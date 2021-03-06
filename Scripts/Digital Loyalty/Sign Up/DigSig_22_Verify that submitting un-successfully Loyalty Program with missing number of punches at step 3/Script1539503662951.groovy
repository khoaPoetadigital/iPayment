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

'Navigate to sign up page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_DigLoyaltySignup_URL)

'input first name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_FirstName_Por_Dig_Step1'), 'first name')

'input last name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_LastName_Por_Dig_Step1'), 'last name')

'get unique email'
GlobalVariable.var_DigSignedUpEmail = CustomKeywords.'customkeyword.CommonKeyword.GenerateEmail'('Digital')

'get unique email'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_Email_Por_Dig_Step1'), GlobalVariable.var_DigSignedUpEmail)

'input phone'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_Phone_Por_Dig_Step1'), '+84123456789')

'input business name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_BusinessName_Por_Dig_Step1'), 'test company')

'input street'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_StreetAddress_Por_Dig_Step1'), '123 street')

'input city'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_City_Por_Dig_Step1'), 'HCMC')

'input postal code'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_PostalCode_Por_Dig_Step1'), '70000')

'submit form'
WebUI.click(findTestObject('Digital Loyalty/Por_Digital inf/btn_NextStep_Por_Dig_Step1'))

'input street'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_StreetAddress_Por_Dig_Step2'), '123 street')

'input city'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_City_Por_Dig_Step2'), 'HCMC')

'input zip code'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_ZipCode_Por_Dig_Step2'), '70000')

'input card'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_CreditCardNumber_Por_Dig_Step2'), GlobalVariable.var_CreditCardStaging)

'input CVV'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_CVV_Por_Dig_Step2'), '123')

'select date'
WebUI.selectOptionByIndex(findTestObject('Digital Loyalty/Por_Digital inf/drp_Date_Por_Dig_Step2'), 1)

'select date'
WebUI.selectOptionByIndex(findTestObject('Digital Loyalty/Por_Digital inf/drp_Year_Por_Dig_Step2'), 10)

'input first name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_FirstName_Por_Dig_Step2'), 'first name')

'input last name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_LastName_Por_Dig_Step2'), 'last name')

'submit form'
WebUI.click(findTestObject('Digital Loyalty/Por_Digital inf/btn_SubmitPayment_Por_Dig_Step2'))

'input title'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_RewardTitle_Por_Dig_Step3'), '123 title')

'input description'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_Description_Por_Dig_Step3'), '<h1>123 description !@#$</h1>')

'submit form'
WebUI.click(findTestObject('Digital Loyalty/Por_Digital inf/btn_CreateLoyaltyProgram_Por_Dig_Step3'))

'Verify Error "You must provide the number of punches for your program" displays'
WebUI.verifyElementPresent(findTestObject('Digital Loyalty/Por_Digital inf/lbl_missingPunches_step3'), 5)

WebUI.closeBrowser()

