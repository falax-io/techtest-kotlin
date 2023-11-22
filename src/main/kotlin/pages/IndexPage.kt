package pages

import com.microsoft.playwright.Page

class IndexPage (val page: Page) {

    private val inputUsernameLocator = "xpath=.//input[@id='user-name']"
    private val inputPasswordLocator = "xpath=.//input[@id='password' and @type='password']"
    private val inputLoginLocator = "xpath=.//input[@id='login-button' and @type='submit']"
    private val errorButtonLocator = "xpath=.//h3[@data-test='error']/button[@class='error-button']"

    fun login(username: String, password: String) {
        page.locator(inputUsernameLocator).fill(username)
        page.locator(inputPasswordLocator).fill(password)
        page.locator(inputLoginLocator).click()
    }

    fun isErrorDisplayed() : Boolean {
        return page.locator(errorButtonLocator).isVisible
    }
}