package pages

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page

class CheckoutStepTwoPage(page: Page) {

    private val buttonFinish : Locator = page.locator("xpath=.//button[@id='finish']")
    private val totalDiv : Locator = page.locator("xpath=.//div[@class='summary_info_label summary_total_label']")

    fun clickFinish() {
        buttonFinish.click()
    }

    fun getTotal() : String {
        return totalDiv.textContent()
    }

}