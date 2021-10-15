package org.pojoclass;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BookingHotelPojoClass extends MavenBassClass {
	public BookingHotelPojoClass() {
		PageFactory.initElements(driver, this);
	}
    @CacheLookup
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;
    @CacheLookup
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
    @CacheLookup
	@FindBy(xpath = "//input[@name='login']")
	private WebElement login;
    @CacheLookup
	@FindAll({
		@FindBy(xpath="//select[@id='location']"),
		@FindBy(xpath="//select[@name='locatio']")
	})
	private WebElement location;
    @CacheLookup
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
    @CacheLookup
	@FindBys({
		@FindBy(xpath="//select[@id='room_type']"),
		@FindBy(xpath="//select[@name='room_type']")
	})
	private WebElement roomType;
    @CacheLookup
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomNo;
    @CacheLookup
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkInDate;
    @CacheLookup
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkOutDate;
    @CacheLookup
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultNO;
    @CacheLookup
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childNo;
    @CacheLookup
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;
    @CacheLookup
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement confirmHotel;
    @CacheLookup
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continueBtn;
    @CacheLookup
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;
    @CacheLookup
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;
    @CacheLookup
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billingAddress;
    @CacheLookup
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditCardNo;
    @CacheLookup
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement creditCardType;
    @CacheLookup
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement creditExpMonth;
    @CacheLookup
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement creditExpYear;
    @CacheLookup
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNo;
    @CacheLookup
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookNo;
    @CacheLookup
	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement orderNo;

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultNO() {
		return adultNO;
	}

	public WebElement getChildNo() {
		return childNo;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getConfirmHotel() {
		return confirmHotel;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getCreditExpMonth() {
		return creditExpMonth;
	}

	public WebElement getCreditExpYear() {
		return creditExpYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNo() {
		return bookNo;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

}
