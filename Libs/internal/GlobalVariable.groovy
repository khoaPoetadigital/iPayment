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
    public static Object var_LoginMerchant_URL
     
    /**
     * <p></p>
     */
    public static Object var_MerchantUsername
     
    /**
     * <p></p>
     */
    public static Object var_MerchantPassword
     
    /**
     * <p></p>
     */
    public static Object var_FirstTimeUsername
     
    /**
     * <p></p>
     */
    public static Object var_FirstTimePassword
     
    /**
     * <p></p>
     */
    public static Object var_DigLoyaltySignup_URL
     
    /**
     * <p></p>
     */
    public static Object var_DigLoyaltySignupEmail
     
    /**
     * <p></p>
     */
    public static Object var_CreditCardStaging
     
    /**
     * <p></p>
     */
    public static Object var_textclubUsername
     
    /**
     * <p></p>
     */
    public static Object var_textclubPassword
     
    /**
     * <p></p>
     */
    public static Object var_TextClubSignup_URL
     
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
     
    /**
     * <p></p>
     */
    public static Object var_PirqHomepage
     
    /**
     * <p></p>
     */
    public static Object var_ConsumerSignup_URL
     
    /**
     * <p></p>
     */
    public static Object var_ConsumerNewPassword
     
    /**
     * <p></p>
     */
    public static Object var_ConsumerNewSignUpEmail
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['var_LoginMerchant_URL' : 'https://merchant.staging-1.pirq.com/merchant/login', 'var_MerchantUsername' : 'thuat@yopmail.com', 'var_MerchantPassword' : '123456?a', 'var_FirstTimeUsername' : '', 'var_FirstTimePassword' : '', 'var_DigLoyaltySignup_URL' : 'https://staging-1.pirq.com/digital-loyalty/signup', 'var_DigLoyaltySignupEmail' : 'test14@yopmail.com', 'var_CreditCardStaging' : '4242424242424242', 'var_textclubUsername' : 'thuat20@yopmail.com', 'var_textclubPassword' : '123456?a', 'var_TextClubSignup_URL' : 'https://staging-1.pirq.com/text-club/signup', 'var_ConsumerEmail' : 'alanconsumer1010@yopmail.com', 'var_ConsumerPassword' : '123456?a', 'var_LoginConsumer_URL' : 'https://staging-1.pirq.com/user/login', 'var_GmailPass' : 'Banhmi01', 'var_InboxURL' : 'http://www.yopmail.com/en/', 'var_PirqHomepage' : 'https://staging-1.pirq.com/', 'var_ConsumerSignup_URL' : 'https://staging-1.pirq.com/user/signup', 'var_ConsumerNewPassword' : '123456?a', 'var_ConsumerNewSignUpEmail' : 'alanconsumer111018_052605@yopmail.com'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        var_LoginMerchant_URL = selectedVariables['var_LoginMerchant_URL']
        var_MerchantUsername = selectedVariables['var_MerchantUsername']
        var_MerchantPassword = selectedVariables['var_MerchantPassword']
        var_FirstTimeUsername = selectedVariables['var_FirstTimeUsername']
        var_FirstTimePassword = selectedVariables['var_FirstTimePassword']
        var_DigLoyaltySignup_URL = selectedVariables['var_DigLoyaltySignup_URL']
        var_DigLoyaltySignupEmail = selectedVariables['var_DigLoyaltySignupEmail']
        var_CreditCardStaging = selectedVariables['var_CreditCardStaging']
        var_textclubUsername = selectedVariables['var_textclubUsername']
        var_textclubPassword = selectedVariables['var_textclubPassword']
        var_TextClubSignup_URL = selectedVariables['var_TextClubSignup_URL']
        var_ConsumerEmail = selectedVariables['var_ConsumerEmail']
        var_ConsumerPassword = selectedVariables['var_ConsumerPassword']
        var_LoginConsumer_URL = selectedVariables['var_LoginConsumer_URL']
        var_GmailPass = selectedVariables['var_GmailPass']
        var_InboxURL = selectedVariables['var_InboxURL']
        var_PirqHomepage = selectedVariables['var_PirqHomepage']
        var_ConsumerSignup_URL = selectedVariables['var_ConsumerSignup_URL']
        var_ConsumerNewPassword = selectedVariables['var_ConsumerNewPassword']
        var_ConsumerNewSignUpEmail = selectedVariables['var_ConsumerNewSignUpEmail']
        
    }
}
