package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateExchangeInputModelCustomerCreditRatingStateExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateExchangeInputModel
 */
public class CRCustomerCreditRatingStateExchangeInputModel   {
  private String customerCreditRatingServicingSessionReference = null;

  private String customerCreditRatingStateInstanceReference = null;

  private Object customerCreditRatingStateExchangeActionTaskRecord = null;

  private CRCustomerCreditRatingStateExchangeInputModelCustomerCreditRatingStateExchangeActionRequest customerCreditRatingStateExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCreditRatingServicingSessionReference
  **/

  public String getCustomerCreditRatingServicingSessionReference() {
    return customerCreditRatingServicingSessionReference;
  }

  public void setCustomerCreditRatingServicingSessionReference(String customerCreditRatingServicingSessionReference) {
    this.customerCreditRatingServicingSessionReference = customerCreditRatingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Credit Rating State instance 
   * @return customerCreditRatingStateInstanceReference
  **/

  public String getCustomerCreditRatingStateInstanceReference() {
    return customerCreditRatingStateInstanceReference;
  }

  public void setCustomerCreditRatingStateInstanceReference(String customerCreditRatingStateInstanceReference) {
    this.customerCreditRatingStateInstanceReference = customerCreditRatingStateInstanceReference;
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
   * Get customerCreditRatingStateExchangeActionRequest
   * @return customerCreditRatingStateExchangeActionRequest
  **/

  public CRCustomerCreditRatingStateExchangeInputModelCustomerCreditRatingStateExchangeActionRequest getCustomerCreditRatingStateExchangeActionRequest() {
    return customerCreditRatingStateExchangeActionRequest;
  }

  public void setCustomerCreditRatingStateExchangeActionRequest(CRCustomerCreditRatingStateExchangeInputModelCustomerCreditRatingStateExchangeActionRequest customerCreditRatingStateExchangeActionRequest) {
    this.customerCreditRatingStateExchangeActionRequest = customerCreditRatingStateExchangeActionRequest;
  }


}

