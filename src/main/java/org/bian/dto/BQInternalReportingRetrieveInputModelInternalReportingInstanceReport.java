package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInternalReportingRetrieveInputModelInternalReportingInstanceReport
 */
public class BQInternalReportingRetrieveInputModelInternalReportingInstanceReport   {
  private String internalReportingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return internalReportingInstanceReportReference
  **/

  public String getInternalReportingInstanceReportReference() {
    return internalReportingInstanceReportReference;
  }

  public void setInternalReportingInstanceReportReference(String internalReportingInstanceReportReference) {
    this.internalReportingInstanceReportReference = internalReportingInstanceReportReference;
  }


}

