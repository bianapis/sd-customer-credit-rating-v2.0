package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateRequestInputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.CRCustomerCreditRatingStateRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRequestInputModel
 */
public class CRCustomerCreditRatingStateRequestInputModel   {
  private String customerCreditRatingServicingSessionReference = null;

  private String customerCreditRatingStateInstanceReference = null;

  private CRCustomerCreditRatingStateRequestInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private Object customerCreditRatingStateRequestActionTaskRecord = null;

  private CRCustomerCreditRatingStateRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerCreditRatingStateRequestInputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(CRCustomerCreditRatingStateRequestInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerCreditRatingStateRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerCreditRatingStateRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

