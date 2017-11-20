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

CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

WebUI.delay(3)

WebUI.click(findTestObject('ADVSearch/MenuSearch'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('FRAME1'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('ADVSearch/searchCategory'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('ADVSearch/searchCategory'), 'Estimate')

WebUI.delay(3)

WebUI.setText(findTestObject('ADVSearch/caseID'), 'BEP-02Nov2017-5')

WebUI.delay(3)

WebUI.click(findTestObject('ADVSearch/SearchButton'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('ADVSearch/result'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

