import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest{
    DatabaseAdmin databaseadmin;

    @Before
    public void before() {
        databaseadmin = new DatabaseAdmin("Finn", "AB123456E", 500);
    }

    @Test
    public void databaseadminHasName() {
        assertEquals("Finn", databaseadmin.getName());
    }

    @Test
    public void databaseadminHasNiNumber() {
        assertEquals("AB123456E", databaseadmin.getNiNumber());
    }

    @Test
    public void databaseadminHasSalary() {
        assertEquals(500, databaseadmin.getSalary());
    }

    @Test
    public void databaseadminHasBonus() {
        assertEquals(505, 505, databaseadmin.getBonus());
    }

}