package eFiveGetWinnerGame;


import java.util.Arrays;
import java.util.Objects;

public class SearchWinGame {
    private String[] listForSplit;
    private Integer maxPoints = 0;

    public SearchWinGame(String[] listForSplit) {
        this.listForSplit = listForSplit;
        findMaxPoints();
    }

    public void printWinner(){
        if(listForSplit.length!=0) {
            try {
                for(String player: listForSplit){
                    String name = player.split(" ")[0];
                    Integer points = Integer.parseInt(player.split(" ")[1]);
                    if(points==this.maxPoints) {
                        System.out.println("Игрок набравший максимальное колличество очков: "+name+", набравший "+ points+" очков.");
                        break;
                    }
                }

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Вы ввели некорректные данные.");
                System.out.println("Формат вводимых данных: имя_игрока количество_очков" );
                System.out.println("Проверьте ваши данные и попробуйте снова" );
                throw e;
            }

        }
    }
    //находим максимальное колличество очков в игре
    private void findMaxPoints(){
        if(listForSplit.length!=0) {
            try {
                for(String player: listForSplit){
                    Integer points = Integer.parseInt(player.split(" ")[1]);
                    if(points>this.maxPoints) this.maxPoints=points;
                }

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Вы ввели некорректные данные.");
                System.out.println("Формат вводимых данных: имя_игрока количество очков" );
                System.out.println("Проверьте ваши данные и попробуйте снова" );
                throw e;
            }
        }

    }

    public String[] getListForSplit() {
        return listForSplit;
    }

    public Integer getMaxPoints() {
        return maxPoints;
    }

    @Override
    public String toString() {
        return "SearchWinGame{" +
                "listForSplit=" + Arrays.toString(listForSplit) +
                ", maxPoints=" + maxPoints +
                '}';
    }

}
