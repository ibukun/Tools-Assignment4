package assignment4package;

import java.util.Date;

import model.Guest;
import model.LoyatyProgram;

/*import br.com.thoughtworks.hotelreservation.domain.model.Guest;
import br.com.thoughtworks.hotelreservation.domain.model.LoyatyProgram;*/

public class GuestDAO extends AbstractDAO {

	public Guest find(Long id) throws Exception {
		//TODO: Use database instead of mocked entities
		return new Guest(342585162L, new LoyatyProgram(1L, "Details 1"), "Guest 1", "Datais 1", new Date());
	}

}