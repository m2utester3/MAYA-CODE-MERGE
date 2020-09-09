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

WebUI.delay(3)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeButton - Expenses'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/25.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeButton - Expenses'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Enter your 6-digit PIN'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/26.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.tap(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeOther - 5'), 0)

Mobile.getText(findTestObject('MAYA UAT IOS/Drop3/Expenses - Latest/XCUIElementTypeStaticText - Expenses'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshotsIOS/expenses/27.png', FailureHandling.CONTINUE_ON_FAILURE)

