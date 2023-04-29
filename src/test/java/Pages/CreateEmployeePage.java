package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmployeePage extends CommonMethods {

   public CreateEmployeePage(){
    PageFactory.initElements(driver, this);

    }

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimTab;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmpBtn;

    @FindBy(id="firstName")
    public WebElement firstNameBox;

    @FindBy(id="middleName")
    public WebElement middleNameBox;


    @FindBy(id="lastName")
    public WebElement lastNameBox;


    @FindBy(xpath="//input[@id='chkLogin']")
    public WebElement loginBox;

    @FindBy(xpath="//input[@id='user_name']")
    public WebElement userNameBox;

    @FindBy(xpath="//input[@id='user_password']")
    public WebElement userPasswordBox;

    @FindBy(xpath="//input[@id='re_password']")
    public WebElement  rePasswordBox;

    @FindBy(xpath="//select[@id='status']")
    public WebElement  statusBox;

    @FindBy(xpath="//input[@id='btnSave']")
    public WebElement  btnSaveBox;
}
