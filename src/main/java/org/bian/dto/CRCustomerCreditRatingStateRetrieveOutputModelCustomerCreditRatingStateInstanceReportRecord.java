package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceReportRecord
 */
public class CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceReportRecord   {
  private String customerCreditRatingStateInstanceReportData = null;

  private String customerCreditRatingStateInstanceReportType = null;

  private Object customerCreditRatingStateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerCreditRatingStateInstanceReportData
  **/

  public String getCustomerCreditRatingStateInstanceReportData() {
    return customerCreditRatingStateInstanceReportData;
  }

  public void setCustomerCreditRatingStateInstanceReportData(String customerCreditRatingStateInstanceReportData) {
    this.customerCreditRatingStateInstanceReportData = customerCreditRatingStateInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCreditRatingStateInstanceReportType
  **/

  public String getCustomerCreditRatingStateInstanceReportType() {
    return customerCreditRatingStateInstanceReportType;
  }

  public void setCustomerCreditRatingStateInstanceReportType(String customerCreditRatingStateInstanceReportType) {
    this.customerCreditRatingStateInstanceReportType = customerCreditRatingStateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerCreditRatingStateInstanceReport
  **/

  public Object getCustomerCreditRatingStateInstanceReport() {
    return customerCreditRatingStateInstanceReport;
  }

  public void setCustomerCreditRatingStateInstanceReport(Object customerCreditRatingStateInstanceReport) {
    this.customerCreditRatingStateInstanceReport = customerCreditRatingStateInstanceReport;
  }


}

