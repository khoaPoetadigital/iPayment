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

CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_DigLoyaltySignup_URL)

WebUI.setText(findTestObject('Por_Digital inf/txt_FirstName_Por_Dig_Step1'), 'test')

WebUI.setText(findTestObject('Por_Digital inf/txt_LastName_Por_Dig_Step1'), 'Employee')

WebUI.setText(findTestObject('Por_Digital inf/txt_Email_Por_Dig_Step1'), GlobalVariable.var_DigLoyaltySignupEmail)

WebUI.setText(findTestObject('Por_Digital inf/txt_Phone_Por_Dig_Step1'), '+84123456789')

WebUI.setText(findTestObject('Por_Digital inf/txt_BusinessName_Por_Dig_Step1'), 'test')

WebUI.setText(findTestObject('Por_Digital inf/txt_StreetAddress_Por_Dig_Step1'), '123 test')

WebUI.setText(findTestObject('Por_Digital inf/txt_City_Por_Dig_Step1'), 'HCMC')

WebUI.setText(findTestObject('Por_Digital inf/txt_PostalCode_Por_Dig_Step1'), '70000')

WebUI.click(findTestObject('Por_Digital inf/btn_NextStep_Por_Dig_Step1'))

'Done Test case for signup Step 1'
WebUI.verifyElementPresent(findTestObject('Por_Digital inf/btn_SubmitPayment_Por_Dig_Step2'), 1)

WebUI.check(findTestObject('Por_Digital inf/chx_SameAsBusiness_Por_Dig_Step2'))

WebUI.setText(findTestObject('Por_Digital inf/txt_CreditCardNumber_Por_Dig_Step2'), GlobalVariable.var_CreditCardStaging)

WebUI.selectOptionByIndex(findTestObject('Por_Digital inf/drp_Date_Por_Dig_Step2'), '1')

WebUI.selectOptionByIndex(findTestObject('Por_Digital inf/drp_Year_Por_Dig_Step2'), '10')

WebUI.setText(findTestObject('Por_Digital inf/txt_CVV_Por_Dig_Step2'), '123')

WebUI.click(findTestObject('Por_Digital inf/btn_SubmitPayment_Por_Dig_Step2'))

'Done Test case for signup Step 2'
WebUI.verifyElementPresent(findTestObject('Por_Digital inf/lbl_Congratulations_Por_Dig_Step3'), 1)

WebUI.setText(findTestObject('Por_Digital inf/txt_NumberofPunches_Por_Dig_Step3'), '2')

WebUI.setText(findTestObject('Por_Digital inf/txt_RewardTitle_Por_Dig_Step3'), 'test reward title')

WebUI.setText(findTestObject('Por_Digital inf/txt_Description_Por_Dig_Step3'), 'test description')

WebUI.setText(findTestObject('Por_Digital inf/txt_Rules_Por_Dig_Step3'), 'test rules')

WebUI.click(findTestObject('Por_Digital inf/btn_CreateLoyaltyProgram_Por_Dig_Step3'))

'Done Test case for signup Step 3'
WebUI.verifyElementPresent(findTestObject('Por_Digital inf/btn_X_Por_Dig_Step4'), 1)

WebUI.closeBrowser()
