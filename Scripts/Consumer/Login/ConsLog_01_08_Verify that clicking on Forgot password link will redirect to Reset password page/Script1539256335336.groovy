import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After
import org.seleniumhq.jetty9.server.Authentication.Failed

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.exception.StepErrorException
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Go to Consumer Login page'
CustomKeywords.'customkeyword.CommonKeyword.OpenBrowser'(GlobalVariable.var_LoginConsumer_URL)

'Click Forgot-Password link'
WebUI.click(findTestObject('Consumer/Por_Consumer inf/lnk_ForgotPassword_Portal_Login'))

'Verify point'
WebUI.verifyElementPresent(findTestObject("Consumer/Por_Consumer_ForgotPassword inf/lbl_ResetYourPassword_Portal_ForgotPassword"), 10)
/*String currenturl = WebUI.getUrl()
String correcturl = "https://staging-1.pirq.com/1111password-reset"
if(currenturl == correcturl){
	System.out.println("successfully")
}else {
	System.out.println("Failed url")
	throw new StepErrorException("Incorrect URL")
	FailureHandling.CONTINUE_ON_FAILURE
}*/

WebUI.closeBrowser()

