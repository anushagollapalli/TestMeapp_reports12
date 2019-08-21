package cucumber_new_project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\selenium workspace\\project5\\Feature456\\mytest999.feature",glue="cucumber_new_project",plugin= {"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})

public class runnerclass123 {

}
