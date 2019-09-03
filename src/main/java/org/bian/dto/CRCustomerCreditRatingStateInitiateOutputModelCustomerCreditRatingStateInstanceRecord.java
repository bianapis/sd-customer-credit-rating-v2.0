package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord;
import org.bian.dto.CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecord
 */
public class CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecord   {
  private String customerCreditRatingSchedule = null;

  private CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord customerCreditRatingAssessmentRecord = null;

  private CRCustomerCreditRatingStateInitiateOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingRecord customerCreditRatingRecord = null;


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

  public CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord getCustomerCreditRatingAssessmentRecord() {
    return customerCreditRatingAssessmentRecord;
  }

  public void setCustomerCreditRatingAssessmentRecord(CRCustomerCreditRatingStateInitiateInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord customerCreditRatingAssessmentRecord) {
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

