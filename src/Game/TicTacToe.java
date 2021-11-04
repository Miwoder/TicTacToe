package Game;

import java.util.Scanner;

public class TicTacToe{

    private char [][] field = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};

    public char[][] getField() {
        return field;
    }

    public static void welcome(){
        System.out.println("Choose game mode: \n 1) Singleplayer (with computer) \n 2) Multiplayer \n 3) Exit");
        int variant = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                variant = scanner.nextInt();
                if(variant>0 && variant <4){
                    break;
                }
                else{
                    System.out.println("Please enter 1-3");
                }
            } catch (Exception e) {
                System.out.println("Please enter the number");
                scanner.nextLine();
            }
        }

        switch (variant) {
            case 1:
                System.out.println("Game mode - singleplayer");
                TicTacToe singleplayer = new TicTacToe();
                singleplayer.drawField(singleplayer.getField());
                singleplayer.playWithComputer();
                System.out.println("Would you like to play again? \n 1 - Yes \n 2 - No");
                singleplayer.checkPlayAgain();
                break;
            case 2:
                System.out.println("Game mode - multiplayer");
                TicTacToe multiplayer = new TicTacToe();
                multiplayer.drawField(multiplayer.getField());
                multiplayer.play();
                System.out.println("Would you like to play again? \n 1 - Yes \n 2 - No");
                multiplayer.checkPlayAgain();
                break;
            case 3 :
                break;
            default:
                System.out.println("Please, select 1 or 2");
                break;
        }
    }

    public void checkPlayAgain(){
        int variant = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                variant = scanner.nextInt();
                if(variant>0 && variant <4){
                    break;
                }
                else{
                    System.out.println("Please enter 1 or 2");
                }
            } catch (Exception e) {
                System.out.println("Please enter the number");
                scanner.nextLine();
            }
        }

        if(variant==1){
            welcome();
        }
    }

    public Boolean isGameOver() {
        if((field[0][0]==field[1][1] && field[0][0]==field[2][2]) || (field[0][2]==field[1][1] && field[0][0]==field[2][0])){
            System.out.println("GAME OVER!");
            return true;
        }
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][2] == field[i][0] ||
                    field[0][i] == field[1][i] && field[2][i] == field[0][i]) {
                System.out.println("GAME OVER!");
                return true;
            }
        }
        return false;
    }

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

    public void putSymbolComputer(char[][] field, char symbol) {
        int position = (int) (Math.random() * 9);

        switch (position){
            case 1:
                if (field[0][0]=='1'){
                    field[0][0]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            case 2:
                if (field[0][1]=='2'){
                    field[0][1]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            case 3:
                if (field[0][2]=='3'){
                    field[0][2]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            case 4:
                if (field[1][0]=='4'){
                    field[1][0]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            case 5:
                if (field[1][1]=='5'){
                    field[1][1]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            case 6:
                if (field[1][2]=='6'){
                    field[1][2]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            case 7:
                if (field[2][0]=='7'){
                    field[2][0]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            case 8:
                if (field[2][1]=='8'){
                    field[2][1]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            case 9:
                if (field[2][2]=='9'){
                    field[2][2]=symbol;
                }
                else{
                    putSymbolComputer(field,symbol);
                }
                break;
            default:
                putSymbolComputer(field,symbol);
                break;
        }
    }

    public void play() {
        for(int i = 0; i<5 ; i++){
            System.out.println("Please, select position for X");
            putSymbol(field, 'X');
            drawField(field);
            if(isGameOver()){
                break;
            }
            if(i!=4){
                System.out.println("Please, select position for O");
                putSymbol(field, 'O');
                drawField(field);
                if(isGameOver()){
                    break;
                }
            }
            else{
                System.out.println("GAME OVER");
                break;
            }
        }
    }

    public void playWithComputer() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Please, select position for X");
            putSymbol(field, 'X');
            if (isGameOver()) {
                break;
            }
            if (i != 4) {
                putSymbolComputer(field, 'O');
                drawField(field);
                if (isGameOver()) {
                    break;
                }
            } else {
                System.out.println("GAME OVER");
                break;
            }

        }
    }

}
