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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\APK\\app-uat-universal-release.apk', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\1.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Wallet_HOME'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - Wallet_toChangeAcc'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\2.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - Wallet_getText_1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(955, 180, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\3.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - Hide Balance on Dashboard_getText_2a'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - Change Wallet Account_getText_2'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - Contact Bank_getText_2c'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - Change Wallet Account_getText_2'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - MAE'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\4.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - MAE (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\5.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Confirm'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\6.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Home'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\7.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - More'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\8.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Flight Tickets_1'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\9.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Flight Tickets_TAP'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\10.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - One Way_3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Round Trip_4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - DEPART_4b'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Adult_5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Child_6'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Infant_7'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.view.View0 - From'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(850, 1543, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(681, 1395, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(964, 1517, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Kuala Lumpur - KUL'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\12.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.view.View0 - Singapore Changi Intl Airport'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(222, 1515, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(799, 1391, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tapAtPosition(756, 1668, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\13.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Singapore Changi Intl Airport - SIN'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\14.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - DEPART'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 9_JULY_date'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 19 Sept_DATE_1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - - 19SEPT_Value_1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 20 Sept_DATE_2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 135 20SEPT_Value_2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 21 Sept_DATE_3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 149 21SEPT_Value_3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: a = Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - - 19SEPT_Value_1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 20 Sept_DATE_2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: b = Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 135 20SEPT_Value_2'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 21 Sept_DATE_3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: c = Mobile.getText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 149 21SEPT_Value_3'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: if (1 == 1) {
    if (a == '-') {
        // verify price of date 19 Sept
    } else {
        Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 19 Sept_DATE_1'), 0)
    }
    
    if (b == '-') {
        // verify price of date 20 Sept
    } else {
        Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 135 20SEPT_Value_2'), 0)
    }
    
    if (c == '-') {
        // verify price of date 21 Sept
    } else {
        Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.TextView0 - 149 21SEPT_Value_3'), 0)
    }
}

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Search'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\15.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: b = Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Flight Tickets_8'), 
    0)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Flight Tickets_8'), 
    0)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Book'), 0)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\16.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: b = Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Depart flight_9'), 
    0)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Depart flight_9'), 
    0)

not_run: b = Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.Button0 - Change Flight_10'), 
    0)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.Button0 - Change Flight_10'), 
    0)

