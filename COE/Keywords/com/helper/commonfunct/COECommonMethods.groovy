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

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class COECommonMethods {
	
	
	
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
	def login(String username,String password) //ranjs1
			{
			WebUI.setText(findTestObject('Page_Pega 7/input_UserIdentifier'), username)
			WebUI.navigateToUrl('')
			WebUI.setText(findTestObject('Page_Pega 7/input_Password'), password)
			WebUI.sendKeys(findTestObject('Page_Pega 7/input_Password'), Keys.chord(Keys.ENTER))
			}
			
			

}
