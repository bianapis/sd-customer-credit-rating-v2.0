package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRequestOutputModel
 */
public class CRCustomerCreditRatingStateRequestOutputModel   {
  private CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private String customerCreditRatingStateRequestActionTaskReference = null;

  private Object customerCreditRatingStateRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Credit Rating State instance request service call 
   * @return customerCreditRatingStateRequestActionTaskReference
  **/

  public String getCustomerCreditRatingStateRequestActionTaskReference() {
    return customerCreditRatingStateRequestActionTaskReference;
  }

  public void setCustomerCreditRatingStateRequestActionTaskReference(String customerCreditRatingStateRequestActionTaskReference) {
    this.customerCreditRatingStateRequestActionTaskReference = customerCreditRatingStateRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCreditRatingStateRequestActionTaskRecord
  **/

  public Object getCustomerCreditRatingStateRequestActionTaskRecord() {
    return customerCreditRatingStateRequestActionTaskRecord;
  }

  public void setCustomerCreditRatingStateRequestActionTaskRecord(Object customerCreditRatingStateRequestActionTaskRecord) {
    this.customerCreditRatingStateRequestActionTaskRecord = customerCreditRatingStateRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

