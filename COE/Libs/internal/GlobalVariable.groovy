package internal
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import groovy.transform.CompileStatic


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 * 
 */

@CompileStatic
public class GlobalVariable {
	 
    /**
     * <p></p>
     */
	public static Object delay = 4
	 
    /**
     * <p></p>
     */
	public static Object WOID = 'BEP-02Nov2017-5'
	 
    /**
     * <p></p>
     */
	public static Object WOSTATUS = ''
	 
    /**
     * <p>If it becomes true it will go to reject path for RD</p>
     */
	public static Object RDReject = false
	 
    /**
     * <p>If it becomes true it will go to reject path for RL</p>
     */
	public static Object RLReject = false
	 
    /**
     * <p>If it becomes true it will go to reject path for OPS</p>
     */
	public static Object OpsReject = false
	 
    /**
     * <p></p>
     */
	public static Object Meeting = false
	 
    /**
     * <p>BEP route to RL property</p>
     */
	public static Object RouteToRL = true
	 
    /**
     * <p>If it is true it will recall the WO as RD</p>
     */
	public static Object RDRecall = true
	 
    /**
     * <p>If it is true it will recall the WO as RL</p>
     */
	public static Object RLRecall = true
	 
    /**
     * <p></p>
     */
	public static Object CreateECR = false
	 
    /**
     * <p></p>
     */
	public static Object SendEmail = false
	 
    /**
     * <p></p>
     */
	public static Object URL = 'http://vtcpqa2:9685/tcpqa/PRServlet'
	 
    /**
     * <p></p>
     */
	public static Object RD = 'ellia@pegasystems.com'
	 
    /**
     * <p></p>
     */
	public static Object pwd = 'install'
	 
    /**
     * <p></p>
     */
	public static Object RL = 'panee@pegasystems.com'
	 
    /**
     * <p></p>
     */
	public static Object OPS = 'pogoa@pegasystems.com'
	 
    /**
     * <p></p>
     */
	public static Object EXP_SVC = 'sachb@pegasystems.com'
	 
    /**
     * <p></p>
     */
	public static Object CLINIC = 'diazz@pegasystems.com'
	 
    /**
     * <p></p>
     */
	public static Object PL = 'hendj@pegasystems.com'
	 
    /**
     * <p>If it is true it will  reject the WO as RDD</p>
     */
	public static Object RDD_Reject = false
	 
    /**
     * <p>If it is true it will  reject the WO as EXPSVC</p>
     */
	public static Object EXP_SVC_Reject = false
	 
    /**
     * <p></p>
     */
	public static Object RDD = 'lachd@pegasystems.com'
	 
    /**
     * <p></p>
     */
	public static Object AssignmentList = []
	 
    /**
     * <p></p>
     */
	public static Object Status = ''
	 
    /**
     * <p></p>
     */
	public static Object MeetingDate = '11/6/2017 11:27 AM'
	 
    /**
     * <p></p>
     */
	public static Object MeetingScheduled = true
	 
    /**
     * <p></p>
     */
	public static Object Approve_Reject_Recall = 'Approve'
	 
    /**
     * <p>If it is true it will  recall the WO as OPS</p>
     */
	public static Object OpsRecall = false
	 
    /**
     * <p>If it is true it will  recall the WO as EXPSVC</p>
     */
	public static Object EXP_SVC_Recall = false
	 
    /**
     * <p>If it is true it will  recall the WO as RDD</p>
     */
	public static Object RDD_Recall = false
	 
}
