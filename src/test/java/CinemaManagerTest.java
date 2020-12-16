package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {

    CinemaManager manager = new CinemaManager();
    CinemaData film = new CinemaData(7, "Number 1", "comedy");

    @Test
    void addFilm() {

        CinemaData[] actual = manager.addFilm(film);
        CinemaData[] expected = {new CinemaData(1, "Bladshort", "action"),
                new CinemaData(2, "Onward", "cartoon" ),
                new CinemaData(3, "Hotel Belgrad", "comedy" ),
                new CinemaData(4, "Gentlemen", "action"),
                new CinemaData(5, "Invisible", "Thriller"),
                new CinemaData(6, "Troll's tour", "cartoon"),
                new CinemaData(7, "Number 1", "comedy")};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAddedFilms() {
        manager.addFilm(film);
        CinemaData[] actual = manager.showAddedFilms();
        CinemaData[] expected = {new CinemaData(5, "Invisible", "Thriller"),
                new CinemaData(6, "Troll's tour", "cartoon"),
                new CinemaData(7, "Number 1", "comedy")};
    }
}