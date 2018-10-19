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


RunConfiguration.setExecutionSettingFile('C:\\Users\\thelu\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Text Club\\Merchant\\Onboarding\\TextMer_01_Verify that logging with the fresh account shows the Text Club video correctly\\20181018_211231\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Text Club/Merchant/Onboarding/TextMer_01_Verify that logging with the fresh account shows the Text Club video correctly', new TestCaseBinding('Test Cases/Text Club/Merchant/Onboarding/TextMer_01_Verify that logging with the fresh account shows the Text Club video correctly',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
