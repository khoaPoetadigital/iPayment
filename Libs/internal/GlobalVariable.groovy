package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Prod_LoginMerchant_URL
     
    /**
     * <p></p>
     */
    public static Object Stag_LoginMerchant_URL
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['Prod_LoginMerchant_URL' : 'https://merchant.pirq.com/merchant/login', 'Stag_LoginMerchant_URL' : 'https://merchant.staging-1.pirq.com/merchant/login'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        Prod_LoginMerchant_URL = selectedVariables['Prod_LoginMerchant_URL']
        Stag_LoginMerchant_URL = selectedVariables['Stag_LoginMerchant_URL']
        
    }
}
