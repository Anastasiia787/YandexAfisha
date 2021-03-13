package tech.itpark.manager;

import tech.itpark.domain.Film;

import java.util.ArrayList;

public class FilmManager {
    private ArrayList<Film> films = new ArrayList<>();

    public void add(Film film) {
        films.add(film);
    }
}
