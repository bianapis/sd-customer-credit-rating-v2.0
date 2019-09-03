package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateInitiateOutputModel
 */
public class CRCustomerCreditRatingStateInitiateOutputModel   {
  private String customerCreditRatingStateInstanceReference = null;

  private String customerCreditRatingStateInitiateActionReference = null;

  private Object customerCreditRatingStateInitiateActionRecord = null;

  private String customerCreditRatingStateInstanceStatus = null;

  private CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerCreditRatingStateInitiateActionReference
  **/

  public String getCustomerCreditRatingStateInitiateActionReference() {
    return customerCreditRatingStateInitiateActionReference;
  }

  public void setCustomerCreditRatingStateInitiateActionReference(String customerCreditRatingStateInitiateActionReference) {
    this.customerCreditRatingStateInitiateActionReference = customerCreditRatingStateInitiateActionReference;
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

  public CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


}

