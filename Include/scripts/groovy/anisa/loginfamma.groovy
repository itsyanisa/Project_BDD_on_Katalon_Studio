package anisa
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginfamma {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User can login on the web")
	def User_can_login_on_the_web() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://famma-konstruksi.id/sigaka/login')
	}

	@When("User input coloum username and password")
	def User_input_coloum_username_and_password() {
		WebUI.setText(findTestObject('Object Repository/testing/Page_Login - Famma Nusantara-Konstruksi/input_Login_username'),
			'admin')
		
	}

	@Then("user on the dassbord")
	def user_on_the_dassbord() {
		WebUI.setEncryptedText(findTestObject('Object Repository/testing/Page_Login - Famma Nusantara-Konstruksi/input_Login_password'),
			'RAIVpflpDOg=')
		
		WebUI.click(findTestObject('Object Repository/testing/Page_Login - Famma Nusantara-Konstruksi/button_Login'))
		
	}
}