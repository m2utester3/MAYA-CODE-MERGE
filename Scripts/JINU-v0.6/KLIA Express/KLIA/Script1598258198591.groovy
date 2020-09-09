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

Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 2'), 0)

not_run: Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0)

not_run: String trx6 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 
    0).substring(3)

not_run: String trx61 = trx6.replaceAll('[^a-zA-Z0-9]+', '')

not_run: System.out.println(trx61)

not_run: int trx611 = ((trx61) as Integer)

not_run: System.out.println(trx611)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - ERL Tickets'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - KLIA Ekspres'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Buy Tickets'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - From'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - From'), 0)

Mobile.tap(findTestObject('Maya/KLIA/spy/KLIA spy- from Please Select'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - To'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - To'), 0)

Mobile.tap(findTestObject('Maya/KLIA/spy/KLIA spy- TO Please Select'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/3.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Select travel date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Select travel date'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/4.png', FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Check Train Schedule'), 0)
not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (2)'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.EditText0 - Enter date'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0nEXT mONTH'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Done (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/5.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(823, 971, 802, 200)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Single Trip'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Summary'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Summary'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - From (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - From (1)'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - To (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - To (1)'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Date'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - TICKETS'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - TICKETS'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Trip'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Trip'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Total amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Total amount'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/6.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Continue (2)'), 0)

Mobile.setText(findTestObject('Maya/Bus Ticket/android.widget.EditText0 (10)'), 'pass1234', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia7.png', FailureHandling.STOP_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - RM 60.75'), 0)

not_run: String trx5 = Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - RM 60.75'), 0).substring(3)

not_run: String trx51 = trx5.replaceAll('[^a-zA-Z0-9]+', '')

not_run: System.out.println(trx51)

not_run: int trx511 = ((trx51) as Integer)

not_run: System.out.println(trx511)

not_run: Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Summary'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Confirmation'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - KLIA Ekspres (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - KLIA Ekspres (1)'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - 20 Jul 2020'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - 20 Jul 2020'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Pay from'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Pay from'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Date (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Date (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/8.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Date (1)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Pay Now'), 0)

//Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 0)
if (Mobile.verifyElementExist(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 3)) {
    def otpM = Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 0)

    WebUI.delay(2)

    for (def i = 16; i <= 21; i++) {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        if ((otpM[i]) == '0') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
        }
        
        if ((otpM[i]) == '1') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
        }
        
        if ((otpM[i]) == '2') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
        }
        
        if ((otpM[i]) == '3') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            not_run: Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

            Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
        }
        
        if ((otpM[i]) == '4') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
        }
        
        if ((otpM[i]) == '5') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
        }
        
        if ((otpM[i]) == '6') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
        }
        
        if ((otpM[i]) == '7') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
        }
        
        if ((otpM[i]) == '8') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
        }
        
        if ((otpM[i]) == '9') {
            Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
        }
    }
    
    Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(826, 2048)
}

if (Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket9.png', FailureHandling.STOP_ON_FAILURE)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - To (2)'), 0)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - KLIA Ekspres (2)'), 0)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - From (2)'), 0)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Date (2)'), 0)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - KLIA EkspressBooking Number'), 0)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Current Account-i5640 1703 5529'), 0)

    Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Current Account-i5640 1703 5529'), 
        0)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - 17180449370M'), 0)

    Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - 17180449370M'), 0)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - 30 Jul 2020'), 0)

    Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - 30 Jul 2020'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 0)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Payment successful'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/9.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Payment successful'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Payment successful'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Payment successful'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Date  time'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Share Receipt'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (3)'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.Button0 - Cancel'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.view.View0 - Reference ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.view.View0 - Reference ID'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/10.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Share Receipt'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.view.View0 - Corporate Name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.view.View0 - Corporate Name'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.view.View0 - Booking number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.view.View0 - Booking number'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.view.View0 - Amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.view.View0 - Train Tickets'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.view.View0 - Successful'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.view.View0 - 17180447831M'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.view.View0 - KLIA Ekspres'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.view.View0 - 17180447831M (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.view.View0 - RM 60.75'), 0)

Mobile.swipe(831, 1382, 800, 100)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Note This receipt is computer generated and no signature is required.'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Malayan Banking Berhad (Co. Reg.  196001000142)'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank Islamic Berhad (Co. Reg.  200701029411)'), 
    0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Done (2)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Wallet'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - RM 981.40'), 0)

not_run: String trx4 = Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - RM 981.40'), 0).substring(3)

not_run: String trx41 = trx4.replaceAll('[^a-zA-Z0-9]+', '')

not_run: System.out.println(trx41)

not_run: int trx411 = ((trx41) as Integer)

not_run: System.out.println(trx411)

not_run: int trx311 = trx611 - trx511

not_run: if (trx311 == trx411) {
    not_run: System.out.println('Balance match')
} else {
    System.out.println('Balance not match')
}

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - View Transactions'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Today'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Today'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/11.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Notifications'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Got It'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Maybank2u Payments'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Today (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/klia/12.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Successful payment of RM 182.25 to KLIA. REF180446966M'), 
    0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Successful payment of RM 182.25 to KLIA. REF180446966M - Copy'), 
    0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Successful payment of RM 182.25 to KLIA. REF180446966M - Copy (1)'), 
    0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

if (Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - ERL Tickets (1)'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket9.png', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - ERL Tickets (1)'), 0)
} else if (Mobile.verifyElementNotExist(findTestObject('Maya/KLIA/android.widget.TextView0 - ERL Tickets (1)'), 0)) {
    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Manage'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (10)'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - ERL Tickets (2)'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(895, 1046, 800, 50)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (11)'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Save Changes'), 0)
}

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - PAST'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(895, 1046, 800, 50)

Mobile.swipe(895, 1046, 800, 50)

Mobile.swipe(895, 1046, 800, 50)

Mobile.swipe(895, 1046, 800, 50)

Mobile.swipe(895, 1046, 800, 50)

Mobile.swipe(895, 1046, 800, 50)

Mobile.swipe(895, 1046, 800, 50)

Mobile.tap(findTestObject('Maya/KLIA/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Single Trip (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket14.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Share Selected Ticket'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Share Selected Ticket'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.ImageView0 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket15.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.Button0 - Cancel (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket16.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.closeApplication()

