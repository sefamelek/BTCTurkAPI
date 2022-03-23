package pro.btcturk.steps;

import pro.btcturk.config.Logger;
import pro.btcturk.ListUsers.ListUsers;
import pro.btcturk.ListUsers.ListUsersResponseParameter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class ListUsersSteps {
    ListUsers listusers = new ListUsers();
    public ListUsersResponseParameter listUsersResponseParameter;
    int ListPageNumber;


    @Given("go to List Page: {int}")
    public void listPage (int pageNumber) {
        this.ListPageNumber = pageNumber;
    }

    @When("List Users")
    public void getUser() {
        listUsersResponseParameter = listusers.getListUsersWithPageParameter(ListPageNumber);
    }

    @Then("Check the List Users response")
    public void checkUser() {

        int dataCount = listUsersResponseParameter.getData().size();
        int pages = listUsersResponseParameter.getTotal_pages();
        Assert.assertEquals(listUsersResponseParameter.getPer_page(), 6, "Checked list per_page");
        Assert.assertEquals(listUsersResponseParameter.getTotal_pages(), ListPageNumber, "Checked List Page Number");

    }
}