package objectpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject  {
	
	public static WebDriver driver;
	@FindBy(id = "all-home-launch-survey-Dental")
	WebElement btn_dental;



	@FindBy(name = "fullName")
	WebElement inp_username;
	@FindBy(xpath = "(//button[@type='button'])[18]")
	WebElement btn_age;
//	@FindBy()
//	WebElement
	@FindBy(name = "email")
	WebElement inp_email;
	@FindBy(id = "all-survey-coverage-continue")
	WebElement btn_ctn;
	@FindBy(xpath = "//input[@placeholder='123 Tooth Fairy Lane']")
	WebElement inp_address;
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement inp_city;
	@FindBy(xpath = "//input[@inputmode='numeric']")
	WebElement inp_pincode;
	@FindBy(id = "all-survey-address-continue")
	WebElement btn_con;
	@FindBy(xpath = "//span[text()='Just for my annual cleaning']")
	WebElement btn_package;
	@FindBy(id = "all-survey-questionnaire-continue")
	WebElement btn_cont;
	@FindBy(id = "all-survey-questionnaire-continue")
	WebElement btn_conti;
	@FindBy(id="all-plan-details-hero-enroll-now")
	WebElement btn_enroll;
	@FindBy(name = "dateOfBirth")
	WebElement inp_dob;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_submit;
	@FindBy(name = "paymentMethod")
	WebElement btn_payment;
	@FindBy(xpath = "(//li[@tabindex='0'])[2]")
	WebElement drpdn_card;
	@FindBy(id="bankInformation.routingNumber")
	WebElement inp_routnum;
	@FindBy(name = "bankInformation.accountNumber")
	WebElement inp_accnum;
	@FindBy(xpath = "(//p[@class='informational'])[5] ")
	WebElement ckbx_infrom;
	@FindBy(id = "all-payment-container-submit")
	WebElement btn_sub;
	@FindBy(xpath = "(//button[@role='button'])[7]")
	WebElement btn_agre;
	@FindBy(xpath = "(//button[@role='button'])[7]")
	WebElement btn_agree;
	@FindBy(xpath = "(//button[@role='button'])[7]")
	WebElement btn_finish;
	

	

	public PageObject(WebDriver driver) {
		 PageObject.driver=driver;
		 PageFactory.initElements(driver,this);
	 }

 public void data() throws Exception {
     
	 btn_dental.click();
	 inp_username.sendKeys("Suraj Kumar");
	
	 inp_email.sendKeys("surajshantha@gmail.com");
	
	 btn_age.click();
	 List<WebElement> age=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0;i<age.size();i++) {

			if(age.get(i).getText().equals("19-20")) {
				age.get(i).click();
				break;

			}}
		 btn_ctn.click();
		 Thread.sleep(3000);
	 inp_address.sendKeys("56 rajendra nagar");
	 inp_city.sendKeys("chicago");
	 inp_pincode.sendKeys("64111");
	 btn_con.click();
	 Thread.sleep(3000);
	 btn_package.click();
	 btn_cont.click();
	 Thread.sleep(3000);
	 btn_conti.click();
	 Thread.sleep(3000);
	 btn_enroll.click();
	 Thread.sleep(4000);
	 inp_dob.sendKeys("15/06/1997");
	 btn_submit.click();
	 Thread.sleep(4000);
	 btn_payment.click();
	 drpdn_card.click();
	 inp_routnum.sendKeys("071000013");
	 inp_accnum.sendKeys("78945612301");
	 ckbx_infrom.click();
	 btn_sub.click();
	 Thread.sleep(4000);
	 btn_agre.click();
	 Thread.sleep(4000);
	 btn_agree.click();
	 Thread.sleep(4000);
	 btn_finish.click();
	 Thread.sleep(2000);

	 
 }}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


