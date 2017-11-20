import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.helper.commonfunct.utilities as utilities
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.helper.commonfunct.utilities.login'('https://vtcpdev2.rpega.com:7688/tcpdev/PRServlet', 'pogoa@pegasystems.com', 
    'install')

WebUI.click(findTestObject('Generic/a_Actions'))

WebUI.focus(findTestObject('span_New'))

WebUI.click(findTestObject('span_Bid Process'))

WebUI.switchToFrame(findTestObject('FRAME1'), 30)

WebUI.click(findTestObject('ECR/BID_TYPE'))

CustomKeywords.'com.helper.commonfunct.utilities.Import'('C:\\\\ECR_WITH_MEETING.xlsm')

WebUI.delay(4)

WebUI.setText(findTestObject('Generic/ORG'), 'BOFA')

WebUI.delay(4)

WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))

WebUI.delay(5)

WebUI.setText(findTestObject('Generic/ACC'), 'BOFA')

WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))

WebUI.delay(5)

WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')

WebUI.delay(5)

WebUI.click(findTestObject('Generic/SUBMIT'))

WebUI.delay(5)

WebUI.setText(findTestObject('EngInfo/COID'), 'CO-123')

WebUI.delay(5)

WebUI.setText(findTestObject('EngInfo/MeetingDate'), '10/24/2017 3:20 PM')

WebUI.delay(5)

WebUI.setText(findTestObject('EngInfo/instruction'), 'TEsting')

WebUI.delay(5)

WebUI.click(findTestObject('EngInfo/isCloudInitiativeYes'))

WebUI.delay(5)

WebUI.click(findTestObject('EngInfo/IsPegaMarketingYes'))

WebUI.delay(5)

WebUI.click(findTestObject('EngInfo/IsPegaMobileYes'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('EngInfo/PL'), 'Jeff Henderson')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('EngInfo/PLTL'), 'Robert Higgins')

WebUI.delay(5)

WebUI.click(findTestObject('EngInfo/RapidDeliv'))

WebUI.delay(3)

not_run: WebUI.setText(findTestObject('EngInfo/SM'), 'Neela Suram')

not_run: WebUI.delay(4)

not_run: WebUI.sendKeys(findTestObject('EngInfo/AE'), Keys.chord(Keys.TAB))

not_run: WebUI.delay(4)

not_run: WebUI.setText(findTestObject('EngInfo/AE'), 'Nagaveni Nipinale')

not_run: WebUI.delay(4)

not_run: WebUI.sendKeys(findTestObject('EngInfo/SM'), Keys.chord(Keys.TAB))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('EngInfo/SD'), 'Deepa Sacheti')

not_run: WebUI.delay(4)

not_run: WebUI.sendKeys(findTestObject('EngInfo/SM'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Generic/PlatformID'))

WebUI.delay(3)

WebUI.click(findTestObject('Generic/PlatformVersion'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Generic/MorethanOneRLS'))

WebUI.delay(3)

WebUI.click(findTestObject('Generic/methodology'))

WebUI.delay(3)

WebUI.click(findTestObject('NEXT_BUTTON'))

WebUI.delay(3)

WebUI.click(findTestObject('NEXT_BUTTON'))

WebUI.delay(3)

WebUI.click(findTestObject('Generic/FINISH_BUTTON'))

WebUI.delay(3)

WebUI.click(findTestObject('EngInfo/Continue'))

WebUI.delay(3)

CustomKeywords.'com.helper.commonfunct.utilities.attachDocs'()

WebUI.delay(3)

CustomKeywords.'com.helper.commonfunct.utilities.woid'()

WebUI.delay(3)

CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

WebUI.delay(3)

CustomKeywords.'com.helper.commonfunct.utilities.closeWO'()

WebUI.delay(3)

WebUI.closeBrowser()

CustomKeywords.'com.helper.commonfunct.utilities.setprop'()

WebUI.callTestCase(findTestCase('ECR/REF/Old/ECR_Approval_Reject_OLD'), [:], FailureHandling.STOP_ON_FAILURE)

