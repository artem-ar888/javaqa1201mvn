import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    Movie item1 = new Movie(67890, "Начало", "Триллер, фантастика", "https://example.com/inception-poster.jpg", true);
    Movie item2 = new Movie(23456, "Интерстеллар", "Научная фантастика", "https://example.com/interstellar-poster.jpg", false);
    Movie item3 = new Movie(98765, "Форрест Гамп", "Драма", "https://example.com/forrest-gump-poster.jpg", true);
    Movie item4 = new Movie(54321, "Побег из Шоушенка", "Драма", "https://example.com/shawshank-redemption-poster.jpg", false);
    Movie item5 = new Movie(13579, "Зеленая миля", "Фэнтези, драма", "https://example.com/green-mile-poster.jpg", true);
    Movie item6 = new Movie(24680, "Бойцовский клуб", "Драма, триллер", "https://example.com/fight-club-poster.jpg", false);

    @Test
    public void shouldFindAll() {
        PosterManager manager = new PosterManager();
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);

        Movie[] expected = {item1, item2, item3};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastInEmptyArray() {
        PosterManager manager = new PosterManager();

        Movie[] expected = {};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfArrLessLimit() {
        PosterManager manager = new PosterManager();
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);

        Movie[] expected = {item3, item2, item1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfArrEqualsLimit() {
        PosterManager manager = new PosterManager();
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);
        manager.addMovie(item4);
        manager.addMovie(item5);

        Movie[] expected = {item5, item4, item3, item2, item1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfArrAboveLimit() {
        PosterManager manager = new PosterManager();
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);
        manager.addMovie(item4);
        manager.addMovie(item5);
        manager.addMovie(item6);

        Movie[] expected = {item6, item5, item4, item3, item2};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithCustomLimit() {
        PosterManager manager = new PosterManager(3);
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);
        manager.addMovie(item4);
        manager.addMovie(item5);
        manager.addMovie(item6);

        Movie[] expected = {item6, item5, item4};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithZeroLimit() {
        PosterManager manager = new PosterManager(0);
        manager.addMovie(item1);
        manager.addMovie(item2);
        manager.addMovie(item3);

        Movie[] expected = {};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}