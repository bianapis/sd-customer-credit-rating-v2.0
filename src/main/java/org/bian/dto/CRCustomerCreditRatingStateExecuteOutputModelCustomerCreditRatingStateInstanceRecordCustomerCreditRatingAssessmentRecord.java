package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord
 */
public class CRCustomerCreditRatingStateExecuteOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord   {
  private String creditRatingAssessmentDate = null;

  private String creditRatingAssessmentWorkProducts = null;

  private String creditRatingAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the supporting credit assessment was developed 
   * @return creditRatingAssessmentDate
  **/

  public String getCreditRatingAssessmentDate() {
    return creditRatingAssessmentDate;
  }

  public void setCreditRatingAssessmentDate(String creditRatingAssessmentDate) {
    this.creditRatingAssessmentDate = creditRatingAssessmentDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return creditRatingAssessmentWorkProducts
  **/

  public String getCreditRatingAssessmentWorkProducts() {
    return creditRatingAssessmentWorkProducts;
  }

  public void setCreditRatingAssessmentWorkProducts(String creditRatingAssessmentWorkProducts) {
    this.creditRatingAssessmentWorkProducts = creditRatingAssessmentWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The resulting report from the credit rating assessment 
   * @return creditRatingAssessmentResult
  **/

  public String getCreditRatingAssessmentResult() {
    return creditRatingAssessmentResult;
  }

  public void setCreditRatingAssessmentResult(String creditRatingAssessmentResult) {
    this.creditRatingAssessmentResult = creditRatingAssessmentResult;
  }


}

