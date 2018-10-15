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
		WebUI.setText(findTestObject('Por_Consumer inf/txt_Email_Portal_Login'), username)

		WebUI.setText(findTestObject('Por_Consumer inf/txt_Password_Portal_Login'), password)

		WebUI.click(findTestObject('Por_Consumer inf/btn_Login_Portal_Login'))
	}

	@Keyword
	public String GenerateEmail (String type){
		Date today = new Date()
		String todaysDate = today.format('ddMMyyhhmmss')
<<<<<<< HEAD
		String var_SignUpEmail = type + todaysDate + "@yopmail.com"
=======
		String var_SignUpEmail = type + "autoemail_" + todaysDate + "@yopmail.com"
>>>>>>> 70b1751fd44685e6afe3b0fd2388fe5f1df395d7
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
}