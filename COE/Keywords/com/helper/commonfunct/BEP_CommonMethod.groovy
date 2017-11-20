package com.helper.commonfunct

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
import com.sun.jna.platform.win32.WinDef.WORD

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.junit.After
import org.openqa.selenium.Keys as Keys

public class BEP_CommonMethod {
	
	
@Keyword
	
	def BEPImport(String filename){
	WebUI.delay(5)
	WebUI.waitForElementVisible(findTestObject('BEP/import'), 0)
	WebUI.click(findTestObject('BEP/import'))
	WebUI.delay(5)
	WebUI.uploadFile(findTestObject('input_PpyWorkPageppyFilePath'), filename)
	WebUI.delay(5)
	WebUI.click(findTestObject('Object Repository/button_Submit'))
		
	}
	
	@Keyword
	
	def EstimateNoOutput(String Filelocation)
	{
		WebUI.click(findTestObject('Generic/a_Actions'))
		WebUI.focus(findTestObject('span_New'))
		WebUI.click(findTestObject('BEP/EstimateLink'))
		WebUI.switchToFrame(findTestObject('FRAME1'), 30)
		BEPImport(Filelocation)
		WebUI.delay(7)
		WebUI.setText(findTestObject('Generic/ORG'), 'BOFA')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ACC'), 'BOFA')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Generic/PlatformID'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'), 'Accessibility')
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Generic/PlatformVersion'))
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'), 'Accessibility Framework')
		
		WebUI.delay(4)
		
		WebUI.scrollToElement(findTestObject('BEP/MorethanOneRLSNO'), 2)
		
		WebUI.click(findTestObject('BEP/MorethanOneRLSNO'))
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
		
		WebUI.delay(4)
		
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		
		WebUI.click(findTestObject('NEXT_BUTTON'))
		
		WebUI.setText(findTestObject('BEP/DurationLow'), '12')
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('BEP/DurationLow'), Keys.chord(Keys.TAB))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('BEP/DurationHigh'), '12')
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('BEP/DurationHigh'), Keys.chord(Keys.TAB))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('BEP/PartnerHoursLow'), '12')
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('BEP/PartnerHoursLow'), Keys.chord(Keys.TAB))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('BEP/PartnerHoursHigh'), '12')
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('BEP/EstimationMethod'))
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('BEP/EstimationMethod'), 'BSW', FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('BEP/routeToRL'))
		
		WebUI.delay(2)
		
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		
		WebUI.click(findTestObject('NEXT_BUTTON'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('BEP/BEPoutput'))
		
		WebUI.delay(4)
		
		WebUI.selectOptionByValue(findTestObject('BEP/ReasonCode'), 'RFP in process', false)
		
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		
		WebUI.click(findTestObject('NEXT_BUTTON'))
		
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'), 2)
		
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		
		WebUI.delay(4)
		
		woid()
		
	}
	
	
	@Keyword
	
	def EstimateEmailOutput(String Filelocation)
	{
		WebUI.click(findTestObject('Generic/a_Actions'))
		
		WebUI.focus(findTestObject('span_New'))
		
		WebUI.click(findTestObject('BEP/EstimateLink'))
		
		WebUI.switchToFrame(findTestObject('FRAME1'), 30)
		
		BEPImport(Filelocation)
		
		WebUI.delay(8)
		
		WebUI.setText(findTestObject('Generic/ORG'), 'BOFA')
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('Generic/ACC'), 'BOFA')
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Generic/PlatformID'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'), 'Accessibility')
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Generic/PlatformVersion'))
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'), 'Accessibility Framework')
		
		WebUI.delay(4)
		
		WebUI.scrollToElement(findTestObject('BEP/MorethanOneRLSNO'), 2)
		
		WebUI.click(findTestObject('BEP/MorethanOneRLSNO'))
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
		
		WebUI.delay(4)
		
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		
		WebUI.click(findTestObject('NEXT_BUTTON'))
		
		WebUI.setText(findTestObject('BEP/DurationLow'), '12')
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('BEP/DurationLow'), Keys.chord(Keys.TAB))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('BEP/DurationHigh'), '12')
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('BEP/DurationHigh'), Keys.chord(Keys.TAB))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('BEP/PartnerHoursLow'), '12')
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('BEP/PartnerHoursLow'), Keys.chord(Keys.TAB))
		
		WebUI.delay(5)
		
		WebUI.setText(findTestObject('BEP/PartnerHoursHigh'), '12')
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('BEP/EstimationMethod'))
		
		WebUI.delay(5)
		
		WebUI.sendKeys(findTestObject('BEP/EstimationMethod'), 'BSW', FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('BEP/routeToRL'))
		
		WebUI.delay(2)
		
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		
		WebUI.click(findTestObject('NEXT_BUTTON'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('BEP/BEPOutputEmail'))
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('BEP/RECEIPIENT'))
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('BEP/AddEmailID'))
		
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('BEP/MAILID_XPATH'), 'nagaveni.nipinale@in.pega.com')
		WebUI.delay(4)
		WebUI.click(findTestObject('BEP/modal_submit'))
		
		WebUI.delay(4)
		
		WebUI.sendKeys(findTestObject('BEP/Email_Subject'), 'Test Automation')
		
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		
		WebUI.click(findTestObject('NEXT_BUTTON'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		woid()
	}
	
	
@Keyword
	def OldWOstatus()
			{
			GlobalVariable.WOSTATUS=WebUI.getText(findTestObject('Object Repository/BEP/WOSTATUS'))
			WebUI.click(findTestObject('Object Repository/Generic/CLOSE_WORK_OBJECT'))
			
			}
@Keyword
			
			def WOstatus()
			{
			GlobalVariable.WOSTATUS=WebUI.getText(findTestObject('Object Repository/BEP/WOSTATUS'))
			print(GlobalVariable.WOSTATUS)
			GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('AssignmentStatus'), 1)
			println GlobalVariable.AssignmentList.size()

			}
			
	
	
				
			
	
