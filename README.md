# QA Automation CI Pipeline

![CI Pipeline](https://github.com/nuwanthikaishani/qa-automation-ci-pipeline/actions/workflows/ci.yml/badge.svg)

## Project Overview

This project demonstrates a simple QA automation CI pipeline using **Java**, **Maven**, **TestNG**, and **GitHub Actions**.

The main purpose of this project is to practice how automated tests can be executed automatically whenever code is pushed to GitHub.

## Technologies Used

* Java
* Maven
* TestNG
* GitHub Actions
* Git
* GitHub

## Project Structure

```text
qa-automation-ci-pipeline
│
├── .github
│   └── workflows
│       └── ci.yml
│
├── src
│   └── test
│       └── java
│           └── SampleTest.java
│
├── pom.xml
└── README.md
```

## Test Scenarios

This project includes simple automated test cases such as:

* Verify login page title
* Verify valid login test data
* Verify cart total calculation

These test cases are created for CI/CD learning and practice purposes.

## How to Run Tests Locally

Clone the repository:

```bash
git clone https://github.com/nuwanthikaishani/qa-automation-ci-pipeline.git
```

Go to the project folder:

```bash
cd qa-automation-ci-pipeline
```

Run the tests using Maven:

```bash
mvn clean test
```

## CI Pipeline

This project uses **GitHub Actions** to run automated tests.

The pipeline runs automatically when:

* Code is pushed to the `master` or `main` branch
* A pull request is created for the `master` or `main` branch

## CI Pipeline Steps

The GitHub Actions workflow performs the following steps:

1. Checkout the project code
2. Set up Java environment
3. Install Maven dependencies
4. Run TestNG automated tests
5. Upload test reports as build artifacts

## GitHub Actions Workflow

The workflow file is located at:

```text
.github/workflows/ci.yml
```

## Test Reports

After the pipeline runs, test reports are generated in:

```text
target/surefire-reports/
```

These reports are uploaded as GitHub Actions artifacts.

## Purpose of This Project

This project was created for self-learning and portfolio development.

By completing this project, I practiced:

* Creating a Maven test automation project
* Writing simple TestNG test cases
* Running tests locally
* Creating a GitHub repository
* Creating a GitHub Actions CI workflow
* Running automated tests through CI
* Viewing CI pipeline results in GitHub Actions

## Future Improvements

Planned improvements for this project:

* Add Selenium WebDriver tests
* Add API automation tests
* Add Allure reports
* Add test execution screenshots
* Add browser-based UI test execution in headless mode
* Add separate workflows for smoke and regression tests

## Author

Created by **Nuwanthika Ishani** as a QA automation and CI/CD practice project.
