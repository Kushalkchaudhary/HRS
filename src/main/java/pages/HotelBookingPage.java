package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HotelBookingPage {

        private WebDriver driver;

        public HotelBookingPage() {
            // Initialize WebDriver
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        public void navigateToBookingPortal() {
            // Navigate to the HRS booking portal URL
            driver.get("https://www.hrs.de/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
        }

        public void activateDestination(){
            WebElement destinaion = driver.findElement(By.xpath("//span[text()='Ort, Hotel, Region, Adresse, PLZ']"));
            destinaion.click();
        }
        public void selectDestination(String destination) {
            // Locate and select the destination input field
            WebElement destinationInput = driver.findElement(By.id("DestinationSearchInput"));
            destinationInput.sendKeys(destination);
        }

        public void selectCheckInDate(String checkInDate) {
            // Locate and select the check-in date input field
            WebElement checkInDateInput = driver.findElement(By.xpath("//div[@data-test='DateRangeInputField_date']"));
            checkInDateInput.sendKeys(checkInDate);
        }

        public void selectCheckOutDate(String checkOutDate) {
            // Locate and select the check-out date input field
            WebElement checkOutDateInput = driver.findElement(By.id("checkOutDateInput"));
            checkOutDateInput.sendKeys(checkOutDate);
        }

        public void applyLowAvailabilityFilter() {
            // Locate and click on the low availability filter checkbox
            WebElement lowAvailabilityFilterCheckbox = driver.findElement(By.id("lowAvailabilityFilter"));
            lowAvailabilityFilterCheckbox.click();
        }

        public void verifyHotelsWithLowAvailability() {
            // Verify that hotels with low availability are displayed
            // Implementation code here
        }

        public void viewAndBookAvailableRooms() {
            // Locate and click on available rooms for booking
            // Implementation code here
        }
    }
