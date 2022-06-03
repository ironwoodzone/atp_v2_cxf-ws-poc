package com.bookcyprus.webservicesV2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-30T12:59:13.796+05:30
 * Generated source version: 3.5.2
 *
 */
@WebService(targetNamespace = "http://webservicesV2.bookcyprus.com/", name = "eBookingServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface EBookingServiceSoap {

    @WebMethod(operationName = "TransferAvailabilitySearch", action = "http://webservicesV2.bookcyprus.com/TransferAvailabilitySearch")
    @RequestWrapper(localName = "TransferAvailabilitySearch", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.TransferAvailabilitySearch")
    @ResponseWrapper(localName = "TransferAvailabilitySearchResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.TransferAvailabilitySearchResponse")
    @WebResult(name = "TransferAvailabilitySearchResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.TransferAvailabilityResponse transferAvailabilitySearch(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.TransferAvailabilityRequest rq
    );

    @WebMethod(operationName = "RoundtripInfo", action = "http://webservicesV2.bookcyprus.com/RoundtripInfo")
    @RequestWrapper(localName = "RoundtripInfo", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.RoundtripInfo")
    @ResponseWrapper(localName = "RoundtripInfoResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.RoundtripInfoResponse")
    @WebResult(name = "RoundtripInfoResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.RoundtripInfoResponse2 roundtripInfo(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.RoundtripInfoRequest rq
    );

    @WebMethod(operationName = "CarAvailabilitySearch", action = "http://webservicesV2.bookcyprus.com/CarAvailabilitySearch")
    @RequestWrapper(localName = "CarAvailabilitySearch", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.CarAvailabilitySearch")
    @ResponseWrapper(localName = "CarAvailabilitySearchResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.CarAvailabilitySearchResponse")
    @WebResult(name = "CarAvailabilitySearchResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.CarAvailabilityResponse carAvailabilitySearch(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.CarAvailabilityRequest rq
    );

    @WebMethod(operationName = "GetReservationList", action = "http://webservicesV2.bookcyprus.com/GetReservationList")
    @RequestWrapper(localName = "GetReservationList", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetReservationList")
    @ResponseWrapper(localName = "GetReservationListResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetReservationListResponse")
    @WebResult(name = "GetReservationListResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ReservationListRetrieveResponse getReservationList(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ReservationListRetrieveRequest rq
    );

    @WebMethod(operationName = "GetAccountDetails", action = "http://webservicesV2.bookcyprus.com/GetAccountDetails")
    @RequestWrapper(localName = "GetAccountDetails", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetAccountDetails")
    @ResponseWrapper(localName = "GetAccountDetailsResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetAccountDetailsResponse")
    @WebResult(name = "GetAccountDetailsResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.AccountDetailsResponse getAccountDetails(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.AccountDetailsRequest rq
    );

    @WebMethod(operationName = "GetTransferSearchLocations", action = "http://webservicesV2.bookcyprus.com/GetTransferSearchLocations")
    @RequestWrapper(localName = "GetTransferSearchLocations", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetTransferSearchLocations")
    @ResponseWrapper(localName = "GetTransferSearchLocationsResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetTransferSearchLocationsResponse")
    @WebResult(name = "GetTransferSearchLocationsResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.TransferSearchLocationResponse getTransferSearchLocations(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.TransferSearchLocationRequest rq
    );

    @WebMethod(operationName = "UpdateReservationClientDetails", action = "http://webservicesV2.bookcyprus.com/UpdateReservationClientDetails")
    @RequestWrapper(localName = "UpdateReservationClientDetails", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.UpdateReservationClientDetails")
    @ResponseWrapper(localName = "UpdateReservationClientDetailsResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.UpdateReservationClientDetailsResponse")
    @WebResult(name = "UpdateReservationClientDetailsResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ReservationResponse updateReservationClientDetails(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ReservationCustomerUpdateRequest rq
    );

    @WebMethod(operationName = "CancelReservation", action = "http://webservicesV2.bookcyprus.com/CancelReservation")
    @RequestWrapper(localName = "CancelReservation", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.CancelReservation")
    @ResponseWrapper(localName = "CancelReservationResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.CancelReservationResponse")
    @WebResult(name = "CancelReservationResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ReservationResponse cancelReservation(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ReservationCancelRequest rq
    );

    @WebMethod(operationName = "GetBookingConditions", action = "http://webservicesV2.bookcyprus.com/GetBookingConditions")
    @RequestWrapper(localName = "GetBookingConditions", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetBookingConditions")
    @ResponseWrapper(localName = "GetBookingConditionsResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetBookingConditionsResponse")
    @WebResult(name = "GetBookingConditionsResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.BookingConditionsResponse getBookingConditions(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.BookingConditionsRequest rq
    );

    @WebMethod(operationName = "RoundtripExtendedAvailability", action = "http://webservicesV2.bookcyprus.com/RoundtripExtendedAvailability")
    @RequestWrapper(localName = "RoundtripExtendedAvailability", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.RoundtripExtendedAvailability")
    @ResponseWrapper(localName = "RoundtripExtendedAvailabilityResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse")
    @WebResult(name = "RoundtripExtendedAvailabilityResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse2 roundtripExtendedAvailability(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityRequest rq
    );

    @WebMethod(operationName = "MakeReservation", action = "http://webservicesV2.bookcyprus.com/MakeReservation")
    @RequestWrapper(localName = "MakeReservation", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.MakeReservation")
    @ResponseWrapper(localName = "MakeReservationResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.MakeReservationResponse")
    @WebResult(name = "MakeReservationResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ReservationResponse makeReservation(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ReservationRequest rq
    );

    @WebMethod(operationName = "GetSupplierCancellationPolicy", action = "http://webservicesV2.bookcyprus.com/GetSupplierCancellationPolicy")
    @RequestWrapper(localName = "GetSupplierCancellationPolicy", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetSupplierCancellationPolicy")
    @ResponseWrapper(localName = "GetSupplierCancellationPolicyResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetSupplierCancellationPolicyResponse")
    @WebResult(name = "GetSupplierCancellationPolicyResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse getSupplierCancellationPolicy(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.SupplierCancellationPolicyRequest rq
    );

    @WebMethod(operationName = "GetReservation", action = "http://webservicesV2.bookcyprus.com/GetReservation")
    @RequestWrapper(localName = "GetReservation", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetReservation")
    @ResponseWrapper(localName = "GetReservationResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetReservationResponse")
    @WebResult(name = "GetReservationResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ReservationResponse getReservation(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ReservationRetrieveRequest rq
    );

    @WebMethod(operationName = "GetExcursionSearchLocations", action = "http://webservicesV2.bookcyprus.com/GetExcursionSearchLocations")
    @RequestWrapper(localName = "GetExcursionSearchLocations", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetExcursionSearchLocations")
    @ResponseWrapper(localName = "GetExcursionSearchLocationsResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetExcursionSearchLocationsResponse")
    @WebResult(name = "GetExcursionSearchLocationsResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse getExcursionSearchLocations(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ExcursionSearchLocationRequest rq
    );

    @WebMethod(operationName = "HotelAvailabilitySearch", action = "http://webservicesV2.bookcyprus.com/HotelAvailabilitySearch")
    @RequestWrapper(localName = "HotelAvailabilitySearch", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.HotelAvailabilitySearch")
    @ResponseWrapper(localName = "HotelAvailabilitySearchResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.HotelAvailabilitySearchResponse")
    @WebResult(name = "HotelAvailabilitySearchResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.HotelAvailabilityResponse hotelAvailabilitySearch(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.HotelAvailabilityRequest rq
    );

    @WebMethod(operationName = "RoundtripAvailability", action = "http://webservicesV2.bookcyprus.com/RoundtripAvailability")
    @RequestWrapper(localName = "RoundtripAvailability", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.RoundtripAvailability")
    @ResponseWrapper(localName = "RoundtripAvailabilityResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse")
    @WebResult(name = "RoundtripAvailabilityResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse2 roundtripAvailability(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.RoundtripAvailabilityRequest rq
    );

    @WebMethod(operationName = "RoundtripList", action = "http://webservicesV2.bookcyprus.com/RoundtripList")
    @RequestWrapper(localName = "RoundtripList", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.RoundtripList")
    @ResponseWrapper(localName = "RoundtripListResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.RoundtripListResponse")
    @WebResult(name = "RoundtripListResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.RoundtripListResponse2 roundtripList(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.RoundtripListRequest rq
    );

    @WebMethod(operationName = "PayReservation", action = "http://webservicesV2.bookcyprus.com/PayReservation")
    @RequestWrapper(localName = "PayReservation", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.PayReservation")
    @ResponseWrapper(localName = "PayReservationResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.PayReservationResponse")
    @WebResult(name = "PayReservationResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ReservationResponse payReservation(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ReservationPaymentRequest rq
    );

    @WebMethod(operationName = "GetExcursionPrice", action = "http://webservicesV2.bookcyprus.com/GetExcursionPrice")
    @RequestWrapper(localName = "GetExcursionPrice", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetExcursionPrice")
    @ResponseWrapper(localName = "GetExcursionPriceResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.GetExcursionPriceResponse")
    @WebResult(name = "GetExcursionPriceResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ExcursionPriceResponse getExcursionPrice(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ExcursionPriceRequest rq
    );

    @WebMethod(operationName = "ExcursionAvailabilitySearch", action = "http://webservicesV2.bookcyprus.com/ExcursionAvailabilitySearch")
    @RequestWrapper(localName = "ExcursionAvailabilitySearch", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.ExcursionAvailabilitySearch")
    @ResponseWrapper(localName = "ExcursionAvailabilitySearchResponse", targetNamespace = "http://webservicesV2.bookcyprus.com/", className = "com.bookcyprus.webservicesV2.ExcursionAvailabilitySearchResponse")
    @WebResult(name = "ExcursionAvailabilitySearchResult", targetNamespace = "http://webservicesV2.bookcyprus.com/")
    public com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse excursionAvailabilitySearch(

        @WebParam(name = "rq", targetNamespace = "http://webservicesV2.bookcyprus.com/")
        com.bookcyprus.webservicesV2.ExcursionAvailabilityRequest rq
    );
}