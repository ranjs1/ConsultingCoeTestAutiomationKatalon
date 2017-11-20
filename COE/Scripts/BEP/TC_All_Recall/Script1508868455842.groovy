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

WebUI.callTestCase(findTestCase('BEP/TC_Create_BEP_NoOutput'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.RDRecall = true

GlobalVariable.RLRecall = true

CustomKeywords.'com.helper.commonfunct.utilities.setprop'('Recall')

not_run: while (GlobalVariable.WOSTATUS.contains('Pending')) {
    if (GlobalVariable.WOSTATUS == 'Pending-RDApproval') {
        if (GlobalVariable.RDRecall == true) {
            CustomKeywords.'com.helper.commonfunct.utilities.login'('http://vtcpqa2:9685/tcpqa/PRServlet', 'hendj@pegasystems.com', 
                'install')

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.recall'()

            GlobalVariable.RDRecall = false

            print(GlobalVariable.RDReject)

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

            WebUI.closeBrowser()
        } else {
            CustomKeywords.'com.helper.commonfunct.utilities.login'('http://vtcpqa2:9685/tcpqa/PRServlet', 'ellia@pegasystems.com', 
                'install')

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.RDapprove'()

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

            WebUI.closeBrowser()
        }
    } else if (GlobalVariable.WOSTATUS == 'Pending-RLApproval') {
        if (GlobalVariable.RLRecall == true) {
            CustomKeywords.'com.helper.commonfunct.utilities.login'('http://vtcpqa2:9685/tcpqa/PRServlet', 'hendj@pegasystems.com', 
                'install')

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.recall'()

            GlobalVariable.RLRecall = false

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

            WebUI.closeBrowser()
        } else {
            CustomKeywords.'com.helper.commonfunct.utilities.login'('http://vtcpqa2:9685/tcpqa/PRServlet', 'panee@pegasystems.com', 
                'install')

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.RLapprove'()

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

            WebUI.closeBrowser()
        }
    } else if (GlobalVariable.WOSTATUS == 'Pending-Update') {
        CustomKeywords.'com.helper.commonfunct.utilities.login'('http://vtcpqa2:9685/tcpqa/PRServlet', 'hendj@pegasystems.com', 
            'install')

        CustomKeywords.'com.helper.commonfunct.utilities.search'()

        CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.UpdateAfterRecall'()

        CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

        WebUI.closeBrowser()
    }
}

WebUI.callTestCase(findTestCase('BEP/All_Approval_Recall'), [:], FailureHandling.STOP_ON_FAILURE)

