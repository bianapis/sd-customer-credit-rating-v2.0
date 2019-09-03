package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecord
 */
public class CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecord   {
  private CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord customerCreditRatingAssessmentRecord = null;


  /**
   * Get customerCreditRatingAssessmentRecord
   * @return customerCreditRatingAssessmentRecord
  **/

  public CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord getCustomerCreditRatingAssessmentRecord() {
    return customerCreditRatingAssessmentRecord;
  }

  public void setCustomerCreditRatingAssessmentRecord(CRCustomerCreditRatingStateExecuteInputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord customerCreditRatingAssessmentRecord) {
    this.customerCreditRatingAssessmentRecord = customerCreditRatingAssessmentRecord;
  }


}