@Keyword
	def search()
	{
		WebUI.maximizeWindow()
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/EngInfo/search'), GlobalVariable.WOID)
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/search'), Keys.chord(Keys.ENTER))
		WebUI.delay(4)
	}
	
	
	@Keyword
	def woid()
			{
			GlobalVariable.WOID=WebUI.getText(findTestObject('Object Repository/BEP/BEPWOID'))
			print(GlobalVariable.WOID)
			}
		
	
@Keyword
	def RDapprove()
	{
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/RDLink'))
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
	WebUI.click(findTestObject('NEXT_BUTTON'))
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RLApprove'),0)
	
	WebUI.click(findTestObject('BEP/RD_RLApprove'))
	WebUI.delay(4)
	WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
	
	WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
	WebUI.delay(4)
	
	}
	
	
	
	@Keyword
	def noToRL()
	{
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/RDLink'))
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
	WebUI.delay(4)
	
	WebUI.click(findTestObject('Object Repository/BEP/routeNoTORL'))
	WebUI.delay(4)
	
	WebUI.click(findTestObject('NEXT_BUTTON'))
	WebUI.delay(4)
	WebUI.click(findTestObject('BEP/RD_RLApprove'))
	WebUI.delay(4)
	WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
	
	WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
	
	WebUI.delay(4)
	}
	
	

	@Keyword
	def RDReject()
	{
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/RDLink'))
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
	WebUI.click(findTestObject('NEXT_BUTTON'))
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RL_REJECT'),0)
	
	WebUI.click(findTestObject('BEP/RD_RL_REJECT'))
	WebUI.delay(4)
	WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
	
	WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
	
	WebUI.delay(4)
	}
	
	
	
	@Keyword
	
	def GSOpsReview(){
		
		
		WebUI.delay(4)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/BEP/GSOpsLink'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('NEXT_BUTTON'))
		WebUI.delay(4)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(4)
			
	}
	
	
	@Keyword
	def RLapprove()

	{
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/RlLink'))
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
	WebUI.click(findTestObject('NEXT_BUTTON'))
	WebUI.delay(4)
	if (GlobalVariable.Meeting==true)
	{
	WebUI.verifyTextPresent('A meeting for this estimate has been requested/scheduled', false)
	WebUI.delay(4)
	
	}
	else{
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RLApprove'),0)
	WebUI.click(findTestObject('BEP/RD_RLApprove'))
	WebUI.delay(4)
	WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
	WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
	WebUI.delay(4)

	WOstatus()
	}
	}
	
	

	
	
	@Keyword
	def ScheduleMeeting()
	{
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/Meeting/meetingLink'))
	WebUI.delay(4)
	WebUI.setText(findTestObject('Object Repository/ECR_MEETING/location'), 'Cambridge')
	WebUI.delay(4)
	
	WebUI.scrollToElement(findTestObject('Object Repository/Generic/FINISH_ASSIGNMENT'),0)
	
	WebUI.click(findTestObject('Object Repository/Generic/FINISH_ASSIGNMENT'))
	
	WebUI.delay(5)
	}
	
	@Keyword
	def Cancelmeeting()
	
	{
	
		WebUI.delay(4)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/BEP/Meeting/cancelMeetinglink'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		
	}
	
	
	@Keyword
	
	def RLRequestMeeting() {
		
		WebUI.delay(4)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/BEP/RlLink'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('NEXT_BUTTON'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RLApprove'),0)
		WebUI.click(findTestObject('BEP/RD_RLApprove'))
		WebUI.delay(4)
		WebUI.click(findTestObject('BEP/Meeting_Required'))
		WebUI.delay(4)
		WebUI.setText(findTestObject('Object Repository/BEP/MeetingDate'), GlobalVariable.MeetingDate)
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		
		WebUI.delay(5)
		
	}
	
	
	@Keyword
	
	def RLreject(){
		WebUI.delay(4)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/BEP/RlLink'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('NEXT_BUTTON'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RL_REJECT'),0)
		
		WebUI.click(findTestObject('BEP/RD_RL_REJECT'))
		WebUI.delay(4)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		
		WebUI.delay(4)
		
	}
	
	
			

			
