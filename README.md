# MobileFramework

MobileFramework is a mobile automation testing framework built using Java, Appium, and Cucumber. It leverages TestNG for test execution and ExtentReports for comprehensive reporting.

## Features

*   **Appium**: Support for mobile application automation (Android/iOS).
*   **Cucumber (BDD)**: Write tests in plain English using Gherkin syntax.
*   **TestNG**: Robust test runner and configuration.
*   **ExtentReports**: Rich HTML reporting for test results.

## Prerequisites

Before you begin, ensure you have the following installed:

*   **Java Development Kit (JDK) 21**
*   **Maven**
*   **Appium Server**
*   **Android Studio / SDK** (for Android automation)
*   **Xcode** (for iOS automation - macOS only)

## Installation

1.  Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2.  Navigate to the project directory:
    ```bash
    cd MobileFramework
    ```
3.  Install dependencies:
    ```bash
    mvn clean install -DskipTests
    ```

## Running Tests

To run the tests, use the following Maven command:

```bash
mvn test
```

You can also run specific test suites or Cucumber features if configured in your `pom.xml` or TestNG XML files.

## Reporting

After the test execution, ExtentReports will generate an HTML report. You can typically find it in the `test-output` or a configured reports directory (e.g., `target/spark-reports`).

## Dependencies

Key dependencies used in this project:

*   `io.appium:java-client`
*   `io.cucumber:cucumber-java`
*   `io.cucumber:cucumber-testng`
*   `org.testng:testng`
*   `tech.grasshopper:extentreports-cucumber7-adapter`

## License

[Add License Information Here]
