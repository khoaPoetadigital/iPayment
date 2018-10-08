import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\thuat\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Digital Loyalty\\Sign Up\\Digital Loyalty_Verify that creating digital loyalty account un-successfully by missing Phone\\20181008_170034\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Digital Loyalty/Sign Up/Digital Loyalty_Verify that creating digital loyalty account un-successfully by missing Phone', new TestCaseBinding('Test Cases/Digital Loyalty/Sign Up/Digital Loyalty_Verify that creating digital loyalty account un-successfully by missing Phone',[:]), FailureHandling.STOP_ON_FAILURE , false)
    