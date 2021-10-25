package org.pojoclass;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderingAProductPojoClass extends MavenBassClass {

	public OrderingAProductPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='login']")
	public static WebElement signIn;
	public static WebElement getSignIn() {
		return signIn;
	}
	public static WebElement getLoginMail() {
		return loginMail;
	}
	public static WebElement getLoginPassword() {
		return loginPassword;
	}
	public static WebElement getLoginButton() {
		return loginButton;
	}
	public static WebElement getFadedShortSleeve() {
		return fadedShortSleeve;
	}
	public static WebElement getPrice() {
		return price;
	}
	public static WebElement getAddToCart() {
		return addToCart;
	}
	public static WebElement getPopupMessage() {
		return popupMessage;
	}
	@FindBy(xpath="//input[@id='email']")
	public static WebElement loginMail;
	@FindBy(xpath="//input[@id='passwd']")
	public static WebElement loginPassword;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	public static WebElement loginButton;
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	public static WebElement fadedShortSleeve;
	@FindBy(xpath="//span[text()='$16.51']")
	public static WebElement price;
	@FindBy(xpath="//span[text()='Add to cart']")
	public static WebElement addToCart;
	@FindBy(xpath="//div[@class='product-image-container layer_cart_img']/preceding-sibling::h2")
	public static WebElement popupMessage;
}
