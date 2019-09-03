package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.BQInternalReportingRetrieveOutputModelInternalReportingInstanceAnalysis;
import org.bian.dto.BQInternalReportingRetrieveOutputModelInternalReportingInstanceRecord;
import org.bian.dto.BQInternalReportingRetrieveOutputModelInternalReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInternalReportingRetrieveOutputModel
 */
public class BQInternalReportingRetrieveOutputModel   {
  private BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private BQInternalReportingRetrieveOutputModelInternalReportingInstanceRecord internalReportingInstanceRecord = null;

  private String internalReportingRetrieveActionTaskReference = null;

  private Object internalReportingRetrieveActionTaskRecord = null;

  private String internalReportingRetrieveActionResponse = null;

  private BQInternalReportingRetrieveOutputModelInternalReportingInstanceReport internalReportingInstanceReport = null;

  private BQInternalReportingRetrieveOutputModelInternalReportingInstanceAnalysis internalReportingInstanceAnalysis = null;


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(BQInternalReportingRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


  /**
   * Get internalReportingInstanceRecord
   * @return internalReportingInstanceRecord
  **/

  public BQInternalReportingRetrieveOutputModelInternalReportingInstanceRecord getInternalReportingInstanceRecord() {
    return internalReportingInstanceRecord;
  }

  public void setInternalReportingInstanceRecord(BQInternalReportingRetrieveOutputModelInternalReportingInstanceRecord internalReportingInstanceRecord) {
    this.internalReportingInstanceRecord = internalReportingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Reporting instance retrieve service call 
   * @return internalReportingRetrieveActionTaskReference
  **/

  public String getInternalReportingRetrieveActionTaskReference() {
    return internalReportingRetrieveActionTaskReference;
  }

  public void setInternalReportingRetrieveActionTaskReference(String internalReportingRetrieveActionTaskReference) {
    this.internalReportingRetrieveActionTaskReference = internalReportingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return internalReportingRetrieveActionTaskRecord
  **/

  public Object getInternalReportingRetrieveActionTaskRecord() {
    return internalReportingRetrieveActionTaskRecord;
  }

  public void setInternalReportingRetrieveActionTaskRecord(Object internalReportingRetrieveActionTaskRecord) {
    this.internalReportingRetrieveActionTaskRecord = internalReportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return internalReportingRetrieveActionResponse
  **/

  public String getInternalReportingRetrieveActionResponse() {
    return internalReportingRetrieveActionResponse;
  }

  public void setInternalReportingRetrieveActionResponse(String internalReportingRetrieveActionResponse) {
    this.internalReportingRetrieveActionResponse = internalReportingRetrieveActionResponse;
  }


  /**
   * Get internalReportingInstanceReport
   * @return internalReportingInstanceReport
  **/

  public BQInternalReportingRetrieveOutputModelInternalReportingInstanceReport getInternalReportingInstanceReport() {
    return internalReportingInstanceReport;
  }

  public void setInternalReportingInstanceReport(BQInternalReportingRetrieveOutputModelInternalReportingInstanceReport internalReportingInstanceReport) {
    this.internalReportingInstanceReport = internalReportingInstanceReport;
  }


  /**
   * Get internalReportingInstanceAnalysis
   * @return internalReportingInstanceAnalysis
  **/

  public BQInternalReportingRetrieveOutputModelInternalReportingInstanceAnalysis getInternalReportingInstanceAnalysis() {
    return internalReportingInstanceAnalysis;
  }

  public void setInternalReportingInstanceAnalysis(BQInternalReportingRetrieveOutputModelInternalReportingInstanceAnalysis internalReportingInstanceAnalysis) {
    this.internalReportingInstanceAnalysis = internalReportingInstanceAnalysis;
  }


}

