$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vanmai/Documents/clothes-katalon/Include/features/TES-1 Login into website.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on login pgae",
  "keyword": "Given "
});
formatter.match({
  "location": "AllSteps.user_is_on_login_pagee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username",
  "keyword": "When "
});
formatter.match({
  "location": "AllSteps.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "And "
});
formatter.match({
  "location": "AllSteps.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "AllSteps.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can be login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AllSteps.user_login_successfully()"
});
formatter.result({
  "status": "passed"
});
});