@Keyword

def withdraw(){
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('otherAction'))
	WebUI.delay(4)
	
	WebUI.click(findTestObject('Object Repository/BEP/withdraw_link'))
	WebUI.delay(4)
	WebUI.setText(findTestObject('Object Repository/BEP/withdraw_notes'), 'Testing')
	WebUI.delay(4)
	
	WebUI.sendKeys(findTestObject('Object Repository/BEP/withdraw_notes'), Keys.chord(Keys.TAB))
	WebUI.delay(4)
	
	WebUI.click(findTestObject('Object Repository/BEP/withdraw_submit'))
	WebUI.delay(4)
	
	WebUI.click(findTestObject('Object Repository/Generic/CLOSE_WORK_OBJECT'))


	
}


@Keyword 

def recall(){
	
	WebUI.delay(4)
	 WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	 WebUI.click(findTestObject('otherAction'))
	 WebUI.delay(4)
	 
	 WebUI.click(findTestObject('Object Repository/BEP/recall'))
	 WebUI.delay(4)
	 WebUI.setText(findTestObject('Object Repository/BEP/recall_reason'), 'Testing')
	 WebUI.delay(4)
	 
	 WebUI.sendKeys(findTestObject('Object Repository/BEP/recall_reason'), Keys.chord(Keys.TAB))
	 WebUI.delay(4)
	 
	 WebUI.click(findTestObject('Object Repository/BEP/recall_submit'))
	 WebUI.delay(4)
	
	}


@Keyword

