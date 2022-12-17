package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I open spotify")
    public void i_open_Spotify() {
        System.out.println("open spotify");
    }

    @When("I click on play button")
    public void i_click_on_play_button() {
        System.out.println("play ");
    }

    @Then("I should hear a song")
    public void i_should_hear_a_song() {
        System.out.println("song playing");
    }
}
