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


RunConfiguration.setExecutionSettingFile('C:\\Users\\thuat\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Digital Loyalty\\Sign Up\\Digital Loyalty_Verify that creating Loyalty Program un-successfully without Number of Punches\\20181008_170143\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Digital Loyalty/Sign Up/Digital Loyalty_Verify that creating Loyalty Program un-successfully without Number of Punches', new TestCaseBinding('Test Cases/Digital Loyalty/Sign Up/Digital Loyalty_Verify that creating Loyalty Program un-successfully without Number of Punches',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
