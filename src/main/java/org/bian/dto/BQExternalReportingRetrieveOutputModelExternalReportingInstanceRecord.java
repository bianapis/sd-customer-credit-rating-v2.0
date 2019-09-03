package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportingRetrieveOutputModelExternalReportingInstanceRecord
 */
public class BQExternalReportingRetrieveOutputModelExternalReportingInstanceRecord   {
  private String ratingAgencyReportSchedule = null;

  private String ratingAgencyCreditReportType = null;

  private Object referencetotheratingagencycreditreport = null;

  private Object ratingAgencyCreditReport = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Reference to the report provided by the agency 
   * @return referencetotheratingagencycreditreport
  **/

  public Object getReferencetotheratingagencycreditreport() {
    return referencetotheratingagencycreditreport;
  }

  public void setReferencetotheratingagencycreditreport(Object referencetotheratingagencycreditreport) {
    this.referencetotheratingagencycreditreport = referencetotheratingagencycreditreport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The customer's credit report from the agency 
   * @return ratingAgencyCreditReport
  **/

  public Object getRatingAgencyCreditReport() {
    return ratingAgencyCreditReport;
  }

  public void setRatingAgencyCreditReport(Object ratingAgencyCreditReport) {
    this.ratingAgencyCreditReport = ratingAgencyCreditReport;
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

