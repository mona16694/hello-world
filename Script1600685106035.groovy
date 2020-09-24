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

WebUI.navigateToUrl('http://10.9.100.225:7011/SmartCMS-web/Login.xhtml')

WebUI.setText(findTestObject('Object Repository/reنوع الدعوى/Page_/input_ _j_username'), 'nada')

WebUI.setEncryptedText(findTestObject('Object Repository/reنوع الدعوى/Page_/input_ _j_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/span_'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/span__1'))

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/span_ (1)'))

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/label_'))

WebUI.setText(findTestObject('Object Repository/Page_/input_ _addEditFormtabViewIdcourtId_filter'), 'محكمة سيدى بشر')

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/li_'))

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/span_  _ui-radiobutton-icon ui-icon ui-icon_293675'))

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/input__addEditFormtabViewIdorignalLawyerNationalId'))

WebUI.setText(findTestObject('Object Repository/reنوع الدعوى/Page_/input__addEditFormtabViewIdorignalLawyerNationalId'), 
    '12400214522362')

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/input__addEditFormtabViewIdnationalId'))

WebUI.setText(findTestObject('Object Repository/reنوع الدعوى/Page_/input__addEditFormtabViewIdnationalId'), '12400214522362')

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/span__1_2'))

WebUI.click(findTestObject('Object Repository/reنوع الدعوى/Page_/span__1_2'))

WebUI.verifyElementText(findTestObject('reنوع الدعوى/Page_/span_          missed'), 'نوع الدعوي: خطأ في التحقق من الحقل هذا الحقل يجب إدخاله')

