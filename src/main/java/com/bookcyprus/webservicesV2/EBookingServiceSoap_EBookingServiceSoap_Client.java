
package com.bookcyprus.webservicesV2;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-30T12:59:13.778+05:30
 * Generated source version: 3.5.2
 *
 */
public final class EBookingServiceSoap_EBookingServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://webservicesV2.bookcyprus.com/", "eBookingService");

    private EBookingServiceSoap_EBookingServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EBookingService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        EBookingService ss = new EBookingService(wsdlURL, SERVICE_NAME);
        EBookingServiceSoap port = ss.getEBookingServiceSoap();

        {
        System.out.println("Invoking transferAvailabilitySearch...");
        com.bookcyprus.webservicesV2.TransferAvailabilityRequest _transferAvailabilitySearch_rq = null;
        com.bookcyprus.webservicesV2.TransferAvailabilityResponse _transferAvailabilitySearch__return = port.transferAvailabilitySearch(_transferAvailabilitySearch_rq);
        System.out.println("transferAvailabilitySearch.result=" + _transferAvailabilitySearch__return);


        }
        {
        System.out.println("Invoking roundtripInfo...");
        com.bookcyprus.webservicesV2.RoundtripInfoRequest _roundtripInfo_rq = null;
        com.bookcyprus.webservicesV2.RoundtripInfoResponse2 _roundtripInfo__return = port.roundtripInfo(_roundtripInfo_rq);
        System.out.println("roundtripInfo.result=" + _roundtripInfo__return);


        }
        {
        System.out.println("Invoking carAvailabilitySearch...");
        com.bookcyprus.webservicesV2.CarAvailabilityRequest _carAvailabilitySearch_rq = null;
        com.bookcyprus.webservicesV2.CarAvailabilityResponse _carAvailabilitySearch__return = port.carAvailabilitySearch(_carAvailabilitySearch_rq);
        System.out.println("carAvailabilitySearch.result=" + _carAvailabilitySearch__return);


        }
        {
        System.out.println("Invoking getReservationList...");
        com.bookcyprus.webservicesV2.ReservationListRetrieveRequest _getReservationList_rq = null;
        com.bookcyprus.webservicesV2.ReservationListRetrieveResponse _getReservationList__return = port.getReservationList(_getReservationList_rq);
        System.out.println("getReservationList.result=" + _getReservationList__return);


        }
        {
        System.out.println("Invoking getAccountDetails...");
        com.bookcyprus.webservicesV2.AccountDetailsRequest _getAccountDetails_rq = null;
        com.bookcyprus.webservicesV2.AccountDetailsResponse _getAccountDetails__return = port.getAccountDetails(_getAccountDetails_rq);
        System.out.println("getAccountDetails.result=" + _getAccountDetails__return);


        }
        {
        System.out.println("Invoking getTransferSearchLocations...");
        com.bookcyprus.webservicesV2.TransferSearchLocationRequest _getTransferSearchLocations_rq = null;
        com.bookcyprus.webservicesV2.TransferSearchLocationResponse _getTransferSearchLocations__return = port.getTransferSearchLocations(_getTransferSearchLocations_rq);
        System.out.println("getTransferSearchLocations.result=" + _getTransferSearchLocations__return);


        }
        {
        System.out.println("Invoking updateReservationClientDetails...");
        com.bookcyprus.webservicesV2.ReservationCustomerUpdateRequest _updateReservationClientDetails_rq = null;
        com.bookcyprus.webservicesV2.ReservationResponse _updateReservationClientDetails__return = port.updateReservationClientDetails(_updateReservationClientDetails_rq);
        System.out.println("updateReservationClientDetails.result=" + _updateReservationClientDetails__return);


        }
        {
        System.out.println("Invoking cancelReservation...");
        com.bookcyprus.webservicesV2.ReservationCancelRequest _cancelReservation_rq = null;
        com.bookcyprus.webservicesV2.ReservationResponse _cancelReservation__return = port.cancelReservation(_cancelReservation_rq);
        System.out.println("cancelReservation.result=" + _cancelReservation__return);


        }
        {
        System.out.println("Invoking getBookingConditions...");
        com.bookcyprus.webservicesV2.BookingConditionsRequest _getBookingConditions_rq = null;
        com.bookcyprus.webservicesV2.BookingConditionsResponse _getBookingConditions__return = port.getBookingConditions(_getBookingConditions_rq);
        System.out.println("getBookingConditions.result=" + _getBookingConditions__return);


        }
        {
        System.out.println("Invoking roundtripExtendedAvailability...");
        com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityRequest _roundtripExtendedAvailability_rq = null;
        com.bookcyprus.webservicesV2.RoundtripExtendedAvailabilityResponse2 _roundtripExtendedAvailability__return = port.roundtripExtendedAvailability(_roundtripExtendedAvailability_rq);
        System.out.println("roundtripExtendedAvailability.result=" + _roundtripExtendedAvailability__return);


        }
        {
        System.out.println("Invoking makeReservation...");
        com.bookcyprus.webservicesV2.ReservationRequest _makeReservation_rq = null;
        com.bookcyprus.webservicesV2.ReservationResponse _makeReservation__return = port.makeReservation(_makeReservation_rq);
        System.out.println("makeReservation.result=" + _makeReservation__return);


        }
        {
        System.out.println("Invoking getSupplierCancellationPolicy...");
        com.bookcyprus.webservicesV2.SupplierCancellationPolicyRequest _getSupplierCancellationPolicy_rq = null;
        com.bookcyprus.webservicesV2.SupplierCancellationPolicyResponse _getSupplierCancellationPolicy__return = port.getSupplierCancellationPolicy(_getSupplierCancellationPolicy_rq);
        System.out.println("getSupplierCancellationPolicy.result=" + _getSupplierCancellationPolicy__return);


        }
        {
        System.out.println("Invoking getReservation...");
        com.bookcyprus.webservicesV2.ReservationRetrieveRequest _getReservation_rq = null;
        com.bookcyprus.webservicesV2.ReservationResponse _getReservation__return = port.getReservation(_getReservation_rq);
        System.out.println("getReservation.result=" + _getReservation__return);


        }
        {
        System.out.println("Invoking getExcursionSearchLocations...");
        com.bookcyprus.webservicesV2.ExcursionSearchLocationRequest _getExcursionSearchLocations_rq = null;
        com.bookcyprus.webservicesV2.ExcursionSearchLocationResponse _getExcursionSearchLocations__return = port.getExcursionSearchLocations(_getExcursionSearchLocations_rq);
        System.out.println("getExcursionSearchLocations.result=" + _getExcursionSearchLocations__return);


        }
        {
        System.out.println("Invoking hotelAvailabilitySearch...");
        com.bookcyprus.webservicesV2.HotelAvailabilityRequest _hotelAvailabilitySearch_rq = null;
        com.bookcyprus.webservicesV2.HotelAvailabilityResponse _hotelAvailabilitySearch__return = port.hotelAvailabilitySearch(_hotelAvailabilitySearch_rq);
        System.out.println("hotelAvailabilitySearch.result=" + _hotelAvailabilitySearch__return);


        }
        {
        System.out.println("Invoking roundtripAvailability...");
        com.bookcyprus.webservicesV2.RoundtripAvailabilityRequest _roundtripAvailability_rq = null;
        com.bookcyprus.webservicesV2.RoundtripAvailabilityResponse2 _roundtripAvailability__return = port.roundtripAvailability(_roundtripAvailability_rq);
        System.out.println("roundtripAvailability.result=" + _roundtripAvailability__return);


        }
        {
        System.out.println("Invoking roundtripList...");
        com.bookcyprus.webservicesV2.RoundtripListRequest _roundtripList_rq = null;
        com.bookcyprus.webservicesV2.RoundtripListResponse2 _roundtripList__return = port.roundtripList(_roundtripList_rq);
        System.out.println("roundtripList.result=" + _roundtripList__return);


        }
        {
        System.out.println("Invoking payReservation...");
        com.bookcyprus.webservicesV2.ReservationPaymentRequest _payReservation_rq = null;
        com.bookcyprus.webservicesV2.ReservationResponse _payReservation__return = port.payReservation(_payReservation_rq);
        System.out.println("payReservation.result=" + _payReservation__return);


        }
        {
        System.out.println("Invoking getExcursionPrice...");
        com.bookcyprus.webservicesV2.ExcursionPriceRequest _getExcursionPrice_rq = null;
        com.bookcyprus.webservicesV2.ExcursionPriceResponse _getExcursionPrice__return = port.getExcursionPrice(_getExcursionPrice_rq);
        System.out.println("getExcursionPrice.result=" + _getExcursionPrice__return);


        }
        {
        System.out.println("Invoking excursionAvailabilitySearch...");
        com.bookcyprus.webservicesV2.ExcursionAvailabilityRequest _excursionAvailabilitySearch_rq = null;
        com.bookcyprus.webservicesV2.ExcursionAvailabilityResponse _excursionAvailabilitySearch__return = port.excursionAvailabilitySearch(_excursionAvailabilitySearch_rq);
        System.out.println("excursionAvailabilitySearch.result=" + _excursionAvailabilitySearch__return);


        }

        System.exit(0);
    }

}
