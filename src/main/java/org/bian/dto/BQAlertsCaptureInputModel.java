package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertsCaptureInputModelAlertsInstanceRecord;
import org.bian.dto.BQAlertsCaptureInputModelCaptureRecordType;
import org.bian.dto.BQAlertsCaptureInputModelCustomerCreditRatingStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAlertsCaptureInputModel
 */
public class BQAlertsCaptureInputModel   {
  private BQAlertsCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private String customerCreditRatingStateInstanceReference = null;

  private String alertsInstanceReference = null;

  private BQAlertsCaptureInputModelAlertsInstanceRecord alertsInstanceRecord = null;

  private Object alertsCaptureActionTaskRecord = null;

  private BQAlertsCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public BQAlertsCaptureInputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(BQAlertsCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Alerts instance 
   * @return alertsInstanceReference
  **/

  public String getAlertsInstanceReference() {
    return alertsInstanceReference;
  }

  public void setAlertsInstanceReference(String alertsInstanceReference) {
    this.alertsInstanceReference = alertsInstanceReference;
  }


  /**
   * Get alertsInstanceRecord
   * @return alertsInstanceRecord
  **/

  public BQAlertsCaptureInputModelAlertsInstanceRecord getAlertsInstanceRecord() {
    return alertsInstanceRecord;
  }

  public void setAlertsInstanceRecord(BQAlertsCaptureInputModelAlertsInstanceRecord alertsInstanceRecord) {
    this.alertsInstanceRecord = alertsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return alertsCaptureActionTaskRecord
  **/

  public Object getAlertsCaptureActionTaskRecord() {
    return alertsCaptureActionTaskRecord;
  }

  public void setAlertsCaptureActionTaskRecord(Object alertsCaptureActionTaskRecord) {
    this.alertsCaptureActionTaskRecord = alertsCaptureActionTaskRecord;
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

