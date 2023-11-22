package pages

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page

class CommonPage( page : Page) {
    private val burgerMenuButton : Locator = page.locator("xpath=.//button[@id='react-burger-menu-btn']")
    private val logoutLnk : Locator = page.locator("xpath=.//a[@id='logout_sidebar_link']")

    fun clickHamburgerMenu () {
        burgerMenuButton.click()
    }

    fun clickLogoutLnk () {
        logoutLnk.click()
    }
}