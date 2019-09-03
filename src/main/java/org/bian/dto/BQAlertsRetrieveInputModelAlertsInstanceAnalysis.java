package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertsRetrieveInputModelAlertsInstanceAnalysis
 */
public class BQAlertsRetrieveInputModelAlertsInstanceAnalysis   {
  private String alertsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return alertsInstanceAnalysisReference
  **/

  public String getAlertsInstanceAnalysisReference() {
    return alertsInstanceAnalysisReference;
  }

  public void setAlertsInstanceAnalysisReference(String alertsInstanceAnalysisReference) {
    this.alertsInstanceAnalysisReference = alertsInstanceAnalysisReference;
  }


}

