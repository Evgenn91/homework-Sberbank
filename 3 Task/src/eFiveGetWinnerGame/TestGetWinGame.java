package eFiveGetWinnerGame;

/**
 *Необходимо написать функцию, которая на вход получает массив строк, в формате имя_игрока количество_очков.
 * 	Необходимо вывести победителя данной игры. Победителем считается тот, кто раньше набрал максимальное количество очков.
 */

public class TestGetWinGame {
    public static void main(String[] args) {
        //вводные данные:
        String[] listPlayers = new String[]{"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"
        };

        SearchWinGame searchWinGame = new SearchWinGame(listPlayers);
        searchWinGame.printWinner();

    }
}
