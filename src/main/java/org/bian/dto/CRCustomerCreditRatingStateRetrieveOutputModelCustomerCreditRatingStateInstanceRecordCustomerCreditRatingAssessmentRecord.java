package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord
 */
public class CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecordCustomerCreditRatingAssessmentRecord   {
  private String assessmentCustomerBehaviorModelReference = null;

  private String creditRatingAssessmentType = null;

  private String creditRatingAssessmentDate = null;

  private String creditRatingAssessmentWorkProducts = null;

  private String creditRatingAssessmentResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer behavior model(s) used to develop any underlying analysis for determining the credit state 
   * @return assessmentCustomerBehaviorModelReference
  **/

  public String getAssessmentCustomerBehaviorModelReference() {
    return assessmentCustomerBehaviorModelReference;
  }

  public void setAssessmentCustomerBehaviorModelReference(String assessmentCustomerBehaviorModelReference) {
    this.assessmentCustomerBehaviorModelReference = assessmentCustomerBehaviorModelReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of analysis performed to support the credit state 
   * @return creditRatingAssessmentType
  **/

  public String getCreditRatingAssessmentType() {
    return creditRatingAssessmentType;
  }

  public void setCreditRatingAssessmentType(String creditRatingAssessmentType) {
    this.creditRatingAssessmentType = creditRatingAssessmentType;
  }


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

