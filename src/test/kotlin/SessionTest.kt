import com.microsoft.playwright.Playwright
import org.junit.jupiter.api.Test
import pages.*
import kotlin.test.assertTrue

class SessioneTest {

    @Test
    fun sessioneTest() {
        Playwright.create().use { playwright ->
            val browser = playwright.chromium().launch()
            val page = browser.newPage()

            val indexPage = IndexPage(page)
            val commonPage = CommonPage(page)

            page.navigate("https://www.saucedemo.com/")
            indexPage.login("standard_user", "secret_sauce")
            commonPage.clickHamburgerMenu()
            commonPage.clickLogoutLnk()
            page.navigate("https://www.saucedemo.com/inventory.html")
            assertTrue(indexPage.isErrorDisplayed())
        }
    }

}