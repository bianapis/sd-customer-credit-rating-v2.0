package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertsCaptureInputModelCaptureRecordType;
import org.bian.dto.BQExternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.BQExternalReportingCaptureInputModelExternalReportingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExternalReportingCaptureInputModel
 */
public class BQExternalReportingCaptureInputModel   {
  private BQExternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private String customerCreditRatingStateInstanceReference = null;

  private String externalReportingInstanceReference = null;

  private BQExternalReportingCaptureInputModelExternalReportingInstanceRecord externalReportingInstanceRecord = null;

  private Object externalReportingCaptureActionTaskRecord = null;

  private BQAlertsCaptureInputModelCaptureRecordType captureRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Credit Rating State instance 
   * @return customerCreditRatingStateInstanceReference
  **/

  public String getCustomerCreditRatingStateInstanceReference() {
    return customerCreditRatingStateInstanceReference;
  }

  public void setCustomerCreditRatingStateInstanceReference(String customerCreditRatingStateInstanceReference) {
    this.customerCreditRatingStateInstanceReference = customerCreditRatingStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the External Reporting instance 
   * @return externalReportingInstanceReference
  **/

  public String getExternalReportingInstanceReference() {
    return externalReportingInstanceReference;
  }

  public void setExternalReportingInstanceReference(String externalReportingInstanceReference) {
    this.externalReportingInstanceReference = externalReportingInstanceReference;
  }


  /**
   * Get externalReportingInstanceRecord
   * @return externalReportingInstanceRecord
  **/

  public BQExternalReportingCaptureInputModelExternalReportingInstanceRecord getExternalReportingInstanceRecord() {
    return externalReportingInstanceRecord;
  }

  public void setExternalReportingInstanceRecord(BQExternalReportingCaptureInputModelExternalReportingInstanceRecord externalReportingInstanceRecord) {
    this.externalReportingInstanceRecord = externalReportingInstanceRecord;
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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQAlertsCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQAlertsCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

