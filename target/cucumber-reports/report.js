$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginAction.feature");
formatter.feature({
  "line": 2,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SMOKE"
    }
  ]
});
formatter.before({
  "duration": 635900,
  "status": "passed"
});
formatter.before({
  "duration": 206700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Perform Succcesfull Login",
  "description": "",
  "id": "login-action;perform-succcesfull-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SMOKE,"
    },
    {
      "line": 4,
      "name": "@FIRST"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User accepted cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"kondareddy.a@gmail.com\" and \"Password@7\" and performed login action",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User login is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginActionSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 12062566200,
  "status": "passed"
});
formatter.match({
  "location": "LoginActionSteps.user_accepted_cookies()"
});
formatter.result({
  "duration": 2168263300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kondareddy.a@gmail.com",
      "offset": 13
    },
    {
      "val": "Password@7",
      "offset": 42
    }
  ],
  "location": "LoginActionSteps.user_enters_and_and_performed_login_action(String,String)"
});
formatter.result({
  "duration": 6401649900,
  "status": "passed"
});
formatter.match({
  "location": "LoginActionSteps.user_login_is_successful()"
});
formatter.result({
  "duration": 5714021700,
  "status": "passed"
});
formatter.after({
  "duration": 150200,
  "status": "passed"
});
formatter.uri("LogoutAction.feature");
formatter.feature({
  "line": 2,
  "name": "Logout Action",
  "description": "",
  "id": "logout-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SMOKE"
    }
  ]
});
formatter.before({
  "duration": 273900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Perform Logout Action",
  "description": "",
  "id": "logout-action;perform-logout-action",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SMOKE,"
    },
    {
      "line": 4,
      "name": "@LAST"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User performed logout",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User logout is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LogoutActionSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 17751113200,
  "status": "passed"
});
formatter.match({
  "location": "LogoutActionSteps.user_performed_logout()"
});
formatter.result({
  "duration": 9139317300,
  "status": "passed"
});
formatter.match({
  "location": "LogoutActionSteps.user_logout_is_successful()"
});
formatter.result({
  "duration": 5781271600,
  "status": "passed"
});
formatter.after({
  "duration": 60600,
  "status": "passed"
});
formatter.after({
  "duration": 57300,
  "status": "passed"
});
});