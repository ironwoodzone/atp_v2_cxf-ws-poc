import java.net.MalformedURLException;
import java.net.URL;

import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.datatype.DatatypeConfigurationException;
import com.bookcyprus.webservicesV2.ArrayOfHotelOccupancy;
import com.bookcyprus.webservicesV2.ArrayOfHotelService;
import com.bookcyprus.webservicesV2.EBookingService;
import com.bookcyprus.webservicesV2.EBookingServiceSoap;
import com.bookcyprus.webservicesV2.HotelAvailabilityRequest;
import com.bookcyprus.webservicesV2.HotelOccupancy;
import com.bookcyprus.webservicesV2.HotelService;
import com.bookcyprus.webservicesV2.RequestBase;

public class EBookingServiceSoap12_Client {

	private static final QName SERVICE_NAME = new QName("http://webservicesV2.bookcyprus.com/", "eBookingService");

	public static void main(String[] args) throws MalformedURLException, DatatypeConfigurationException {

		EBookingServiceSoap12_Client eBookingServiceSoap12_Client = new EBookingServiceSoap12_Client();
		eBookingServiceSoap12_Client.send();

	}

	private void send() throws MalformedURLException, DatatypeConfigurationException {

		long smili = System.currentTimeMillis();
		URL wsdlURL = EBookingService.WSDL_LOCATION;
		EBookingService ss = new EBookingService(wsdlURL, SERVICE_NAME);
//		EBookingServiceSoap port = ss.getEBookingServiceSoap12();
		EBookingServiceSoap port = ss.getEBookingServiceSoap();

		long emili = System.currentTimeMillis();

		System.out.println("time taken 1 : " + (emili - smili) / 1000 + "s");

		System.out.println("Invoking hotelAvailabilitySearch...");
		com.bookcyprus.webservicesV2.HotelAvailabilityRequest hotelAvailabilityRequest = new HotelAvailabilityRequest();

		RequestBase requestBase = new RequestBase();
		requestBase.setUserName("premiereservices@testcredentials.com");
		requestBase.setPassword("premservices123");
		requestBase.setCurrency("USD");
		requestBase.setLanguage("EN");

		hotelAvailabilityRequest.setBaseRequest(requestBase);

		GregorianCalendar checkInG = new GregorianCalendar(2022, 6, 28, 13, 24, 56);
		GregorianCalendar checkoutG = new GregorianCalendar(2022, 6, 29, 13, 24, 56);

		XMLGregorianCalendar checkIn = DatatypeFactory.newInstance().newXMLGregorianCalendar(checkInG);
		XMLGregorianCalendar checkout = DatatypeFactory.newInstance().newXMLGregorianCalendar(checkoutG);

		hotelAvailabilityRequest.setFromDate(checkIn);
		hotelAvailabilityRequest.setToDate(checkout);

		HotelOccupancy hotelOccupancy = new HotelOccupancy();
		hotelOccupancy.setAdults(2);

		ArrayOfHotelOccupancy arrayOfHotelOccupancy = new ArrayOfHotelOccupancy();
		arrayOfHotelOccupancy.getHotelOccupancy().add(hotelOccupancy);

		hotelAvailabilityRequest.setOccupancy(arrayOfHotelOccupancy);

		hotelAvailabilityRequest.setLocationId(1957);

		long emili2 = System.currentTimeMillis();

		System.out.println("time taken 2 : " + (emili2 - emili) / 1000 + "s");

		com.bookcyprus.webservicesV2.HotelAvailabilityResponse _hotelAvailabilitySearch__return = port
				.hotelAvailabilitySearch(hotelAvailabilityRequest);
		System.out.println("hotelAvailabilitySearch.result=" + _hotelAvailabilitySearch__return);

		long emili3 = System.currentTimeMillis();

		System.out.println("time taken 3 : " + (emili3 - emili2) / 1000 + "s");

		System.out.println("send()._hotelAvailabilitySearch__return.getBaseResponse().getExecutionTime() : "
				+ _hotelAvailabilitySearch__return.getBaseResponse().getExecutionTime());

		System.out.println("send()._hotelAvailabilitySearch__return.getResultCount() : "
				+ _hotelAvailabilitySearch__return.getResultCount());

		ArrayOfHotelService arrayOfHotelService = _hotelAvailabilitySearch__return.getHotels();

		for (HotelService hotelService : arrayOfHotelService.getHotelService()) {
			System.out.println("send().hotelService.getHotelId() : " + hotelService.getHotelId()
					+ " | hotelService.getHotelName() : " + hotelService.getHotelName());

		}

		long emili4 = System.currentTimeMillis();

		System.out.println("time taken 4 : " + (emili4 - emili3) / 1000 + "s");

	}

}
