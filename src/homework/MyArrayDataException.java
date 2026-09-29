package homework;

public class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    public MyArrayDataException(int row, int col, String value) {
        super(String.format("Неверные данные в ячейке [%d][%d]: значение '%s' невозможно преобразовать в число.", row, col, value));
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
}