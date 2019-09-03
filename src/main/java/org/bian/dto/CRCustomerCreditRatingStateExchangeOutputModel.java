package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateExchangeOutputModel
 */
public class CRCustomerCreditRatingStateExchangeOutputModel   {
  private String customerCreditRatingStateExchangeActionTaskReference = null;

  private Object customerCreditRatingStateExchangeActionTaskRecord = null;

  private String customerCreditRatingStateExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Credit Rating State instance exchange service call 
   * @return customerCreditRatingStateExchangeActionTaskReference
  **/

  public String getCustomerCreditRatingStateExchangeActionTaskReference() {
    return customerCreditRatingStateExchangeActionTaskReference;
  }

  public void setCustomerCreditRatingStateExchangeActionTaskReference(String customerCreditRatingStateExchangeActionTaskReference) {
    this.customerCreditRatingStateExchangeActionTaskReference = customerCreditRatingStateExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerCreditRatingStateExchangeActionTaskRecord
  **/

  public Object getCustomerCreditRatingStateExchangeActionTaskRecord() {
    return customerCreditRatingStateExchangeActionTaskRecord;
  }

  public void setCustomerCreditRatingStateExchangeActionTaskRecord(Object customerCreditRatingStateExchangeActionTaskRecord) {
    this.customerCreditRatingStateExchangeActionTaskRecord = customerCreditRatingStateExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerCreditRatingStateExchangeActionResponse
  **/

  public String getCustomerCreditRatingStateExchangeActionResponse() {
    return customerCreditRatingStateExchangeActionResponse;
  }

  public void setCustomerCreditRatingStateExchangeActionResponse(String customerCreditRatingStateExchangeActionResponse) {
    this.customerCreditRatingStateExchangeActionResponse = customerCreditRatingStateExchangeActionResponse;
  }


}

