package pages

import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page


class InventoryPage(val page: Page) {

    fun addItemToCart(itemName: String) {
        val inventoryItem = InventoryItem(itemName)
        val addToCartButton: Locator = page.locator(inventoryItem.buttonAddToCartLocator)
        addToCartButton.click()
    }

    fun clickOnCart() {
        val lnkShoppingCart: Locator = page.locator("xpath=.//a[@class='shopping_cart_link']")
        lnkShoppingCart.click()
    }
}

class InventoryItem(itemName: String) {
    private val inventoryItemLocator = "xpath=.//div[@class='inventory_item']//div[text()='$itemName']/../../../../"
    val buttonAddToCartLocator = "$inventoryItemLocator.//button"
}