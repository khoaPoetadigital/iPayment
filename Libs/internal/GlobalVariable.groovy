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
    public static Object LoginMerchant_URL
     
    /**
     * <p></p>
     */
    public static Object MerchantUsername
     
    /**
     * <p></p>
     */
    public static Object MerchantPassword
     
    /**
     * <p></p>
     */
    public static Object FirstTimeUsername
     
    /**
     * <p></p>
     */
    public static Object FirstTimePassword
     
    /**
     * <p></p>
     */
    public static Object DigLoyaltySignup_URL
     
    /**
     * <p></p>
     */
    public static Object DigLoyaltySignupEmail
     
    /**
     * <p></p>
     */
    public static Object CreditCard
     
    /**
     * <p></p>
     */
    public static Object textclubUsername
     
    /**
     * <p></p>
     */
    public static Object textclubPassword
     
    /**
     * <p></p>
     */
    public static Object TextClubSignup_URL
     
    /**
     * <p></p>
     */
    public static Object var_ConsumerEmail
     
    /**
     * <p></p>
     */
    public static Object var_ConsumerPassword
     
    /**
     * <p></p>
     */
    public static Object var_LoginConsumer_URL
     
    /**
     * <p></p>
     */
    public static Object var_GmailPass
     
    /**
     * <p></p>
     */
    public static Object var_InboxURL
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['LoginMerchant_URL' : 'https://merchant.staging-1.pirq.com/merchant/login', 'MerchantUsername' : 'thuat@yopmail.com', 'MerchantPassword' : '123456?a', 'FirstTimeUsername' : '', 'FirstTimePassword' : '', 'DigLoyaltySignup_URL' : 'https://staging-1.pirq.com/digital-loyalty/signup', 'DigLoyaltySignupEmail' : 'test14@yopmail.com', 'CreditCard' : '4242424242424242', 'textclubUsername' : 'thuat20@yopmail.com', 'textclubPassword' : '123456?a', 'TextClubSignup_URL' : 'https://staging-1.pirq.com/text-club/signup', 'var_ConsumerEmail' : 'hoa@vinasource.com', 'var_ConsumerPassword' : '123456?a', 'var_LoginConsumer_URL' : 'https://staging-1.pirq.com/user/login', 'var_GmailPass' : 'Banhmi01', 'var_InboxURL' : 'gmail.com'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        LoginMerchant_URL = selectedVariables['LoginMerchant_URL']
        MerchantUsername = selectedVariables['MerchantUsername']
        MerchantPassword = selectedVariables['MerchantPassword']
        FirstTimeUsername = selectedVariables['FirstTimeUsername']
        FirstTimePassword = selectedVariables['FirstTimePassword']
        DigLoyaltySignup_URL = selectedVariables['DigLoyaltySignup_URL']
        DigLoyaltySignupEmail = selectedVariables['DigLoyaltySignupEmail']
        CreditCard = selectedVariables['CreditCard']
        textclubUsername = selectedVariables['textclubUsername']
        textclubPassword = selectedVariables['textclubPassword']
        TextClubSignup_URL = selectedVariables['TextClubSignup_URL']
        var_ConsumerEmail = selectedVariables['var_ConsumerEmail']
        var_ConsumerPassword = selectedVariables['var_ConsumerPassword']
        var_LoginConsumer_URL = selectedVariables['var_LoginConsumer_URL']
        var_GmailPass = selectedVariables['var_GmailPass']
        var_InboxURL = selectedVariables['var_InboxURL']
        
    }
}
