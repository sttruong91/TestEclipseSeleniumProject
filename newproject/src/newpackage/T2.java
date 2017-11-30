package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class T2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\struong\\chromedriver_win32_2.3.3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
        String baseUrl = "https://vertical.vappcenter.com/login";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        // LOGIN PAGE
        // Find the Email Address TextField		
        WebElement EmailID = driver.findElement(By.id("email"));						            		
        // Enter a valid email address
        EmailID.sendKeys("struong@vertical.com");											
     	// Find the Next button
        WebElement bNext = driver.findElement(By.className("btn"));
        // Click the Next button	
        bNext.click();	
        // Find the Password TextField
        WebElement PasswordCode = driver.findElement(By.id("password"));
        // Enter the valid password
        PasswordCode.sendKeys("0103070911SmUlM!");
        // Find the Login button
        WebElement bLogin = driver.findElement(By.className("btn--block"));
        // Click the Login button
        bLogin.click();
        
        // VCC MAIN PAGE
        
        // Storing parent window reference into a String Variable
        //Set<String> Parent_Window = driver.getWindowHandles();
        
        // Find ViewPont Web application button
        //WebElement bVPW = driver.findElement(By.className("gadget-application"));
        // Click VPW app to launch
        //bVPW.click();
        
        // Switching from parent (VCC) to child (VPW) window
        //for (String Child_Window : driver.getWindowHandles())
        //driver.switchTo().window(Child_Window);
        
        // Find Admin Console application button
        //WebElement bAdminConsole = driver.findElement(By.xpath("//*[@id=\"gadget-applications\"]/li[2]/div/div[2]"));
        // Click Admin Console application button
        //bAdminConsole.click();
        // Find Manage Gadgets button
        //WebElement bGadgets = driver.findElement(By.xpath("//*[@id=\"dashboard-layout-header\"]/button[1]/div"));
        //WebElement bGadgets = driver.findElement(By.xpath("//*[@id=\"dashboard-layout-header\"]/button[1]"));
        // Click Manage Gadgets button
        //bGadgets.click();		
        // Find Unlock Layout button
        //WebElement bGadgets = driver.findElement(By.xpath("//*[@id=\"dashboard-layout-header\"]/button[2]/div")); --> element not visible
        // Click Unlock Layout button
        //bGadgets.click();
        
        // MENU SETTINGS ON MAIN PAGE
        // Find Menu Settings button
        WebElement bMenu = driver.findElement(By.id("application-menu"));
        //WebElement bMenu = driver.findElement(By.xpath("//*[@id=\"application-menu\"]/div/button/div")); --> top line won't work unless this line is here...Q???
        // Click Menu Settings button
        bMenu.click();
        
        // Find ViewPoint Web app in Menu Settings
        //WebElement MenuVPW = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/ul/li[3]/div/div[2]"));
        // Click ViewPoint Web app in Menu Settings
        //MenuVPW.click();
              
        // Find Admin Console app in Menu Settings
        WebElement MenuAdmin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/ul/li[2]/div/div[2]"));        
        // Click Admin Console Web app in Menu Settings
        MenuAdmin.click();
       
        // Find Menu Settings button again in Admin Console
        //WebElement bMenu2 = driver.findElement(By.id("application-menu"));
        //WebElement bMenu2 = driver.findElement(By.xpath("//*[@id=\"application-menu\"]/div/button/div")); --> does not work
        // Click Menu Settings button again in Admin Console
        //bMenu2.click();
        
        // Find Dashboard app in Menu Settings
        //WebElement MenuDash = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/ul/li[1]/div/div[2]"));
        // Click Dashboard app in Menu Settings
        //MenuDash.click();
        
        
        // VCC ADMIN CONSOLE PAGE
        // Verify Admin Console page title
        //String actualTitle = driver.getTitle();
        //System.out.println("Title of page is :" + actualTitle );
        //String expectedTitle = "Admin Console"
        //Assert.assertEquals(expectedTitle, actualTitle)
        //Assert.assertTrue(actualTitle.contains("Admin Console"));
        //System.out.println("Test pass - page verified");
        
        // Find Vertical logo
        //WebElement bVlogo = driver.findElement(By.className("toolbar-logo"));
        // Click Vertical logo
        //bVlogo.click();
        // Find Home tab
        //WebElement bHome = driver.findElement(By.className("sidebar-tile")); --> element not visible
        //WebElement bHome = driver.findElement(By.className("list__tile")); --> element not visible
        //WebElement bHome = driver.findElement(By.xpath(("//*[@id=\"sidebar\"]/aside/ul[1]/li[1]/div/div[2]"))); --> Unable to locate element
        // Click Home tab
        //bHome.click();
        // Find Manage Wave Servers link on Home tab
        //WebElement bMWS = driver.findElement(By.className("gadget-footer"));
        //WebElement bMWS = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div")); --> Unable to locate element
        //Click Manage Wave Servers
        //bMWS.click();
        // Find Manage VCCG Instances link on Home tab
        //WebElement bMVI = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div[2]/div[1]/div[2]/div/div[3]/div"));
        //Click Manage VCCG Instances
        //bMVI.click();        
        // Find Company Profile tab
        //WebElement bCProfile = driver.findElement(By.xpath(("//*[@id=\"sidebar\"]/aside/ul[1]/li[2]/div/div[2]")));
        // Click Company Profile tab
        //bCProfile.click();
        // Find Tenants tab
        //WebElement bTenants = driver.findElement(By.xpath(("//*[@id=\"sidebar\"]/aside/ul[1]/li[3]/div/div[2]")));
        // Click Tenants tab
        //bTenants.click();
        // Find Wave Servers tab
        //WebElement bWServers = driver.findElement(By.xpath(("//*[@id=\"sidebar\"]/aside/ul[1]/li[4]/div/div[2]")));
        // Click Wave Servers tab
        //bWServers.click();
        
        // ADD TEST WAVE SERVER
        // Find Add Wave Server button
        //WebElement bAddWave = driver.findElement(By.className("view-add-button"));
        //WebElement bAddWave = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/div/button/div"));
        // Click Add Wave Server button
        //bAddWave.click();
        // Find Wave Server Name TextField
        //WebElement WaveName = driver.findElement(By.id("name"));
        //WebElement WaveName = driver.findElement(By.className("field-control"));
        //WebElement WaveName = driver.findElement(By.xpath("//*[@id="name"]"));
        // Enter Wave Server Name
        //WaveName.sendKeys("Test Wave Server");
        // Find Wave Server Cancel button
        //WebElement bWaveCancel = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div[2]/form/div/div/div[3]/button[2]/div"));
        //WebElement bWaveCancel = driver.findElement(By.className("blue-grey--text btn btn--outline btn--raised"));
        // Click Wave Server Cancel button
        //bWaveCancel.click();
        // Select from VCCG Instance dropdown
        //Select drpVCCG = new Select(driver.findElement(By.name("gateway")));
        //drpVCCG.selectByVisibleText("SC/Hotfoot 172.18.18.175");
        // Find Wave Server Create button
        //WebElement bWaveCreate = driver.findElement(By.className("btn btn--raised primary"));
        //WebElement bWaveCreate = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div[2]/form/div/div/div[3]/button[1]/div"));
        // Click Wave Server Create button
        
        // Find Unpair button for first Wave listed
        //WebElement bUnpair = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/table/tbody/tr[1]/td[5]/div[2]"));
        // Click Unpair button for first Wave listed
        //bUnpair.click();
        // Find Edit button for first Wave listed
        //WebElement bEdit = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/table/tbody/tr[1]/td[5]/div[3]"));
        // Click Edit button for first Wave listed
        //bEdit.click();
        // Find Delete button for first Wave listed
        //WebElement bDelete = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/table/tbody/tr[1]/td[5]/div[4]"));
        // Click Delete button for first Wave listed
        //bDelete.click();
        
        
        // Find VCCG Instances tab
        //WebElement bVCCG = driver.findElement(By.xpath(("//*[@id=\"sidebar\"]/aside/ul[1]/li[5]/div/div[2]")));
        // Click VCCG Instances tab
        //bVCCG.click();
        
        // ADD TEST VCCG INSTANCE
        // Find Add VCCG Instance button for first VCCG listed
        //WebElement bAddVCCG = driver.findElement(By.className("view-add-button grey--text btn btn--outline btn--raised"));
        //WebElement bAddVCCG = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/div/button/div"));
        // Click Add VCCG Instance button for first VCCG listed
        //bAddWave.click();
        // Find VCCG Instance Name TextField
        //WebElement VCCGName = driver.findElement(By.id("name"));
        //WebElement VCCGName = driver.findElement(By.className("field-control"));
        //WebElement VCCGName = driver.findElement(By.xpath("//*[@id="name"]"));
        // Enter VCCG Instance Name
        //VCCGName.sendKeys("Test VCCG + IP");
        // Find VCCG Instance Cancel button
        //WebElement bVCCGCancel = driver.findElement(By.xpath("//*[@id="sidebar"]/main/div/div/div/div[2]/form/div/div/div[3]/button[2]/div"));
        //WebElement bVCCGCancel = driver.findElement(By.className("blue-grey--text btn btn--outline btn--raised"));
        // Click Wave Server Cancel button
        //bVCCGCancel.click();
        // Find External IP Address Auto radio button 1
        //WebElement bAutoRadio1 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div[2]/form/div/div/div[2]/div/div/div[1]/label/input"));
        //WebElement bManualRadio2 = driver.findElement(By.className("gateway-ip-address-radio"));
        // Find External IP Address Manual radio button 2
        //WebElement bManualRadio2 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div[2]/form/div/div/div[2]/div/div/div[2]/label/input"));
        // Click Auto first radio button
        //bAutoRadio1.click();
        // Click Manual second radio button (which de-selects Auto first radio button)
        //bManualRadio2.click();
        // Find Manual IP TextField
        //WebElement ManualVCCG = driver.findElement(By.id("externalIP"));
        //WebElement ManualVCCG = driver.findElement(By.className("field-control"));
        //WebElement ManualVCCG = driver.findElement(By.xpath("//*[@id="externalIP"]"));
        // Find VCCG Instance Create button
        //WebElement bVCCGCreate = driver.findElement(By.className("btn btn--raised primary"));
        //WebElement bVCCGCreate = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div[2]/form/div/div/div[3]/button[1]/div"));
        // Click VCCG Instance Create button
        //bVCCGCreate.click();
        
        // Find Unpair button for first VCCG listed
        //WebElement bVUnpair = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/table/tbody/tr[1]/td[5]/div[2]"));
        // Click Unpair button for first VCCG listed
        //bVUnpair.click();
        // Find Edit button for first VCCG listed
        //WebElement bVEdit = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/table/tbody/tr[1]/td[5]/div[3]"));
        // Click Edit button for first VCCG listed
        //bVEdit.click();
        // Find Delete button for first VCCG listed
        //WebElement bVDelete = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/table/tbody/tr[1]/td[5]/div[4]"));
        // Click Delete button for first VCCG listed
        //bVDelete.click();        
        
        // Find User Groups tab
        //WebElement bUGroups = driver.findElement(By.xpath(("//*[@id=\"sidebar\"]/aside/ul[1]/li[6]/div/div[2]")));
        // Click User Groups tab
        //bUGroups.click();
        // Find Open button on User Groups tab of first User Group listed
        //WebElement bUGOpen = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/table/tbody/tr[1]/td[3]/div));
        // Click Open button on User Groups tab of first User Group listed
        //bUGOpen.click();
        // Find Users tab
        //WebElement bUsers = driver.findElement(By.xpath(("//*[@id=\"sidebar\"]/aside/ul[1]/li[7]/div/div[2]")));
        // Click Users tab
        //bUsers.click();
        // Find Open button on Users tab of first User listed
        //WebElement bUserOpen = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/main/div/div/div/div/table/tbody/tr[1]/td[5]/div));
        // Click Open button on User Groups tab of first User listed
        //bUserOpen.click();
        
        // Find Help button in Admin Console
        //WebElement bHelp = driver.findElement(By.id("bottom-list"));
        //WebElement bHelp = driver.findElement(By.xpath("//*[@id=\"bottom-list\"]/li/div/div[2]"));
        // Click Help button
        //bHelp.click();
        
        // Find total number of iFrames on webpage
        //Integer size = driver.findElements(By.tagName("iframe")).size();
       
        
        // VPW MAIN PAGE
        // Find VPW Menu/Avatar button
        //WebElement bVPWMenu = driver.findElement(By.xpath("//*[@id=\"avatarElement\"]/img"));
        // Click VPW Menu/Avatar button
        //bVPWMenu.click();
       
        
    }
}         