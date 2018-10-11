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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Hoa\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Consumer\\Sign Up\\Consumer_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed\\20181011_174034\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Consumer/Sign Up/Consumer_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed', new TestCaseBinding('Test Cases/Consumer/Sign Up/Consumer_Verify that clicking on confirmation link will redirect ro confirm-user page with the correct email showed',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
