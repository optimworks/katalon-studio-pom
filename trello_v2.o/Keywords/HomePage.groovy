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

public class HomePage {

	int shortTime = GlobalVariable.shortTime

	int middleTime = GlobalVariable.middleTime

	int longTime = GlobalVariable.longTime

	int veryLongTime = GlobalVariable.veryLongTime
	
@Keyword
	def verifyHomePageIsVisible() {

		assert WebUI.verifyElementPresent(findTestObject('Object Repository/homePageLocaters/userLogo'), veryLongTime)==true:'home page not visible'
	}

	@Keyword
	def createBoard(String boardName) {

		
		int randomNumber = CustomKeywords.'Utilities.genarateRandomNumber'(100)
		
		println(boardName+randomNumber)
		
		CustomKeywords.'Utilities.click'(findTestObject('homePageLocaters/createNewBoard'), shortTime)

		CustomKeywords.'Utilities.enterText'(findTestObject('boardCreationLocaters/boardTitleTextField'), boardName+randomNumber, shortTime)

		CustomKeywords.'Utilities.click'(findTestObject('boardCreationLocaters/createBoardButton'), shortTime)
		
		return boardName+randomNumber
		}

	@Keyword
	def verifyBoardIsCreatedOrNot(String boardName) {
		
		println(boardName)

		assert WebUI.waitForElementVisible(findTestObject('Object Repository/homePageLocaters/boardTitle',[('text'):boardName]), veryLongTime)==true:"board not created"
	}
	@Keyword
	def verifyBoardIsVisibleOrNotInRecentlyViewedSection(def boardName) {

		String actualboardName = WebUI.getText(findTestObject('Object Repository/homePageLocaters/recentlyViewedBoard'))

		assert actualboardName.equals(boardName) == true:"expected board name is "+boardName+" but board name is "+actualboardName
	}

	@Keyword
	def verifyBoardDelete(String boardName) {

		assert WebUI.verifyElementNotPresent(findTestObject('Object Repository/homePageLocaters/boardInWorkspaceButton',['title':boardName]), longTime) == true : 'board is visible'
	}

	@Keyword
	def logout() {

		CustomKeywords.'Utilities.click'(findTestObject('homePageLocaters/userLogo'), veryLongTime)

		CustomKeywords.'Utilities.click'(findTestObject('homePageLocaters/logoutButton'), veryLongTime)

		CustomKeywords.'Utilities.click'(findTestObject('homePageLocaters/verifyLogoutButton'), veryLongTime)
	}
}

