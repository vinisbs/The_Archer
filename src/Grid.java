import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    public static final int PADDING = 10;
    private final int cols;
    private final int rows;

    private int width;

    private int height;

    private int x = 56;

    private int y = 80;



    private final int cellSize = 50;

    private Rectangle field;

    public Grid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;

    }


    public void init(){
        Rectangle background = new Rectangle(x, y, cols * cellSize, rows * cellSize);
        background.draw();
        background.setColor(Color.WHITE);
    }

    public int getCols(){
        return this.cols;
    }

    public int getRows(){
        return this.rows;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getX(){
        return field.getX();



    }

    public int getY(){
        return field.getY();
    }

    public int getCellSize(){
        return this.cellSize;
    }

    public int rowToY(int row){
        return PADDING + cellSize * row;
    }

    public int columnToX(int column){
        return PADDING + cellSize * column;
    }
}
