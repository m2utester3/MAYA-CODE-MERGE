import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - More (1)'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Notifications (2)'), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Notifications (2)'), 
    0)

a = Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Notifications (3)'), 
    0)

Mobile.verifyEqual(a, 'Notifications')

c = Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Today (1)'), 
    0)

Mobile.verifyEqual(c, 'Today')

b = Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Maybank2u Payments'), 
    0)

Mobile.verifyEqual(b, 'Maybank2u: Payments')

d = Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Successful payment of RM 114.00 to AIRPAZ. REF180695384M (1)'), 
    0)

d1 = Mobile.verifyElementVisible(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Successful payment of RM 114.00 to AIRPAZ. REF180695384M (1)'), 
    0)

d2 = Mobile.verifyElementVisible(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/noti msg psrt 2'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - 301 PM'), 0)

not_run: Mobile.closeApplication()

