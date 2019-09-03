package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertsCaptureInputModelCaptureRecordType;
import org.bian.dto.BQInternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.BQInternalReportingCaptureInputModelInternalReportingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInternalReportingCaptureInputModel
 */
public class BQInternalReportingCaptureInputModel   {
  private BQInternalReportingCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private String customerCreditRatingStateInstanceReference = null;

  private String internalReportingInstanceReference = null;

  private BQInternalReportingCaptureInputModelInternalReportingInstanceRecord internalReportingInstanceRecord = null;

  private Object internalReportingCaptureActionTaskRecord = null;

  private BQAlertsCaptureInputModelCaptureRecordType captureRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Reporting instance 
   * @return internalReportingInstanceReference
  **/

  public String getInternalReportingInstanceReference() {
    return internalReportingInstanceReference;
  }

  public void setInternalReportingInstanceReference(String internalReportingInstanceReference) {
    this.internalReportingInstanceReference = internalReportingInstanceReference;
  }


  /**
   * Get internalReportingInstanceRecord
   * @return internalReportingInstanceRecord
  **/

  public BQInternalReportingCaptureInputModelInternalReportingInstanceRecord getInternalReportingInstanceRecord() {
    return internalReportingInstanceRecord;
  }

  public void setInternalReportingInstanceRecord(BQInternalReportingCaptureInputModelInternalReportingInstanceRecord internalReportingInstanceRecord) {
    this.internalReportingInstanceRecord = internalReportingInstanceRecord;
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

