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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions
import internal.GlobalVariable
import org.openqa.selenium.chrome.ChromeDriver


public class boardHomePage {
	
	//WebDriver driver = new ChromeDriver();

	int shortTime = GlobalVariable.shortTime

	int middleTime = GlobalVariable.middleTime

	int longTime = GlobalVariable.longTime

	int veryLongTime = GlobalVariable.veryLongTime
	
	//Actions actions = new Actions(driver);
	
	
    @Keyword
	public verifyBoardHomePage() {

		assert WebUI.verifyElementPresent(findTestObject('boardHomePageLocaters/boardTitle'), longTime)==true:'board home page not displayed'
	}

	@Keyword
    public createList(def lists) {

		for (int i = 0; i <= (lists.size() - 1); i++) {

			CustomKeywords.'Utilities.enterText'(findTestObject('boardHomePageLocaters/listNameTextField'), lists[i], shortTime)

			CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/createListButton'), shortTime)
		}
	}

	@Keyword
	public createCards(def lists,def cards) {
		
        int c= 0;

		for (int j = 0; j <= (lists.size() - 1); j++) {

			String list = lists[j]

			String selectList = "//h2[normalize-space()='"+ list+"']/ancestor::div[@class='js-list list-wrapper']//div/a/span[text()='Add a card']"

			TestObject selectlistObject = CustomKeywords.'Utilities.createDynamicTestObject'(selectList)

			WebUI.click(selectlistObject)
		
			for (int k = 0; k <= 1; k++) {

				CustomKeywords.'Utilities.enterText'(findTestObject('boardHomePageLocaters/cardNameTestField'), cards[c], longTime)

				CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/createCardButton'), shortTime)

				c++;
			}
		}
	}
	
	@Keyword
	def addCardBackGround( def cards) {
		
		CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/cardInList',['text':cards[0]]), veryLongTime)
		
		CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/AttachementButton'), longTime)
		
		WebUI.delay(5)
		
		CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/computerButton'), veryLongTime)
		
		WebUI.delay(20)
		
	}

	@Keyword
	public verifylistsIsCreatedOrNot(def lists) {

		for (int m = 0; m <= (lists.size() - 1); m++) {

			String verifylist = "//h2[normalize-space()='"+(lists[m])+"']"
		String listname = lists[m]

		TestObject list = CustomKeywords.'Utilities.createDynamicTestObject'(verifylist)

		assert WebUI.verifyElementPresent(list, longTime) == true:lists[m]+'is not created'
	}
	}

	@Keyword
	public verifyCardsIsCreatedOrNot(def cards) {

		for (int n = 0; n <= (cards.size() - 1); n++) {

			String verifycard = "//span[text()='"+(cards[n])+"']"

			TestObject cardobject = CustomKeywords.'Utilities.createDynamicTestObject'(verifycard)

			assert WebUI.verifyElementPresent(cardobject, longTime) == true:cards[n]+'is not created'

			WebUI.waitForElementVisible(findTestObject('Object Repository/boardHomePageLocaters/cardUnderLIst',['cardName':cards[n]]), veryLongTime)
		}
	}

	@Keyword
	def moveToHomePage() {

		CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/BackToHome'), shortTime)

		assert WebUI.verifyElementPresent(findTestObject('Object Repository/homePageLocaters/userLogo'), longTime) == true : 'trello home page not displayed'
	}

	@Keyword
	def verifyBoardIsVisibleOrNotInWorkspace(def boardName) {
		
		assert WebUI.waitForElementVisible(findTestObject('Object Repository/boardHomePageLocaters/boardInWorkspace',['text':boardName]), veryLongTime)==true:" board is displayed in workspace feild"

		CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/boardInWorkspace',['text':boardName]), veryLongTime)
	}

	@Keyword
	def PrintCardAndListNames(def lists ,def cards) {

		List<String> listTitle=new ArrayList<String>();

		for(int p = 1;p<=lists.size();p++) {
			
			String str = WebUI.getText(findTestObject('Object Repository/boardHomePageLocaters/listBox',['number':p]))
			
			listTitle.add(str)

		}

		println(listTitle)


		List<String> cardTitle=new ArrayList<String>();

		for(int r = 1;r<=cards.size();r++) {

			String cardBox = "(//span[@class='list-card-title js-card-name'])["+r+"]"

			TestObject cardData = CustomKeywords.'Utilities.createDynamicTestObject'(cardBox)

			String listNames = WebUI.getText(cardData)

			cardTitle.add(listNames)
		}

		println(cardTitle)
	}
	
