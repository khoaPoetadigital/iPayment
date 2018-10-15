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

'navigate to sign up page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_DigLoyaltySignup_URL)

'Input First name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_FirstName_Por_Dig_Step1'), 'first name')

'Input Last name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_LastName_Por_Dig_Step1'), 'last name')

'Input Phone'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_Phone_Por_Dig_Step1'), '+84123456789')

'Input business name'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_BusinessName_Por_Dig_Step1'), 'test Company')

'input streeet'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_StreetAddress_Por_Dig_Step1'), '123 street')

'input City'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_City_Por_Dig_Step1'), 'HCMC')

'Input postal code'
WebUI.setText(findTestObject('Digital Loyalty/Por_Digital inf/txt_PostalCode_Por_Dig_Step1'), '70000')

'Submit form'
WebUI.click(findTestObject('Digital Loyalty/Por_Digital inf/btn_NextStep_Por_Dig_Step1'))

'Verify error message'
WebUI.verifyElementPresent(findTestObject('Digital Loyalty/Por_Digital inf/lbl_MissingEmail_Step1'), 5)

WebUI.closeBrowser()
