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

'Next without input data'
WebUI.click(findTestObject('Text Club/Por_TextClub inf/btn_NextStep_Por_TextClub_Step1'))

WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingAddress_Por_TextClub_Step1'), 1)

WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingBusiness_Por_TextClub_Step1'), 1)

WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingCity_Por_TextClub_Step1'), 1)

WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingEmail_Por_TextClub_Step1'), 1)

WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingFirstName_Por_TextClub_Step1'), 1)

WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingLastName_Por_TextClub_Step1'), 1)

WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingPhone_Por_TextClub_Step1'), 1)

WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_MissingPostalCode_Por_TextClub_Step1'), 1)

WebUI.closeBrowser()

