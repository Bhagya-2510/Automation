package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewListingLocators {

	public NewListingLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "addNewListingButton")
	public WebElement newListingButton; 
    
    @FindBy(xpath="//div[contains(text(),'ACTIVE')")
    public WebElement statusOption;
 	   
    @FindBy(xpath="(//input[contains(@class,'placeholderText placeholderText-default')])[1]")
    public WebElement StatusDropdown;
    
    @FindBy(xpath="//div[@role='presentation' and @data-ref = 'bodyEl']/div/div/input[@data-ref='inputEl' and @maxlength=\"14\"]")
    public WebElement listPrice;
       
    @FindBy(xpath="//span[contains(text(),'Listing Agreement Type')]")
    public WebElement listingAgreementTypeDropdown;
    
    @FindBy(xpath="//div[contains(text(),'Exclusive Agency')]")
    public WebElement listingAgreementOption;
    
    @FindBy(xpath="(//span[contains(text(),'Listing Agreement')])[1]")
    public WebElement listingAgreement;
    
    @FindBy(xpath="(//div[@data-ref='bodyEl']/div[@data-ref='triggerWrap']/div[@data-ref='inputWrap']/input[@maxlength='25'])[2]")
    public WebElement streetNumberModifier;
    
    @FindBy(xpath="(//input[@title='Expected date format m-d-Y.'])[1]")
    public WebElement listingTermBegins;
    
    @FindBy(xpath="//span[text()='Expiration Date']/following::input[1]")
    public WebElement expirationDate;
    
    @FindBy(xpath="//span[text()='Ownership Interest']/following::input[1]")
    public WebElement ownershipInterest;
    
    @FindBy(xpath="//span[contains(text(),'Short Sale')]")
    public WebElement shortsaleheader;
    
    @FindBy(xpath="//span[contains(text(),'Short Sale')]/following::input[2]")
    public WebElement shortsaleRadiobutton;
    
    @FindBy(xpath="//span[contains(text(),'REO (Real Estate Owned) Y/N')]/following::input[2]")
    public WebElement ReoNo;
    
    @FindBy(xpath="//span[text()='Sale Type']")
    public WebElement saleType;
    
    @FindBy(xpath="//ul[@class='x-list-plain']/div[@class='x-boundlist-item enabled']/div[@class='picklistLabel' and contains(text(),'Standard')]")
    public WebElement saleTypeOption;
    
    @FindBy(xpath="//span[contains(text(),'Listing Terms')]")
    public WebElement listingTerms;
    
    @FindBy(xpath="//span[contains(text(),'Prospects Excluded Y/N')]/following::input[2]")
    public WebElement prospectsIncluded;
    
    @FindBy(xpath="//span[text()='Listing Service Type']")
    public WebElement listingServiceType;
    
    @FindBy(xpath="//ul[@class='x-list-plain']/div[@class='x-boundlist-item enabled']/div[contains(text(),'Entry Only')]")
    public WebElement listingServiceTypeOption;
    
    @FindBy(xpath="//span[contains(text(),'Dual Agency Y/N')]/following::input[2]")
    public WebElement dualAgencyNo;
    
    @FindBy(xpath="//span[contains(text(),'Other Equipment')]")
    public WebElement otherEquipment;
    
    @FindBy(xpath="//span[text()='Possession']")
    public WebElement possesion;
    
    @FindBy(xpath="//div[@class='x-boundlist-item enabled']/div[contains(text(),'Immediate')]")
   // @FindBy(xpath="//span[text()='Possession']/following::input[1]")
    public WebElement possesionDropdown;
    
    @FindBy(xpath="//span[contains(text(),'Buyer Agency Compensation Selection')]/following::input[1]")
    public WebElement buyerAgencyCompensation;
    
    @FindBy(xpath="(//div[@class='picklistLabel' and text()='Dollar Amount'])[2]|(//div[@class='picklistLabel' and text()='Dollar Amount'])")
    public WebElement buyerAgencyOption;
    
    @FindBy(xpath="//div[@class[contains(.,'dollar')]]//input[1]")
    public WebElement buyerAgencydollarField;
    
    @FindBy(xpath="//span[contains(text(),'Sub Agency Compensation Selection')]/following::input[1]")
    public WebElement subAgencyCompensation;
    
    @FindBy(xpath="(//div[@class='picklistLabel' and text()='Dollar Amount'])[2]")
    public WebElement subAgencyCompensationOption;
    
    @FindBy(xpath="//div[@class[contains(.,'SubAgencyCompensation dollar')]]//input[1]")
    public WebElement SubAgencyCompensationdollarField;    
    
    @FindBy(xpath="//span[contains(text(),'Transaction Broker Compensation Selection')]/following::input[1]")
    public WebElement transactionBrokerCompensation;
    
    @FindBy(xpath="(//div[@class='picklistLabel' and text()='Dollar Amount'])[2]")
    public WebElement transactionBrokerOption;
    
   @FindBy(xpath="//div[@class[contains(.,'TransactionBrokerCompensation dollar')]]//input[1]")
   public WebElement TransactionBrokerCompensationDollarField;
    
   @FindBy(xpath="//span[contains(text(),'Dual Variable Compensation Y/N')]/following::input[2]")
   public WebElement dualVariableCompensation;
   
   @FindBy(xpath="//span[contains(text(),'Location')]")
   public WebElement location;
   
   @FindBy(xpath="(//div[@data-ref='triggerWrap']/div[@data-ref='inputWrap']/following::input)[6]")
   public WebElement streetNumber;
   
   @FindBy(xpath="//span[contains(text(),'Street Direction Suffix')]")
   public WebElement streetDirectionSuffix;
   
   @FindBy(xpath="(//div[@class[contains(.,'textarea')]]/textarea)[1]")
   public WebElement directions;
   
   @FindBy(xpath="//span[contains(text(),'Area & Schools')]")
   public WebElement areasAndSchool;
   
   @FindBy(xpath="//div[@class[contains(.,'SubdivisionName')]]/div/div/div/input")
   public WebElement subDivision;
   
   @FindBy(xpath="//span[contains(text(),'Association/Community')]")
   public WebElement associationCommunity;
   
   @FindBy(xpath="//span[contains(text(),'HOA Y/N')]/following::input[2]")
   public WebElement hoaNo;
   
   @FindBy(xpath="//span[contains(text(),'Condo/Coop Association Y/N')]/following::input[2]")
   public WebElement condoCoopAssociation;
   
   @FindBy(xpath="//span[contains(text(),'HOA/Condo/Coop Amenities')]")
   public WebElement hoaCondoCoopAmenities;
   
   @FindBy(xpath="//span[contains(text(),'Senior Community Y/N')]/following::input[2]")
   public WebElement seniorCommunity;
   
   @FindBy(xpath="//span[contains(text(),'Taxes')]")
   public WebElement taxes;
   
   @FindBy(xpath="//div[@class[contains(.,'TaxAssessmentAmount')]]/div/div/div/input")
   public WebElement taxAssessedValue;
   
   @FindBy(xpath="//span[contains(text(),'Tax Bill')]")
   public WebElement taxBill;
   
   @FindBy(xpath="//span[contains(text(),'Municipal Trash Y/N')]")
   public WebElement municiaplTrashPayement;
   
   @FindBy(xpath="//div[@class[contains(.,'TaxYear')]]/div/div/div/input")
   public WebElement taxYear;
   
   @FindBy(xpath="//div[@class[contains(.,'TaxAnnualAmount')]]/div/div/div/input")
   public WebElement taxAnnualAmount;
   
   @FindBy(xpath="//span[contains(text(),'Building & Utilities')]")
   public WebElement buildingAndUtility;
   
   @FindBy(xpath="//span[contains(text(),'New Construction Y/N')]/following::input[2]")
   public WebElement newConstruction;
   
   @FindBy(xpath="//div[@class[contains(.,'YearBuilt')]]/div/div/div/input")
   public WebElement yearBuilt;
   
   @FindBy(xpath="//span[contains(text(),'Structure Type')]")
   public WebElement structureType;
   
   @FindBy(xpath="//div[@class='picklistLabel' and text()='Detached']")
   public WebElement structureTypeOption;
   
   @FindBy(xpath="//span[contains(text(),'Style')]")
   public WebElement style;
   
   @FindBy(xpath="//div[@class='picklistLabel' and text()='A-Frame']")
   public WebElement styleOption;
   
   @FindBy(xpath="//span[contains(text(),'Construction Materials')]")
   public WebElement constructionMaterials;
   
   @FindBy(xpath="//div[@class='picklistLabel' and text()='Brick']")
   public WebElement constructionMaterialOption;
   
   @FindBy(xpath="//span[contains(text(),'Construction Details')]")
   public WebElement constructionDetails;
   
   @FindBy(xpath="//span[contains(text(),'Flooring Type')]")
   public WebElement flooringType;
   
   @FindBy(xpath="//div[@class[contains(.,'Levels')]]/div/div/div/input")
   public WebElement levelsAndStories;
   
   @FindBy(xpath="(//span[contains(text(),'Utilities')])[2]")
   public WebElement utilities;
   
   @FindBy(xpath="//span[contains(text(),'Water Source')]")
   public WebElement waterSource;
   
   @FindBy(xpath="//div[@class='picklistLabel' and text()='Cistern']")
   public WebElement waterSourceOption;
   
   @FindBy(xpath="//span[contains(text(),'Sewer Septic')]")
   public WebElement sewerSeptic;
   
   @FindBy(xpath="//div[@class='picklistLabel' and text()='Aerobic Septic']")
   public WebElement sewerSepticOption;
   
    @FindBy(xpath="//span[contains(text(),'Electric Service')]")
    public WebElement electricService;
    
    @FindBy(xpath="//span[contains(text(),'Hot Water')]")
    public WebElement hotWater;
    
    @FindBy(xpath="//div[@class='picklistLabel' and text()='60+ Gallon Tank']")
    public WebElement hotWaterOption;
    
    @FindBy(xpath="//span[contains(text(),'Cooling Type')]")
    public WebElement coolingType;
    
    @FindBy(xpath="//div[@class='picklistLabel' and text()='Ceiling Fan(s)']")
    public WebElement coolingTypeOption;
    
    @FindBy(xpath="//span[contains(text(),'Cooling Fuel')]")
    public WebElement coolingFuel;
    
    @FindBy(xpath="(//div[@class='picklistLabel' and text()='Geothermal'])[2]")
    public WebElement coolingFuelOption;
  
    @FindBy(xpath="//span[contains(text(),'Heating Type')]")
    public WebElement heatingType;
    
    @FindBy(xpath="(//div[@class='picklistLabel' and text()='Energy Star Heating System'])")
    public WebElement heatingTypeOption;
    
    @FindBy(xpath="//span[contains(text(),'Heating Fuel')]")
    public WebElement heatingFuel;
    
    @FindBy(xpath="(//div[@class='picklistLabel' and text()='Oil'])")
    public WebElement heatingFuelOption;
    
    @FindBy(xpath="//span[contains(text(),'Basement and Foundation')]")
    public WebElement basementAndFoundation;
    
    @FindBy(xpath="//span[contains(text(),'Basement Y/N')]/following::input[2]")
    public WebElement basementAndFoundationRadio;
    
    @FindBy(xpath="//span[contains(text(),'Foundation Details')]")
    public WebElement FoundationDetails;
  
    @FindBy(xpath="(//div[@class='picklistLabel' and text()='Active Radon Mitigation'])")
    public WebElement FoundationDetailsOption;
    
    @FindBy(xpath="//span[contains(text(),'Features & Rooms')]")
    public WebElement featuresAndRooms;
    
    @FindBy(xpath="//div[@class[contains(.,'MainLevelBedrooms')]]/div/div/div/input")
    public WebElement bed;
  
    @FindBy(xpath="//div[@class[contains(.,'MainLevelFullBaths')]]/div/div/div/input")
    public WebElement baths;
    
    @FindBy(xpath="//span[contains(text(),'Interior Features')]")
    public WebElement interiorFeatures;
 
    @FindBy(xpath=" //span[contains(text(),'Accessibility Features')]")
    public WebElement assessbilityFeatures;
    
    @FindBy(xpath="//div[@class='picklistLabel' and text()='2+ Access Exits']")
    public WebElement assessbilityFeaturesOption;
    
    @FindBy(xpath="//span[contains(text(),'Exterior Features')]")
    public WebElement exteriorFeatures;
    
    @FindBy(xpath="//span[contains(text(),'Pool')]")
    public WebElement pool;
    
    @FindBy(xpath="//div[@class='picklistLabel' and text()='Yes - Community']")
    public WebElement poolOption;
    
    @FindBy(xpath="//span[contains(text(),'Lot & Parking')]")
    public WebElement lotAndParking;
    
    @FindBy(xpath="(//span[contains(text(),'Parking')])[2]")
    public WebElement parking;
    
    @FindBy(xpath="//span[contains(text(),'Type Of Parking')]")
    public WebElement typeOfParking;
    
    @FindBy(xpath="//div[@class='picklistLabel' and text()='Alley']")
    public WebElement typeOfParkingOption;
    
    @FindBy(xpath="//span[contains(text(),'Photos & Tours')]")
    public WebElement photosAndTour;
    
    @FindBy(xpath="//span[contains(text(),'Photo Option')]")
    public WebElement photoOption;
    
    @FindBy(xpath="//div[@class='picklistLabel' and text()='Lister Will Upload All']")
    public WebElement listerUpload;
    
    @FindBy(xpath="(//span[contains(text(),'Showing')])[1]")
    public WebElement showing;
    
    @FindBy(xpath="//span[contains(text(),'Showing Requirements')]")
    public WebElement showingRequirements;
    		
    @FindBy(xpath="//div[@class='picklistLabel' and text()='1 Hour Notice']")
     public WebElement showingRequirementsOption;	
 
    @FindBy(xpath="//span[contains(text(),'Showing Contact')]")
    public WebElement showingContctHeader;
    
    @FindBy(xpath="//span[contains(text(),'Showing Method')]")
    public WebElement showingMethod;
    		
    @FindBy(xpath="//div[@class='picklistLabel' and text()='In-Person Only']")
     public WebElement showingMethodOption;	
    
    @FindBy(xpath="//span[contains(text(),'Showing Contact Type')]")
    public WebElement showingContactType;
    		
    @FindBy(xpath="//div[@class='picklistLabel' and text()='Showing Contact 1']")
     public WebElement showingContactTypeOption;	
    
    @FindBy(xpath="//div[@class[contains(.,'ShowingContactName')]]/div/div/div/input")
    public WebElement showingContactName;
    		
    @FindBy(xpath="//div[@class[contains(.,'ShowingContactPhone')]]/div/div/div/input")
     public WebElement showingContactPhoneNumber;	
    
    @FindBy(xpath="//span[contains(text(),'Lockbox')]")
    public WebElement lockBox;
    
    @FindBy(xpath="//span[contains(text(),'Lock Box Type')]")
    public WebElement lockBoxType;
    
    @FindBy(xpath="//div[@class='picklistLabel' and text()='Combo']")
    public WebElement lockBoxTypeOption;
  
    
}
