package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateInitiateInputModel
 */
public class CRCustomerCreditRatingStateInitiateInputModel   {
  private String customerCreditRatingServicingSessionReference = null;

  private Object customerCreditRatingStateInitiateActionRecord = null;

  private String customerCreditRatingStateInstanceStatus = null;

  private CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerCreditRatingStateInitiateActionRecord
  **/

  public Object getCustomerCreditRatingStateInitiateActionRecord() {
    return customerCreditRatingStateInitiateActionRecord;
  }

  public void setCustomerCreditRatingStateInitiateActionRecord(Object customerCreditRatingStateInitiateActionRecord) {
    this.customerCreditRatingStateInitiateActionRecord = customerCreditRatingStateInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Credit Rating State instance (e.g. initialised, pending, active) 
   * @return customerCreditRatingStateInstanceStatus
  **/

  public String getCustomerCreditRatingStateInstanceStatus() {
    return customerCreditRatingStateInstanceStatus;
  }

  public void setCustomerCreditRatingStateInstanceStatus(String customerCreditRatingStateInstanceStatus) {
    this.customerCreditRatingStateInstanceStatus = customerCreditRatingStateInstanceStatus;
  }


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


}

