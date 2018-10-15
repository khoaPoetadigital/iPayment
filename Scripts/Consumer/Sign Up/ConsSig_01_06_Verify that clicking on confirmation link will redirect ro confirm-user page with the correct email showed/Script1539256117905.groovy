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

'Go to sign up page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_InboxURL)

WebUI.comment(GlobalVariable.var_ConsumerNewSignUpEmail)
'Check Yopmail inbox'
CustomKeywords.'customkeyword.CommonKeyword.CheckYopmailLink'(GlobalVariable.var_ConsumerNewSignUpEmail, 'Your Pirq user account is almost ready!')

'Switch to control Pirq tab '
WebUI.switchToWindowTitle('Pirq')


'Verify point'
WebUI.verifyElementPresent(findTestObject('Consumer/Por_Confirm Account inf/lbl_ConfirmYourAccount'), 10)

WebUI.closeBrowser()

