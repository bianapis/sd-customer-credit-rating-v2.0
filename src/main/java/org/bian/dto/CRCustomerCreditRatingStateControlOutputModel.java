package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateControlOutputModel
 */
public class CRCustomerCreditRatingStateControlOutputModel   {
  private String customerCreditRatingStateControlActionTaskReference = null;

  private Object customerCreditRatingStateControlActionTaskRecord = null;

  private String customerCreditRatingStateControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Credit Rating State instance control processing service call 
   * @return customerCreditRatingStateControlActionTaskReference
  **/

  public String getCustomerCreditRatingStateControlActionTaskReference() {
    return customerCreditRatingStateControlActionTaskReference;
  }

  public void setCustomerCreditRatingStateControlActionTaskReference(String customerCreditRatingStateControlActionTaskReference) {
    this.customerCreditRatingStateControlActionTaskReference = customerCreditRatingStateControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerCreditRatingStateControlActionTaskRecord
  **/

  public Object getCustomerCreditRatingStateControlActionTaskRecord() {
    return customerCreditRatingStateControlActionTaskRecord;
  }

  public void setCustomerCreditRatingStateControlActionTaskRecord(Object customerCreditRatingStateControlActionTaskRecord) {
    this.customerCreditRatingStateControlActionTaskRecord = customerCreditRatingStateControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerCreditRatingStateControlActionResponse
  **/

  public String getCustomerCreditRatingStateControlActionResponse() {
    return customerCreditRatingStateControlActionResponse;
  }

  public void setCustomerCreditRatingStateControlActionResponse(String customerCreditRatingStateControlActionResponse) {
    this.customerCreditRatingStateControlActionResponse = customerCreditRatingStateControlActionResponse;
  }


}

