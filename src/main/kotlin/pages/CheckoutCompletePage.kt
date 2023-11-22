package pages

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page

class CheckoutCompletePage(page: Page) {

    private val h2SuccessMessage : Locator = page.locator("xpath=.//h2[@class='complete-header']")
    private val imgSuccess : Locator = page.locator("xpath=.//img[@class='pony_express']")

    fun isCheckoutComplete () : Boolean {
        return h2SuccessMessage.isVisible && imgSuccess.isVisible
    }
}