def Update(){
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/UpdateValueEst'))
	WebUI.delay(4)
	
	WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
	WebUI.click(findTestObject('NEXT_BUTTON'))
	WebUI.delay(4)

	WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
	WebUI.delay(4)
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
	WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
	
	WebUI.delay(4)
	
	}

@Keyword

def EmailCustomer(){
	
	if (GlobalVariable.CreateECR==true)
	{
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/SendCustomerEmail'))
	WebUI.delay(4)
	WebUI.click(findTestObject('Object Repository/BEP/ECR_CHECKBOX'))
	WebUI.delay(4)
	WebUI.click(findTestObject('Object Repository/BEP/SEND_EMAIL'))
	WebUI.delay(4)
	}
	else{
		WebUI.delay(4)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/BEP/SendCustomerEmail'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/BEP/SEND_EMAIL'))
		WebUI.delay(4)
		
		}
	}



@Keyword
def SkipEmail(){


	if (GlobalVariable.CreateECR==true)
	{
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/SendCustomerEmail'))
	WebUI.delay(4)
	WebUI.click(findTestObject('Object Repository/BEP/ECR_CHECKBOX'))
	WebUI.delay(4)
	WebUI.click(findTestObject('Object Repository/BEP/SKIP_EMAIL_XPATH'))
	WebUI.delay(5)
	WebUI.sendKeys(findTestObject('BEP/DispositionReason'), 'testing')
	WebUI.delay(5)	
	WebUI.selectOptionByValue(findTestObject('BEP/ReasonCode'), 'RFP in process', false)
	WebUI.delay(4)
	WebUI.click(findTestObject('Object Repository/BEP/test'))
	WebUI.delay(4)
	WebUI.click(findTestObject('Object Repository/BEP/Modal_OK'))
	WebUI.delay(4)
	
	}
	else
	{
		WebUI.delay(4)
		WebUI.switchToFrame(findTestObject('FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/BEP/SendCustomerEmail'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/BEP/SKIP_EMAIL_XPATH'))
		WebUI.delay(4)
		WebUI.sendKeys(findTestObject('BEP/DispositionReason'), 'testing')
		WebUI.delay(5)
		WebUI.selectOptionByValue(findTestObject('BEP/ReasonCode'), 'RFP in process', false)
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/BEP/test'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/BEP/Modal_OK'))
		WebUI.delay(4)
		
		}
	}





@Keyword

def UpdateAfterRecall(){
	WebUI.delay(4)
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/BEP/link_Update_AftreRecall'))
	WebUI.delay(4)
	
	WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
	WebUI.click(findTestObject('NEXT_BUTTON'))
	WebUI.delay(4)
	
	
	WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
	WebUI.click(findTestObject('NEXT_BUTTON'))
	WebUI.delay(4)
	

	WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
	WebUI.delay(4)
	
	
	WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)
	WebUI.click(findTestObject('NEXT_BUTTON'))
	WebUI.delay(4)
	
	
	WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
	WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
	
	WebUI.delay(4)
	
	}


@Keyword

def RequestCancelMeeting()

{
	WebUI.switchToFrame(findTestObject('FRAME1'), 0)
	WebUI.click(findTestObject('BEP/OtherActions'))
	WebUI.delay(4)
	WebUI.click(findTestObject('BEP/Meeting/CancelMeeting'))
	WebUI.delay(4)
	WebUI.setText(findTestObject('Object Repository/ECR/ActionMenu/Reason'), 'Testing')
	WebUI.delay(4)
	WebUI.sendKeys(findTestObject('Object Repository/ECR/ActionMenu/Reason'), Keys.chord(Keys.TAB))
	WebUI.delay(4)
	WebUI.click(findTestObject('Object Repository/BEP/Meeting/Submit_otheraction'))
	WebUI.delay(4)
	WebUI.click(findTestObject('Generic/CLOSE_WORK_OBJECT'))
	
	}


}




