package Game;

public interface Gamable {
    Boolean isGameOver();
    void drawField(char[][] field);
    void putSymbol(char[][] field, char symbol);
}
