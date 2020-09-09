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

'app launch'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - More'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/101.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Tabung'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/102.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Tabung'), 0)

var1500 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Enter your 6-digit PIN'), 0)

Mobile.verifyEqual(var1500, 'Enter your 6-digit PIN')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Tabung (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - TABUNG (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Create Tabung'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/103.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Create Tabung'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Pick a category to start saving.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Travel'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Shopping'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Rainy Day'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Coin Jar'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/104.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - BOOSTERS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/105.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - BOOSTERS'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Spare Change'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/106.png', FailureHandling.CONTINUE_ON_FAILURE)

'vertical swipe'
Mobile.swipe(500, 1500, 500, 1000)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Scan  Pay Savers'), 0)

'vertical swipe'
Mobile.swipe(500, 1000, 500, 1600)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Spare Change'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Spare Change'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Boosters (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Spare Change (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Round up to the nearest'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM  1.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Round up to the nearest'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM  1.00'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/107.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM  1.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Boosters (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Spare Change (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - How much would you like to round up your transactions to'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung BOOSTER RM 1.00'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/108.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung BOOSTER RM 1.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Cancel'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/109.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Boosters (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Booster summary'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - BOOSTERS'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Boosters (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/110.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung - BOOSTER Add Category PLUS SIGN'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Select category'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Travel (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Entertainment'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Electronics'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung BOOSTER health'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Shopping (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung BOOSTER Leisure'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung BOOSTER Food'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/111.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung BOOSTER Food'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Boosters (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Shopping (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Set daily limit for category.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.EditText0 - 0.00'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/112.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Please enter your daily limit for this category.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/113.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Boosters (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Shopping (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.EditText0 - 0.00 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/114.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Please enter a funding value.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/115.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Boosters (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Food  Beverage (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Set limit'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 25.00'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/116.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 25.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Set daily limit for category.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/117.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Fund amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 3.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Active Tabung (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Add Category'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/118.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Add Category'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung BOOSTER health'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/spy UAT funding/UAT - Tabung BOOSTER health'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Set daily limit for category.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/119.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Please enter a minimum daily limit of RM 10.00 for this category.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/120.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - How much would you like to fund each time the spending limit is exceeded'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/121.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Confirm'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/122.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - BOOSTERS (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Spare Change'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/123.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Boosters (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Booster summary'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Set limit'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 25.50'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Fund amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 3.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Set limit (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 10.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Fund amount (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 0.20'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/124.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 0.20'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - How much would you like to fund each time the spending limit is exceeded'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/125.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Fund amount (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 2.00'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/126.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Remove Category'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Are you sure you want to remove the category from your Booster'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Remove'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/127.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Remove'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Booster summary'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Health  Beauty (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Set limit (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 10.00 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Fund amount (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - RM 2.00 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Save Changes'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/128.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Save Changes'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Booster summary'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/129.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Remove Category'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Cancel (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/130.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Booster summary'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - BOOSTERS (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Tabung'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Tabung'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - BOOSTERS'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - BOOSTERS'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/131.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Guilty Pleasure'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Booster summary'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Food  Beverage (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung - BOOSTERS/android.widget.TextView0 - Health  Beauty (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/Tabung/132.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

