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


RunConfiguration.setExecutionSettingFile('C:\\Users\\thelu\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Text Club\\Merchant\\Onboarding\\TextMer_03_Verify that inputting SMS keyword shows in image (right and left)\\20181018_225344\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Text Club/Merchant/Onboarding/TextMer_03_Verify that inputting SMS keyword shows in image (right and left)', new TestCaseBinding('Test Cases/Text Club/Merchant/Onboarding/TextMer_03_Verify that inputting SMS keyword shows in image (right and left)',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
