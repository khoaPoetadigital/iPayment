import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Digital Loyalty')

suiteProperties.put('name', 'Digital Loyalty')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\thuat\\Documents\\GitHub\\iPayment\\Reports\\Digital Loyalty\\20181015_172026\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Digital Loyalty', suiteProperties, [new TestCaseBinding('Test Cases/Digital Loyalty/Sign Up/DigSig_26_Verify that submitting successfully Loyalty Program at step 3', 'Test Cases/Digital Loyalty/Sign Up/DigSig_26_Verify that submitting successfully Loyalty Program at step 3',  null), new TestCaseBinding('Test Cases/Digital Loyalty/Sign Up/DigSig_27_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed', 'Test Cases/Digital Loyalty/Sign Up/DigSig_27_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed',  null), new TestCaseBinding('Test Cases/Digital Loyalty/Sign Up/DigSig_28_Verify that submitting confirm account un-successfully with empty password', 'Test Cases/Digital Loyalty/Sign Up/DigSig_28_Verify that submitting confirm account un-successfully with empty password',  null), new TestCaseBinding('Test Cases/Digital Loyalty/Sign Up/DigSig_29_Verify that submitting confirm account with password no alphabet character', 'Test Cases/Digital Loyalty/Sign Up/DigSig_29_Verify that submitting confirm account with password no alphabet character',  null), new TestCaseBinding('Test Cases/Digital Loyalty/Sign Up/DigSig_30_Verify that submitting confirm account with invalid confirm-password', 'Test Cases/Digital Loyalty/Sign Up/DigSig_30_Verify that submitting confirm account with invalid confirm-password',  null), new TestCaseBinding('Test Cases/Digital Loyalty/Sign Up/DigSig_31_Verify that submitting successfully password if full-fill valid information', 'Test Cases/Digital Loyalty/Sign Up/DigSig_31_Verify that submitting successfully password if full-fill valid information',  null)])
