package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceAnalysis
 */
public class CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceAnalysis   {
  private String customerCreditRatingStateInstanceAnalysisData = null;

  private String customerCreditRatingStateInstanceAnalysisReportType = null;

  private Object customerCreditRatingStateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerCreditRatingStateInstanceAnalysisData
  **/

  public String getCustomerCreditRatingStateInstanceAnalysisData() {
    return customerCreditRatingStateInstanceAnalysisData;
  }

  public void setCustomerCreditRatingStateInstanceAnalysisData(String customerCreditRatingStateInstanceAnalysisData) {
    this.customerCreditRatingStateInstanceAnalysisData = customerCreditRatingStateInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerCreditRatingStateInstanceAnalysisReport
  **/

  public Object getCustomerCreditRatingStateInstanceAnalysisReport() {
    return customerCreditRatingStateInstanceAnalysisReport;
  }

  public void setCustomerCreditRatingStateInstanceAnalysisReport(Object customerCreditRatingStateInstanceAnalysisReport) {
    this.customerCreditRatingStateInstanceAnalysisReport = customerCreditRatingStateInstanceAnalysisReport;
  }


}

