package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInternalReportingRetrieveInputModelInternalReportingInstanceAnalysis;
import org.bian.dto.BQInternalReportingRetrieveInputModelInternalReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInternalReportingRetrieveInputModel
 */
public class BQInternalReportingRetrieveInputModel   {
  private Object internalReportingRetrieveActionTaskRecord = null;

  private String internalReportingRetrieveActionRequest = null;

  private BQInternalReportingRetrieveInputModelInternalReportingInstanceReport internalReportingInstanceReport = null;

  private BQInternalReportingRetrieveInputModelInternalReportingInstanceAnalysis internalReportingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return internalReportingRetrieveActionTaskRecord
  **/

  public Object getInternalReportingRetrieveActionTaskRecord() {
    return internalReportingRetrieveActionTaskRecord;
  }

  public void setInternalReportingRetrieveActionTaskRecord(Object internalReportingRetrieveActionTaskRecord) {
    this.internalReportingRetrieveActionTaskRecord = internalReportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return internalReportingRetrieveActionRequest
  **/

  public String getInternalReportingRetrieveActionRequest() {
    return internalReportingRetrieveActionRequest;
  }

  public void setInternalReportingRetrieveActionRequest(String internalReportingRetrieveActionRequest) {
    this.internalReportingRetrieveActionRequest = internalReportingRetrieveActionRequest;
  }


  /**
   * Get internalReportingInstanceReport
   * @return internalReportingInstanceReport
  **/

  public BQInternalReportingRetrieveInputModelInternalReportingInstanceReport getInternalReportingInstanceReport() {
    return internalReportingInstanceReport;
  }

  public void setInternalReportingInstanceReport(BQInternalReportingRetrieveInputModelInternalReportingInstanceReport internalReportingInstanceReport) {
    this.internalReportingInstanceReport = internalReportingInstanceReport;
  }


  /**
   * Get internalReportingInstanceAnalysis
   * @return internalReportingInstanceAnalysis
  **/

  public BQInternalReportingRetrieveInputModelInternalReportingInstanceAnalysis getInternalReportingInstanceAnalysis() {
    return internalReportingInstanceAnalysis;
  }

  public void setInternalReportingInstanceAnalysis(BQInternalReportingRetrieveInputModelInternalReportingInstanceAnalysis internalReportingInstanceAnalysis) {
    this.internalReportingInstanceAnalysis = internalReportingInstanceAnalysis;
  }


}

