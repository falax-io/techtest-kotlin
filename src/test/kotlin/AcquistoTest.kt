import com.microsoft.playwright.Playwright
import org.junit.jupiter.api.Test
import pages.*
import kotlin.test.assertTrue

class AcquistoTest {

    @Test
    fun acquistoTest() {
        Playwright.create().use { playwright ->
            val browser = playwright.chromium().launch()
            val page = browser.newPage()

            val indexPage = IndexPage(page)
            val inventoryPage = InventoryPage(page)
            val cartPage = CartPage(page)
            val checkoutStepOnePage = CheckoutStepOnePage(page)
            val checkoutStepTwoPage = CheckoutStepTwoPage(page)
            val checkoutCompletePage = CheckoutCompletePage(page)


            page.navigate("https://www.saucedemo.com/")
            indexPage.login("standard_user", "secret_sauce")
            inventoryPage.addItemToCart("Sauce Labs Backpack")
            inventoryPage.addItemToCart("Sauce Labs Onesie")
            inventoryPage.clickOnCart()
            cartPage.clickCheckout()
            checkoutStepOnePage.fillTheForm("Paolino", "Paperino", "10137")
            checkoutStepOnePage.clickContinue()
            checkoutStepTwoPage.clickFinish()
            assertTrue(checkoutCompletePage.isCheckoutComplete())
        }
    }

}