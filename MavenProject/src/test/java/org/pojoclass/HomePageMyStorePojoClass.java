package org.pojoclass;

import java.util.List;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;

public class HomePageMyStorePojoClass extends MavenBassClass {
	
	public HomePageMyStorePojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@class='img-responsive']")
	public static WebElement image1;
	@FindBy(xpath="//a[@class='login']")
	public static WebElement signIn;
	@FindBy(xpath="//a[text()='Contact us']")
	public static WebElement contactUs;
	
	@FindBy(xpath="//span[text()='Call us now: ']")
	public static WebElement callUsNow;
	@FindBy(xpath="//img[@class='logo img-responsive']")
	public static WebElement logo;
	@FindBy(xpath="//input[@id='search_query_top']")
	public static WebElement search;
	@FindBy(xpath="//button[@name='submit_search']")
    public static WebElement searchBtn;
	@FindBy(xpath="//a[@title='View my shopping cart']")
	public static WebElement shoppingCart;
	@FindBy(xpath="//a[@title='Women']")
	public static WebElement women;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	public static WebElement dresses;
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	public static WebElement tshirts;
	@FindBy(xpath="(//img[@class='item-img'])[1]")
	public static WebElement itemImg1;
	@FindBy(xpath="(//img[@class='item-img'])[2]")
	public static WebElement itemImg2;
	@FindBy(xpath="//li[@class='homeslider-container']")
	public static List<WebElement> homeSlider;
	@FindBy(xpath="(//a[@class='item-link'])[1]/img")
	public static WebElement img1;
	@FindBy(xpath="(//a[@class='item-link'])[2]/img")
	public static WebElement img2;
	@FindBy(xpath="(//a[@class='item-link'])[3]/img")
	public static WebElement img3;
	@FindBy(xpath="(//a[@class='item-link'])[4]/img")
	public static WebElement img4;
	@FindBy(xpath="(//a[@class='item-link'])[5]/img")
	public static WebElement img5;
	@FindBy(xpath="(//a[@class='item-link'])[6]/img")
	public static WebElement img6;
	@FindBy(xpath="(//a[@class='item-link'])[7]/img")
	public static WebElement img7;
	@FindBy(xpath="//a[text()='Popular']")
	public static WebElement popular;
	@FindBy(xpath="//a[text()='Best Sellers']")
	public static WebElement bestSellers;
	@FindBy(xpath="//h4[text()='Follow us on Facebook']")
	public static WebElement followUsFacebook;
	@FindBy(xpath="//div[@class='facebook-fanbox']")
	public static WebElement fanbox;	
	@FindBy(xpath="//em[@id='icon-truck']")
	public static WebElement truckIcon;
	@FindBy(xpath="//h3[text()='Come Visit Us']")
	public static WebElement comeVisitUs;
	@FindBy(xpath="//p[text()='We are located in Research Triangle Park, North Carolina, USA']")
	public static WebElement visitText;
	@FindBy(xpath="//em[@id='icon-phone']")
	public static WebElement phoneIcon;
	@FindBy(xpath="//h3[text()='Call Us']")
	public static WebElement callltext;
	@FindBy(xpath="//a[text()='Selenium Framework']")
	public static WebElement seleniumFramework;
	@FindBy(xpath="//em[@id='icon-credit-card']")
	public static WebElement creditIcon;
	@FindBy(xpath="//h3[text()='How to Pay dues']")
	public static WebElement howToPayDues;
	@FindBy(xpath="//p[text()='You can pay us by calling or use our online pay channels']")
	public static WebElement HowToPayDuesText;
	@FindBy(xpath="//h3[text()='Custom Block']")
	public static WebElement customBlock;
	@FindBy(xpath="//strong[text()='This is a custom block of text']")
	public static WebElement customBlockOfText;
	@FindBy(xpath="(//div[@class='col-xs-6'])[2]/p[2]")
	public static WebElement SeleniumText;
	@FindBy(xpath="//p[text()='Subsidiary of seleniumframework.com']")
	public static WebElement Subsidiary;
	@FindBy(xpath="//h1[text()='Automation Practice Website']")
	public static WebElement AutomationPracticeWebsite;
	@FindBy(xpath="//h2[text()='Practice Selenium ']")
	public static WebElement PracticeSelenium;
	@FindBy(xpath="//div[@class='rte']/p")
	public static WebElement PracticeSeleniumText;
	@FindBy(xpath="//h4[text()='Newsletter']")
	public static WebElement Newsletter;
	@FindBy(xpath="//input[@id='newsletter-input']")
	public static WebElement newsLetterMail;
	@FindBy(xpath="//button[@name='submitNewsletter']")
	public static WebElement submitNewsletter;
	@FindBy(xpath="//h4[text()='Follow us']")
	public static WebElement followUs;
	@FindBy(xpath="//li[@class='facebook']/a")
	public static WebElement facebookIcon;
	@FindBy(xpath="//li[@class='twitter']/a")
	public static WebElement twitterIcon;
	@FindBy(xpath="//li[@class='youtube']/a")
	public static WebElement youtubeIcon;
	@FindBy(xpath="//li[@class='google-plus']/a")
	public static WebElement googlePlusIcon;
	@FindBy(xpath="//h4[text()='Categories']")
	public static WebElement Categories;
	@FindBy(xpath="(//li[@class='last']/a)[1]")
	public static WebElement womenCategory;
	@FindBy(xpath="//h4[text()='Information']")
	public static WebElement Information;
	@FindBy(xpath="//li[@class='item']")
	public static List<WebElement> items;
	public static WebElement getImage1() {
		return image1;
	}
	public static WebElement getSignIn() {
		return signIn;
	}
	public static WebElement getContactUs() {
		return contactUs;
	}
	public static WebElement getCallUsNow() {
		return callUsNow;
	}
	public static WebElement getLogo() {
		return logo;
	}
	public static WebElement getSearch() {
		return search;
	}
	public static WebElement getSearchBtn() {
		return searchBtn;
	}
	public static WebElement getShoppingCart() {
		return shoppingCart;
	}
	public static WebElement getWomen() {
		return women;
	}
	public static WebElement getDresses() {
		return dresses;
	}
	public static WebElement getTshirts() {
		return tshirts;
	}
	public static WebElement getItemImg1() {
		return itemImg1;
	}
	public static WebElement getItemImg2() {
		return itemImg2;
	}
	public static List<WebElement> getHomeSlider() {
		return homeSlider;
	}
	public static WebElement getImg1() {
		return img1;
	}
	public static WebElement getImg2() {
		return img2;
	}
	public static WebElement getImg3() {
		return img3;
	}
	public static WebElement getImg4() {
		return img4;
	}
	public static WebElement getImg5() {
		return img5;
	}
	public static WebElement getImg6() {
		return img6;
	}
	public static WebElement getImg7() {
		return img7;
	}
	public static WebElement getPopular() {
		return popular;
	}
	public static WebElement getBestSellers() {
		return bestSellers;
	}
	public static WebElement getFollowUsFacebook() {
		return followUsFacebook;
	}
	public static WebElement getFanbox() {
		return fanbox;
	}
	public static WebElement getTruckIcon() {
		return truckIcon;
	}
	public static WebElement getComeVisitUs() {
		return comeVisitUs;
	}
	public static WebElement getVisitText() {
		return visitText;
	}
	public static WebElement getPhoneIcon() {
		return phoneIcon;
	}
	public static WebElement getCallltext() {
		return callltext;
	}
	public static WebElement getSeleniumFramework() {
		return seleniumFramework;
	}
	public static WebElement getCreditIcon() {
		return creditIcon;
	}
	public static WebElement getHowToPayDues() {
		return howToPayDues;
	}
	public static WebElement getHowToPayDuesText() {
		return HowToPayDuesText;
	}
	public static WebElement getCustomBlock() {
		return customBlock;
	}
	public static WebElement getCustomBlockOfText() {
		return customBlockOfText;
	}
	public static WebElement getSeleniumText() {
		return SeleniumText;
	}
	public static WebElement getSubsidiary() {
		return Subsidiary;
	}
	public static WebElement getAutomationPracticeWebsite() {
		return AutomationPracticeWebsite;
	}
	public static WebElement getPracticeSelenium() {
		return PracticeSelenium;
	}
	public static WebElement getPracticeSeleniumText() {
		return PracticeSeleniumText;
	}
	public static WebElement getNewsletter() {
		return Newsletter;
	}
	public static WebElement getNewsLetterMail() {
		return newsLetterMail;
	}
	public static WebElement getSubmitNewsletter() {
		return submitNewsletter;
	}
	public static WebElement getFollowUs() {
		return followUs;
	}
	public static WebElement getFacebookIcon() {
		return facebookIcon;
	}
	public static WebElement getTwitterIcon() {
		return twitterIcon;
	}
	public static WebElement getYoutubeIcon() {
		return youtubeIcon;
	}
	public static WebElement getGooglePlusIcon() {
		return googlePlusIcon;
	}
	public static WebElement getCategories() {
		return Categories;
	}
	public static WebElement getWomenCategory() {
		return womenCategory;
	}
	public static WebElement getInformation() {
		return Information;
	}
	public static List<WebElement> getItems() {
		return items;
	}
	public static WebElement getMyAccount() {
		return myAccount;
	}
	public static List<WebElement> getMyDetails() {
		return MyDetails;
	}
	public static WebElement getStoreInfo() {
		return storeInfo;
	}
	public static WebElement getAddress() {
		return address;
	}
	public static WebElement getPhoneNo() {
		return phoneNo;
	}
	public static WebElement getEmail() {
		return email;
	}
	@FindBy(xpath="//a[text()='My account']")
	public static WebElement myAccount;
	@FindBy(xpath="//ul[@class='bullet']")
	public static List<WebElement> MyDetails;
	@FindBy(xpath="//h4[text()='Store information']")
	public static WebElement storeInfo;
	@FindBy(xpath="(//ul[@class='toggle-footer'])[2]/li[1]")
	public static WebElement address;
	@FindBy(xpath="(//ul[@class='toggle-footer'])[2]/li[2]")
	public static WebElement phoneNo;
	@FindBy(xpath="(//ul[@class='toggle-footer'])[2]/li[3]")
	public static WebElement email;


	
	
}
