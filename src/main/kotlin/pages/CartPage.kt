package pages

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page

class CartPage(page: Page) {
    private val buttonCheckout : Locator = page.locator("xpath=.//button[@id='checkout']")

    fun clickCheckout () {
        buttonCheckout.click()
    }
}
