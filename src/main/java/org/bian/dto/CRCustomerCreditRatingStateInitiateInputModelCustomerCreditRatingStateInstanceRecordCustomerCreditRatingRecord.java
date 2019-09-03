package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord
 */
public class CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord   {
  private String customerCreditRatingDate = null;


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

