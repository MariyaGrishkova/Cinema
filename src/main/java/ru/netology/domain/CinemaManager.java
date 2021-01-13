package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CinemaManager {
    private int neededQuantityOfFilmsToAdd = 3;
    CinemaData[] list = {new CinemaData(
    int id;
    string name;
    string genre);
}

    public CinemaData[] addFilm(CinemaData film) {
        int length = list.length + 1;
        CinemaData[] addedFilm = new CinemaData[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = film;
        list = addedFilm;
        System.out.println(list);
        return list;

//        for (int i = 0; i < list.length; i++) {
//            System.out.println(i);
    }


    public CinemaData[] showAddedFilms() {
        for (int i = list.length - 1; i > list.length - (neededQuantityOfFilmsToAdd + 1) & i >= 0; i--) {
            System.out.print(list[i]);
        }
            for (int i = list.length; i > list.length - (neededQuantityOfFilmsToAdd + 1) & i <=10; i--){
            System.out.print(list[i])
        }

        return new CinemaData[0];
    }

}
