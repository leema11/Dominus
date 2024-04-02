package runnerClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import baseClass.BaseNew;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\featureClass\\newfolder.feature", glue="stepClass", dryRun = false)
public class runnerNew  extends BaseNew{
	@BeforeClass
	public static void start() {
		Bowserlaunch();
		toMaximize();
		
		
	}
	
	public static void end() {
		
		quit();
		
	}

}
