package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalReportingRetrieveOutputModelInternalReportingInstanceRecord
 */
public class BQInternalReportingRetrieveOutputModelInternalReportingInstanceRecord   {
  private String productServiceActivityReportReference = null;

  private String productServiceActivityReportSchedule = null;

  private Object productServiceActivityReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal bank product and service activity report that is used for the credit assessment 
   * @return productServiceActivityReportReference
  **/

  public String getProductServiceActivityReportReference() {
    return productServiceActivityReportReference;
  }

  public void setProductServiceActivityReportReference(String productServiceActivityReportReference) {
    this.productServiceActivityReportReference = productServiceActivityReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for the upload of the data file/report 
   * @return productServiceActivityReportSchedule
  **/

  public String getProductServiceActivityReportSchedule() {
    return productServiceActivityReportSchedule;
  }

  public void setProductServiceActivityReportSchedule(String productServiceActivityReportSchedule) {
    this.productServiceActivityReportSchedule = productServiceActivityReportSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The report data file/report of customer production activity 
   * @return productServiceActivityReport
  **/

  public Object getProductServiceActivityReport() {
    return productServiceActivityReport;
  }

  public void setProductServiceActivityReport(Object productServiceActivityReport) {
    this.productServiceActivityReport = productServiceActivityReport;
  }


}

