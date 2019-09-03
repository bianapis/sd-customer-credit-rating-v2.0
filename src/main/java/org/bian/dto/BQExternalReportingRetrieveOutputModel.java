package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.BQExternalReportingRetrieveOutputModelExternalReportingInstanceAnalysis;
import org.bian.dto.BQExternalReportingRetrieveOutputModelExternalReportingInstanceRecord;
import org.bian.dto.BQExternalReportingRetrieveOutputModelExternalReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQExternalReportingRetrieveOutputModel
 */
public class BQExternalReportingRetrieveOutputModel   {
  private BQExternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private BQExternalReportingRetrieveOutputModelExternalReportingInstanceRecord externalReportingInstanceRecord = null;

  private String externalReportingRetrieveActionTaskReference = null;

  private Object externalReportingRetrieveActionTaskRecord = null;

  private String externalReportingRetrieveActionResponse = null;

  private BQExternalReportingRetrieveOutputModelExternalReportingInstanceReport externalReportingInstanceReport = null;

  private BQExternalReportingRetrieveOutputModelExternalReportingInstanceAnalysis externalReportingInstanceAnalysis = null;


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public BQExternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(BQExternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


  /**
   * Get externalReportingInstanceRecord
   * @return externalReportingInstanceRecord
  **/

  public BQExternalReportingRetrieveOutputModelExternalReportingInstanceRecord getExternalReportingInstanceRecord() {
    return externalReportingInstanceRecord;
  }

  public void setExternalReportingInstanceRecord(BQExternalReportingRetrieveOutputModelExternalReportingInstanceRecord externalReportingInstanceRecord) {
    this.externalReportingInstanceRecord = externalReportingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a External Reporting instance retrieve service call 
   * @return externalReportingRetrieveActionTaskReference
  **/

  public String getExternalReportingRetrieveActionTaskReference() {
    return externalReportingRetrieveActionTaskReference;
  }

  public void setExternalReportingRetrieveActionTaskReference(String externalReportingRetrieveActionTaskReference) {
    this.externalReportingRetrieveActionTaskReference = externalReportingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return externalReportingRetrieveActionTaskRecord
  **/

  public Object getExternalReportingRetrieveActionTaskRecord() {
    return externalReportingRetrieveActionTaskRecord;
  }

  public void setExternalReportingRetrieveActionTaskRecord(Object externalReportingRetrieveActionTaskRecord) {
    this.externalReportingRetrieveActionTaskRecord = externalReportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return externalReportingRetrieveActionResponse
  **/

  public String getExternalReportingRetrieveActionResponse() {
    return externalReportingRetrieveActionResponse;
  }

  public void setExternalReportingRetrieveActionResponse(String externalReportingRetrieveActionResponse) {
    this.externalReportingRetrieveActionResponse = externalReportingRetrieveActionResponse;
  }


  /**
   * Get externalReportingInstanceReport
   * @return externalReportingInstanceReport
  **/

  public BQExternalReportingRetrieveOutputModelExternalReportingInstanceReport getExternalReportingInstanceReport() {
    return externalReportingInstanceReport;
  }

  public void setExternalReportingInstanceReport(BQExternalReportingRetrieveOutputModelExternalReportingInstanceReport externalReportingInstanceReport) {
    this.externalReportingInstanceReport = externalReportingInstanceReport;
  }


  /**
   * Get externalReportingInstanceAnalysis
   * @return externalReportingInstanceAnalysis
  **/

  public BQExternalReportingRetrieveOutputModelExternalReportingInstanceAnalysis getExternalReportingInstanceAnalysis() {
    return externalReportingInstanceAnalysis;
  }

  public void setExternalReportingInstanceAnalysis(BQExternalReportingRetrieveOutputModelExternalReportingInstanceAnalysis externalReportingInstanceAnalysis) {
    this.externalReportingInstanceAnalysis = externalReportingInstanceAnalysis;
  }


}

