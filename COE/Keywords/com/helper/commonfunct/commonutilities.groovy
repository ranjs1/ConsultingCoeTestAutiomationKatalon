package com.helper.commonfunct
import org.junit.After
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

import org.openqa.selenium.WebElement
import internal.GlobalVariable as GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.JavascriptExecutor 
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.WebDriver as WebDriver
import WebElement as WebElement



public class utilities 
{
@Keyword
def login(String URL, String username, String pwd)
		{
		WebUI.openBrowser('')
		WebUI.navigateToUrl(URL)
		WebUI.setText(findTestObject('Object Repository/input_UserIdentifier'), username)
		WebUI.setText(findTestObject('Object Repository/input_Password'), pwd)
		WebUI.sendKeys(findTestObject('Object Repository/input_Password'), Keys.chord(Keys.ENTER))	
		}
@Keyword
def Import(Filelocation)

		{
		WebUI.verifyElementPresent(findTestObject('Object Repository/button_Import'),2)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/button_Import'))
		WebUI.uploadFile(findTestObject('input_PpyWorkPageppyFilePath'), Filelocation)
		
		WebUI.delay(2)			
		WebUI.scrollToElement(findTestObject('Object Repository/button_Submit'), 0)
		WebUI.click(findTestObject('Object Repository/button_Submit'))
		WebUI.waitForElementVisible(findTestObject('EngInfo/COID'), 3)
		WebUI.delay(5)
		
		
		}
		
		
@Keyword
def logoff()
			{
		WebUI.click(findTestObject('Object Repository/operator1'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/logoffbutton'))
		}
@Keyword
def woid()
		{
		GlobalVariable.WOID=WebUI.getText(findTestObject('WO'))		
		print(GlobalVariable.WOID)
		}
	
@Keyword
def WOstatus()
		{ 
		
			
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('AssignmentStatus'), 1)
		println GlobalVariable.AssignmentList.size()
		
		GlobalVariable.WOSTATUS=WebUI.getText(findTestObject('Object Repository/ECR/WOSTATUS'))
		print(GlobalVariable.WOSTATUS)
		
		
		}
		
		
@Keyword
def closeWO()
		{ 
		WebUI.click(findTestObject('Object Repository/Generic/CLOSE_WORK_OBJECT'))
		}
		
@Keyword
def search()
		{
			WebUI.maximizeWindow()
			WebUI.delay(5)
			
		WebUI.setText(findTestObject('Object Repository/EngInfo/search'), GlobalVariable.WOID)
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/search'), Keys.chord(Keys.ENTER))
		WebUI.delay(5)
		
		println GlobalVariable.WOID
		}
		
@Keyword
def approve()
		{
		WebUI.delay(5)				
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)			
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))	
		WebUI.delay(5)
		}
		@Keyword
		def gsopsApprove(){
		
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Object Repository/Approve-Reject/link_assignment'), 1)
		println GlobalVariable.AssignmentList.size()
		if(GlobalVariable.AssignmentList.size()>1)
		{
		GlobalVariable.AssignmentList[1].click()
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		
		}
		else {
		GlobalVariable.AssignmentList[0].click()
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}
		
		}
		
		
	
		@Keyword
		def gsopsReject(){
		
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Object Repository/Approve-Reject/link_assignment'), 1)
		println GlobalVariable.AssignmentList.size()
		if(GlobalVariable.AssignmentList.size()==2)
		{
		GlobalVariable.AssignmentList[1].click()
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		closeWO()
		WebUI.delay(5)
		search()
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.delay(5)
		WOstatus()
		
		}
		else {
		GlobalVariable.AssignmentList[0].click()
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		closeWO()
		WebUI.delay(5)
		}
		
		}
		
			
		@Keyword
		def reject()
				{
				WebUI.delay(5)
				WebUI.switchToFrame(findTestObject('FRAME1'), 0)
				WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'),0)
				WebUI.click(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'))
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
				WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
				WebUI.delay(5)
				}

	
@Keyword
def attachDocs(){	
			WebUI.delay(5)	
			WebUI.click(findTestObject('Object Repository/Approve-Reject/attachdoc'))
			WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/BSW_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/ESTIMATE_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/OTHER_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/PRIAGE_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/SIZING_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
				WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
				WebUI.delay(5)
				
				GlobalVariable.Meeting=1
				
				}
		
			

@Keyword
def ContractDisposition()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/contractlink'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/cretaeContract'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/Approve-Reject/contractNotes'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		
		WebUI.waitForPageLoad(4)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/dispositionLink'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/dispositionOption'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/Approve-Reject/disposition_comments'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}

@Keyword

def routeToRL()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		
		if (GlobalVariable.Meeting==false)
		{
		WebUI.click(findTestObject('Object Repository/Approve-Reject/routetoRL'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		}
		
		else {
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}
		
		}


@Keyword

def noRL()
		{
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/routetoRLNO'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		}

		@Keyword
		
def RDApprove_Meeting()
				{
				WebUI.switchToFrame(findTestObject('FRAME1'), 0)
				WebUI.delay(5)
				WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
				
				WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
				
				WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
				WebUI.delay(5)
				WebUI.waitForPageLoad(4)
				}
				
@Keyword
def BSW() {
					
		WebUI.click(findTestObject('Generic/a_Actions'))
		WebUI.focus(findTestObject('span_New'))
		WebUI.click(findTestObject('span_Bid Process'))
		WebUI.switchToFrame(findTestObject('FRAME1'), 30)
		WebUI.click(findTestObject('ECR/BID_TYPE'))		
		Import('C:\\ECR.xlsm')
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ORG'), 'BOFA')
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ACC'), 'BOFA')
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/SUBMIT'), 0)
		
		WebUI.click(findTestObject('Generic/SUBMIT'))
		WebUI.delay(5)
					
				}
		
@Keyword

def createECR(String Filelocation)
		{
		WebUI.click(findTestObject('Generic/a_Actions'))
		WebUI.focus(findTestObject('span_New'))
		WebUI.click(findTestObject('span_Bid Process'))
		WebUI.switchToFrame(findTestObject('FRAME1'), 30)
		WebUI.click(findTestObject('ECR/BID_TYPE'))		
		Import(Filelocation)
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ORG'), 'BOFA')
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ACC'), 'BOFA')
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')
		WebUI.delay(5)		
		WebUI.scrollToElement(findTestObject('Generic/SUBMIT'), 0)
		
		WebUI.click(findTestObject('Generic/SUBMIT'))
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('Object Repository/EngInfo/COID'), 'CO-12')
		WebUI.delay(5)
		WebUI.waitForPageLoad(5)
		WebUI.click(findTestObject('Object Repository/Generic/MorethanOneRLS'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Generic/gapDrivenMethodology'))
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Generic/RapidDelivery'))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('Object Repository/ECR/Licence'), '85000')
		WebUI.delay(5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Generic/platform'), 10)
		WebUI.delay(5)		
		
		WebUI.click(findTestObject('Object Repository/Generic/PlatformID'))
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'),'Accessibility')
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Generic/PlatformVersion'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'),'Accessibility Framework')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
		WebUI.delay(5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/PL'))
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PL'),'Jeffrey Hendeson ')
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/EngInfo/PLTL'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PLTL'),'Robert Higgins')
		
		WebUI.delay(5)
		
		
		
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'),2)
		WebUI.click(findTestObject('NEXT_BUTTON'))
		WebUI.delay(7)
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'),2)
		WebUI.click(findTestObject('NEXT_BUTTON'))
		WebUI.delay(7)
		WebUI.waitForPageLoad(3)
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'),2)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		WebUI.delay(5)
		woid()
		WOstatus()
		}

		@Keyword
		
		def ECRMeeting(String Filelocation)
		
		{
			
			
			WebUI.click(findTestObject('Generic/a_Actions'))
			
			WebUI.focus(findTestObject('span_New'))
			
			WebUI.click(findTestObject('span_Bid Process'))
			
			WebUI.switchToFrame(findTestObject('FRAME1'), 30)
			
			WebUI.click(findTestObject('ECR/BID_TYPE'))
			
			Import(Filelocation)
			
			WebUI.delay(5)
			
			/*Identify Engagement*/
			WebUI.setText(findTestObject('Generic/ORG'), 'BOFA')
			
			WebUI.delay(5)
			
			WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))
			
			WebUI.delay(5)
			
			WebUI.setText(findTestObject('Generic/ACC'), 'BOFA')
			
			WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))
			
			WebUI.delay(5)
			
			WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')
			
			WebUI.delay(5)
			
			WebUI.scrollToElement(findTestObject('Generic/SUBMIT'), 2)
			
			WebUI.click(findTestObject('Generic/SUBMIT'))
			
			WebUI.waitForPageLoad(3)
			
			WebUI.delay(5)
			
			WebUI.setText(findTestObject('EngInfo/COID'), 'CO-123')
			WebUI.waitForPageLoad(5)
			
			
			/*Identify Service Team */
			WebUI.delay(5)
			
			WebUI.click(findTestObject('Object Repository/EngInfo/PL'))
			
			WebUI.delay(2)
			
			WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PL'), 'Jeff Hendeson ')
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/EngInfo/PLTL'))
			
			WebUI.delay(5)
			
			WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PLTL'), 'Robert Higgins')
			
			WebUI.delay(5)
			
			/*Identify Licene */
			WebUI.delay(5)
			
			WebUI.click(findTestObject('Object Repository/Generic/MorethanOneRLS'))
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('Object Repository/Generic/RapidDelivery'))
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('Generic/methodology'))
			
			WebUI.delay(5)
			
			WebUI.setText(findTestObject('Object Repository/ECR/Licence'), '85000')
			
			WebUI.delay(5)
			
			/*Identify Product Details  */
			WebUI.click(findTestObject('Object Repository/Generic/PlatformID'))
			
			WebUI.delay(5)
			
			WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'), 'Accessibility')
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('Object Repository/Generic/PlatformVersion'))
			
			WebUI.delay(5)
			
			WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'), 'Accessibility Framework')
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
			
			WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
			
			WebUI.click(findTestObject('NEXT_BUTTON'))
			
			WebUI.delay(5)
			
			/*Clinic Details  */
			WebUI.setText(findTestObject('EngInfo/MeetingDate'), GlobalVariable.MeetingDate)
			
			WebUI.delay(5)
			
			WebUI.setText(findTestObject('EngInfo/instruction'), 'TEsting')
			
			WebUI.delay(5)
			
			/*Services & Sales Team   */
			WebUI.setText(findTestObject('EngInfo/AE'), '')
			
			WebUI.delay(5)
			
			WebUI.setText(findTestObject('EngInfo/AE'), 'Nagaveni Nipinale')
			
			WebUI.delay(5)
			
			WebUI.mouseOver(findTestObject('EngInfo/AE_USER'), FailureHandling.STOP_ON_FAILURE)
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('EngInfo/AE_USER'))
			
			WebUI.delay(5)
			
			WebUI.sendKeys(findTestObject('EngInfo/AE'), Keys.chord(Keys.TAB))
			
			/*Engagement Characteristics For Priage*/
			WebUI.click(findTestObject('EngInfo/isCloudInitiativeYes'))
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('EngInfo/IsPegaMarketingYes'))
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('EngInfo/IsPegaMobileYes'))
			
			WebUI.delay(5)
			
			WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
			
			WebUI.click(findTestObject('NEXT_BUTTON'))
			
			WebUI.delay(5)
			
			WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
			
			WebUI.click(findTestObject('NEXT_BUTTON'))
			
			WebUI.delay(5)
			
			WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'), 2)
			
			WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('EngInfo/Continue'))
			
			WebUI.delay(5)
			
			attachDocs()
			
			woid()
			
			WOstatus()
			
			GlobalVariable.Meeting=true
		}
		
		
