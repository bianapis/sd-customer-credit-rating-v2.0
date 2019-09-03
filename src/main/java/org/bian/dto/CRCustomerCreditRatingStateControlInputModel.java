package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateControlInputModelCustomerCreditRatingStateControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateControlInputModel
 */
public class CRCustomerCreditRatingStateControlInputModel   {
  private String customerCreditRatingServicingSessionReference = null;

  private String customerCreditRatingStateInstanceReference = null;

  private Object customerCreditRatingStateControlActionTaskRecord = null;

  private CRCustomerCreditRatingStateControlInputModelCustomerCreditRatingStateControlActionRequest customerCreditRatingStateControlActionRequest = null;


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
   * Get customerCreditRatingStateControlActionRequest
   * @return customerCreditRatingStateControlActionRequest
  **/

  public CRCustomerCreditRatingStateControlInputModelCustomerCreditRatingStateControlActionRequest getCustomerCreditRatingStateControlActionRequest() {
    return customerCreditRatingStateControlActionRequest;
  }

  public void setCustomerCreditRatingStateControlActionRequest(CRCustomerCreditRatingStateControlInputModelCustomerCreditRatingStateControlActionRequest customerCreditRatingStateControlActionRequest) {
    this.customerCreditRatingStateControlActionRequest = customerCreditRatingStateControlActionRequest;
  }


}

