package assignment7.def;
import io.cucumber.java.en.*;
import java.util.HashMap;
public class Stepdef {



    /**
     * This is the Step Definition Class for the .feature file.
     */
    public class ApplicationLoginStepsDefinition {
        /**
         * Method to define steps when user lands on Net Banking Page
         */
        @Given("User is on NetBanking landing page")
        public void user_is_on_net_banking_landing_page () {
            System.out.println("USER IS ON NET BANKING LANDING PAGE");
        }

        /**
         * Method to define steps to validate user credentials
         */
        @When("User login into application with username and password")
        public void user_login_into_application_with_username_and_password () {
            System.out.println("USER LOGIN INTO APPLICATION WITH USERNAME AND PASSWORD");
        }

        /**
         * Method to define steps when user is able to log into NetBanking Page After Validation
         */
        @Then("Home page is populated")
        public void home_page_is_populated () {
            System.out.println("HOME PAGE IS POPULATED");
        }

        /**
         * Method to define steps when to display cards
         */
        @Then("Cards are displayed")
        public void cards_are_displayed () {
            System.out.println("CARDS ARE DISPLAYED");
        }

        /**
         * Method to define steps when user is logging into page with specific credentials
         * @param arg0 For Username
         * @param arg1 For Password
         */
        @When("User login into application with {string} and password {string}")
        public void userLoginIntoApplicationWithAndPassword(String arg0, String arg1) {
            if(arg0.equalsIgnoreCase("jin") && arg1.equalsIgnoreCase("1234") || arg0.equalsIgnoreCase("john") && arg1.equalsIgnoreCase("4321")){
                System.out.println("CREDENTIALS VERIFIED SUCCESSFULLY");
            }
            else{
                System.out.println("WRONG CREDENTIALS");
            }
        }

        /**
         * Method to define steps if the cards are displayed or not
         * @param arg0 To get value for cards visibility
         */
        @And("Cards displayed are {string}")
        public void cardsDisplayedAre(String arg0) {
            if(arg0.equalsIgnoreCase("true")) {
                System.out.println("CARDS DISPLAYED ARE TRUE");
            }
            else{
                System.out.println("CARDS DISPLAYED ARE FALSE");
            }
        }

        /**
         * Method to define steps when there are series of username and password
         * @param arg0 For Username
         * @param arg1 For Password
         */
        @When("User login in to application with {string} and password {string}")
        public void userLoginInToApplicationWithAndPassword(String arg0, String arg1) {
            HashMap<String,String> map = new HashMap<>();
            map.put("user1","pass1");
            map.put("user2","pass2");
            map.put("user3","pass3");
            map.put("user4","pass4");
            if(map.containsKey(arg0) && arg1.equals(map.get(arg0))){
                System.out.println("CREDENTIALS VERIFIED SUCCESSFULLY");
            }
            else{
                System.out.println("WRONG CREDENTIALS");
            }
        }
    }

}
