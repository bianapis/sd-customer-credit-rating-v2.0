package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecord
 */
public class CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecord   {
  private CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord customerCreditRatingAssessmentRecord = null;


  /**
   * Get customerCreditRatingAssessmentRecord
   * @return customerCreditRatingAssessmentRecord
  **/

  public CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord getCustomerCreditRatingAssessmentRecord() {
    return customerCreditRatingAssessmentRecord;
  }

  public void setCustomerCreditRatingAssessmentRecord(CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord customerCreditRatingAssessmentRecord) {
    this.customerCreditRatingAssessmentRecord = customerCreditRatingAssessmentRecord;
  }


}

