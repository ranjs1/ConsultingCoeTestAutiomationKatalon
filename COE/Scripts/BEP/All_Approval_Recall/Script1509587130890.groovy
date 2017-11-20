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
    for (int j = 0; j < GlobalVariable.AssignmentList.size(); j++) {
        GlobalVariable.Status = GlobalVariable.AssignmentList[j].text

        println(GlobalVariable.Status)

        if (GlobalVariable.WOSTATUS == 'Pending-RDApproval') {
            if (GlobalVariable.RDRecall == false) {
                if (GlobalVariable.RouteToRL == true) {
                    CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

                    CustomKeywords.'com.helper.commonfunct.utilities.search'()

                    CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.RDapprove'()

                    CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
                } else {
                    CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

                    CustomKeywords.'com.helper.commonfunct.utilities.search'()

                    CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.noToRL'()

                    CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
                }
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RD, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.RDRecall'()

                GlobalVariable.RDRecall = false

                print(GlobalVariable.RDRecall)

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            }
        } else if (GlobalVariable.WOSTATUS == 'Pending-RLApproval') {
            if (GlobalVariable.RLRecall == false) {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RL, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.RLapprove'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RL, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.RLRecall'()

                GlobalVariable.RLRecall = false

                print(GlobalVariable.RLRecall)

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            }
        } else if (GlobalVariable.WOSTATUS == 'Pending-Update') {
            CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.PL, GlobalVariable.pwd)

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.Update'()

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
        } else if (GlobalVariable.WOSTATUS == 'Pending-Meeting') {
            CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.RL, GlobalVariable.pwd)

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.RLapprove'()

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
        } else if (GlobalVariable.WOSTATUS == 'Pending-EmailCustomer') {
            if (GlobalVariable.SendEmail == true) {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.PL, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.EmailCustomer'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            } else {
                CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.PL, GlobalVariable.pwd)

                CustomKeywords.'com.helper.commonfunct.utilities.search'()

                CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.SkipEmail'()

                CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
            }
        } else {
            CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.OPS, GlobalVariable.pwd)

            CustomKeywords.'com.helper.commonfunct.utilities.search'()

            CustomKeywords.'com.helper.commonfunct.BEP_CommonMethod.GSOpsReview'()

            CustomKeywords.'com.helper.commonfunct.utilities.WOstatus'()
        }
    }
}

