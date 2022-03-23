package pro.btcturk.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pro.btcturk.userDetail.UserDetailResponseParameters;
import pro.btcturk.userDetail.DetailUser;
import pro.btcturk.config.Logger;


public class UserDetailSteps {

    DetailUser detailUser = new DetailUser();
    UserDetailResponseParameters userDetailResponseParameters = new UserDetailResponseParameters();
    String id;

    @Given("Customer Id : {string}")
    public void CustomerId(String id) {
        this.id = id;
    }

    @When("get user by Id")
    public void getUserById() {
        userDetailResponseParameters = detailUser.getUserWithId(id);
    }

    @Then("Check User Response Parameters")
    public void checkUser() {
        Assert.assertEquals(userDetailResponseParameters.getData().id, id, "Checked id !");
        Assert.assertEquals(userDetailResponseParameters.getData().avatar.isEmpty(), false, "Checked Avatar");
        Assert.assertEquals(userDetailResponseParameters.getData().email.isEmpty(), false, "Checked Email");
        Assert.assertEquals(userDetailResponseParameters.getData().first_name.isEmpty(), false, "Checked First Name !");
        Assert.assertEquals(userDetailResponseParameters.getData().last_name.isEmpty(), false, "Checked Last Name");
        Assert.assertEquals(userDetailResponseParameters.getSupport().url.isEmpty(), false, "Checked Url");
        Assert.assertEquals(userDetailResponseParameters.getSupport().text.isEmpty(), false, "Checked text");

        Logger.info("PASS Check the User Response");
    }


}