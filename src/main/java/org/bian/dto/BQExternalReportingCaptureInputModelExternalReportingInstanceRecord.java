package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportingCaptureInputModelExternalReportingInstanceRecord
 */
public class BQExternalReportingCaptureInputModelExternalReportingInstanceRecord   {
  private String ratingAgencyReportSchedule = null;

  private String ratingAgencyCreditReportType = null;

  private String ratingAgencyCreditReportDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for the upload of the data file/report from the external agency (can be ad-hoc) 
   * @return ratingAgencyReportSchedule
  **/

  public String getRatingAgencyReportSchedule() {
    return ratingAgencyReportSchedule;
  }

  public void setRatingAgencyReportSchedule(String ratingAgencyReportSchedule) {
    this.ratingAgencyReportSchedule = ratingAgencyReportSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Defines the type of credit assessment report provided (e.g. reference check, credit score, long/short form credit report) 
   * @return ratingAgencyCreditReportType
  **/

  public String getRatingAgencyCreditReportType() {
    return ratingAgencyCreditReportType;
  }

  public void setRatingAgencyCreditReportType(String ratingAgencyCreditReportType) {
    this.ratingAgencyCreditReportType = ratingAgencyCreditReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date time the credit report was downloaded (content will define refresh history) 
   * @return ratingAgencyCreditReportDate
  **/

  public String getRatingAgencyCreditReportDate() {
    return ratingAgencyCreditReportDate;
  }

  public void setRatingAgencyCreditReportDate(String ratingAgencyCreditReportDate) {
    this.ratingAgencyCreditReportDate = ratingAgencyCreditReportDate;
  }


}

