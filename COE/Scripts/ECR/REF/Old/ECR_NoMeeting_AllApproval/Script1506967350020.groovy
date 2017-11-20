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

while (GlobalVariable.WOSTATUS.contains('Pending')) {
    if (GlobalVariable.WOSTATUS == 'Pending-RDApproval') {
        CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

        CustomKeywords.'com.helper.commonfunct.utilities.search'()

        CustomKeywords.'com.helper.commonfunct.utilities.noRL'()

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

        WebUI.delay(3)

        WebUI.closeBrowser()

        WebUI.delay(4)
    } else if (GlobalVariable.WOSTATUS == 'Pending-RLApproval') {
        CustomKeywords.'com.helper.commonfunct.utilities.login'('https://vtcpdev2.rpega.com:7688/tcpdev/PRServlet', 'panee@pegasystems.com', 
            'install')

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.search'()

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.approve'()

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

        WebUI.delay(3)

        WebUI.closeBrowser()

        WebUI.delay(4)
    } else if (GlobalVariable.WOSTATUS == 'Pending-Contract') {
        CustomKeywords.'com.helper.commonfunct.utilities.login'('https://vtcpdev2.rpega.com:7688/tcpdev/PRServlet', 'hendj@pegasystems.com', 
            'install')

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.search'()

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.ContractDisposition'()

        WebUI.delay(4)

        WebUI.waitForPageLoad(4)

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

        CustomKeywords.'com.helper.commonfunct.utilities.closeWO'()
    } else if (GlobalVariable.WOSTATUS == 'Pending-OPSApproval') {
        CustomKeywords.'com.helper.commonfunct.utilities.login'('https://vtcpdev2.rpega.com:7688/tcpdev/PRServlet', 'pogoa@pegasystems.com', 
            'install')

        CustomKeywords.'com.helper.commonfunct.utilities.search'()

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.approve'()

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

        WebUI.delay(3)

        WebUI.closeBrowser()

        WebUI.delay(4)
    } else if (GlobalVariable.WOSTATUS == 'Pending-DocUpdate') {
        CustomKeywords.'com.helper.commonfunct.utilities.login'('https://vtcpdev2.rpega.com:7688/tcpdev/PRServlet', 'pogoa@pegasystems.com', 
            'install')

        CustomKeywords.'com.helper.commonfunct.utilities.search'()

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.docUpdate'()

        WebUI.delay(3)

        CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

        WebUI.delay(3)

        WebUI.closeBrowser()

        WebUI.delay(4)
    }
}

