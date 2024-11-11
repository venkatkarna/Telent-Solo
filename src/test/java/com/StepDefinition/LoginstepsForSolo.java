package com.StepDefinition;



import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepsForSolo {
	static WebDriver driver;
	
		
		@Given("the user is on the login page")
		public void the_user_is_on_the_login_page() {
			driver = new ChromeDriver();
			driver.get("http://172.16.0.61/SOLO/Pages/depot_jobpack_documents.aspx");
			driver.manage().window().maximize();
		    
		}

		@When("the user enters valid credentials")
		public void the_user_enters_valid_credentials() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("UserName")).sendKeys("balasubramanian.n@changepond.com");
			driver.findElement(By.id("Password")).sendKeys("euuai@123");
			driver.findElement(By.name("LoginButton")).click();
			Thread.sleep(2000);
		}

		@Then("the user should be redirected to the homepage")
		public void the_user_should_be_redirected_to_the_homepage() {
		    String currentUrl = driver.getCurrentUrl();
		    assertTrue(currentUrl.contains("homepage"));
		}

		@Given("user mouse hover the PMO")
		public void user_mouse_hover_the_PMO() throws InterruptedException {
			Thread.sleep(2000);
			Actions action = new Actions(driver);

			action.moveToElement(driver.findElement(By.id("ctl00_cCtrlMenu-menuItem000"))).build().perform();
			Thread.sleep(2000);
		}

		@When("User click on Advanced job search")
		public void user_click_on_Advanced_job_search() throws InterruptedException {
			driver.findElement(By.id("ctl00_cCtrlMenu-menuItem000-subMenu-menuItem001")).click();
			Thread.sleep(3000);
		}

		
			
		

		@Given("Scroll down the advanced job search page")
		public void scroll_down_the_advanced_job_search_page() throws InterruptedException {
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scroll(0,520)", "");
			Thread.sleep(2000);
		}

		@When("User click on the My job button")
		public void user_click_on_the_My_job_button() {
			driver.findElement(By.id("ctl00_cphContent_btnMyJobs")).click();
		}

		@When("scroll the My job function")
		public void scroll_the_My_job_function() throws InterruptedException {
			Thread.sleep(2000);
			JavascriptExecutor executor1 = (JavascriptExecutor) driver;
			executor1.executeScript("window.scroll(0,880)", "");
		}

		@Then("Click on the Add job button")
		public void click_on_the_Add_job_button() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.id("ctl00_cphContent_btnNAddJobs")).click();
		}

		@Given("Select the contract box")
		public void select_the_contract_box() throws InterruptedException {
			Thread.sleep(4000);
			WebElement dropDown1 = driver
					.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_ddlA537Contract"));
			Thread.sleep(2000);
			dropDown1.click();
			Select selct = new Select(dropDown1);
			selct.selectByIndex(7);
		}

		@When("Enter the valid inputs in estimate text box field")
		public void enter_the_valid_inputs_in_estimate_text_box_field() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_txtA537EstimateNo")).sendKeys("SLO00001");
		}

		@When("Select the Job category in dropdown field")
		public void select_the_Job_category_in_dropdown_field() throws InterruptedException {
			Thread.sleep(2000);
			WebElement dropDown2 = driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_ddlA537JobCat"));
			Thread.sleep(2000);
			dropDown2.click();
			Select slt = new Select(dropDown2);
			slt.selectByIndex(1);
		}

		@When("select the date Required By Date\\/Time field")
		public void select_the_date_Required_By_Date_Time_field() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_txtA537RequiredByDate"))
					.sendKeys("14/10/2024");
		}

		@When("Enter the valid input in Originator text box field")
		public void enter_the_valid_input_in_Originator_text_box_field() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_txtA537Originator")).sendKeys("CP");
			Thread.sleep(2000);
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor2.executeScript("window.scroll(0,350)", "");
		}

		@When("Enter the valid inputs in OCU text box field")
		public void enter_the_valid_inputs_in_OCU_text_box_field() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_txtA537OrigOUC")).sendKeys("OCU");
		}

		@When("Select the Receipt Date\\/Time field")
		public void select_the_Receipt_Date_Time_field() {
			driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_txtA537ReceiptDate"))
			.sendKeys("04/10/2024");
		}

		@When("Select the Depot in Depot dropdown field")
		public void select_the_Depot_in_Depot_dropdown_field() throws InterruptedException {
			Thread.sleep(2000);
			WebElement dropDown21 = driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_ddlA537Depot"));
			Thread.sleep(2000);
			dropDown21.click();
			Select slc = new Select(dropDown21);
			slc.selectByIndex(3);
		}

		@Then("Enter the valida inputs in COW text box field")
		public void enter_the_valida_inputs_in_COW_text_box_field() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_txtA537COW")).sendKeys("Test");
		}

		@Then("Enter the valid inputs in Location text box field")
		public void enter_the_valid_inputs_in_Location_text_box_field() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_txtA537Location")).sendKeys("UK");
			Thread.sleep(2000);
			JavascriptExecutor executor3 = (JavascriptExecutor) driver;
			executor3.executeScript("window.scroll(0,350)", "");
			Thread.sleep(2000);
			
		}

		@Then("Click on the Exchange area search bar")
		public void click_on_the_Exchange_area_search_bar() throws InterruptedException {
			Thread.sleep(5000); 
			WebElement clickExchangeArea = driver .findElement(By.xpath("//i[@class='fa fa-search']"));
			clickExchangeArea.click();
		}

		@Then("User can handle the Exchange area search bar window")
		public void user_can_handle_the_Exchange_area_search_bar_window() throws InterruptedException {
			Thread.sleep(2000); 

			String parentWindow = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> handles = new ArrayList<String>(windowHandles);
			driver.switchTo().window(handles.get(1));
			Thread.sleep(5000);
			WebElement selectExchangeArea =	driver.findElement(By.xpath("//td[text()='ABERMULE']"));
			selectExchangeArea.click(); 
			Thread.sleep(5000); 
			WebElement clickSelectButton = driver.findElement(By.xpath("//input[@name='btnSelect']"));
			clickSelectButton.click();
			driver.switchTo().window(parentWindow);
		}

		@Given("Click on the save button")
		public void click_on_the_save_button() throws InterruptedException {
			Thread.sleep(5000); 
			driver.findElement(By.id("ctl00_cphContent_JobPoolTabContainer_TabA537_btnA537Save")).click();
Thread.sleep(4000); 
			
			Alert alrt = driver.switchTo().alert();
			alrt.accept();
		}
		

		@Given("Click on the estimate hyper link in Job info screen")
		public void click_on_the_estimate_hyper_link_in_Job_info_screen() throws InterruptedException {
			Thread.sleep(6000); 
			driver.findElement(By.id("ctl00_cphContent_EJobsMenu_trEstimate")).click();
		}

		@When("Click on the add button")
		public void click_on_the_add_button() throws InterruptedException {
			Thread.sleep(2000); 
			driver.findElement(By.id("ctl00_cphContent_btnWIAddJob")).click();
		}

		@When("Select the description in dropdown list")
		public void select_the_description_in_dropdown_list() throws InterruptedException {
			Thread.sleep(5000); 
			WebElement dropDown = driver.findElement(By.id("ctl00_cphContent_EstimateGrid_ctl03_ddlWorkItemAdd"));
			Select slt1 = new Select(dropDown);
			slt1.selectByIndex(1);
		}

		@When("Enter the Estimate quantity number")
		public void enter_the_Estimate_quantity_number() throws InterruptedException {
			Thread.sleep(2000); 
			driver.findElement(By.id("ctl00_cphContent_EstimateGrid_ctl03_txtWIEstimateQtyAdd")).sendKeys("3");
		}

		@Then("Click on the save button in Estimate screen")
		public void click_on_the_save_button_in_Estimate_screen() throws InterruptedException {
			Thread.sleep(2000); 
			driver.findElement(By.id("ctl00_cphContent_EstimateGrid_ctl03_btnAddSave")).click();
		}

		@Given("Click on the Job info screen")
		public void click_on_the_Job_info_screen() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_RightMenu_scrn10")).click();
		}

		@When("User can click on the Accept job")
		public void user_can_click_on_the_Accept_job() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_OrderHeaderControl_Accept Job")).click();
		}

		@When("User can click on the continue button")
		public void user_can_click_on_the_continue_button() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_btnContinue")).click();
		}

		@When("User can click on the No button in Job Pack required ?")
		public void user_can_click_on_the_No_button_in_Job_Pack_required() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_Button1")).click();
		}

		@When("User can click on the no button in USRN Required ?")
		public void user_can_click_on_the_no_button_in_USRN_Required() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_Button1")).click();
		}

		@When("User can click on the Continue button")
		public void user_can_click_on_the_Continue_button() throws InterruptedException {
			Thread.sleep(10000); 
			driver.findElement(By.id("ctl00_cphContent_btnGotoJobSearch")).click();
		}

		@When("User can click on the Releasd to depot button")
		public void user_can_click_on_the_Releasd_to_depot_button() throws InterruptedException {
			Thread.sleep(5000); 
			driver.findElement(By.id("ctl00_cphContent_OrderHeaderControl_Release to Depot")).click();
		}

		@When("User can click on the Mandatory work flow save button")
		public void user_can_click_on_the_Mandatory_work_flow_save_button() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_btnSaveMandatoryWorkflow")).click();
		}

		@When("User can click on the ZOI No excavation")
		public void user_can_click_on_the_ZOI_No_excavation() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_RDZoiNOExcavation")).click();
		}

		@When("Click on the Release button")
		public void click_on_the_Release_button() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_btnHotJobYes")).click();
		}

		@When("User can click on the Release Job Confirmation Yes button")
		public void user_can_click_on_the_Release_Job_Confirmation_Yes_button() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_btnYes")).click();
			Thread.sleep(4000); 
			Alert alrt1 = driver.switchTo().alert();
			alrt1.accept();
		}

		@Given("Click on the quick link")
		public void click_on_the_quick_link() throws InterruptedException {
			Thread.sleep(3000); 
			driver.findElement(By.id("ctl00_cCtrlMenu-menuItem013")).click();
		}

		@When("Double click on the order number")
		public void double_click_on_the_order_number() throws InterruptedException {
			Thread.sleep(4000); 
			WebElement douleClick1 = driver.findElement(By.id("ctl00_cphContent_GVQuickLinks_ctl02_lblOrderNo"));
			Actions action111 = new Actions(driver);
			action111.moveToElement(douleClick1).doubleClick().build().perform();
			
		}

		@When("User can accept the job")
		public void user_can_accept_the_job() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_getDepotOrderDetails_btnAcceptJob")).click();
			
		}

		@When("User can accept the job pack")
		public void user_can_accept_the_job_pack() throws InterruptedException {
			Thread.sleep(4000); 
			driver.findElement(By.id("ctl00_cphContent_DepotOrderHeaderControl_Accept Job Pack")).click();
		}

		@When("User can select the pole Weighting")
		public void user_can_select_the_pole_Weighting() throws InterruptedException {
			Thread.sleep(4000); 
			WebElement dropDown11 = driver.findElement(By.id("ctl00_cphContent_ddlPolingWeighting"));
			Select slt11 = new Select(dropDown11);
			slt11.selectByValue("1");
			Thread.sleep(3000); 
			driver.findElement(By.id("ctl00_cphContent_btnPolingYes")).click();
			Thread.sleep(3000); 
			Alert alrt11 = driver.switchTo().alert();
			alrt11.accept();
		}

		@When("Depot accepted double click the order number")
		public void depot_accepted_double_click_the_order_number() throws InterruptedException {
			WebElement douleClick2 = driver.findElement(By.id("ctl00_cphContent_GVQuickLinks_ctl02_lblOrderNo"));
			   Actions action1111 = new Actions(driver);
			   action1111.moveToElement(douleClick2).doubleClick().build().perform();
			   Thread.sleep(4000); 
			   driver.findElement(By.id("ctl00_cphContent_getDepotOrderDetails_btnAcceptJob")).click();
		}

		@Given("Click on quick programming link")
		public void click_on_quick_programming_link() throws InterruptedException {
			Thread.sleep(4000);
			   String Oldwindow = driver.getWindowHandle();
			   WebElement QuickProgramming = driver.findElement(By.id("ctl00_cphContent_EJobsMenu_scrnPlanner"));
			   Thread.sleep(4000);
			   QuickProgramming.click();
			   Thread.sleep(4000);   
			  driver.manage().window().maximize();
			   Set<String> handles1 = driver.getWindowHandles();
		   for (String newwindow : handles1) {
			  
			  
				   
				   Thread.sleep(4000);
				   WebElement SaveButton = driver.findElement(By.id("jobDetailsSave"));
				   SaveButton.click();
				   Thread.sleep(4000);
				   
				   Alert alrt12 = driver.switchTo().alert();
					alrt12.accept();
					Thread.sleep(4000);
					
					driver.switchTo().window(Oldwindow);
		   }
		}

		@Given("click on the work assign")
		public void click_on_the_work_assign() throws InterruptedException {
			 driver.findElement(By.xpath("//input[@value='Work Assigned']")).click();
			   Thread.sleep(4000);
			   Alert alrt13 = driver.switchTo().alert();
			   alrt13.accept();
			   Thread.sleep(4000);
		}

		@When("accept the job document")
		public void accept_the_job_document() throws InterruptedException {
			WebElement doubleclick3 = driver.findElement(By.id("ctl00_cphContent_GVQuickLinks_ctl02_lblOrderNo"));
			   Actions action1112 = new Actions(driver);
			   action1112.moveToElement(doubleclick3).doubleClick().build().perform();
			   //accept
			   Thread.sleep(4000);
			   driver.findElement(By.id("ctl00_cphContent_getDepotOrderDetails_btnAcceptJob")).click();
			   
			   
		}

		@Given("Click on the A{int} Hyper link")
		public void click_on_the_A_Hyper_link(Integer int1) throws InterruptedException {
			Thread.sleep(8000);
			   driver.findElement(By.id("ctl00_cphContent_EJobsMenu_trA537")).click();
			   
			   Thread.sleep(4000);
			   JavascriptExecutor executor4 = (JavascriptExecutor) driver;
				executor4.executeScript("window.scroll(0,1100)", "");
				Thread.sleep(4000);
		}

		@When("Click on the planned work")
		public void click_on_the_planned_work() {
			driver.findElement(By.id("ctl00_cphContent_RadioISworksExecutedPlannedYes")).click();
		}

		@When("Select the CSSID")
		public void select_the_CSSID() {
			WebElement Dropdown3 = driver.findElement(By.id("ctl00_cphContent_ddlEngResCSSID"));
			Dropdown3.click();
			 Select slt12 = new Select(Dropdown3);
			  slt12.selectByIndex(5);
		}

		@When("Click on the EC Button")
		public void click_on_the_EC_Button() throws InterruptedException {
			Thread.sleep(4000);
			   
		driver.findElement(By.name("ctl00$cphContent$btnA537TxEC")).click();
		Alert alrt131 = driver.switchTo().alert();
		   alrt131.accept();
		   Thread.sleep(20000);
		   JavascriptExecutor executor41 = (JavascriptExecutor) driver;
			executor41.executeScript("window.scroll(0,-1500)", "");
		}

		@Then("Click on the job info")
		public void click_on_the_job_info() throws InterruptedException {
			Thread.sleep(4000);
			driver.findElement(By.id("ctl00_cphContent_RightMenu_scrn10")).click();
		}

		@Given("Click on the send to Completete the job pack invoicing")
		public void click_on_the_send_to_Completete_the_job_pack_invoicing() throws InterruptedException {
			Thread.sleep(4000);
			driver.findElement(By.id("ctl00_cphContent_DepotOrderHeaderControl_Send Complete Job Pack to Invoicing")).click();
		}

		@When("click on the agreen Button")
		public void click_on_the_agreen_Button() throws InterruptedException {
			Thread.sleep(4000);
		    driver.findElement(By.id("ctl00_cphContent_btnAgree")).click();
		    Thread.sleep(4000);
			Alert alrt132 = driver.switchTo().alert();
			   alrt132.accept();
		}

		@When("Accept the invoicing status")
		public void accept_the_invoicing_status() throws InterruptedException {
			Thread.sleep(4000);  
			   
			   
			   WebElement doubleClick4 = driver.findElement(By.id("ctl00_cphContent_GVQuickLinks_ctl02_lblOrderNo"));
			   doubleClick4.click();
			   Actions action13 = new Actions(driver);
			   action13.moveToElement(doubleClick4).doubleClick().build().perform();
		}

		@Then("Accept the job")
		public void accept_the_job() throws InterruptedException {
			Thread.sleep(4000); 
			 driver.findElement(By.id("ctl00_cphContent_OrderAcceptControl_btnAcceptJob")).click();
			 Thread.sleep(4000);  
			   JavascriptExecutor executor42 = (JavascriptExecutor) driver;
			   executor42.executeScript("window.scroll(0,500)", "");
		}

		@Given("Click on the payment validation")
		public void click_on_the_payment_validation() throws InterruptedException {
			driver.findElement(By.id("ctl00_cphContent_EJobsMenu_trPaymentValid")).click();
			Thread.sleep(4000);
		}

		@When("Click o the Add button")
		public void click_o_the_Add_button() throws InterruptedException {
			driver.findElement(By.xpath("(//div[@class='p10']/child::input)[1]")).click();
			 Thread.sleep(2000);
			 Thread.sleep(2000);
			 
				String parentWindow1 = driver.getWindowHandle();
				Set<String> windowHandles1 = driver.getWindowHandles();
				List<String> handles11 = new ArrayList<String>(windowHandles1);
				driver.switchTo().window(handles11.get(1));
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//div[@class='btn-center']/child::input)[2]")).click();
				Thread.sleep(4000);
				driver.switchTo().window(parentWindow1);
		}

		@When("Click on the View button")
		public void click_on_the_View_button() throws InterruptedException {
			Thread.sleep(4000);
			driver.findElement(By.id("ctl00_cphContent_GridPayments_ctl02_btnModify")).click();
			
			
			
			String parentWindow11 = driver.getWindowHandle();
			Set<String> windowHandles11 = driver.getWindowHandles();
			List<String> handles111 = new ArrayList<String>(windowHandles11);
			driver.switchTo().window(handles111.get(0));
			
		}

		@Then("Click on the Agree button")
		public void click_on_the_Agree_button() throws InterruptedException {
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//div[@class='btn-center']/child::input[1]")).click();
			driver.findElement(By.id("btnAgreed")).click();
			Thread.sleep(2000);
			
			
		}
		@Given("Click on the tax completion button")
		public void click_on_the_tax_completion_button() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.id("ctl00_cphContent_GridPayments_ctl02_btnTx")).click();
			Thread.sleep(2000);
			   Alert alrt01 = driver.switchTo().alert();
			   alrt01.accept();
		}

		

}
