package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportingRetrieveOutputModelExternalReportingInstanceReport
 */
public class BQExternalReportingRetrieveOutputModelExternalReportingInstanceReport   {
  private Object externalReportingInstanceReportRecord = null;

  private String externalReportingInstanceReportType = null;

  private String externalReportingInstanceReportParameters = null;

  private Object externalReportingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return externalReportingInstanceReportRecord
  **/

  public Object getExternalReportingInstanceReportRecord() {
    return externalReportingInstanceReportRecord;
  }

  public void setExternalReportingInstanceReportRecord(Object externalReportingInstanceReportRecord) {
    this.externalReportingInstanceReportRecord = externalReportingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return externalReportingInstanceReportType
  **/

  public String getExternalReportingInstanceReportType() {
    return externalReportingInstanceReportType;
  }

  public void setExternalReportingInstanceReportType(String externalReportingInstanceReportType) {
    this.externalReportingInstanceReportType = externalReportingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return externalReportingInstanceReportParameters
  **/

  public String getExternalReportingInstanceReportParameters() {
    return externalReportingInstanceReportParameters;
  }

  public void setExternalReportingInstanceReportParameters(String externalReportingInstanceReportParameters) {
    this.externalReportingInstanceReportParameters = externalReportingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return externalReportingInstanceReport
  **/

  public Object getExternalReportingInstanceReport() {
    return externalReportingInstanceReport;
  }

  public void setExternalReportingInstanceReport(Object externalReportingInstanceReport) {
    this.externalReportingInstanceReport = externalReportingInstanceReport;
  }


}

