Feature: Hotel Booking with Availability Filtering

  Scenario: User filters hotels in Barcelona for a week with low availability
    Given the user is on the HRS booking portal
    When the user selects "Barcelona" as the destination
    And the user selects "21.06.2024" as the check-in date
    And the user selects "28.06.2024" as the check-out date
    And the user applies the filter for low availability
    Then the user should see a list of hotels in Barcelona with low availability
    And the user should be able to view details and book available rooms