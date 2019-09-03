package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord;
import org.bian.dto.CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord
 */
public class CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord   {
  private String customerReference = null;

  private String customerCreditRatingStatusType = null;

  private String customerCreditRatingSchedule = null;

  private CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord customerCreditRatingAssessmentRecord = null;

  private CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord customerCreditRatingRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of credit status being monitored (e.g. consumer, small business, corporate) 
   * @return customerCreditRatingStatusType
  **/

  public String getCustomerCreditRatingStatusType() {
    return customerCreditRatingStatusType;
  }

  public void setCustomerCreditRatingStatusType(String customerCreditRatingStatusType) {
    this.customerCreditRatingStatusType = customerCreditRatingStatusType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for refreshing the credit state and supporting analysis, and update history as appropriate 
   * @return customerCreditRatingSchedule
  **/

  public String getCustomerCreditRatingSchedule() {
    return customerCreditRatingSchedule;
  }

  public void setCustomerCreditRatingSchedule(String customerCreditRatingSchedule) {
    this.customerCreditRatingSchedule = customerCreditRatingSchedule;
  }


  /**
   * Get customerCreditRatingAssessmentRecord
   * @return customerCreditRatingAssessmentRecord
  **/

  public CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord getCustomerCreditRatingAssessmentRecord() {
    return customerCreditRatingAssessmentRecord;
  }

  public void setCustomerCreditRatingAssessmentRecord(CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord customerCreditRatingAssessmentRecord) {
    this.customerCreditRatingAssessmentRecord = customerCreditRatingAssessmentRecord;
  }


  /**
   * Get customerCreditRatingRecord
   * @return customerCreditRatingRecord
  **/

  public CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord getCustomerCreditRatingRecord() {
    return customerCreditRatingRecord;
  }

  public void setCustomerCreditRatingRecord(CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord customerCreditRatingRecord) {
    this.customerCreditRatingRecord = customerCreditRatingRecord;
  }


}

