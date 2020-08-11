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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://thetestingworld.com/testings/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_username'), 
    'Testing1')

WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_email'), 'Testing1@intergrupo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_cpassword'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_add_type'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login  Sign Up Forms/select_Choose Gender                  Male _4c15ff'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_terms'))

WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/a_Read Detail'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login  Sign Up Forms/h2_Terms and Conditions'), 'Terms and Conditions')

WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/a_X'))

WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/input'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login  Sign Up Forms/div_User  email id not available Please try_05cf3e'), 
    ' User / email id not available. Please try another')

WebUI.closeBrowser()

