package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertsRetrieveInputModelAlertsInstanceAnalysis;
import org.bian.dto.BQAlertsRetrieveInputModelAlertsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAlertsRetrieveInputModel
 */
public class BQAlertsRetrieveInputModel   {
  private Object alertsRetrieveActionTaskRecord = null;

  private String alertsRetrieveActionRequest = null;

  private BQAlertsRetrieveInputModelAlertsInstanceReport alertsInstanceReport = null;

  private BQAlertsRetrieveInputModelAlertsInstanceAnalysis alertsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return alertsRetrieveActionRequest
  **/

  public String getAlertsRetrieveActionRequest() {
    return alertsRetrieveActionRequest;
  }

  public void setAlertsRetrieveActionRequest(String alertsRetrieveActionRequest) {
    this.alertsRetrieveActionRequest = alertsRetrieveActionRequest;
  }


  /**
   * Get alertsInstanceReport
   * @return alertsInstanceReport
  **/

  public BQAlertsRetrieveInputModelAlertsInstanceReport getAlertsInstanceReport() {
    return alertsInstanceReport;
  }

  public void setAlertsInstanceReport(BQAlertsRetrieveInputModelAlertsInstanceReport alertsInstanceReport) {
    this.alertsInstanceReport = alertsInstanceReport;
  }


  /**
   * Get alertsInstanceAnalysis
   * @return alertsInstanceAnalysis
  **/

  public BQAlertsRetrieveInputModelAlertsInstanceAnalysis getAlertsInstanceAnalysis() {
    return alertsInstanceAnalysis;
  }

  public void setAlertsInstanceAnalysis(BQAlertsRetrieveInputModelAlertsInstanceAnalysis alertsInstanceAnalysis) {
    this.alertsInstanceAnalysis = alertsInstanceAnalysis;
  }


}

