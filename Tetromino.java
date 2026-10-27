public class Tetromino {
    
    private int x;
    private int y;
    private int[][] shape;
    private int coloridx;

    public Tetromino(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Tetromino(int x, int y, int[][] shape, int coloridx) {
        this.x = x;
        this.y = y;
        this.shape = shape;
        this.coloridx = coloridx;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
