package customkeyword
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.WebDriver
import org.apache.xmlbeans.impl.xb.xsdschema.Public
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException



class CommonKeyword {

	/**
	 * Refresh browser
	 */
	public void WaitForElementVisible (WebDriver driver, String xpath){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)))
	}

	@Keyword
	public OpenBrowser(String url) {
		WebUI.openBrowser(url);
		WebUI.maximizeWindow();
	}

	@Keyword
	public LoginMerchant(String username, String password) {
		WebUI.setText(findTestObject('Sys_Login inf/txt_Email_System_Login'), username)

		WebUI.setText(findTestObject('Sys_Login inf/txt_Password_System_Login'), password)

		WebUI.click(findTestObject('Sys_Login inf/btn_Login_System_Login'))
	}

	@Keyword
	public LoginConsumer (String username, String password) {
		WebUI.setText(findTestObject('Consumer/Por_Consumer inf/txt_Email_Portal_Login'), username)

		WebUI.setText(findTestObject('Consumer/Por_Consumer inf/txt_Password_Portal_Login'), password)

		WebUI.click(findTestObject('Consumer/Por_Consumer inf/btn_Login_Portal_Login'))
	}

	@Keyword
	public String GenerateEmail (String type){
		Date today = new Date()
		String todaysDate = today.format('ddMMyyhhmmss')
		String var_SignUpEmail = type + todaysDate + "@yopmail.com"
		//String var_SignUpEmail = type + "autoemail_" + todaysDate + "@yopmail.com"
		return var_SignUpEmail;
	}

	@Keyword
	public CheckYopmailLink (String username, String emailtitle){
		WebUI.setText(findTestObject('Yopmail inf/txt_Login_Yopmail'), username)
		WebUI.click(findTestObject('Yopmail inf/btn_CheckInbox_Yopmail'))
		WebDriver driver = DriverFactory.getWebDriver()
		String var_inboxtitle = "(//span[text()='" + emailtitle +"'])[1]"
		String var_mailtitle = "//div[text()='" + emailtitle +"']"
		'Switch to inbox iframe'
		driver.switchTo().frame("ifinbox")
		driver.findElement(By.xpath(var_inboxtitle)).click()
		driver.switchTo().defaultContent()
		'Switch to mail iframe'
		driver.switchTo().frame("ifmail")
		WaitForElementVisible(driver, var_mailtitle)

		switch (emailtitle) {
			case "Your Pirq user account is almost ready!":
				String var_showpicture = "//a[@id='affim']"
				String var_ClicktoConfirm = "//img[contains(@alt,'Click to confirm account')]"
				driver.findElement(By.xpath(var_showpicture)).click()
				'Click confirm link'
				WaitForElementVisible(driver, var_ClicktoConfirm)
				driver.findElement(By.xpath(var_ClicktoConfirm)).click()
				break
			case "Your Pirq password reset link":
				String var_resetlink = "//a[contains(@href,'password-reset')]"
				driver.findElement(By.xpath(var_resetlink)).click()
				break
			case "Welcome to your Pirq Text Club":
				String var_confirmlink = "//a[contains(@href,'confirm_account')]"
				driver.findElement(By.xpath(var_confirmlink)).click()
				break
			case "Welcome Pirq Merchant":
				String var_confirmlink = "//a[contains(@href,'confirm_account')]"
				driver.findElement(By.xpath(var_confirmlink)).click()
				break
			case "Confirmation of your sign-up with Pirq":
				String var_confirmlink = "//a[contains(@href,'digital-loyalty')]"
				driver.findElement(By.xpath(var_confirmlink)).click()
				break
			default:
				System.out.println("No title matched!")
				break
		}
	}

	@Keyword
	public String CreateTextClubAccount (){
		'open text club sign up page'
		OpenBrowser(GlobalVariable.var_TextClubSignup_URL)

		'input first name'
		WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_FirstName_Por_TextClub_Step1'), 'first name')

		'input last name'
		WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_LastName_Por_TextClub_Step1'), 'last name')

		'input city'
		WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_City_Por_TextClub_Step1'), 'HCMC')

		'Generate email'
		String var_emailsignedup = GenerateEmail("textclub")

		'Input new email\r\n'
		WebUI.setText(findTestObject('Text Club/Por_TextClub inf/txt_Email_Por_TextClub_Step1'), var_emailsignedup)

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
		//WebUI.verifyElementPresent(findTestObject('Text Club/Por_TextClub inf/lbl_Congratulations_Por_TextClub_Step3'), 5)
		
		'Check yopmail link'
		OpenBrowser(GlobalVariable.var_InboxURL)
		CheckYopmailLink(var_emailsignedup, 'Welcome to your Pirq Text Club')
		
		'switch tab'
		WebUI.switchToWindowTitle('Pirq')
		
		'input password'
		WebUI.setText(findTestObject('Text Club/Sys_ConfirmAccount inf/txt_SetPassword_Sys_ConfirmAccount'), '123456?a')
		
		'input confirm password '
		WebUI.setText(findTestObject('Text Club/Sys_ConfirmAccount inf/txt_ConfirmPassword_Sys_ConfirmAccount'), '123456?a')
		
		'submit password'
		WebUI.click(findTestObject('Text Club/Sys_ConfirmAccount inf/btn_Confirm_Sys_ConfirmAccount'))
		
		'verify Redirect to CUSTOMIZE YOUR SMS KEYWORD'
		//WebUI.verifyElementPresent(findTestObject('Text Club/Sys_Dashboard inf/lbl_customizeYourSMSKeyword'), 5)

		return var_emailsignedup
	}
}