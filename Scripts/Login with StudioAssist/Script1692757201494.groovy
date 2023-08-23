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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*
 * Open a web browser, maximize the window, navigate to a specific URL, click on a menu item, take a screenshot of a login form, enter an email and encrypted password, take a screenshot of the login button, click on the login button, and then close the browser.
 */
// Open a web browser
WebUI.openBrowser('')

// Maximize the window
WebUI.maximizeWindow()

// Navigate to a specific URL
WebUI.navigateToUrl('https://www.example.com')

// Click on a menu item
WebUI.click(findTestObject('Page_Example/menu_item'))

// Take a screenshot of a login form
WebUI.takeScreenshot('screenshot1.png')

// Enter an email and encrypted password
WebUI.setText(findTestObject('Page_Example/email_input'), 'example@example.com')
WebUI.setText(findTestObject('Page_Example/password_input'), 'encrypted_password')

// Take a screenshot of the login button
WebUI.takeScreenshot('screenshot2.png')

// Click on the login button
WebUI.click(findTestObject('Page_Example/login_button'))

// Close the browser
WebUI.closeBrowser()



