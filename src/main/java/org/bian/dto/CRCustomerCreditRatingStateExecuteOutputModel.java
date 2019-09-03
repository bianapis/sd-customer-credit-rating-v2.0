package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateExecuteOutputModel
 */
public class CRCustomerCreditRatingStateExecuteOutputModel   {
  private CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private String customerCreditRatingStateExecuteActionTaskReference = null;

  private Object customerCreditRatingStateExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Credit Rating State instance execute service call 
   * @return customerCreditRatingStateExecuteActionTaskReference
  **/

  public String getCustomerCreditRatingStateExecuteActionTaskReference() {
    return customerCreditRatingStateExecuteActionTaskReference;
  }

  public void setCustomerCreditRatingStateExecuteActionTaskReference(String customerCreditRatingStateExecuteActionTaskReference) {
    this.customerCreditRatingStateExecuteActionTaskReference = customerCreditRatingStateExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerCreditRatingStateExecuteActionTaskRecord
  **/

  public Object getCustomerCreditRatingStateExecuteActionTaskRecord() {
    return customerCreditRatingStateExecuteActionTaskRecord;
  }

  public void setCustomerCreditRatingStateExecuteActionTaskRecord(Object customerCreditRatingStateExecuteActionTaskRecord) {
    this.customerCreditRatingStateExecuteActionTaskRecord = customerCreditRatingStateExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

