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

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('F_B_Drop4/android.widget.TextView0 - More'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('F_B_Drop4/android.widget.TextView0 - Food'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('F_B_Drop4/android.widget.TextView0 - Settings'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Food'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Food'), 0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - DISCOVER'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - DISCOVER'), 0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - MAKAN MANA'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - MAKAN MANA'), 0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Promotions'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Promotions'), 0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Browse Merchants'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Browse Merchants'), 0)

Mobile.tapAtPosition(54, 131)

Mobile.tap(findTestObject('F_B_Drop4/android.widget.TextView0 - Food'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('F_B_Drop4/android.widget.TextView0 - Cancel'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(112, 182)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('F_B_Drop4/android.widget.TextView0 - Food'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(935, 668)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/FB/android.widget.TextView0 - View All_PROMOTIONS'), 825)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/FB/android.widget.TextView0 - Find merchants_UNDER PROMO'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(854, 1529)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(435, 1526)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(445, 1678)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/Spy 2/android.widget.TextView0 - Bummer No Results Found-GETTEXT'), 825)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/Spy 2/android.widget.TextView0 - New Search'), 825)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/FB/android.widget.TextView0 - Cancel_afterbummer'), 0)

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/FB/android.widget.TextView0 - View All_PROMOTIONS'), 825)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(942, 386)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Filter-getText_PROMOTIONS_1'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Filter-getText_PROMOTIONS_1'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Price range_getText_PROMOTIONS_2'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Price range_getText_PROMOTIONS_2'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Distance_getText_PROMOTIONS_3'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Distance_getText_PROMOTIONS_3'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/android.widget.TextView0 - Please select distance'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/android.widget.TextView0 - Please select distance'), 0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Categories_getText_PROMOTIONS_4'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Categories_getText_PROMOTIONS_4'), 
    0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(888, 1531, 594, 497)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Display Newest Additions_getText_PROMOTIONS_5'), 
    0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Display Newest Additions_getText_PROMOTIONS_5'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Location_getText_PROMOTIONS_6'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Location_getText_PROMOTIONS_6'), 
    0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(964, 207)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(120, 185)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/android.widget.TextView0 - Browse Merchants'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/android.widget.TextView0 - Browse Merchants'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(910, 1403)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/android.widget.TextView0 - Merchants'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/android.widget.TextView0 - Merchants'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(935, 404)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Filter_getText_MERCHANTS_1'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Filter_getText_MERCHANTS_1'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Price range_getText_MERCHANTS_2'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Price range_getText_MERCHANTS_2'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Distance_getText_MERCHANTS_3'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Distance_getText_MERCHANTS_3'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/android.widget.TextView0 - Please select distance'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/android.widget.TextView0 - Please select distance'), 0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Categories_getText_MERCHANTS_4'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Categories_getText_MERCHANTS_4'), 
    0)

Mobile.swipe(858, 1537, 676, 745)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Display Newest Additions_getText_MERCHANTS_5'), 
    0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Display Newest Additions_getText_MERCHANTS_5'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Location_getText_MERCHANTS_6'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/verification/android.widget.TextView0 - Location_getText_MERCHANTS_6'), 
    0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(964, 198)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(103, 189)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Nisa_Spy/FB/android.widget.TextView0 - DISCOVER'), 0)

Mobile.getText(findTestObject('Nisa_Spy/FB/android.widget.TextView0 - MAKAN MANA'), 0)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

