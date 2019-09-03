/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerCreditRatingApiServiceImpl implements CustomerCreditRatingApiService {

	public SDCustomerCreditRatingActivateOutputModel activate(SDCustomerCreditRatingActivateInputModel request){
		return JsonReader.read("activate-SDCustomerCreditRatingActivateOutputModel.json",new TypeReference<SDCustomerCreditRatingActivateOutputModel>(){});
	}
	
	public BQAlertsCaptureOutputModel captureAlerts(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAlertsCaptureInputModel request){
		return JsonReader.read("capture-BQAlertsCaptureOutputModel.json",new TypeReference<BQAlertsCaptureOutputModel>(){});
	}
	
	public BQExternalReportingCaptureOutputModel captureExternalreporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExternalReportingCaptureInputModel request){
		return JsonReader.read("capture-BQExternalReportingCaptureOutputModel.json",new TypeReference<BQExternalReportingCaptureOutputModel>(){});
	}
	
	public BQInternalReportingCaptureOutputModel captureInternalreporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalReportingCaptureInputModel request){
		return JsonReader.read("capture-BQInternalReportingCaptureOutputModel.json",new TypeReference<BQInternalReportingCaptureOutputModel>(){});
	}
	
	public SDCustomerCreditRatingConfigureOutputModel configure(String sdReferenceId, SDCustomerCreditRatingConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerCreditRatingConfigureOutputModel.json",new TypeReference<SDCustomerCreditRatingConfigureOutputModel>(){});
	}
	
	public CRCustomerCreditRatingStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerCreditRatingStateControlInputModel request){
		return JsonReader.read("control-CRCustomerCreditRatingStateControlOutputModel.json",new TypeReference<CRCustomerCreditRatingStateControlOutputModel>(){});
	}
	
	public CRCustomerCreditRatingStateExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCreditRatingStateExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerCreditRatingStateExchangeOutputModel.json",new TypeReference<CRCustomerCreditRatingStateExchangeOutputModel>(){});
	}
	
	public CRCustomerCreditRatingStateExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCreditRatingStateExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerCreditRatingStateExecuteOutputModel.json",new TypeReference<CRCustomerCreditRatingStateExecuteOutputModel>(){});
	}
	
	public SDCustomerCreditRatingFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCreditRatingFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerCreditRatingFeedbackOutputModel.json",new TypeReference<SDCustomerCreditRatingFeedbackOutputModel>(){});
	}
	
	public CRCustomerCreditRatingStateInitiateOutputModel initiate(String sdReferenceId, CRCustomerCreditRatingStateInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerCreditRatingStateInitiateOutputModel.json",new TypeReference<CRCustomerCreditRatingStateInitiateOutputModel>(){});
	}
	
	public CRCustomerCreditRatingStateRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCreditRatingStateRequestInputModel request){
		return JsonReader.read("request-CRCustomerCreditRatingStateRequestOutputModel.json",new TypeReference<CRCustomerCreditRatingStateRequestOutputModel>(){});
	}
	
	public CRCustomerCreditRatingStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerCreditRatingStateRetrieveOutputModel.json",new TypeReference<CRCustomerCreditRatingStateRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAlertsRetrieveOutputModel retrieveAlerts(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAlertsRetrieveOutputModel.json",new TypeReference<BQAlertsRetrieveOutputModel>(){});
	}
	
	public BQExternalReportingRetrieveOutputModel retrieveExternalreporting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQExternalReportingRetrieveOutputModel.json",new TypeReference<BQExternalReportingRetrieveOutputModel>(){});
	}
	
	public BQInternalReportingRetrieveOutputModel retrieveInternalreporting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInternalReportingRetrieveOutputModel.json",new TypeReference<BQInternalReportingRetrieveOutputModel>(){});
	}
	
	public SDCustomerCreditRatingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerCreditRatingRetrieveOutputModel.json",new TypeReference<SDCustomerCreditRatingRetrieveOutputModel>(){});
	}
	
}
