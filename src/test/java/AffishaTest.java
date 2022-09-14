
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class AffishaTest {

        @Test
        public void test() {
            Affisha affisha = new Affisha();

            affisha.add("Movie 1");
            affisha.add("Movie 2");
            affisha.add("Movie 3");

            String[] actual = affisha.findAll();
            String[] expected = {"Movie 1", "Movie 2", "Movie 3"};


            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void testFindlast() {
            Affisha affisha = new Affisha();

            affisha.add("Movie 1");
            affisha.add("Movie 2");
            affisha.add("Movie 3");

            String[] actual = affisha.findLast();
            String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
            Assertions.assertArrayEquals(expected, actual);
        }

    }

