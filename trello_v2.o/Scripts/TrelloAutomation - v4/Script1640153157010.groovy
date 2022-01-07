import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'Utilities.launchTrello'(GlobalVariable.url)

CustomKeywords.'loginPage.trellologin'(GlobalVariable.username,GlobalVariable.password)

CustomKeywords.'HomePage.verifyHomePageIsVisible'()

String boardName = CustomKeywords.'HomePage.createBoard'(boardName)

CustomKeywords.'HomePage.verifyBoardIsCreatedOrNot'(boardName)

List listNames = CustomKeywords.'boardHomePage.createList'(lists)

CustomKeywords.'boardHomePage.verifylistsIsCreatedOrNot'(listNames)

List cardNames = CustomKeywords.'boardHomePage.createCards'(listNames, cards)

CustomKeywords.'boardHomePage.verifyCardsIsCreatedOrNot'(cardNames)

CustomKeywords.'boardHomePage.changeCardsCover'(cardNames)

CustomKeywords.'boardHomePage.moveToHomePage'()

CustomKeywords.'HomePage.verifyHomePageIsVisible'()

CustomKeywords.'HomePage.verifyBoardIsVisibleOrNotInRecentlyViewedSection'(boardName)

CustomKeywords.'boardHomePage.verifyBoardIsVisibleOrNotInWorkspace'(boardName)

CustomKeywords.'boardHomePage.verifyBoardHomePage'(boardName)

CustomKeywords.'boardHomePage.PrintCardAndListNames'(listNames, cardNames)

CustomKeywords.'boardHomePage.dragAndDrop'(listNames, cardNames)

CustomKeywords.'boardHomePage.verifyDrogAndDrop'(listNames, cardNames)

CustomKeywords.'boardHomePage.revertDrogAndDrop'(listNames, cardNames)

CustomKeywords.'boardHomePage.verifyRevertDrogAndDrop'(listNames, cardNames)

CustomKeywords.'boardHomePage.deleteBoard'(boardName)

CustomKeywords.'HomePage.verifyBoardDelete'(boardName)

CustomKeywords.'HomePage.logout'()

CustomKeywords.'Utilities.closeBrowser'()




