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

CustomKeywords.'HomePage.createBoard'(boardName)

CustomKeywords.'HomePage.verifyBoardIsCreatedOrNot'(boardName)

CustomKeywords.'boardHomePage.createList'(lists)

CustomKeywords.'boardHomePage.verifylistsIsCreatedOrNot'(lists)

CustomKeywords.'boardHomePage.createCards'(lists, cards)

CustomKeywords.'boardHomePage.addCardBackGround'(cards)

//CustomKeywords.'boardHomePage.verifyCardsIsCreatedOrNot'(cards)
//
//CustomKeywords.'boardHomePage.changeCardsCover'(cards)
//
//CustomKeywords.'boardHomePage.moveToHomePage'()
//
//CustomKeywords.'HomePage.verifyHomePageIsVisible'()
//
//CustomKeywords.'HomePage.verifyBoardIsVisibleOrNotInRecentlyViewedSection'(boardName)
//
//CustomKeywords.'boardHomePage.verifyBoardIsVisibleOrNotInWorkspace'(boardName)
//
//CustomKeywords.'boardHomePage.verifyBoardHomePage'()
//
//CustomKeywords.'boardHomePage.PrintCardAndListNames'(lists, cards)
//
//CustomKeywords.'boardHomePage.dragAndDrop'(lists,cards)
//
//CustomKeywords.'boardHomePage.verifyDrogAndDrop'(lists,cards)
//
//CustomKeywords.'boardHomePage.revertDrogAndDrop'(lists,cards)
//
//CustomKeywords.'boardHomePage.verifyRevertDrogAndDrop'(lists,cards)
//
//CustomKeywords.'boardHomePage.deleteBoard'(boardName)
CustomKeywords.'boardHomePage.changeBoardBackGround'()

//CustomKeywords.'boardHomePage.createList'(lists)

//CustomKeywords.'boardHomePage.verifylistsIsCreatedOrNot'(lists)

//CustomKeywords.'boardHomePage.createCards'(lists, cards)

//CustomKeywords.'boardHomePage.addCardBackGround'(cards)

//CustomKeywords.'boardHomePage.verifyCardsIsCreatedOrNot'(cards)

//CustomKeywords.'boardHomePage.changeCardsCover'(cards)

//CustomKeywords.'boardHomePage.moveToHomePage'()

//CustomKeywords.'HomePage.verifyHomePageIsVisible'()

//CustomKeywords.'HomePage.verifyBoardIsVisibleOrNotInRecentlyViewedSection'(boardName)

//CustomKeywords.'boardHomePage.verifyBoardIsVisibleOrNotInWorkspace'(boardName)

//CustomKeywords.'boardHomePage.verifyBoardHomePage'()

//CustomKeywords.'boardHomePage.PrintCardAndListNames'(lists, cards)

//CustomKeywords.'boardHomePage.dragAndDrop'(lists,cards)

//CustomKeywords.'boardHomePage.verifyDrogAndDrop'(lists,cards)

//CustomKeywords.'boardHomePage.revertDrogAndDrop'(lists,cards)

//CustomKeywords.'boardHomePage.verifyRevertDrogAndDrop'(lists,cards)

CustomKeywords.'boardHomePage.deleteBoard'(boardName)

//CustomKeywords.'HomePage.verifyBoardDelete'(boardName)

//CustomKeywords.'HomePage.logout'()

//CustomKeywords.'Utilities.closeBrowser'()




