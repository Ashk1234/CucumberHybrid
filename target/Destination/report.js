$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testing.feature");
formatter.feature({
  "line": 2,
  "name": "Verify the login functionality of Rediff mail",
  "description": "",
  "id": "verify-the-login-functionality-of-rediff-mail",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Functional"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify user should login with valid username and pwd",
  "description": "",
  "id": "verify-the-login-functionality-of-rediff-mail;verify-user-should-login-with-valid-username-and-pwd",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User should be able to lunch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the Correct user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "capture the title of application",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo.user_should_be_able_to_lunch_the_application()"
});
formatter.result({
  "duration": 22569960376,
  "status": "passed"
});
formatter.match({
  "location": "Demo.enter_the_Correct_user_name_and_password()"
});
formatter.result({
  "duration": 9970111246,
  "status": "passed"
});
formatter.match({
  "location": "Demo.click_on_Login_button()"
});
formatter.result({
  "duration": 4858326370,
  "status": "passed"
});
formatter.match({
  "location": "Demo.capture_the_title_of_application()"
});
formatter.result({
  "duration": 6328647584,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify the create new account is clickable",
  "description": "",
  "id": "verify-the-login-functionality-of-rediff-mail;verify-the-create-new-account-is-clickable",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User should be able to lunch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Click on create new account",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "capture the title of application",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo.user_should_be_able_to_lunch_the_application()"
});
formatter.result({
  "duration": 7216554384,
  "status": "passed"
});
formatter.match({
  "location": "Demo.click_on_create_new_account()"
});
formatter.result({
  "duration": 1808428960,
  "status": "passed"
});
formatter.match({
  "location": "Demo.capture_the_title_of_application()"
});
formatter.result({
  "duration": 81170422,
  "status": "passed"
});
});