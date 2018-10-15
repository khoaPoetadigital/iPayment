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


suiteProperties.put('id', 'Test Suites/Consumer')

suiteProperties.put('name', 'Consumer')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Hoa\\Documents\\GitHub\\iPayment\\Reports\\Consumer\\20181015_144453\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Consumer', suiteProperties, [new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_01_Verify clicking Signup on button will redirect to Consumer Sign up page correctly', 'Test Cases/Consumer/Sign Up/ConsSig_01_01_Verify clicking Signup on button will redirect to Consumer Sign up page correctly',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_02_Verify that signing up with empty required fields shows error message', 'Test Cases/Consumer/Sign Up/ConsSig_01_02_Verify that signing up with empty required fields shows error message',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_03_Verify that signing up with invalid email shows error message', 'Test Cases/Consumer/Sign Up/ConsSig_01_03_Verify that signing up with invalid email shows error message',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_05_Verify that signing up with valid email', 'Test Cases/Consumer/Sign Up/ConsSig_01_05_Verify that signing up with valid email',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_06_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed', 'Test Cases/Consumer/Sign Up/ConsSig_01_06_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_07_Verify that submitting confirm account with empty first name', 'Test Cases/Consumer/Sign Up/ConsSig_01_07_Verify that submitting confirm account with empty first name',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_08_Verify that submitting confirm account with empty last name', 'Test Cases/Consumer/Sign Up/ConsSig_01_08_Verify that submitting confirm account with empty last name',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_09_Verify that submitting confirm account with empty password', 'Test Cases/Consumer/Sign Up/ConsSig_01_09_Verify that submitting confirm account with empty password',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_10_Verify that submitting confirm account with password lessthan 8 characters', 'Test Cases/Consumer/Sign Up/ConsSig_01_10_Verify that submitting confirm account with password lessthan 8 characters',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_11_Verify that submitting confirm account with password no alphabet character', 'Test Cases/Consumer/Sign Up/ConsSig_01_11_Verify that submitting confirm account with password no alphabet character',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_12_Verify that submitting confirm account with invalid confirm-password', 'Test Cases/Consumer/Sign Up/ConsSig_01_12_Verify that submitting confirm account with invalid confirm-password',  null), new TestCaseBinding('Test Cases/Consumer/Sign Up/ConsSig_01_13_Verify that submitting successfully if full-fill valid information', 'Test Cases/Consumer/Sign Up/ConsSig_01_13_Verify that submitting successfully if full-fill valid information',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_03_Verify that user login invalid email shows error message', 'Test Cases/Consumer/Login/ConsLog_01_03_Verify that user login invalid email shows error message',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_04_Verify that user login invalid password shows error message', 'Test Cases/Consumer/Login/ConsLog_01_04_Verify that user login invalid password shows error message',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_05_Verify that clicking on Cancel button to cancel login and redirect to Pirq homepage', 'Test Cases/Consumer/Login/ConsLog_01_05_Verify that clicking on Cancel button to cancel login and redirect to Pirq homepage',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_06_Verify that user login valid email and password redirect to account page', 'Test Cases/Consumer/Login/ConsLog_01_06_Verify that user login valid email and password redirect to account page',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_07_Verify that clicking on merchant login link (here) will redirect to merchant login page', 'Test Cases/Consumer/Login/ConsLog_01_07_Verify that clicking on merchant login link (here) will redirect to merchant login page',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_08_Verify that clicking on Forgot password link will redirect to Reset password page', 'Test Cases/Consumer/Login/ConsLog_01_08_Verify that clicking on Forgot password link will redirect to Reset password page',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_09_Verify that sending reset password request with invalid email shows error message', 'Test Cases/Consumer/Login/ConsLog_01_09_Verify that sending reset password request with invalid email shows error message',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_10_Veriry that sending reset password request with valid email', 'Test Cases/Consumer/Login/ConsLog_01_10_Veriry that sending reset password request with valid email',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_11_Verify that changing password with invalid password shows error message', 'Test Cases/Consumer/Login/ConsLog_01_11_Verify that changing password with invalid password shows error message',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_12_Verify that changing password with invalid confirm-password shows error message', 'Test Cases/Consumer/Login/ConsLog_01_12_Verify that changing password with invalid confirm-password shows error message',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_13_Verify that successfully changing password with valid pass', 'Test Cases/Consumer/Login/ConsLog_01_13_Verify that successfully changing password with valid pass',  null), new TestCaseBinding('Test Cases/Consumer/Login/ConsLog_01_14_Verify that successfully logging in with new password', 'Test Cases/Consumer/Login/ConsLog_01_14_Verify that successfully logging in with new password',  null)])
