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

'input phone'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_Phone_Por_Dig_Step1'), '+84123456789')

'input first name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_FirstName_Por_Dig_Step1'), 'first name')

'get unique email'
GlobalVariable.var_DigSignedUpEmail = CustomKeywords.'customkeyword.CommonKeyword.GenerateEmail'('Digital')

'get unique email'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_Email_Por_Dig_Step1'), GlobalVariable.var_DigSignedUpEmail)

'input last name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_LastName_Por_Dig_Step1'), 'last name')

'input business name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_BusinessName_Por_Dig_Step1'), 'test company')

'input street'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_StreetAddress_Por_Dig_Step1'), '123 streeet')

'input city'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_City_Por_Dig_Step1'), 'HCMC')

'input postal code'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_PostalCode_Por_Dig_Step1'), '70000')

'submit form'
WebUI.click(findTestObject('Digital Loyalty/Por_Digital inf/btn_NextStep_Por_Dig_Step1'))

'verify redirect to step 2'
WebUI.verifyElementPresent(findTestObject('Digital Loyalty/Por_Digital inf/chx_SameAsBusiness_Por_Dig_Step2'), 5)

'check same as business checkbox'
WebUI.check(findTestObject('Digital Loyalty/Por_Digital inf/chx_SameAsBusiness_Por_Dig_Step2'))

'submit to get data of textbox'
WebUI.click(findTestObject('Digital Loyalty/Por_Digital inf/btn_SubmitPayment_Por_Dig_Step2'))

'verify same with input data from step 1'
WebUI.verifyElementAttributeValue(findTestObject('Digital Loyalty/Por_Digital inf/txt_City_Por_Dig_Step2'), 'value', 'HCMC', 
    0)

'verify same with input data from step 1'
WebUI.verifyElementAttributeValue(findTestObject('Digital Loyalty/Por_Digital inf/txt_StreetAddress_Por_Dig_Step2'), 'value', 
    '123 streeet', 0)

'verify same with input data from step 1'
WebUI.verifyElementAttributeValue(findTestObject('Digital Loyalty/Por_Digital inf/txt_ZipCode_Por_Dig_Step2'), 'value', 
    '70000', 0)

'verify same with input data from step 1'
WebUI.verifyElementAttributeValue(findTestObject('Digital Loyalty/Por_Digital inf/txt_FirstName_Por_Dig_Step2'), 'value', 
    'first name', 0)

'verify same with input data from step 1'
WebUI.verifyElementAttributeValue(findTestObject('Digital Loyalty/Por_Digital inf/txt_LastName_Por_Dig_Step2'), 'value', 
    'last name', 0)

WebUI.closeBrowser()

