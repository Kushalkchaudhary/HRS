package stepdefinitions;

public class HotelBookingStepDefinitions {
    private HotelBookingPage hotelBookingPage;

    @Given("the user is on the HRS booking portal")
    public void user_is_on_booking_portal() {
        // Instantiate the page object
        hotelBookingPage = new HotelBookingPage();
        // Navigate to the HRS booking portal
        hotelBookingPage.navigateToBookingPortal();
    }

    @When("the user selects {string} as the destination")
    public void user_selects_destination(String destination) {
        hotelBookingPage.selectDestination(destination);
    }

    @When("the user selects {string} as the check-in date")
    public void user_selects_check_in_date(String checkInDate) {
        hotelBookingPage.selectCheckInDate(checkInDate);
    }

    @When("the user selects {string} as the check-out date")
    public void user_selects_check_out_date(String checkOutDate) {
        hotelBookingPage.selectCheckOutDate(checkOutDate);
    }

    @When("the user applies the filter for low availability")
    public void user_applies_low_availability_filter() {
        hotelBookingPage.applyLowAvailabilityFilter();
    }

    @Then("the user should see a list of hotels in Barcelona with low availability")
    public void user_sees_hotels_with_low_availability() {
        hotelBookingPage.verifyHotelsWithLowAvailability();
    }

    @Then("the user should be able to view details and book available rooms")
    public void user_views_details_and_books_rooms() {
        hotelBookingPage.viewAndBookAvailableRooms();
    }
}
