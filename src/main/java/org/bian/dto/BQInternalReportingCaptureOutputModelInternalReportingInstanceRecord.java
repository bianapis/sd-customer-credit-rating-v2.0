package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalReportingCaptureOutputModelInternalReportingInstanceRecord
 */
public class BQInternalReportingCaptureOutputModelInternalReportingInstanceRecord   {
  private String productServiceActivityReportSchedule = null;


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


}

