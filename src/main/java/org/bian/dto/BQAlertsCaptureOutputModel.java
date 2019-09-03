package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertsCaptureInputModelCustomerCreditRatingStateInstanceRecord;
import org.bian.dto.BQAlertsCaptureOutputModelAlertsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAlertsCaptureOutputModel
 */
public class BQAlertsCaptureOutputModel   {
  private BQAlertsCaptureInputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private BQAlertsCaptureOutputModelAlertsInstanceRecord alertsInstanceRecord = null;

  private String alertsCaptureActionTaskReference = null;

  private Object alertsCaptureActionTaskRecord = null;

  private String alertsCaptureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * Get alertsInstanceRecord
   * @return alertsInstanceRecord
  **/

  public BQAlertsCaptureOutputModelAlertsInstanceRecord getAlertsInstanceRecord() {
    return alertsInstanceRecord;
  }

  public void setAlertsInstanceRecord(BQAlertsCaptureOutputModelAlertsInstanceRecord alertsInstanceRecord) {
    this.alertsInstanceRecord = alertsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Alerts instance capture service call 
   * @return alertsCaptureActionTaskReference
  **/

  public String getAlertsCaptureActionTaskReference() {
    return alertsCaptureActionTaskReference;
  }

  public void setAlertsCaptureActionTaskReference(String alertsCaptureActionTaskReference) {
    this.alertsCaptureActionTaskReference = alertsCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Alerts structured input transaction/record 
   * @return alertsCaptureRecordReference
  **/

  public String getAlertsCaptureRecordReference() {
    return alertsCaptureRecordReference;
  }

  public void setAlertsCaptureRecordReference(String alertsCaptureRecordReference) {
    this.alertsCaptureRecordReference = alertsCaptureRecordReference;
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