	@Keyword
	def changeCardsCover( def cards) {
		
		for(int i =0;i<= cards.size()-1; i++) {
			
			CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/cardInList',['text':cards[i]]), veryLongTime)
			
		    CustomKeywords.'boardHomePage.verifyCardDiscriptionWindow'(cards[i])
			
			CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/coverButton'), veryLongTime)
			
			CustomKeywords.'boardHomePage.verifyColors'()
			
			String color = WebUI.getCSSValue(findTestObject('Object Repository/boardHomePageLocaters/Colors',['index':i+1]), 'background-color')
			
			CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/Colors',['index':i+1]), veryLongTime)
			
			CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/coverSizeButton'), veryLongTime)
			
			CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/coverPageCloseBUtton'), veryLongTime)
			
			CustomKeywords.'Utilities.click'(findTestObject('Object Repository/boardHomePageLocaters/cardDiscriptionpageCloseButton'), veryLongTime)
			
		   String  cardColor = WebUI.getCSSValue(findTestObject('Object Repository/boardHomePageLocaters/cardBox',['cardName':cards[i]]), 'background-color')
		   
			println("card name is "+cards[i]+" color is "+cardColor)
			
			
			assert (color == cardColor)== true:" color is not matching "				
			
			
			}
		
		}
		
		@Keyword
		def verifyCardDiscriptionWindow(def card) {
		
	String value = WebUI.getAttribute(findTestObject('Object Repository/boardHomePageLocaters/cardDiscriptionButton'), "value")
	println()
		
		}
	@Keyword
	def verifyColors() {
		
		for(int i =1;i<=10;i++) {
			
		assert WebUI.waitForElementVisible(findTestObject('Object Repository/boardHomePageLocaters/Colors',['index':i]), veryLongTime)==true:i+"is not visible"
		
		}
	}
	
	@Keyword
	public dragAndDrop(def lists,def cards) {

      WebUI.dragAndDropToObject(findTestObject('boardHomePageLocaters/cardInList',['text':cards[0]]), findTestObject('Object Repository/boardHomePageLocaters/dropCard',['text':cards[3]]))
	
	  }

	@Keyword
	def verifyDrogAndDrop(def lists,def cards) {

		String verifycard1InList1 = "//h2[normalize-space()='"+lists[0]+"']/ancestor::div[2]/div[2]/a//span[text()='"+cards[0]+"']"

		TestObject verifycard1InList1Object = CustomKeywords.'Utilities.createDynamicTestObject'(verifycard1InList1)

		assert WebUI.verifyElementNotPresent(verifycard1InList1Object, longTime)==true:cards[0]+' is present '
		//assert WebUI.waitForElementVisible(findTestObject('Object Repository/boardHomePageLocaters/cardSelectedList',['list':lists[0],'card':cards[0]]), veryLongTime)

		String verifyCard1InList2 = "//h2[normalize-space()='"+lists[1]+"']/ancestor::div[2]/div[2]/a//span[text()='"+cards[0]+"']"

		TestObject verifyCard1InList2Object = CustomKeywords.'Utilities.createDynamicTestObject'(verifyCard1InList2)

		assert WebUI.verifyElementPresent(verifyCard1InList2Object,longTime)==true:cards[0]+'is not present'
	}
	@Keyword
	def revertDrogAndDrop(def lists,def cards) {

	

		WebUI.dragAndDropToObject(findTestObject('boardHomePageLocaters/cardInList',['text':cards[0]]), findTestObject('Object Repository/boardHomePageLocaters/dropCard',['text':cards[1]]))
	}

	@Keyword
	def verifyRevertDrogAndDrop(def lists,def cards) {

		String verifycard1InList1 = "//h2[normalize-space()='"+lists[0]+"']/ancestor::div[2]/div[2]/a//span[text()='"+cards[0]+"']"

		TestObject verifycard1InList1Object = CustomKeywords.'Utilities.createDynamicTestObject'(verifycard1InList1)

		assert WebUI.verifyElementPresent(verifycard1InList1Object, longTime)==true:cards[0]+' is not present '

		String verifyCard1InList2 = "//h2[normalize-space()='"+lists[1]+"']/ancestor::div[2]/div[2]/a//span[text()='"+cards[0]+"']"

		TestObject verifyCard1InList2Object = CustomKeywords.'Utilities.createDynamicTestObject'(verifyCard1InList2)

		assert WebUI.verifyElementNotPresent(verifyCard1InList2Object, longTime)==true:cards[0]+'is  present'
	}

	@Keyword
	public deleteBoard(String boardName) {

		String board ="//h1[text()='"+boardName+"']"

		TestObject boardObject = CustomKeywords.'Utilities.createDynamicTestObject'(board)

		assert WebUI.verifyElementPresent(boardObject, longTime) == true:boardName+'is not visible'

		CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/showMore'), shortTime)

		CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/moreButton'), shortTime)

		CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/closeBoardButton'), shortTime)

		CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/closeBotton'), veryLongTime)

		CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/deleteButton'), veryLongTime)

		CustomKeywords.'Utilities.click'(findTestObject('boardHomePageLocaters/parmanantlyDelete'), veryLongTime)

		assert WebUI.verifyElementPresent(findTestObject('homePageLocaters/userLogo'), longTime) == true : 'userlogo not visible'
	}
}
