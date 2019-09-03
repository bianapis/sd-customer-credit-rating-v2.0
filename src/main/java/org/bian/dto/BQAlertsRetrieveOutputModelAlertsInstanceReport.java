package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertsRetrieveOutputModelAlertsInstanceReport
 */
public class BQAlertsRetrieveOutputModelAlertsInstanceReport   {
  private Object alertsInstanceReportRecord = null;

  private String alertsInstanceReportType = null;

  private String alertsInstanceReportParameters = null;

  private Object alertsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return alertsInstanceReportRecord
  **/

  public Object getAlertsInstanceReportRecord() {
    return alertsInstanceReportRecord;
  }

  public void setAlertsInstanceReportRecord(Object alertsInstanceReportRecord) {
    this.alertsInstanceReportRecord = alertsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return alertsInstanceReportType
  **/

  public String getAlertsInstanceReportType() {
    return alertsInstanceReportType;
  }

  public void setAlertsInstanceReportType(String alertsInstanceReportType) {
    this.alertsInstanceReportType = alertsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return alertsInstanceReportParameters
  **/

  public String getAlertsInstanceReportParameters() {
    return alertsInstanceReportParameters;
  }

  public void setAlertsInstanceReportParameters(String alertsInstanceReportParameters) {
    this.alertsInstanceReportParameters = alertsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return alertsInstanceReport
  **/

  public Object getAlertsInstanceReport() {
    return alertsInstanceReport;
  }

  public void setAlertsInstanceReport(Object alertsInstanceReport) {
    this.alertsInstanceReport = alertsInstanceReport;
  }


}

