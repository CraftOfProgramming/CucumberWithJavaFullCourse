package com.craftofprogramming;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:out/htmlReport.html"},
        glue = {"com.craftofprogramming"},
//        name = {"^Search a book given its title$"},
//        features = {"src/test/resources/com/craftofprogramming/ExampleWithScenarioOutline.feature",
//                    "src/test/resources/com/craftofprogramming/ExampleWithBasicBookQueries.feature"},
        features = {"src/test/resources/"},
//        tags = "@SMOKE"
//        tags = "@Smoke"
//        tags = "@Basic and @Smoke"
//        tags = "@Read or @Update"
        tags = "@Smoke and (not @Update) or @BuiltInParams or @AlternativeOptional"
)
public class RunCucumberTest {
}