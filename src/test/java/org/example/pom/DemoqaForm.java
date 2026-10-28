package org.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaForm {
    public static WebDriver driver;

    @FindBy(xpath = "//*[@id='firstName']")
    WebElement firstName;

    @FindBy(css = "#lastName")
    WebElement lastName;

    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="userNumber")
    WebElement userNumber;

    @FindBy(css="#dateOfBirthInput")
    WebElement date;

    @FindBy(id="subjectsInput")
    WebElement subjectsInput;



    public DemoqaForm(WebDriver driverParam) {
        driver = driverParam;
        PageFactory.initElements(driverParam, this);
    }

    public void setHobby(String hobbyParam) {
        driver.findElement(By.xpath("//*[@id='hobbiesWrapper']//label[text()='" + hobbyParam + "']/../input")).click();
    }

    public void setSubject(String subjectParam) {
        subjectsInput.clear();
        subjectsInput.sendKeys(subjectParam);
        subjectsInput.sendKeys(Keys.ENTER);
    }

    public void setDate(String dateParam) {
        date.sendKeys(Keys.CONTROL, "a");
        date.sendKeys(dateParam);
        date.sendKeys(Keys.ENTER);
    }

    public void setUserNumber(String numberParam) {

        userNumber.clear();
        userNumber.sendKeys(numberParam);
    }

    public void setGender(String genderParam){
        WebElement gender = driver.findElement(By.xpath("//*[@id='genterWrapper']//label[text()='" + genderParam + "']"));
        gender.click();
    }
    public void setEmail(String emailParam) {
        userEmail.clear();
        userEmail.sendKeys(emailParam);

    }

    public void setLastName(String lastNameParam) {
        lastName.clear();
        lastName.sendKeys(lastNameParam);
    }

    public void setFirstName(String firstNameParam) {
        firstName.clear();
        firstName.sendKeys(firstNameParam);
    }

}
