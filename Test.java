import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    public void testStatement() {

        Customer usuario = new Customer("Gabriel");

        Movie m1 = new Movie("filme 1",1);
        Movie m2 = new Movie("filme 2",2);

        Rental r_1 = new Rental(m1,2);
        Rental r_2 = new Rental(m2,3);

        usuario.addRental(r_1);
        usuario.addRental(r_2);

        String expResultado = "Rental Record for Nickolas\n\tfilme 1\t4.5\n\tO filme 2\t9.5\nAmount owed is 14.0\nYou earned 2 frequent renter points";
        String resultado = usuario.statement();

        assertEquals(expResultado, resultado);
    }

}