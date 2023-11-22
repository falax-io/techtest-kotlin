package pages

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page

class CheckoutStepOnePage( page: Page) {

    private val inputContinue : Locator = page.locator("xpath=.//input[@id='continue']")
    private val inputFirstName : Locator = page.locator("xpath=.//input[@id='first-name']")
    private val inputLastName : Locator = page.locator("xpath=.//input[@id='last-name']")
    private val inputPostalCode : Locator = page.locator("xpath=.//input[@id='postal-code']")

    fun fillTheForm(firstName: String, lastName: String, postalCode: String) {
        inputFirstName.fill(firstName)
        inputLastName.fill(lastName)
        inputPostalCode.fill(postalCode)
    }

    fun clickContinue() {
        inputContinue.click()
    }

}