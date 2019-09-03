package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord
 */
public class CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord   {
  private String customerCreditRatingStateInstanceReportReference = null;

  private String customerCreditRatingStateInstanceReportType = null;

  private String customerCreditRatingStateInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerCreditRatingStateInstanceReportReference
  **/

  public String getCustomerCreditRatingStateInstanceReportReference() {
    return customerCreditRatingStateInstanceReportReference;
  }

  public void setCustomerCreditRatingStateInstanceReportReference(String customerCreditRatingStateInstanceReportReference) {
    this.customerCreditRatingStateInstanceReportReference = customerCreditRatingStateInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCreditRatingStateInstanceReportType
  **/

  public String getCustomerCreditRatingStateInstanceReportType() {
    return customerCreditRatingStateInstanceReportType;
  }

  public void setCustomerCreditRatingStateInstanceReportType(String customerCreditRatingStateInstanceReportType) {
    this.customerCreditRatingStateInstanceReportType = customerCreditRatingStateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerCreditRatingStateInstanceReportParameters
  **/

  public String getCustomerCreditRatingStateInstanceReportParameters() {
    return customerCreditRatingStateInstanceReportParameters;
  }

  public void setCustomerCreditRatingStateInstanceReportParameters(String customerCreditRatingStateInstanceReportParameters) {
    this.customerCreditRatingStateInstanceReportParameters = customerCreditRatingStateInstanceReportParameters;
  }


}

