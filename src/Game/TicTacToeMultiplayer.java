package Game;

public class TicTacToeMultiplayer implements Gamable {


    @Override
    public Boolean isLost() {
        return null;
    }

    @Override
    public void drawField(char[][] field) {
        for (int i = 0; i<5 ; i++){
            if(i==0){
                System.out.println(field[0][0] + " | " + field[0][1] + " | " + field[0][2]);
            }
            if(i==2){
                System.out.println(field[1][0] + " | " + field[1][1] + " | " + field[1][2]);
            }
            if(i==4){
                System.out.println(field[2][0] + " | " + field[2][1] + " | " + field[2][2]);
            }
            if(i%2==1){
                System.out.println("----------");
            }
        }
    }

}
