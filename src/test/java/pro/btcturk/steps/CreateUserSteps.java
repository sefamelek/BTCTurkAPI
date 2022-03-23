package pro.btcturk.steps;

import pro.btcturk.createUser.CreateUserResponseParameter;
import pro.btcturk.createUser.CreateUser;

import pro.btcturk.config.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 import org.testng.Assert;

import java.text.ParseException;

public class CreateUserSteps {
    private CreateUser createUser = new CreateUser();
    private CreateUserResponseParameter createUserResponseParameter;

    private String name;
    private String job;

    @Given("User Name {string}, User Job {string}")
    public void giveCustomerInfo(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @When("Create User")
    public void post() {
        createUserResponseParameter = createUser.createUser(name, job);

    }

    @Then("Check response")
    public void checkCreate() throws ParseException {
        Assert.assertEquals(createUserResponseParameter.getName(), name, "User Name succesfull created");
        Assert.assertEquals(createUserResponseParameter.getJob(), job, "Job Name succesfull created");
        Logger.info("User succesfull created!");
    }
}