not_run: b = Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TOTAL PRICE_11'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TOTAL PRICE_11'), 
    0)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\17.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - SELECTED FLIGHT_12'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - SELECTED FLIGHT_12'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Contact Information_13'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Contact Information_13'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Please Input Contact Data_14'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Please Input Contact Data_14'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Passenger Data 1 - Adult_15'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Passenger Data 1 - Adult_15'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Please Input Passenger Data_16'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Please Input Passenger Data_16'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TOTAL PRICE_17'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TOTAL PRICE_17'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(50, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(922, 684, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\18.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.view.View0 - Contact Information (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/android.view.View0 - Contact Information (1)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.Spinner0 - Title Title_CI'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 - Mrs (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (10)'), 'khairul', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (11)'), 'nisa', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Spinner0 (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(734, 1704, 662, 949)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 -     Malaysia (60) (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.view.View0 - Mobile_CI_1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.EditText0_mobile_CI'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

Mobile.tapAtPosition(158, 1283, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(143, 1626, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(402, 1283, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(404, 1642, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(404, 1642, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(402, 1283, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(166, 1625, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(166, 1625, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(142, 1460, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (12)'), 'test@airpaz.com', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\19.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - save (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\20.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.view.View0_Passenger Data_MAIN'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.Spinner0_TITLE_PassData_1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.CheckedTextView0 - Mrs_PASSdata'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Nisa_Spy/Flight Tickets/android.widget.EditText0_FIRSTNAME_PassData_2'), 'Khairul', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (11)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0_PassData_3_Last Name'), 'Nisa', 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/Flight Tickets/android.widget.EditText0_DOB_PassData_4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(257.6, 836.4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(210, 1168, 10, 290, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(368, 1171, 24, 107, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/Spy-2/android.view.View0 - 2000_YEAR_DOB_2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(516, 1159, 501, 1308, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Set (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(6, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Spinner0 - Nationality (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(538, 1562, 409, 921)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 -     Malaysia (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(457, 1643, 464, 1329)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\21.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - save (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\22.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.Button0 - Book Now_18'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.Button0 - Book Now_18'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Book Now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\23.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - BOOKING DETAILS_19'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - BOOKING DETAILS_19'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TRAVELER DETAILS_20'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TRAVELER DETAILS_20'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - FLIGHT_21'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - FLIGHT_21'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - PRICE_22'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - PRICE_22'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(808, 1790, 589, 1007, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Total_23'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Total_23'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Processing Fee_24'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Processing Fee_24'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Total_24a'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Total_24a'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckBox0 - I agree to the terms and conditions of Airpaz and AK-AirAsia Non-Refundable Policy. '), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Submit Payment'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\24.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Enter your password_28'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Enter your password_28'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Forgot Password_29'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Forgot Password_29'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (9)'), 'pass1234', 0, FailureHandling.CONTINUE_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\25.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Confirmation_30'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Confirmation_30'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date_31'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date_31'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Pay from_32'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Pay from_32'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Pay Now_33'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Pay Now_33'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/spy/android.widget.TextView0 - Pay Now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\26.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/spy_OneTap/android.widget.TextView0 - Approve_OneTap_child'), 
    0)) {
    WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - To_34'), 0)

    Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - To_34'), 0)

    Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - From_35'), 0)

    Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - From_35'), 
        0)

    Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Order number_36'), 0)

    Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Order number_36'), 
        0)

    Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date_37'), 0)

    Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date_37'), 
        0)

    Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Reject_38'), 0)

    Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Reject_38'), 
        0)

    Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Approve_39'), 0)

    Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Approve_39'), 
        0)

    Mobile.tap(findTestObject('Flight Ticket_19June2020/spy_OneTap/android.widget.TextView0 - Approve_OneTap_child'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/spy/Flights-TAC-2'), 5)) {
    WebUI.delay(2)

    //Mobile.tap(findTestObject('Flight Ticket_19June2020/spy/android.widget.TextView0 - Pay Now_TAC'), 0)
    def otpMessage = Mobile.getText(findTestObject('Flight Ticket_19June2020/spy/Flights-TAC-2'), 0)

    WebUI.delay(2)

    for (def i = 16; i <= 21; i++) {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        if ((otpMessage[i]) == '0') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 0_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '1') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 1_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '2') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 2_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '3') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 3_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '4') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 4_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '5') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '6') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 6_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '7') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 7_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '8') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 8_OTP'), 0)
        }
        
        if ((otpMessage[i]) == '9') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 9_OTP'), 0)
        }
    }
    
    Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Flight Ticket_19June2020/Spy-2/android.widget.ImageView0-TICKbutton_TAC'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    not_run: Mobile.tapAtPosition(537.2, 1350.0, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.getText(findTestObject('Flight Ticket_19June2020/Spy-2/android.widget.TextView0 - Payment Successful_GET_TEXT_19Aug'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/Spy-2/android.widget.TextView0 - Payment Successful_GET_TEXT_19Aug'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\27.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Reference ID_40'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Reference ID_40'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date  time_41'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date  time_41'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Share Receipt_42'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Share Receipt_42'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Share Receipt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\28.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/Receipt/android.view.View0 - Successful_3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/Receipt/android.view.View0 - Successful_3'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Flight Tickets_44'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Flight Tickets_44'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Reference ID_45'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Reference ID_45'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Corporate name_46'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Corporate name_46'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Order number_47'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Order number_47'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Amount_48'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Amount_48'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/Receipt/android.widget.TextView0 - Note This receipt is computer generated and no signature is required.-4'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/Receipt/android.widget.TextView0 - Note This receipt is computer generated and no signature is required.-4'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/Receipt/android.widget.TextView0 - Malayan Banking Berhad (Co. Reg.  196001000142)_5'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/Receipt/android.widget.TextView0 - Malayan Banking Berhad (Co. Reg.  196001000142)_5'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/Receipt/android.widget.TextView0 - Maybank Islamic Berhad (Co. Reg.  200701029411)_6'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/Receipt/android.widget.TextView0 - Maybank Islamic Berhad (Co. Reg.  200701029411)_6'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.ImageView0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Done_43'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Done_43'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Done (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 -  Payment successful. Please check your e-mail periodically for the e-ticket._50'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 -  Payment successful. Please check your e-mail periodically for the e-ticket._50'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.view.View0 - Confirmed'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/android.view.View0 - Confirmed'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.ImageView0 (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Home'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\29.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Wallet_51'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Wallet_51'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/Spy-2/android.view.ViewGroup0-WALLET-transactionHistory'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\30.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - View Transactions_52'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - View Transactions_52'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - View Transactions'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Transactions_53'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Transactions_53'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Transaction History_54'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Transaction History_54'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(449, 997, 437, 782, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/Spy-2/android.widget.TextView0 - Today_GET TEXT_19Aug'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/Spy-2/android.widget.TextView0 - Today_GET TEXT_19Aug'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - AIRPAZ SDN BHD  MB111111171724'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - AIRPAZ SDN BHD  MB111111171724'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\31.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/Spy-2/android.widget.ImageView0_XBUTTON_ViewTransactionHistory'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\32.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - More (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - More (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Notifications (2)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Notifications (2)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\33.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Got It_GETTEXT'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Got It_GETTEXT'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Got It_GETTEXT'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\34.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

a = Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Notifications (3)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'Notifications', FailureHandling.CONTINUE_ON_FAILURE)

c = Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Today (1)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(c, 'Today', FailureHandling.CONTINUE_ON_FAILURE)

b = Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Maybank2u Payments'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, 'Maybank2u: Payments', FailureHandling.CONTINUE_ON_FAILURE)

d = Mobile.getText(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Successful payment of RM 114.00 to AIRPAZ. REF180695384M (1)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

d1 = Mobile.verifyElementVisible(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/android.widget.TextView0 - Successful payment of RM 114.00 to AIRPAZ. REF180695384M (1)'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

d2 = Mobile.verifyElementVisible(findTestObject('Flight Ticket_19June2020/CR-36_Notifications/noti msg psrt 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication(FailureHandling.CONTINUE_ON_FAILURE)

