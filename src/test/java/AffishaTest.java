
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AffishaTest {

    @Test
    public void testAffishaAdd() {
        Affisha affisha = new Affisha();

        affisha.add("Movie 1");
        affisha.add("Movie 2");
        affisha.add("Movie 3");

        String[] actual = affisha.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindAll() {
        Affisha affisha = new Affisha();
        affisha.add("Movie 1");
        affisha.add("Movie 3");


        String[] actual = affisha.findAll();
        String[] expected = {"Movie 1", "Movie 3"};
    }

    @Test
    public void testFindlast() {
        Affisha affisha = new Affisha();

        affisha.add("Movie 1");
        affisha.add("Movie 2");
        affisha.add("Movie 3");
        affisha.add("Movie 4");

        String[] actual = affisha.findLast();
        String[] expected = {"Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }


}

