package website;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.Common_Config;

public class Test_ResourcesPage extends Common_Config  {
	
	
	String baseUrl = "http://www.resilientplc.com";
	  
	  public void Invoke_Browser()
	  {
		  launchBrowser();
	  }
	  public void NavigateToSite() throws InterruptedException
	  {
		  driver.navigate().to(baseUrl);   
		  driver.manage().window().maximize();
	  } 
	  
	@Test(priority=10)
	  public void Goto_Resources_Page() throws InterruptedException 
	  {
		  Invoke_Browser();
		  NavigateToSite();
		  Thread.sleep(3000);
	  }	  
	  
  @Test(priority=11)
  public void ResourcesPage_Click_Top_5_Benifits_of_Smartnumbers_for_FixedLlineTtelephony() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5789"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Top 5 benefits of smartnumbers for fixed-line telephony � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_How_Smartnumbers_Puts_You_In_Control_of_Your_Communications() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5758"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("How smartnumbers puts you in control of your communications � Resilientplc");
	  gotoHome(".//*[@id='logo']");
	  
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Recording_Conversations_Under_Mifid_a_Quick_Guide_To_Compliance() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5736"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Recording conversations under MiFID II: a quick guide to compliance � Resilientplc");
	  gotoHome(".//*[@id='logo']"); 
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Face_To_Face_Recording_for_Financial_Services_a_Growing_Imperative() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5574"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Face to face recording for financial services: a growing imperative � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_One_Public_Estate_Maintaining_Business_Continuity_During_Estate_Rationalisation() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5571"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("One Public Estate: maintaining business continuity during estate rationalisation � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Five_Questions_To_Ask_When_Moving_Your_Telecoms_To_New_Premises() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5436"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("5 questions to ask when moving your telecoms to new premises � Resilientplc");
	  gotoHome(".//*[@id='logo']"); 
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_One_Public_Estate_for_Number_Management_Success_Stories() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5427"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("One Public Estate: 4 number management success stories � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Keeping_You_In_Control_During_Sip_Migration() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5403"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Keeping you in control during SIP migration � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
    
  @Test(priority=11)
  public void ResourcesPage_Click_Mifid_Ebook() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5339"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("MiFID II eBook � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Smartnumbers_Mobile_Datasheet() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4738"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("smartnumbers mobile datasheet � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Smartnumbers_Call_Recording_Datasheet() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4577"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("smartnumbers call recording datasheet � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Smartnumbers_Face_To_Face_Recording_Datasheet() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4444"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("smartnumbers face-to-face recording datasheet � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Legal_Sector_Industry_Brief() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3711"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("A new approach to mobile call recording � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void public_sector_industry_brief() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3635"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Legal sector industry brief � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_The_Enterprise_Mobile_For_Sales_Organisations() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3631"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Public sector industry brief � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Mifid_Smart_Guide_To_Mobile_Call_Recording() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3628"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("The enterprise mobile for sales organisations � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Smart_Guide_To_The_Costs_And_Risks_of_Allowing_Business_And_Personal_Calls_On_One_Phone() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3623"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("MiFID II: smart guide to mobile call recording � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Smartnumbers_Control_Datasheet() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3617"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("smartnumbers control datasheet � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_De_Risk_Office_Moves_Solution_Brief() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3610"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("De-risk office moves solution brief � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Protect_Critical_Numbers_Solution_Brief() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3605"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Protect critical numbers solution brief � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Compliant_Mobile_Call_Recording_Solution_brief() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3599"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Compliant mobile call recording solution brief � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Mobile_Call_Recording_Ebook() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3591"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Mobile call recording eBook � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Byod_Voice_Made_Easy_Solution_Brief() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3588"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("BYOD voice made easy solution brief � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Byod_Voice_The_Lost_Piece_of_The_Byod_Puzzle() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3579"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("BYOD voice - The lost piece of the BYOD puzzle � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Sustainability_And_The_Corporate_Mobile_Ebook() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3575"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Sustainability and the corporate mobile eBook � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=11)
  public void ResourcesPage_Click_Insurance_Industry_Brief() throws InterruptedException 
  {
	  WebDriverWait wd = new WebDriverWait(driver, 30);
	  
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
	  Thread.sleep(3000);
	  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3563"))).click();
	  Thread.sleep(3000);
	  verifyPageTitle("Insurance industry brief � Resilientplc");
	  gotoHome(".//*[@id='logo']");
  }
  
  @Test(priority=12)
  public void Close_Browser() throws InterruptedException
  {
	   
	  browserClose();

  }
}
