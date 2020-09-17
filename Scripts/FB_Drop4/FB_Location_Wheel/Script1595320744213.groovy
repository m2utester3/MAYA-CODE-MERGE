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

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('F_B_Drop4/Spy/android.widget.TextView0 - Food-QUICK_ACTIONS'), 0)) {
    Mobile.tap(findTestObject('F_B_Drop4/Spy/android.widget.TextView0 - Food-QUICK_ACTIONS'), 0)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W3.png', FailureHandling.CONTINUE_ON_FAILURE)
} else if (Mobile.verifyElementNotExist(findTestObject('F_B_Drop4/Spy/android.widget.TextView0 - Food-QUICK_ACTIONS'), 0)) {
    Mobile.getText(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - Quick Actions'), 0)

    Mobile.getText(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - Spending Summary'), 0)

    Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - Manage'), 0)

    Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W4.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - 5'), 0)

    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - 5'), 0)

    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - 5'), 0)

    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - 5'), 0)

    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - 5'), 0)

    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - 5'), 0)

    Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W5.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.view.ViewGroup0'), 0)

    Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W6.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.swipe(375, 1026, 40, 380)

    Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W7.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - Food'), 0)

    Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W8.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.view.ViewGroup0 (1)'), 0)

    Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W9.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/ManageFOOD/android.widget.TextView0 - Save Changes'), 0)

    Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W10.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('F_B_Drop4/Spy/android.widget.TextView0 - Food-QUICK_ACTIONS'), 0)

    Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W11.png', FailureHandling.CONTINUE_ON_FAILURE)
}

//Mobile.tap(findTestObject('F_B_Drop4/Spy/android.widget.TextView0 - Food-QUICK_ACTIONS'), 0)
Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - MAKAN MANA'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/FB_Location_Wheel/android.view.ViewGroup0-Discover_GetText_1'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.view.ViewGroup0-Discover_GetText_1'), 0)

Mobile.getText(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Need a suggestion_GetText_2'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Need a suggestion_GetText_2'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Wheel_GetText_3'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Wheel_GetText_3'), 0)

Mobile.getText(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - List_GetText_4'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - List_GetText_4'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(340, 1353)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/Spy/android.view.ViewGroup0-MERCHANT-verifyelementEXIST'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/Spy/android.view.ViewGroup0-CATEGORY-verifyelementEXIST'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/Spy/android.widget.TextView0 - 0.0 Km-DISTANCE-verifyelementEXIST'), 
    0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - View More-GetText_8'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - View More-GetText_8'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Spin Again-GetText_9'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Spin Again-GetText_9'), 
    0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Spin Again_2x'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(340, 1353)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/Spy/android.view.ViewGroup0-MERCHANT-verifyelementEXIST'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/Spy/android.view.ViewGroup0-CATEGORY-verifyelementEXIST'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/Spy/android.widget.TextView0 - 0.0 Km-DISTANCE-verifyelementEXIST'), 
    0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - View More'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(734, 1153, 475, 255)

Mobile.getText(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Call Now_GetText_10'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Call Now_GetText_10'), 
    0)

Mobile.getText(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Get Directions_GetText_11'), 0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - Get Directions_GetText_11'), 
    0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(355, 1094, 50, 400)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - More Like This-VEX_1'), 
    0)

Mobile.verifyElementExist(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - View All-VEX-2'), 0)

Mobile.tap(findTestObject('F_B_Drop4/FB_Location_Wheel/android.widget.TextView0 - View All-VEX-2'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/FB/android.widget.ImageView0_BackButton_MoreLikeThis'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Nisa_Spy/FB/android.widget.ImageView0_BackButton_Food'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\DROP 4\\FB\\W24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

