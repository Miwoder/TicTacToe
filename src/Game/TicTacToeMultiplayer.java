package Game;

import java.util.Scanner;

public class TicTacToeMultiplayer implements Gamable {

    private char [][] field = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};

    public char[][] getField() {
        return field;
    }

    @Override
    public Boolean isGameOver() {
        if((field[0][0]==field[1][1] && field[0][0]==field[2][2]) || (field[0][2]==field[1][1] && field[0][0]==field[2][0])){
            return true;
        }
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((field[i][0] == field[i + 1][0] && field[i][0] == field[i + 2][0]))
            }
        }
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

    @Override
    public void putSymbol(char[][] field, char symbol) {
        Scanner scanner = new Scanner(System.in);
        int position;

        while (true){
            try {
                position = scanner.nextInt();
                if(position > 0 && position < 10){
                    break;
                }
                else{
                    System.out.println("Please enter position");
                }
            } catch (Exception e) {
                System.out.println("Please enter the number");
                scanner.nextLine();
            }
        }

        switch (position){
            case 1:
                if (field[0][0]=='1'){
                    field[0][0]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            case 2:
                if (field[0][1]=='2'){
                    field[0][1]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            case 3:
                if (field[0][2]=='3'){
                    field[0][2]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            case 4:
                if (field[1][0]=='4'){
                    field[1][0]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            case 5:
                if (field[1][1]=='5'){
                    field[1][1]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            case 6:
                if (field[1][2]=='6'){
                    field[1][2]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            case 7:
                if (field[2][0]=='7'){
                    field[2][0]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            case 8:
                if (field[2][1]=='8'){
                    field[2][1]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            case 9:
                if (field[2][2]=='9'){
                    field[2][2]=symbol;
                }
                else{
                    System.out.println("Choose another position!");
                    putSymbol(field,symbol);
                }
                break;
            default:
                System.out.println("Please, type your position");
                putSymbol(field,symbol);
                break;
        }
    }



}
