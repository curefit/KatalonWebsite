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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cultsport.com/')

WebUI.click(findTestObject('Object Repository/OR6/Page_Buy Fitness Equipments And Wellness Pr_e0477e/h3_Best Sellers'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Buy Fitness Equipments And Wellness Pr_e0477e/h3_Top Selling'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Best Sellers/img_Sports Shoes_style-prefix-1iji7yj'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Flomo Women Running Shoe/div_UK6'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Flomo Women Running Shoe/div_Add to Cart'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Flomo Women Running Shoe/div_View Cart (1)'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Flomo Women Running Shoe/div_BUY NOW'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Flomo Women Running Shoe/div_LOGIN TO CONTINUE'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Flomo Women Running Shoe/img_OR_style-prefix-ue3i0g'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Flomo Women Running Shoe/div_Sign in with Google'))

WebUI.authenticate('', '', '', 0)

WebUI.switchToWindowTitle('Sign in – Google accounts')

WebUI.setText(findTestObject('Object Repository/OR6/Page_Sign in  Google accounts/input_cultsport.com_identifier'), 'qa.manual@gmail.com')

WebUI.click(findTestObject('Object Repository/OR6/Page_Sign in  Google accounts/span_Next'))

WebUI.click(findTestObject('Object Repository/OR6/Page_Sign in  Google accounts/span_Try again'))

WebUI.setText(findTestObject('Object Repository/OR6/Page_Sign in  Google accounts/input_cultsport.com_identifier'), 'qa.manual@gmail.com')

WebUI.click(findTestObject('Object Repository/OR6/Page_Sign in  Google accounts/span_Next'))

WebUI.closeBrowser()

