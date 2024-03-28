# Triangle

Triangle is an example program for a [software testing exercise](ASSIGNMENT.md) that focuses on
unit testing and test effectiveness, using code coverage criteria.

#### How to run Triangle tests from the terminal

Run these commands from the Triangle root directory,
which contains the `build.gradle` build file.

1. Run `./gradlew test` to run the tests and compute coverage results.

2. View the coverage report.
    * If you are running on a UW CSE machine such as attu, you will find the report at
      https://homes.cs.washington.edu/~$USER/jacoco_report , where $USER is your CSE NetID.
    * Otherwise, find the report in file
      `build/reports/jacoco/test/html/index.html`
