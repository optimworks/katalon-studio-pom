
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginPage {

	int shortTime = GlobalVariable.shortTime

	int middleTime = GlobalVariable.middleTime

	int longTime = GlobalVariable.longTime

	int veryLongTime = GlobalVariable.veryLongTime

	@Keyword
	public trellologin(String username, String password) {

		CustomKeywords.'Utilities.click'(findTestObject('signupLocaters/signupLink'), longTime)

		CustomKeywords.'Utilities.enterText'(findTestObject('loginLocaters/usernameTestField'), username, longTime)

		CustomKeywords.'Utilities.click'(findTestObject('loginLocaters/logInWithAtlassianButton'), shortTime)

		CustomKeywords.'Utilities.enterText'(findTestObject('loginLocaters/passwordTextField'), password, longTime)

		CustomKeywords.'Utilities.click'(findTestObject('loginLocaters/trelloLogin'), longTime)
	}
}
