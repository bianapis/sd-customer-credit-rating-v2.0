package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExternalReportingRetrieveInputModelExternalReportingInstanceAnalysis;
import org.bian.dto.BQExternalReportingRetrieveInputModelExternalReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQExternalReportingRetrieveInputModel
 */
public class BQExternalReportingRetrieveInputModel   {
  private Object externalReportingRetrieveActionTaskRecord = null;

  private String externalReportingRetrieveActionRequest = null;

  private BQExternalReportingRetrieveInputModelExternalReportingInstanceReport externalReportingInstanceReport = null;

  private BQExternalReportingRetrieveInputModelExternalReportingInstanceAnalysis externalReportingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return externalReportingRetrieveActionTaskRecord
  **/

  public Object getExternalReportingRetrieveActionTaskRecord() {
    return externalReportingRetrieveActionTaskRecord;
  }

  public void setExternalReportingRetrieveActionTaskRecord(Object externalReportingRetrieveActionTaskRecord) {
    this.externalReportingRetrieveActionTaskRecord = externalReportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return externalReportingRetrieveActionRequest
  **/

  public String getExternalReportingRetrieveActionRequest() {
    return externalReportingRetrieveActionRequest;
  }

  public void setExternalReportingRetrieveActionRequest(String externalReportingRetrieveActionRequest) {
    this.externalReportingRetrieveActionRequest = externalReportingRetrieveActionRequest;
  }


  /**
   * Get externalReportingInstanceReport
   * @return externalReportingInstanceReport
  **/

  public BQExternalReportingRetrieveInputModelExternalReportingInstanceReport getExternalReportingInstanceReport() {
    return externalReportingInstanceReport;
  }

  public void setExternalReportingInstanceReport(BQExternalReportingRetrieveInputModelExternalReportingInstanceReport externalReportingInstanceReport) {
    this.externalReportingInstanceReport = externalReportingInstanceReport;
  }


  /**
   * Get externalReportingInstanceAnalysis
   * @return externalReportingInstanceAnalysis
  **/

  public BQExternalReportingRetrieveInputModelExternalReportingInstanceAnalysis getExternalReportingInstanceAnalysis() {
    return externalReportingInstanceAnalysis;
  }

  public void setExternalReportingInstanceAnalysis(BQExternalReportingRetrieveInputModelExternalReportingInstanceAnalysis externalReportingInstanceAnalysis) {
    this.externalReportingInstanceAnalysis = externalReportingInstanceAnalysis;
  }


}

