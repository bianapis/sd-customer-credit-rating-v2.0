package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceAnalysis;
import org.bian.dto.CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCreditRatingStateRetrieveOutputModel
 */
public class CRCustomerCreditRatingStateRetrieveOutputModel   {
  private CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private String customerCreditRatingStateRetrieveActionTaskReference = null;

  private Object customerCreditRatingStateRetrieveActionTaskRecord = null;

  private String customerCreditRatingStateRetrieveActionResponse = null;

  private CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceReportRecord customerCreditRatingStateInstanceReportRecord = null;

  private CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceAnalysis customerCreditRatingStateInstanceAnalysis = null;


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Credit Rating State instance retrieve service call 
   * @return customerCreditRatingStateRetrieveActionTaskReference
  **/

  public String getCustomerCreditRatingStateRetrieveActionTaskReference() {
    return customerCreditRatingStateRetrieveActionTaskReference;
  }

  public void setCustomerCreditRatingStateRetrieveActionTaskReference(String customerCreditRatingStateRetrieveActionTaskReference) {
    this.customerCreditRatingStateRetrieveActionTaskReference = customerCreditRatingStateRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerCreditRatingStateRetrieveActionResponse
  **/

  public String getCustomerCreditRatingStateRetrieveActionResponse() {
    return customerCreditRatingStateRetrieveActionResponse;
  }

  public void setCustomerCreditRatingStateRetrieveActionResponse(String customerCreditRatingStateRetrieveActionResponse) {
    this.customerCreditRatingStateRetrieveActionResponse = customerCreditRatingStateRetrieveActionResponse;
  }


  /**
   * Get customerCreditRatingStateInstanceReportRecord
   * @return customerCreditRatingStateInstanceReportRecord
  **/

  public CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceReportRecord getCustomerCreditRatingStateInstanceReportRecord() {
    return customerCreditRatingStateInstanceReportRecord;
  }

  public void setCustomerCreditRatingStateInstanceReportRecord(CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceReportRecord customerCreditRatingStateInstanceReportRecord) {
    this.customerCreditRatingStateInstanceReportRecord = customerCreditRatingStateInstanceReportRecord;
  }


  /**
   * Get customerCreditRatingStateInstanceAnalysis
   * @return customerCreditRatingStateInstanceAnalysis
  **/

  public CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceAnalysis getCustomerCreditRatingStateInstanceAnalysis() {
    return customerCreditRatingStateInstanceAnalysis;
  }

  public void setCustomerCreditRatingStateInstanceAnalysis(CRCustomerCreditRatingStateRetrieveOutputModelCustomerCreditRatingStateInstanceAnalysis customerCreditRatingStateInstanceAnalysis) {
    this.customerCreditRatingStateInstanceAnalysis = customerCreditRatingStateInstanceAnalysis;
  }


}

