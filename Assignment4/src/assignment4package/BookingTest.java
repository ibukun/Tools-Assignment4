package assignment4package;

import model.Booking;
import model.BookingRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*import br.com.thoughtworks.hotelreservation.domain.model.Booking;
import br.com.thoughtworks.hotelreservation.domain.model.BookingRepositoryImpl;*/

public class BookingTest {

	private Booking booking;

	@Before
	public void initialize() {
		setBooking(new Booking(new BookingRepositoryImpl()));
	}

	@Test
	public void shouldFindCheapestHotel() {
		try {
		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();
		}
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}


}