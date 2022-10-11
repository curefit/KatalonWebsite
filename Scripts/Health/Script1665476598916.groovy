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

WebUI.click(findTestObject('Object Repository/OR7/Page_Buy Fitness Equipments And Wellness Pr_e0477e/h3_Nutrition  Wellness'))

WebUI.click(findTestObject('Object Repository/OR7/Page_Buy Fitness Equipments And Wellness Pr_e0477e/h3_Protein'))

WebUI.click(findTestObject('Object Repository/OR7/Page_Buy Gym Proteins  Mass gainer, Protein_b3b961/img_Cultsport Elite 100 Whey Protein, 1 Kg__b60bcd'))

WebUI.click(findTestObject('Object Repository/OR7/Page_Cultsport Elite Whey Isolate Protein, 908g/div_ALL'))

WebUI.click(findTestObject('Object Repository/OR7/Page_Cultsport Elite Whey Isolate Protein, 908g/div_Add to Cart'))

WebUI.click(findTestObject('Object Repository/OR7/Page_Cultsport Elite Whey Isolate Protein, 908g/div_View Cart (1)'))

WebUI.click(findTestObject('Object Repository/OR7/Page_Cultsport Elite Whey Isolate Protein, 908g/div_BUY NOW'))

WebUI.click(findTestObject('Object Repository/OR7/Page_Cultsport Elite Whey Isolate Protein, 908g/div_LOGIN TO CONTINUE'))

WebUI.click(findTestObject('Object Repository/OR7/Page_Cultsport Elite Whey Isolate Protein, 908g/span_'))

