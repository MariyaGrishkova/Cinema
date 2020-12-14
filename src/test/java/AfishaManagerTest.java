package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
    CinemaData firstForTest = new CinemaData(11, "Number 2", "comedy");
    CinemaData secondForTest = new CinemaData(12, "Number 3", "comedy");
    CinemaData thirdForTest = new CinemaData(13, "Number 4", "comedy");


    @Test
    void addFilm() {
        CinemaData[] returned = new CinemaData[]{firstForTest, secondForTest};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).save(thirdForTest);
        manager.addFilm(thirdForTest);
        CinemaData[] expected = new CinemaData[]{firstForTest, secondForTest,thirdForTest};
        CinemaData[] actual = manager.showAll();
        assertArrayEquals(expected, actual);
    }
}

    @Test
    void shouldShowAll() {
        CinemaData[] returned = new CinemaData[]{firstForTest, secondForTest};
        doReturn(returned).when(list).findAll();
//        doNothing().when(list).save(thirdForTest);
        CinemaData[] expected = new CinemaData[]{firstForTest, secondForTest};
        CinemaData[] actual = manager.showAll();
        assertArrayEquals(expected, actual);
    }
}
