package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.BQInternalReportingCaptureOutputModelInternalReportingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInternalReportingCaptureOutputModel
 */
public class BQInternalReportingCaptureOutputModel   {
  private BQInternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private BQInternalReportingCaptureOutputModelInternalReportingInstanceRecord internalReportingInstanceRecord = null;

  private String internalReportingCaptureActionTaskReference = null;

  private Object internalReportingCaptureActionTaskRecord = null;

  private String internalReportingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public BQInternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(BQInternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


  /**
   * Get internalReportingInstanceRecord
   * @return internalReportingInstanceRecord
  **/

  public BQInternalReportingCaptureOutputModelInternalReportingInstanceRecord getInternalReportingInstanceRecord() {
    return internalReportingInstanceRecord;
  }

  public void setInternalReportingInstanceRecord(BQInternalReportingCaptureOutputModelInternalReportingInstanceRecord internalReportingInstanceRecord) {
    this.internalReportingInstanceRecord = internalReportingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Internal Reporting instance capture service call 
   * @return internalReportingCaptureActionTaskReference
  **/

  public String getInternalReportingCaptureActionTaskReference() {
    return internalReportingCaptureActionTaskReference;
  }

  public void setInternalReportingCaptureActionTaskReference(String internalReportingCaptureActionTaskReference) {
    this.internalReportingCaptureActionTaskReference = internalReportingCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return internalReportingCaptureActionTaskRecord
  **/

  public Object getInternalReportingCaptureActionTaskRecord() {
    return internalReportingCaptureActionTaskRecord;
  }

  public void setInternalReportingCaptureActionTaskRecord(Object internalReportingCaptureActionTaskRecord) {
    this.internalReportingCaptureActionTaskRecord = internalReportingCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Reporting structured input transaction/record 
   * @return internalReportingCaptureRecordReference
  **/

  public String getInternalReportingCaptureRecordReference() {
    return internalReportingCaptureRecordReference;
  }

  public void setInternalReportingCaptureRecordReference(String internalReportingCaptureRecordReference) {
    this.internalReportingCaptureRecordReference = internalReportingCaptureRecordReference;
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

