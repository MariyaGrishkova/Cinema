import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AfishaRepositoryTest {

    AfishaRepository repo = new AfishaRepository();

    @Test
    void shouldFindAll() {
        CinemaData[] expected = {new CinemaData(1, "Bladshort", "action"),
                new CinemaData(2, "Onward", "cartoon"),
                new CinemaData(3, "Hotel Belgrad", "comedy"),
                new CinemaData(4, "Gentlemen", "action"),
                new CinemaData(5, "Invisible", "Thriller"),
                new CinemaData(6, "Troll's tour", "cartoon"),
                new CinemaData(7, "Number 1", "comedy")};

        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSave() {
        repo.save(repo.film);
        CinemaData[] expected = {new CinemaData(1, "Bladshort", "action"),
                new CinemaData(2, "Onward", "cartoon"),
                new CinemaData(3, "Hotel Belgrad", "comedy"),
                new CinemaData(4, "Gentlemen", "action"),
                new CinemaData(5, "Invisible", "Thriller"),
                new CinemaData(6, "Troll's tour", "cartoon"),
                new CinemaData(7, "Number 1", "comedy"),
                new CinemaData(8, "One more", "comedy")};
        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldFindByID() {
        CinemaData expected = new CinemaData(2, "Onward", "cartoon");
        CinemaData actual = repo.findByID(2);
        assertEquals(expected, actual);


    }

    @Test
    void shouldRemoveById() {
        repo.removeById(4);
        CinemaData[] expected = {new CinemaData(1, "Bladshort", "action"),
                new CinemaData(2, "Onward", "cartoon"),
                new CinemaData(3, "Hotel Belgrad", "comedy"),
                new CinemaData(4, "Gentlemen", "action"),
                new CinemaData(5, "Invisible", "Thriller"),
                new CinemaData(6, "Troll's tour", "cartoon"),
                new CinemaData(7, "Number 1", "comedy")};
        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdIfIDDoesNotExist() {
        repo.removeById(13);
        CinemaData[] expected = {new CinemaData(1, "Bladshort", "action"),
                new CinemaData(2, "Onward", "cartoon"),
                new CinemaData(3, "Hotel Belgrad", "comedy"),
                new CinemaData(4, "Gentlemen", "action"),
                new CinemaData(5, "Invisible", "Thriller"),
                new CinemaData(6, "Troll's tour", "cartoon"),
                new CinemaData(7, "Number 1", "comedy")};
        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }



    @Test
    void shouldRemoveAll() {
        repo.removeAll();
        CinemaData[] expected = {};
        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);

    }
}

