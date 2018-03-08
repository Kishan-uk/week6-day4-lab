import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Darren", "AB123456C", 100, 50);
    }

    @Test
    public void directorHasName(){
        assertEquals("Darren", director.getName());
    }

    @Test
    public void directorHasNiNumber() {
        assertEquals("AB123456C", director.getNiNumber());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(100, director.getSalary());
    }

    @Test
        public void directorHasBonus() {
            assertEquals(101, 101, director.getBonus());
        }

        @Test
        public void directorHasBudget() {
            assertEquals(50, 50, director.budget());
        }

    }