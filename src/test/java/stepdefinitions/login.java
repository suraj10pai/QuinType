package stepdefinitions;

import Factory.Driverfactory;
import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	private loginPage logPage = new loginPage(Driverfactory.getDriver());



	@Given("three notes are added")
	public void theree_notes_are_added() {
		logPage.AddThreeNotes();
	}

	@When("Mark an existing note as done and verify that the note is marked done")
	public void Mark_an_existing_note() {
		logPage.MarkExistingNoteasDone();
	}

	@Then("Delete any note")
	public void Delete_any_note() {
		logPage.DeleteNotes();
	}

}
