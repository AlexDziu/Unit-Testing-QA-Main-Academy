package runnerTest;

import category.Regression;
import category.Smoke;
import mediumTests.MediumTestClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import simpleTests.SimpleTestClass;

@RunWith(Categories.class)
@Categories.IncludeCategory({Smoke.class, Regression.class})
@Suite.SuiteClasses({SimpleTestClass.class, MediumTestClass.class})
public class RunnerTestClass {

}

