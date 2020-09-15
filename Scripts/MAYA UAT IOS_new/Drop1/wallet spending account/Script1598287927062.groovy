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

Mobile.startApplication('/Users/mosaj/katalon/IPA/M2ULifeUAT.ipa', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Wallet RM 14335.38'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Wallet RM 14335.38'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Wallet'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/UAT IOS wallet 3 dots child'), 0)

d = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem0'), 0)

Mobile.verifyEqual(d, 'Hide Balance on Dashboard')

e = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem1'), 0)

Mobile.verifyEqual(e, 'Change Wallet Account')

f = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem2'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(f, 'Contact Bank')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem2'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Contact Bank'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - For any enquiries regarding your account please call the Customer Care Hotline at'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - 1 300 88 6688.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Call Now'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Call Now'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - 1300886688'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeButton - Call'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeButton - Cancel'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeButton - Cancel'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Wallet (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem0'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem0'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Wallet (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther (2)'), 0)

c = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Wallet RM '), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(c, 'Wallet RM ****')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Wallet RM '), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Wallet (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem1'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem1'), 0)

b = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Change Wallet Account'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(b, 'Change Wallet Account')

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - This account will be used for all activities related to Wallet on the app.'), 
    0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - MAE 5147 1200 1309 RM 1207.16'), 
    0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - MAE 5147 1200 1309 RM 1207.16'), 
    0)

a = Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Confirm'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(a, 'Confirm')

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Confirm'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Wallet (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem0 (1)'), 0)

'cross button'
Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther (3)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Wallet (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem0 (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - menuItem0 (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeStaticText - Wallet (1)'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther (2)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/wallet spending account/XCUIElementTypeOther - Wallet RM 1207.16'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/wallet/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

