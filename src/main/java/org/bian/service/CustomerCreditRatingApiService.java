/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerCreditRatingApiService {

	SDCustomerCreditRatingActivateOutputModel activate(SDCustomerCreditRatingActivateInputModel request);
	
	BQAlertsCaptureOutputModel captureAlerts(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAlertsCaptureInputModel request);
	
	BQExternalReportingCaptureOutputModel captureExternalreporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExternalReportingCaptureInputModel request);
	
	BQInternalReportingCaptureOutputModel captureInternalreporting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInternalReportingCaptureInputModel request);
	
	SDCustomerCreditRatingConfigureOutputModel configure(String sdReferenceId, SDCustomerCreditRatingConfigureInputModel request);
	
	CRCustomerCreditRatingStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerCreditRatingStateControlInputModel request);
	
	CRCustomerCreditRatingStateExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCreditRatingStateExchangeInputModel request);
	
	CRCustomerCreditRatingStateExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCreditRatingStateExecuteInputModel request);
	
	SDCustomerCreditRatingFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCreditRatingFeedbackInputModel request);
	
	CRCustomerCreditRatingStateInitiateOutputModel initiate(String sdReferenceId, CRCustomerCreditRatingStateInitiateInputModel request);
	
	CRCustomerCreditRatingStateRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCreditRatingStateRequestInputModel request);
	
	CRCustomerCreditRatingStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAlertsRetrieveOutputModel retrieveAlerts(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQExternalReportingRetrieveOutputModel retrieveExternalreporting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInternalReportingRetrieveOutputModel retrieveInternalreporting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerCreditRatingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
}
