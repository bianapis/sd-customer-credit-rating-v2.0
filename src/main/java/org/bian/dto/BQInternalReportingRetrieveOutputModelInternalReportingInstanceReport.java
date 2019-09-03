package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalReportingRetrieveOutputModelInternalReportingInstanceReport
 */
public class BQInternalReportingRetrieveOutputModelInternalReportingInstanceReport   {
  private Object internalReportingInstanceReportRecord = null;

  private String internalReportingInstanceReportType = null;

  private String internalReportingInstanceReportParameters = null;

  private Object internalReportingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return internalReportingInstanceReportRecord
  **/

  public Object getInternalReportingInstanceReportRecord() {
    return internalReportingInstanceReportRecord;
  }

  public void setInternalReportingInstanceReportRecord(Object internalReportingInstanceReportRecord) {
    this.internalReportingInstanceReportRecord = internalReportingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return internalReportingInstanceReportType
  **/

  public String getInternalReportingInstanceReportType() {
    return internalReportingInstanceReportType;
  }

  public void setInternalReportingInstanceReportType(String internalReportingInstanceReportType) {
    this.internalReportingInstanceReportType = internalReportingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return internalReportingInstanceReportParameters
  **/

  public String getInternalReportingInstanceReportParameters() {
    return internalReportingInstanceReportParameters;
  }

  public void setInternalReportingInstanceReportParameters(String internalReportingInstanceReportParameters) {
    this.internalReportingInstanceReportParameters = internalReportingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return internalReportingInstanceReport
  **/

  public Object getInternalReportingInstanceReport() {
    return internalReportingInstanceReport;
  }

  public void setInternalReportingInstanceReport(Object internalReportingInstanceReport) {
    this.internalReportingInstanceReport = internalReportingInstanceReport;
  }


}

