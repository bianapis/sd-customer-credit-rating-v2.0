package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord
 */
public class CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord   {
  private String customerCreditRatingState = null;

  private String customerCreditRatingAssessment = null;

  private String customerCreditRatingNarrative = null;

  private String customerCreditRatingDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Is the current credit rating or score (typically a ranking value e.g. 1-10) 
   * @return customerCreditRatingState
  **/

  public String getCustomerCreditRatingState() {
    return customerCreditRatingState;
  }

  public void setCustomerCreditRatingState(String customerCreditRatingState) {
    this.customerCreditRatingState = customerCreditRatingState;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any underlying analysis records and results that support the credit rating 
   * @return customerCreditRatingAssessment
  **/

  public String getCustomerCreditRatingAssessment() {
    return customerCreditRatingAssessment;
  }

  public void setCustomerCreditRatingAssessment(String customerCreditRatingAssessment) {
    this.customerCreditRatingAssessment = customerCreditRatingAssessment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A structured report outlining basis for the credit rating 
   * @return customerCreditRatingNarrative
  **/

  public String getCustomerCreditRatingNarrative() {
    return customerCreditRatingNarrative;
  }

  public void setCustomerCreditRatingNarrative(String customerCreditRatingNarrative) {
    this.customerCreditRatingNarrative = customerCreditRatingNarrative;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the value was last refreshed 
   * @return customerCreditRatingDate
  **/

  public String getCustomerCreditRatingDate() {
    return customerCreditRatingDate;
  }

  public void setCustomerCreditRatingDate(String customerCreditRatingDate) {
    this.customerCreditRatingDate = customerCreditRatingDate;
  }


}

