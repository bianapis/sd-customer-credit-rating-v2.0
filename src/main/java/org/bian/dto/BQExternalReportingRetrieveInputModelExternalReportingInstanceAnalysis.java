package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExternalReportingRetrieveInputModelExternalReportingInstanceAnalysis
 */
public class BQExternalReportingRetrieveInputModelExternalReportingInstanceAnalysis   {
  private String externalReportingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return externalReportingInstanceAnalysisReference
  **/

  public String getExternalReportingInstanceAnalysisReference() {
    return externalReportingInstanceAnalysisReference;
  }

  public void setExternalReportingInstanceAnalysisReference(String externalReportingInstanceAnalysisReference) {
    this.externalReportingInstanceAnalysisReference = externalReportingInstanceAnalysisReference;
  }


}

