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
WebUI.setText(findTestObject('Por_TextClub inf/txt_Email_Por_TextClub_Step1'), 'thuat23@yopmail.com')

WebUI.setText(findTestObject('Por_TextClub inf/txt_Phone_Por_TextClub_Step1'), '+84123456789')

WebUI.setText(findTestObject('Por_TextClub inf/txt_PostalCode_Por_TextClub_Step1'), '70000')

WebUI.setText(findTestObject('Por_TextClub inf/txt_StreetAddress_Por_TextClub_Step1'), '123 street')

WebUI.setText(findTestObject('Por_TextClub inf/txt_BusinessName_Por_TextClub_Step1'), 'ipayment')

WebUI.click(findTestObject('Por_TextClub inf/btn_NextStep_Por_TextClub_Step1'))

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingAddress_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingBusiness_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingCity_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingEmail_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingFirstName_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingLastName_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingPhone_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingPostalCode_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_WrongPhone_Por_TextClub_Step1'), 0)

WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_DuplicatedEmail_Por_TextClub_Step1'), 0)

'Verify that signup process successfully and go to step 2'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/chx_SameAsBusiness_Por_TextClub_Step2'), 1)

'Submit form without input fields\r\n'
WebUI.click(findTestObject('Por_TextClub inf/btn_SubmitPayment_Por_TextClub_Step2'))

'Verify that error appears when not input data to required fields'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingCardAdress_Por_TextClub_Step2'), 1)

'Verify that error appears when not input data to required fields'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingCardCity_Por_TextClub_Step2'), 1)

'Verify that error appears when not input data to required fields'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingCardFirstName_Por_TextClub_Step2'), 1)

'Verify that error appears when not input data to required fields'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingCardLastName_Por_TextClub_Step2'), 1)

'Verify that error appears when not input data to required fields'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingCardPostal_Por_TextClub_Step2'), 1)

'Verify that error appears when not input data to required fields'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingAdress_Por_TextClub_Step2'), 1)

'Verify that error appears when not input data to required fields'
WebUI.verifyElementPresent(findTestObject('Por_TextClub inf/lbl_MissingCardNumber_Por_TextClub_Step2'), 1)

WebUI.closeBrowser()

