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

Mobile.startApplication('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\APK\\app-uat-universal-release.apk', 
    false)

Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Wallet_HOME'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Wallet_HOME'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Wallet_GETTEXT_1'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Hide Balance on Dashboard_GETTEXT_2'), 
    0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Hide Balance on Dashboard_GETTEXT_2'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Change Wallet Account'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Change Wallet Account'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Contact Bank_GETTEXT_3'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Contact Bank_GETTEXT_3'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Change Wallet Account (1)'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Change Wallet Account (1)'), 
    0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - MAE'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - MAE'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Change Wallet Account'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Confirm'), 0)

Mobile.verifyElementExist(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/MAE/android.widget.TextView0 - Home'), 0)

Mobile.closeApplication()

