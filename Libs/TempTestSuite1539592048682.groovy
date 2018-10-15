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


suiteProperties.put('id', 'Test Suites/Consumer Sign Up')

suiteProperties.put('name', 'Consumer Sign Up')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Hoa\\Documents\\GitHub\\iPayment\\Reports\\Consumer Sign Up\\20181015_152728\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Consumer Sign Up', suiteProperties, [new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_05_Verify that signing up with valid email', 'Test Cases/Consumer/Sign Up/ConsSig_01_05_Verify that signing up with valid email',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_06_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed', 'Test Cases/Consumer/Sign Up/ConsSig_01_06_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_07_Verify that submitting confirm account with empty first name', 'Test Cases/Consumer/Sign Up/ConsSig_01_07_Verify that submitting confirm account with empty first name',  null)])
