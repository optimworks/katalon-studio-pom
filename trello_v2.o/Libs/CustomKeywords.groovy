
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import java.util.ArrayList

import java.util.HashMap

import java.util.List



def static "boardHomePage.verifyBoardHomePage"(
    	Object boardName	) {
    (new boardHomePage()).verifyBoardHomePage(
        	boardName)
}


def static "boardHomePage.changeBoardBackGround"() {
    (new boardHomePage()).changeBoardBackGround()
}


def static "boardHomePage.createList"(
    	Object lists	) {
    (new boardHomePage()).createList(
        	lists)
}


def static "boardHomePage.createCards"(
    	Object lists	
     , 	Object cards	) {
    (new boardHomePage()).createCards(
        	lists
         , 	cards)
}


def static "boardHomePage.addCardBackGround"(
    	Object cards	) {
    (new boardHomePage()).addCardBackGround(
        	cards)
}


def static "boardHomePage.verifylistsIsCreatedOrNot"(
    	Object list	) {
    (new boardHomePage()).verifylistsIsCreatedOrNot(
        	list)
}


def static "boardHomePage.verifyCardsIsCreatedOrNot"(
    	Object cards	) {
    (new boardHomePage()).verifyCardsIsCreatedOrNot(
        	cards)
}


def static "boardHomePage.moveToHomePage"() {
    (new boardHomePage()).moveToHomePage()
}


def static "boardHomePage.verifyBoardIsVisibleOrNotInWorkspace"(
    	Object boardName	) {
    (new boardHomePage()).verifyBoardIsVisibleOrNotInWorkspace(
        	boardName)
}


def static "boardHomePage.PrintCardAndListNames"(
    	Object lists	
     , 	Object cards	) {
    (new boardHomePage()).PrintCardAndListNames(
        	lists
         , 	cards)
}


def static "boardHomePage.changeCardsCover"(
    	Object cards	) {
    (new boardHomePage()).changeCardsCover(
        	cards)
}


def static "boardHomePage.verifyCardDiscriptionWindow"(
    	Object card	) {
    (new boardHomePage()).verifyCardDiscriptionWindow(
        	card)
}


def static "boardHomePage.verifyColors"() {
    (new boardHomePage()).verifyColors()
}


def static "boardHomePage.dragAndDrop"(
    	Object lists	
     , 	Object cards	) {
    (new boardHomePage()).dragAndDrop(
        	lists
         , 	cards)
}


def static "boardHomePage.verifyDrogAndDrop"(
    	Object lists	
     , 	Object cards	) {
    (new boardHomePage()).verifyDrogAndDrop(
        	lists
         , 	cards)
}


def static "boardHomePage.revertDrogAndDrop"(
    	Object lists	
     , 	Object cards	) {
    (new boardHomePage()).revertDrogAndDrop(
        	lists
         , 	cards)
}


def static "boardHomePage.verifyRevertDrogAndDrop"(
    	Object lists	
     , 	Object cards	) {
    (new boardHomePage()).verifyRevertDrogAndDrop(
        	lists
         , 	cards)
}


def static "boardHomePage.deleteBoard"(
    	String boardName	) {
    (new boardHomePage()).deleteBoard(
        	boardName)
}


def static "loginPage.trellologin"(
    	String username	
     , 	String password	) {
    (new loginPage()).trellologin(
        	username
         , 	password)
}


def static "Utilities.launchTrello"(
    	String url	) {
    (new Utilities()).launchTrello(
        	url)
}


def static "Utilities.click"(
    	TestObject object	
     , 	int time	) {
    (new Utilities()).click(
        	object
         , 	time)
}


def static "Utilities.enterText"(
    	TestObject object	
     , 	String value	
     , 	int time	) {
    (new Utilities()).enterText(
        	object
         , 	value
         , 	time)
}


def static "Utilities.createDynamicTestObject"(
    	String locater	) {
    (new Utilities()).createDynamicTestObject(
        	locater)
}


def static "Utilities.genarateRandomNumber"(
    	int length	) {
    (new Utilities()).genarateRandomNumber(
        	length)
}


def static "Utilities.genarateRandomAlphabet"(
    	int lenght	) {
    (new Utilities()).genarateRandomAlphabet(
        	lenght)
}


def static "Utilities.clickUsingJS"(
    	TestObject to	
     , 	int timeout	) {
    (new Utilities()).clickUsingJS(
        	to
         , 	timeout)
}


def static "Utilities.closeBrowser"() {
    (new Utilities()).closeBrowser()
}


def static "HomePage.verifyHomePageIsVisible"() {
    (new HomePage()).verifyHomePageIsVisible()
}


def static "HomePage.createBoard"(
    	String boardName	) {
    (new HomePage()).createBoard(
        	boardName)
}


def static "HomePage.verifyBoardIsCreatedOrNot"(
    	String boardName	) {
    (new HomePage()).verifyBoardIsCreatedOrNot(
        	boardName)
}


def static "HomePage.verifyBoardIsVisibleOrNotInRecentlyViewedSection"(
    	Object boardName	) {
    (new HomePage()).verifyBoardIsVisibleOrNotInRecentlyViewedSection(
        	boardName)
}


def static "HomePage.verifyBoardDelete"(
    	String boardName	) {
    (new HomePage()).verifyBoardDelete(
        	boardName)
}


def static "HomePage.logout"() {
    (new HomePage()).logout()
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createFile"(
    	String fullPathWithoutExtension	
     , 	String template	
     , 	String extension	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createFile(
        	fullPathWithoutExtension
         , 	template
         , 	extension)
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.deleteTestSuite"(
    	String testSuiteName	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).deleteTestSuite(
        	testSuiteName)
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.isStringBelongToList"(
    	String text	
     , 	java.util.ArrayList<String> list	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).isStringBelongToList(
        	text
         , 	list)
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getListExecutedRows"(
    	String testCaseId	
     , 	String iterationType	
     , 	String iterationValue	
     , 	int dataTotalRows	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getListExecutedRows(
        	testCaseId
         , 	iterationType
         , 	iterationValue
         , 	dataTotalRows)
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createNameForNewSuite"(
    	String oldTestSuitePath	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createNameForNewSuite(
        	oldTestSuitePath)
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.replaceTSTemplateWithListNewTC"(
    	String oldTSTemplate	
     , 	String newTCList	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).replaceTSTemplateWithListNewTC(
        	oldTSTemplate
         , 	newTCList)
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getProjectFileName"() {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getProjectFileName()
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.getExecutedBrowser"() {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).getExecutedBrowser()
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.replaceFailedRowsForBindingData"(
    	java.util.HashMap<String, java.util.List<java.lang.Integer>> listFailedRowsBelongToTC	
     , 	String testCaseTemp	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).replaceFailedRowsForBindingData(
        	listFailedRowsBelongToTC
         , 	testCaseTemp)
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.createConsoleModeFile"(
    	String relativeTestSuitePath	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).createConsoleModeFile(
        	relativeTestSuitePath)
}


def static "com.kms.katalon.keyword.testsuite.RerunKeyword.removeTCPassedAndReplaceFailedRows"(
    	String oldTSTemplate	
     , 	java.util.List<String> listFailTestCases	
     , 	java.util.HashMap<String, java.util.List<java.lang.Integer>> listFailedRowsBelongToTC	) {
    (new com.kms.katalon.keyword.testsuite.RerunKeyword()).removeTCPassedAndReplaceFailedRows(
        	oldTSTemplate
         , 	listFailTestCases
         , 	listFailedRowsBelongToTC)
}
