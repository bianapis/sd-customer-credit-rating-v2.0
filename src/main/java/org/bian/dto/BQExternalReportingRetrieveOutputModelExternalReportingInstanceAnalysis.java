package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportingRetrieveOutputModelExternalReportingInstanceAnalysis
 */
public class BQExternalReportingRetrieveOutputModelExternalReportingInstanceAnalysis   {
  private Object externalReportingInstanceAnalysisRecord = null;

  private String externalReportingInstanceAnalysisReportType = null;

  private String externalReportingInstanceAnalysisParameters = null;

  private Object externalReportingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return externalReportingInstanceAnalysisRecord
  **/

  public Object getExternalReportingInstanceAnalysisRecord() {
    return externalReportingInstanceAnalysisRecord;
  }

  public void setExternalReportingInstanceAnalysisRecord(Object externalReportingInstanceAnalysisRecord) {
    this.externalReportingInstanceAnalysisRecord = externalReportingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return externalReportingInstanceAnalysisReportType
  **/

  public String getExternalReportingInstanceAnalysisReportType() {
    return externalReportingInstanceAnalysisReportType;
  }

  public void setExternalReportingInstanceAnalysisReportType(String externalReportingInstanceAnalysisReportType) {
    this.externalReportingInstanceAnalysisReportType = externalReportingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return externalReportingInstanceAnalysisParameters
  **/

  public String getExternalReportingInstanceAnalysisParameters() {
    return externalReportingInstanceAnalysisParameters;
  }

  public void setExternalReportingInstanceAnalysisParameters(String externalReportingInstanceAnalysisParameters) {
    this.externalReportingInstanceAnalysisParameters = externalReportingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return externalReportingInstanceAnalysisReport
  **/

  public Object getExternalReportingInstanceAnalysisReport() {
    return externalReportingInstanceAnalysisReport;
  }

  public void setExternalReportingInstanceAnalysisReport(Object externalReportingInstanceAnalysisReport) {
    this.externalReportingInstanceAnalysisReport = externalReportingInstanceAnalysisReport;
  }


}

