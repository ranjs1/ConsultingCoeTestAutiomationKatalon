import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

/* JUST FOR TESTING AND DEMO PURPOSE */

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vtcpqa2.rpega.com:9030/tcpqa/PRServlet/beEBp4uRVTogorRwSwWqbOtn9IL2fwdI*/!STANDARD')

WebUI.setText(findTestObject('Page_Pega 7 (1)/input_UserIdentifier'), 'holmd@pegasystems.com')

WebUI.setText(findTestObject('Page_Pega 7 (1)/input_Password'), 'install')

WebUI.click(findTestObject('Page_Pega 7 (1)/span_Log in'))

WebUI.closeBrowser()

