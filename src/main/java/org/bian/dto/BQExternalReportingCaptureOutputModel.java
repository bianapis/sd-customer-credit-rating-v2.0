package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.BQExternalReportingCaptureOutputModelExternalReportingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExternalReportingCaptureOutputModel
 */
public class BQExternalReportingCaptureOutputModel   {
  private BQExternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private BQExternalReportingCaptureOutputModelExternalReportingInstanceRecord externalReportingInstanceRecord = null;

  private String externalReportingCaptureActionTaskReference = null;

  private Object externalReportingCaptureActionTaskRecord = null;

  private String externalReportingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public BQExternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(BQExternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


  /**
   * Get externalReportingInstanceRecord
   * @return externalReportingInstanceRecord
  **/

  public BQExternalReportingCaptureOutputModelExternalReportingInstanceRecord getExternalReportingInstanceRecord() {
    return externalReportingInstanceRecord;
  }

  public void setExternalReportingInstanceRecord(BQExternalReportingCaptureOutputModelExternalReportingInstanceRecord externalReportingInstanceRecord) {
    this.externalReportingInstanceRecord = externalReportingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a External Reporting instance capture service call 
   * @return externalReportingCaptureActionTaskReference
  **/

  public String getExternalReportingCaptureActionTaskReference() {
    return externalReportingCaptureActionTaskReference;
  }

  public void setExternalReportingCaptureActionTaskReference(String externalReportingCaptureActionTaskReference) {
    this.externalReportingCaptureActionTaskReference = externalReportingCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return externalReportingCaptureActionTaskRecord
  **/

  public Object getExternalReportingCaptureActionTaskRecord() {
    return externalReportingCaptureActionTaskRecord;
  }

  public void setExternalReportingCaptureActionTaskRecord(Object externalReportingCaptureActionTaskRecord) {
    this.externalReportingCaptureActionTaskRecord = externalReportingCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the External Reporting structured input transaction/record 
   * @return externalReportingCaptureRecordReference
  **/

  public String getExternalReportingCaptureRecordReference() {
    return externalReportingCaptureRecordReference;
  }

  public void setExternalReportingCaptureRecordReference(String externalReportingCaptureRecordReference) {
    this.externalReportingCaptureRecordReference = externalReportingCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

