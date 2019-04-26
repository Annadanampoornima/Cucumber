package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CaseStudyLogin {
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement loginbutton;
	@FindBy(how=How.CSS,using="div[class='btn-group']")
	public static WebElement addproduct;
	@FindBy(how=How.CSS,using="option[value='11290']")
	public static WebElement categoryname;
	@FindBy(how=How.CSS,using="option[value='112101']")
	public static WebElement subcategoryname;
	@FindBy(how=How.ID,using="prodid")
	public static WebElement productname;
	@FindBy(how=How.ID,using="priceid")
	public static WebElement priceid;
	@FindBy(how=How.ID,using="quantityid")
	public static WebElement Quality;
	@FindBy(how=How.ID,using="brandid")
	public static WebElement brand;
	@FindBy(how=How.ID,using="description")
	public static WebElement description;
	@FindBy(how=How.CSS,using="input[class='form-control image-preview-filename']")
	public static WebElement fileupload;
	@FindBy(how=How.CSS,using="input[name='Add Product']")
	public static WebElement addproduct1;
}


