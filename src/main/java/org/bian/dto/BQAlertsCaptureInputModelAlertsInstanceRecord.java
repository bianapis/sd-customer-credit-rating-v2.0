package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertsCaptureInputModelAlertsInstanceRecord
 */
public class BQAlertsCaptureInputModelAlertsInstanceRecord   {
  private String productInstanceReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerCreditAlertType = null;

  private String customerCreditAlertDescription = null;

  private String date = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The product/service instance that generated the alert 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The individual source of the alert - if not automated by production 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of alert (e.g. missed payment, limit breach) 
   * @return customerCreditAlertType
  **/

  public String getCustomerCreditAlertType() {
    return customerCreditAlertType;
  }

  public void setCustomerCreditAlertType(String customerCreditAlertType) {
    this.customerCreditAlertType = customerCreditAlertType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the event behind the notification 
   * @return customerCreditAlertDescription
  **/

  public String getCustomerCreditAlertDescription() {
    return customerCreditAlertDescription;
  }

  public void setCustomerCreditAlertDescription(String customerCreditAlertDescription) {
    this.customerCreditAlertDescription = customerCreditAlertDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time of the notification 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


}

