import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

import internal.GlobalVariable

public class Utilities {

	@Keyword
	public launchTrello(String url) {

		WebUI.openBrowser(url)

		WebUI.maximizeWindow()

		assert WebUI.verifyElementVisible(findTestObject('signupLocaters/signupLink'))==true :' unable to launch url'
	}

	@Keyword
	def click(TestObject object, int time) {

		WebUI.waitForElementVisible(object, time)

		WebUI.waitForElementClickable(object, time)

		WebUI.click(object)
	}

	@Keyword
	def enterText(TestObject object, String value, int time) {

		WebUI.waitForElementVisible(object, time)

		WebUI.setText(object, value)
	}

	@Keyword
	def   TestObject createDynamicTestObject(String locater) {

		TestObject dynamicObject = new TestObject()

		dynamicObject.addProperty('xpath', ConditionType.EQUALS, locater)

		return dynamicObject;
	}

	@Keyword
	def closeBrowser() {

		WebUI.closeBrowser()
	}
}
