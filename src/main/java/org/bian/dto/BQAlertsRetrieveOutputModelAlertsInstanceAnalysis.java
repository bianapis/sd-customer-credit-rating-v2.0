package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertsRetrieveOutputModelAlertsInstanceAnalysis
 */
public class BQAlertsRetrieveOutputModelAlertsInstanceAnalysis   {
  private Object alertsInstanceAnalysisRecord = null;

  private String alertsInstanceAnalysisReportType = null;

  private String alertsInstanceAnalysisParameters = null;

  private Object alertsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return alertsInstanceAnalysisRecord
  **/

  public Object getAlertsInstanceAnalysisRecord() {
    return alertsInstanceAnalysisRecord;
  }

  public void setAlertsInstanceAnalysisRecord(Object alertsInstanceAnalysisRecord) {
    this.alertsInstanceAnalysisRecord = alertsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return alertsInstanceAnalysisReportType
  **/

  public String getAlertsInstanceAnalysisReportType() {
    return alertsInstanceAnalysisReportType;
  }

  public void setAlertsInstanceAnalysisReportType(String alertsInstanceAnalysisReportType) {
    this.alertsInstanceAnalysisReportType = alertsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return alertsInstanceAnalysisParameters
  **/

  public String getAlertsInstanceAnalysisParameters() {
    return alertsInstanceAnalysisParameters;
  }

  public void setAlertsInstanceAnalysisParameters(String alertsInstanceAnalysisParameters) {
    this.alertsInstanceAnalysisParameters = alertsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return alertsInstanceAnalysisReport
  **/

  public Object getAlertsInstanceAnalysisReport() {
    return alertsInstanceAnalysisReport;
  }

  public void setAlertsInstanceAnalysisReport(Object alertsInstanceAnalysisReport) {
    this.alertsInstanceAnalysisReport = alertsInstanceAnalysisReport;
  }


}

