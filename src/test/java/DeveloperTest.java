import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest{

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jarrod", "AB123456D", 50);
    }

    @Test
    public void developerHasName() {
        assertEquals("Jarrod", developer.getName());
    }

    @Test
    public void developerHasNiNumber() {
        assertEquals("AB123456D", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(50, developer.getSalary());
    }

    @Test
    public void developerHasBonus() {
        assertEquals(50.50, 50.50, developer.getBonus());
    }

}