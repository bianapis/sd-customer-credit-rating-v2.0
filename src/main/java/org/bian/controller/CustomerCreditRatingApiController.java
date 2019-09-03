/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Monitor;

@BianRestController
public class CustomerCreditRatingApiController {

	@Autowired
	CustomerCreditRatingApiService service;
	
	@Monitor.Activate
	public BianResponse<SDCustomerCreditRatingActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerCreditRatingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("alerts")
	@Monitor.Capture
	public BianResponse<BQAlertsCaptureOutputModel> captureAlerts(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAlertsCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureAlerts(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("externalreporting")
	@Monitor.Capture
	public BianResponse<BQExternalReportingCaptureOutputModel> captureExternalreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExternalReportingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureExternalreporting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("internalreporting")
	@Monitor.Capture
	public BianResponse<BQInternalReportingCaptureOutputModel> captureInternalreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInternalReportingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureInternalreporting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Configure
	public BianResponse<SDCustomerCreditRatingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerCreditRatingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Control
	public BianResponse<CRCustomerCreditRatingStateControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCreditRatingStateControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Exchange
	public BianResponse<CRCustomerCreditRatingStateExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCreditRatingStateExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Execute
	public BianResponse<CRCustomerCreditRatingStateExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCreditRatingStateExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Feedback
	public BianResponse<SDCustomerCreditRatingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerCreditRatingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Initiate
	public BianResponse<CRCustomerCreditRatingStateInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerCreditRatingStateInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Request
	public BianResponse<CRCustomerCreditRatingStateRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCreditRatingStateRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Retrieve
	public BianResponse<CRCustomerCreditRatingStateRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Monitor.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Monitor.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Monitor.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("alerts")
	@Monitor.Retrieve
	public BianResponse<BQAlertsRetrieveOutputModel> retrieveAlerts(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAlerts(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("externalreporting")
	@Monitor.Retrieve
	public BianResponse<BQExternalReportingRetrieveOutputModel> retrieveExternalreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveExternalreporting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("internalreporting")
	@Monitor.Retrieve
	public BianResponse<BQInternalReportingRetrieveOutputModel> retrieveInternalreporting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInternalreporting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Monitor.RetrieveSD
	public BianResponse<SDCustomerCreditRatingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
}
