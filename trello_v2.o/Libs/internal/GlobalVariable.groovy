package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object shortTime
     
    /**
     * <p></p>
     */
    public static Object middleTime
     
    /**
     * <p></p>
     */
    public static Object longTime
     
    /**
     * <p></p>
     */
    public static Object veryLongTime
     
    /**
     * <p></p>
     */
    public static Object boardName
     
    /**
     * <p></p>
     */
    public static Object card
     
    /**
     * <p></p>
     */
    public static Object url
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            username = selectedVariables['username']
            password = selectedVariables['password']
            shortTime = selectedVariables['shortTime']
            middleTime = selectedVariables['middleTime']
            longTime = selectedVariables['longTime']
            veryLongTime = selectedVariables['veryLongTime']
            boardName = selectedVariables['boardName']
            card = selectedVariables['card']
            url = selectedVariables['url']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
