package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierarchyExample {
  @Test
  public void test() {
	  System.out.println("Iam a test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Iam a before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Iam a After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Iam a before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Iam a After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Iam a before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Iam a after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Iam a before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Iam a after suite");
  }

}
