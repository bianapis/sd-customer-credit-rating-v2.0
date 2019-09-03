package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceAnalysis;
import org.bian.dto.CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRetrieveInputModel
 */
public class CRCustomerCreditRatingStateRetrieveInputModel   {
  private Object customerCreditRatingStateRetrieveActionTaskRecord = null;

  private String customerCreditRatingStateRetrieveActionRequest = null;

  private CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord customerCreditRatingStateInstanceReportRecord = null;

  private CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceAnalysis customerCreditRatingStateInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerCreditRatingStateRetrieveActionTaskRecord
  **/

  public Object getCustomerCreditRatingStateRetrieveActionTaskRecord() {
    return customerCreditRatingStateRetrieveActionTaskRecord;
  }

  public void setCustomerCreditRatingStateRetrieveActionTaskRecord(Object customerCreditRatingStateRetrieveActionTaskRecord) {
    this.customerCreditRatingStateRetrieveActionTaskRecord = customerCreditRatingStateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerCreditRatingStateRetrieveActionRequest
  **/

  public String getCustomerCreditRatingStateRetrieveActionRequest() {
    return customerCreditRatingStateRetrieveActionRequest;
  }

  public void setCustomerCreditRatingStateRetrieveActionRequest(String customerCreditRatingStateRetrieveActionRequest) {
    this.customerCreditRatingStateRetrieveActionRequest = customerCreditRatingStateRetrieveActionRequest;
  }


  /**
   * Get customerCreditRatingStateInstanceReportRecord
   * @return customerCreditRatingStateInstanceReportRecord
  **/

  public CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord getCustomerCreditRatingStateInstanceReportRecord() {
    return customerCreditRatingStateInstanceReportRecord;
  }

  public void setCustomerCreditRatingStateInstanceReportRecord(CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord customerCreditRatingStateInstanceReportRecord) {
    this.customerCreditRatingStateInstanceReportRecord = customerCreditRatingStateInstanceReportRecord;
  }


  /**
   * Get customerCreditRatingStateInstanceAnalysis
   * @return customerCreditRatingStateInstanceAnalysis
  **/

  public CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceAnalysis getCustomerCreditRatingStateInstanceAnalysis() {
    return customerCreditRatingStateInstanceAnalysis;
  }

  public void setCustomerCreditRatingStateInstanceAnalysis(CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceAnalysis customerCreditRatingStateInstanceAnalysis) {
    this.customerCreditRatingStateInstanceAnalysis = customerCreditRatingStateInstanceAnalysis;
  }


}

