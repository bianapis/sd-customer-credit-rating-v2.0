package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceAnalysis
 */
public class CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceAnalysis   {
  private String customerCreditRatingStateInstanceAnalysisReference = null;

  private String customerCreditRatingStateInstanceAnalysisReportType = null;

  private String customerCreditRatingStateInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerCreditRatingStateInstanceAnalysisReference
  **/

  public String getCustomerCreditRatingStateInstanceAnalysisReference() {
    return customerCreditRatingStateInstanceAnalysisReference;
  }

  public void setCustomerCreditRatingStateInstanceAnalysisReference(String customerCreditRatingStateInstanceAnalysisReference) {
    this.customerCreditRatingStateInstanceAnalysisReference = customerCreditRatingStateInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCreditRatingStateInstanceAnalysisReportType
  **/

  public String getCustomerCreditRatingStateInstanceAnalysisReportType() {
    return customerCreditRatingStateInstanceAnalysisReportType;
  }

  public void setCustomerCreditRatingStateInstanceAnalysisReportType(String customerCreditRatingStateInstanceAnalysisReportType) {
    this.customerCreditRatingStateInstanceAnalysisReportType = customerCreditRatingStateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerCreditRatingStateInstanceAnalysisParameters
  **/

  public String getCustomerCreditRatingStateInstanceAnalysisParameters() {
    return customerCreditRatingStateInstanceAnalysisParameters;
  }

  public void setCustomerCreditRatingStateInstanceAnalysisParameters(String customerCreditRatingStateInstanceAnalysisParameters) {
    this.customerCreditRatingStateInstanceAnalysisParameters = customerCreditRatingStateInstanceAnalysisParameters;
  }


}

