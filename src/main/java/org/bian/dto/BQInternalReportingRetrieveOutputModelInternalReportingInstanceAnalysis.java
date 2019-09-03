package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalReportingRetrieveOutputModelInternalReportingInstanceAnalysis
 */
public class BQInternalReportingRetrieveOutputModelInternalReportingInstanceAnalysis   {
  private Object internalReportingInstanceAnalysisRecord = null;

  private String internalReportingInstanceAnalysisReportType = null;

  private String internalReportingInstanceAnalysisParameters = null;

  private Object internalReportingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return internalReportingInstanceAnalysisRecord
  **/

  public Object getInternalReportingInstanceAnalysisRecord() {
    return internalReportingInstanceAnalysisRecord;
  }

  public void setInternalReportingInstanceAnalysisRecord(Object internalReportingInstanceAnalysisRecord) {
    this.internalReportingInstanceAnalysisRecord = internalReportingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return internalReportingInstanceAnalysisReportType
  **/

  public String getInternalReportingInstanceAnalysisReportType() {
    return internalReportingInstanceAnalysisReportType;
  }

  public void setInternalReportingInstanceAnalysisReportType(String internalReportingInstanceAnalysisReportType) {
    this.internalReportingInstanceAnalysisReportType = internalReportingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return internalReportingInstanceAnalysisParameters
  **/

  public String getInternalReportingInstanceAnalysisParameters() {
    return internalReportingInstanceAnalysisParameters;
  }

  public void setInternalReportingInstanceAnalysisParameters(String internalReportingInstanceAnalysisParameters) {
    this.internalReportingInstanceAnalysisParameters = internalReportingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return internalReportingInstanceAnalysisReport
  **/

  public Object getInternalReportingInstanceAnalysisReport() {
    return internalReportingInstanceAnalysisReport;
  }

  public void setInternalReportingInstanceAnalysisReport(Object internalReportingInstanceAnalysisReport) {
    this.internalReportingInstanceAnalysisReport = internalReportingInstanceAnalysisReport;
  }


}

