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

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeButton - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - CASA/XCUIElementTypeStaticText - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - FIXED DEPOSITS'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - FIXED DEPOSITS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - INVESTMENTS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - INVESTMENTS'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeStaticText - Total Investments'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/7.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - Master Foreign Currency Account 7140 1100 0297 JPY RM 0.00'), 
    0)

Mobile.tapAtPosition(185, 335)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther'), 0)

WebUI.delay(5)

Mobile.swipe(185, 600, 185, 200)

WebUI.delay(2)

Mobile.tapAtPosition(185, 575)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - You dont have any ASNB accounts at the moment.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther (1)'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther - menuItem0'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/banking/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop1/banking - investment/XCUIElementTypeOther (2)'), 0)

not_run: Mobile.closeApplication()