@Keyword 

def docUpdate()
		{
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/linktoupdateEngData'))
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'),0)
		WebUI.click(findTestObject('NEXT_BUTTON'))
		WebUI.delay(5)		
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'),0)
		
		WebUI.click(findTestObject('NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'),0)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		}
		
		
		@Keyword
		
		def docUpdateMeeting()
				{
				WebUI.switchToFrame(findTestObject('FRAME1'), 0)
				WebUI.delay(5)
				WebUI.click(findTestObject('Object Repository/Approve-Reject/linktoupdateEngData'))
				WebUI.scrollToElement(findTestObject('NEXT_BUTTON'),0)
				
				
				WebUI.click(findTestObject('NEXT_BUTTON'))
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('NEXT_BUTTON'),0)
				
				WebUI.click(findTestObject('NEXT_BUTTON'))
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'),0)
				
				
				WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
				WebUI.delay(5)
				WebUI.click(findTestObject('EngInfo/Continue'))
				WebUI.delay(5)
				WebUI.delay(5)
				WebUI.delay(5)
				WebUI.waitForPageLoad(4)
				}
		
				


@Keyword

def setprop(String Flow){
		
if (GlobalVariable.Approve_Reject_Recall=='Approve')


		{
		GlobalVariable.RLReject=false
		GlobalVariable.RDReject=false
		GlobalVariable.OpsReject=false
		GlobalVariable.RouteToRL=true
		GlobalVariable.RDD_Reject=false
		GlobalVariable.EXP_SVC_Reject=false
		}

		else if(GlobalVariable.Approve_Reject_Recall=='Reject')

		{	
			GlobalVariable.RLReject=true
			GlobalVariable.RDReject=true
			GlobalVariable.OpsReject=true
			GlobalVariable.RouteToRL=true
			GlobalVariable.RDD_Reject=true
			GlobalVariable.EXP_SVC_Reject=true
			}
		
		else
		
		{
			GlobalVariable.RLRecall=true
			GlobalVariable.RDRecall=true
			GlobalVariable.OpsRecall=true
			GlobalVariable.RouteToRL=true
			GlobalVariable.EXP_SVC_Recall=true
			}
}

}
@Keyword
		def scheduleMeeting(){
			WebUI.delay(5)
			WebUI.switchToFrame(findTestObject('FRAME1'), 0)
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/ECR_MEETING/meetinglink'))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Object Repository/ECR_MEETING/location'), 'Testing')
			WebUI.delay(2)
			WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
			WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
			WebUI.delay(5)
			WebUI.verifyTextPresent('This proposal clinic meeting has been scheduled. You may request to reschedule the meeting by using the Actions', false)
			
		}
				

		

@Keyword

		def pendingClinic()
		{
			WebUI.delay(5)
			WebUI.switchToFrame(findTestObject('FRAME1'), 0)
			WebUI.delay(5)			
			WebUI.click(findTestObject('Object Repository/ECR_MEETING/HoldClinicMeeting'))
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/ECR_MEETING/CLINIC_OUTCOME'))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Object Repository/ECR_MEETING/OUTCOME_NOTES'), 'testing')	
			WebUI.delay(5)
			WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
			WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
			WebUI.delay(5)
		}












