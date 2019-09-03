package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertsRetrieveOutputModelAlertsInstanceAnalysis;
import org.bian.dto.BQAlertsRetrieveOutputModelAlertsInstanceRecord;
import org.bian.dto.BQAlertsRetrieveOutputModelAlertsInstanceReport;
import org.bian.dto.BQAlertsRetrieveOutputModelCustomerCreditRatingStateInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAlertsRetrieveOutputModel
 */
public class BQAlertsRetrieveOutputModel   {
  private BQAlertsRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord = null;

  private BQAlertsRetrieveOutputModelAlertsInstanceRecord alertsInstanceRecord = null;

  private String alertsRetrieveActionTaskReference = null;

  private Object alertsRetrieveActionTaskRecord = null;

  private String alertsRetrieveActionResponse = null;

  private BQAlertsRetrieveOutputModelAlertsInstanceReport alertsInstanceReport = null;

  private BQAlertsRetrieveOutputModelAlertsInstanceAnalysis alertsInstanceAnalysis = null;


  /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/

  public BQAlertsRetrieveOutputModelCustomerCreditRatingStateInstanceRecord getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(BQAlertsRetrieveOutputModelCustomerCreditRatingStateInstanceRecord customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }


  /**
   * Get alertsInstanceRecord
   * @return alertsInstanceRecord
  **/

  public BQAlertsRetrieveOutputModelAlertsInstanceRecord getAlertsInstanceRecord() {
    return alertsInstanceRecord;
  }

  public void setAlertsInstanceRecord(BQAlertsRetrieveOutputModelAlertsInstanceRecord alertsInstanceRecord) {
    this.alertsInstanceRecord = alertsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Alerts instance retrieve service call 
   * @return alertsRetrieveActionTaskReference
  **/

  public String getAlertsRetrieveActionTaskReference() {
    return alertsRetrieveActionTaskReference;
  }

  public void setAlertsRetrieveActionTaskReference(String alertsRetrieveActionTaskReference) {
    this.alertsRetrieveActionTaskReference = alertsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return alertsRetrieveActionTaskRecord
  **/

  public Object getAlertsRetrieveActionTaskRecord() {
    return alertsRetrieveActionTaskRecord;
  }

  public void setAlertsRetrieveActionTaskRecord(Object alertsRetrieveActionTaskRecord) {
    this.alertsRetrieveActionTaskRecord = alertsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return alertsRetrieveActionResponse
  **/

  public String getAlertsRetrieveActionResponse() {
    return alertsRetrieveActionResponse;
  }

  public void setAlertsRetrieveActionResponse(String alertsRetrieveActionResponse) {
    this.alertsRetrieveActionResponse = alertsRetrieveActionResponse;
  }


  /**
   * Get alertsInstanceReport
   * @return alertsInstanceReport
  **/

  public BQAlertsRetrieveOutputModelAlertsInstanceReport getAlertsInstanceReport() {
    return alertsInstanceReport;
  }

  public void setAlertsInstanceReport(BQAlertsRetrieveOutputModelAlertsInstanceReport alertsInstanceReport) {
    this.alertsInstanceReport = alertsInstanceReport;
  }


  /**
   * Get alertsInstanceAnalysis
   * @return alertsInstanceAnalysis
  **/

  public BQAlertsRetrieveOutputModelAlertsInstanceAnalysis getAlertsInstanceAnalysis() {
    return alertsInstanceAnalysis;
  }

  public void setAlertsInstanceAnalysis(BQAlertsRetrieveOutputModelAlertsInstanceAnalysis alertsInstanceAnalysis) {
    this.alertsInstanceAnalysis = alertsInstanceAnalysis;
  }


}

