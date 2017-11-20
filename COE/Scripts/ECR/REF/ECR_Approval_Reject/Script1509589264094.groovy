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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.support.ui.ExpectedCondition as ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.OPS, GlobalVariable.pwd)

CustomKeywords.'com.helper.commonfunct.utilities.search'()

CustomKeywords.'com.helper.commonfunct.utilities.woid'()

CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

while (GlobalVariable.WOSTATUS.contains('Pending')) {
    for (int j = 0; j < GlobalVariable.AssignmentList.size(); j++) {
        GlobalVariable.Status = GlobalVariable.AssignmentList[j].text

        println(GlobalVariable.Status)

        if (GlobalVariable.Status == 'Pending-RDApproval') {
            if (GlobalVariable.RDReject == false) {
                if (GlobalVariable.Meeting == true) {
                    CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

                    CustomKeywords.'com.helper.commonfunct.utilities.search'()

                    CustomKeywords.'com.helper.commonfunct.utilities.routeToRL'()

                    print(GlobalVariable.Status)

                    CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
                } else {
                    CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

                    CustomKeywords.'com.helper.commonfunct.utilities.search'()

                    CustomKeywords.'com.helper.commonfunct.utilities.approve'()

                    CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
                }
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                WebUI.maximizeWindow()

                CustomKeywords.'com.helper.commonfunct.utilities.reject'()

                GlobalVariable.RDReject = false

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            }
        } else if (GlobalVariable.Status == 'Pending-RLApproval') {
            if (GlobalVariable.RLReject == false) {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RL, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                WebUI.maximizeWindow()

                CustomKeywords.'com.helper.commonfunct.utilities.approve'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RL, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                WebUI.maximizeWindow()

                CustomKeywords.'com.helper.commonfunct.utilities.reject'()

                GlobalVariable.RLReject = false

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            }
        } else if (GlobalVariable.Status == 'Pending-RDDApproval') {
            if (GlobalVariable.RDD_Reject == false) {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RDD, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.utilities.approve'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RDD, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.utilities.reject'()

                GlobalVariable.RDD_Reject = false

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

                println(GlobalVariable.Status)
            }
        } else if (GlobalVariable.Status == 'Pending-OPSApproval') {
            if (GlobalVariable.OpsReject == false) {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.OPS, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.utilities.gsopsApprove'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.OPS, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                WebUI.maximizeWindow()

                CustomKeywords.'com.helper.commonfunct.utilities.gsOpsReject'()

                GlobalVariable.OpsReject = false

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            }
        } else if (GlobalVariable.Status == 'Pending-ExpSvcApproval') {
            if (GlobalVariable.EXP_SVC_Reject == false) {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.EXP_SVC, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.utilities.approve'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.EXP_SVC, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.utilities.reject'()

                GlobalVariable.EXP_SVC_Reject = false

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            }
        } else if (GlobalVariable.Status == 'Pending-DocUpdate') {
            if (GlobalVariable.Meeting == false) {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.OPS, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                WebUI.maximizeWindow()

                CustomKeywords.'com.helper.commonfunct.utilities.docUpdate'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()

                WebUI.delay(3)
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.OPS, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                WebUI.maximizeWindow()

                CustomKeywords.'com.helper.commonfunct.utilities.docUpdateMeeting'()

                CustomKeywords.'com.helper.commonfunct.utilities.attachDocs'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            }
        } else if (GlobalVariable.Status == 'Pending-Contract') {
            CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.PL, GlobalVariable.pwd)

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            WebUI.maximizeWindow()

            CustomKeywords.'com.helper.commonfunct.utilities.ContractDisposition'()

            WebUI.waitForPageLoad(4)

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
        } else if (GlobalVariable.Status == 'Pending-MeetingSchedule') {
            CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.CLINIC, GlobalVariable.pwd)

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            WebUI.maximizeWindow()

            CustomKeywords.'com.helper.commonfunct.utilities.scheduleMeeting'()

            WebUI.waitForPageLoad(4)

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
        } else {
            CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            WebUI.maximizeWindow()

            CustomKeywords.'com.helper.commonfunct.utilities.pendingClinic'()

            WebUI.waitForPageLoad(4)

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
        }
    }
}

