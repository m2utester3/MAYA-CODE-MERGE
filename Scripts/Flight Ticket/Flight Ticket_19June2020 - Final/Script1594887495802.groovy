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
    false)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - More'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Flight Tickets_1'), 0)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\1.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Flight Tickets_1'), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Flight Tickets_TAP'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\2.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - 6-digit PIN_2'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - 6-digit PIN_2'), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\3.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - One Way_3'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - One Way_3'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Round Trip_4'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Round Trip_4'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - DEPART_4b'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - DEPART_4b'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Adult_5'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Adult_5'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Child_6'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Child_6'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Infant_7'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Infant_7'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0_FROM_tap'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0'), 0)

Mobile.tapAtPosition(561.2, 1175.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(466.3, 1075.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(72.9, 1179.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(633.0, 1182.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(72.9, 1179.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(633.0, 1182.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(466.3, 1075.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(578.2, 1277.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(681.0, 1082.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(466.3, 1075.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(262.6, 1075.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Kuala Lumpur - KUL'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\4.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - To_TAP2'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (1)'), 0)

Mobile.tapAtPosition(144.8, 1193.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(546.2, 1077.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(503.2, 1285.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(356.5, 1171.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(80.9, 1173.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(676.0, 1100.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(599.2, 1081.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(263.6, 1071.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(187.6, 1078.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\5.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Singapore Changi Intl Airport - SIN'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\6.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - DEPART'), 0)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 9_JULY_date'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 14July'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/14July_android.widget.TextView0 - -'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 15July'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/15July_android.widget.TextView0 - 332'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 16July'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/16July_android.widget.TextView0 - 149'), 0)

a = Mobile.getText(findTestObject('Flight Ticket_19June2020/14July_android.widget.TextView0 - -'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 15July'), 0)

b = Mobile.getText(findTestObject('Flight Ticket_19June2020/15July_android.widget.TextView0 - 332'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 16July'), 0)

c = Mobile.getText(findTestObject('Flight Ticket_19June2020/16July_android.widget.TextView0 - 149'), 0)

if (1 == 1) {
    if (a == '-') {
        // verify price of date 14 july
    } else {
        Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.android.widget.TextView0 - 14July'), 0)
    }
    
    if (b == '-') {
        // verify price of date 15 july
    } else {
        Mobile.tap(findTestObject('Flight Ticket_19June2020/15July_android.widget.TextView0 - 332'), 0)
    }
    
    if (c == '-') {
        // verify price of date 16 july
    } else {
        Mobile.tap(findTestObject('Flight Ticket_19June2020/16July_android.widget.TextView0 - 149'), 0)
    }
}

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Search'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\7.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

b = Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Flight Tickets_8'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Flight Tickets_8'), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Book'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\8.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

b = Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Depart flight_9'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Depart flight_9'), 0)

b = Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.Button0 - Change Flight_10'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.Button0 - Change Flight_10'), 
    0)

b = Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TOTAL PRICE_11'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TOTAL PRICE_11'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Continue'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\9.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - SELECTED FLIGHT_12'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - SELECTED FLIGHT_12'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Contact Information_13'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Contact Information_13'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Please Input Contact Data_14'), 
    0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Please Input Contact Data_14'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Passenger Data 1 - Adult_15'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Passenger Data 1 - Adult_15'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Please Input Passenger Data_16'), 
    0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Please Input Passenger Data_16'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TOTAL PRICE_17'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TOTAL PRICE_17'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/Edit contact'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\10.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.view.View0 - Contact Information (1)'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/android.view.View0 - Contact Information (1)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Title_ContactINFO'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 - Mrs (1)'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (10)'), 'khairul', 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (11)'), 'nisa', 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Spinner0 (2)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 -     Malaysia (60) (2)'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.view.View0 - Mobile_CI_1'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Mobile_CI_1'), 0)

Mobile.tapAtPosition(76.9, 992.2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(61.9, 1248.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(254.6, 1023.2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(252.6, 1245.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(252.6, 1245.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(254.6, 1023.2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(252.6, 1245.1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(76.9, 992.2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(81.9, 1133.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(613.0, 1130.3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (12)'), 'test@airpaz.com', 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\11.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - save (2)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\12.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 (4)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Title_PassengerDATA'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 - Mrs (1)'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (10)'), 'Khairul', 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (11)'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (13)'), 'Nisa', 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/spy/android.widget.EditText0_DOB_Child'), 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(257.6, 836.4)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(210, 1168, 10, 290, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(368, 1171, 24, 107, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(496, 1182, 10, 220, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Set (1)'), 0)

WebUI.delay(6, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Spinner0 - Nationality (1)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 -     Malaysia (1)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\13.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - save (1)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\14.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.Button0 - Book Now_18'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.Button0 - Book Now_18'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Book Now'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\15.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - BOOKING DETAILS_19'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - BOOKING DETAILS_19'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TRAVELER DETAILS_20'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - TRAVELER DETAILS_20'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - FLIGHT_21'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - FLIGHT_21'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - PRICE_22'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - PRICE_22'), 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(363, 1091, 171, 700, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Total_23'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Total_23'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Processing Fee_24'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Processing Fee_24'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Total_24a'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Total_24a'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckBox0 - I agree to the terms and conditions of Airpaz and AK-AirAsia Non-Refundable Policy. '), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Submit Payment'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\16.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Enter your password_28'), 
    0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Enter your password_28'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Forgot Password_29'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Forgot Password_29'), 
    0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (9)'), 'pass1234', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\17.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\18.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Confirmation_30'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Confirmation_30'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date_31'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date_31'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Pay from_32'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Pay from_32'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Pay Now_33'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Pay Now_33'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/spy/android.widget.TextView0 - Pay Now'), 0)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\19.png', 
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

if (Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/spy/Flights-TAC-2'), 0)) {
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

    Mobile.tap(findTestObject('Flight Ticket_19June2020/spy/android.widget.ImageView0--child'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    not_run: Mobile.tapAtPosition(537.2, 1350.0, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Payment successful'), 0)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\20.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Payment successful'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Reference ID_40'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Reference ID_40'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date  time_41'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Date  time_41'), 
    0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Share Receipt_42'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Share Receipt_42'), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Share Receipt'), 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\21.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Flight Tickets_44'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Flight Tickets_44'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Reference ID_45'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Reference ID_45'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Corporate name_46'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Corporate name_46'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Order number_47'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Order number_47'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Amount_48'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Amount_48'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Note this receipt is computer generated and no signature is required_49'), 
    0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.view.View0 - Note this receipt is computer generated and no signature is required_49'), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.ImageView0 (1)'), 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Done_43'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Done_43'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 -  Payment successful. Please check your e-mail periodically for the e-ticket._50'), 
    0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 -  Payment successful. Please check your e-mail periodically for the e-ticket._50'), 
    0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\22.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.view.View0 - Confirmed'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/android.view.View0 - Confirmed'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.ImageView0 (2)'), 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Home'), 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\23.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Wallet_51'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Wallet_51'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.ImageView0 (3)'), 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\24.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - View Transactions_52'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - View Transactions_52'), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - View Transactions'), 0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Transactions_53'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Transactions_53'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Transaction History_54'), 
    0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/validation/android.widget.TextView0 - Transaction History_54'), 
    0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 3\\Screenshot MAYA\\25.png', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - AIRPAZ SDN BHD  MB111111171724'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - AIRPAZ SDN BHD  MB111111171724'), 
    0)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

