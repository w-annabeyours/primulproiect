package org.example.testnd.tests;

import org.example.pom.DemoqaForm;
import org.example.utils.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest {
    static public WebDriver driver;
    public static String URI = "https://demoqa.com/automation-practice-form";
    public static String FIRST_NAME = "Anatol";
    public static String LAST_NAME = "Sneg";
    public static String EMAIL = "ex@gmail.com";
    public static String GENDER = "Male";
    public static String NUMBER = "1234567890";
    public static String DATE = "18 Apr 1999";
    public static String SUBJECT = "Maths";
    public static String HOBBY = "Music";

    @BeforeTest
    public void beforeTest() {
        driver = SeleniumDriver.getAutoLocalDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void formTest() {
        System.out.println("Start test");
        driver.get(URI);
        DemoqaForm form = new DemoqaForm(driver);
        form.setFirstName(FIRST_NAME);
        form.setLastName(LAST_NAME);
        form.setEmail(EMAIL);
        form.setGender(GENDER);
        form.setUserNumber(NUMBER);
        form.setDate(DATE);
        form.setSubject(SUBJECT);
        form.setHobby(HOBBY);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
