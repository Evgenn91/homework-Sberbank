package eFiveGetWinnerGame;


import java.util.*;

public class SearchWinGame {
    private String[] listForSplit;
    Map<String,Integer> listPlayers;

    public SearchWinGame(String[] listForSplit) {
        this.listForSplit = listForSplit;
        this.listPlayers = new HashMap();
    }

    public void printWinner(){
        if(listForSplit.length!=0) {
            try {
                int maxPoints = 0;
                String nameWin ="";
                for(String player: listForSplit){
                    String name = player.split(" ")[0];
                    Integer points = Integer.parseInt(player.split(" ")[1]);
                    if(listPlayers.containsKey(name)){
                        int pointsPlayer = points+listPlayers.get(name);
                        listPlayers.put(name, pointsPlayer);

                        if(pointsPlayer>maxPoints) {
                            maxPoints = pointsPlayer;
                            nameWin=name;
                        }
                    } else {
                        listPlayers.put(name,points);
                        if(points>maxPoints) maxPoints = points;
                    }

                }
                System.out.println("Победитель игры: "+nameWin+", быстрее всех набравший "+maxPoints+" очков." );


            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Вы ввели некорректные данные.");
                System.out.println("Формат вводимых данных: имя_игрока количество_очков" );
                System.out.println("Проверьте ваши данные и попробуйте снова" );
                throw e;
            }

        }
    }


    public String[] getListForSplit() {
        return listForSplit;
    }

    public Map<String, Integer> getListPlayers() {
        return listPlayers;
    }

    @Override
    public String toString() {
        return "SearchWinGame{" +
                "listForSplit=" + Arrays.toString(listForSplit) +
                ", listPlayers=" + listPlayers +
                '}';
    }
}
