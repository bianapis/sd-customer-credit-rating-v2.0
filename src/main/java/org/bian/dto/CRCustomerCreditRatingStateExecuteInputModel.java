package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.CRCustomerCreditRatingStateExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateExecuteInputModel
 */
public class CRCustomerCreditRatingStateExecuteInputModel   {
  private String customerCreditRatingServicingSessionReference = null;

  private String customerCreditRatingStateInstanceReference = null;

  private CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private Object customerCreditRatingStateExecuteActionTaskRecord = null;

  private CRCustomerCreditRatingStateExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerCreditRatingStateExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerCreditRatingStateExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

