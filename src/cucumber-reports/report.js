$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/CaseStudy.feature");
formatter.feature({
  "name": "TestmeApp Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": ":url of the TestmeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "CaseStudyLogindef.url_of_the_TestmeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": user enters the data for LoginPage",
  "keyword": "When "
});
formatter.match({
  "location": "CaseStudyLogindef.user_enters_the_data_for_LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ":user is Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudyLogindef.user_is_Login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});