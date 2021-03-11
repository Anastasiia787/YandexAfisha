package tech.itpark;

import tech.itpark.domain.Film;
import tech.itpark.manager.FilmManager;

public class Main {
    public static void main(String[] args) {
        FilmManager manager = new FilmManager();

        Film filmOne = new Film(
                1,
                "https://afisha.yandex.ru/kazan/cinema/para-iz-budushchego?source=selection-events",
                "https://afisha.yandex.ru/kazan/cinema/para-iz-budushchego?source=selection-events",
                "Пара из будущего",
                7.1,
                false,
                "Есть билеты",
                9);
        manager.add(filmOne);

        Film filmTwo = new Film(
                2,
                "https://afisha.yandex.ru/kazan/cinema/raya-i-posledniy-drakon?source=selection-events",
                "https://afisha.yandex.ru/kazan/cinema/raya-i-posledniy-drakon?source=selection-events",
                "Райя и последний дракон",
                7.8,
                false,
                "Есть билеты",
                9);
        manager.add(filmTwo);

        Film filmThree = new Film(
                3,
                "https://afisha.yandex.ru/kazan/cinema/batia-2020?source=selection-events",
                "https://afisha.yandex.ru/kazan/cinema/batia-2020?source=selection-events",
                "Батя",
                7.3,
                false,
                "Есть билеты",
                9);
        manager.add(filmThree);
    }
}
