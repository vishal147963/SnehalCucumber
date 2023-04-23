package StepDef;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo extends BaseClass {
	@Given("User is on login Page")
	public void user_is_on_login_page() {
		BaseClass.setup();

	}


@When("user enter valid String and Sting")
public void user_enter_valid_admin_and_admin123(String username,String Password ) {
driver.findElement(By.xpath("")).sendKeys(username);
driver.findElement(By.xpath("")).sendKeys(Password);

}
@Then("user click on login button")
public void user_click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	@Then("user enter home page")
	public void user_enter_home_page() {

		String a=driver.getTitle();
		System.out.println(a);
	}
}
