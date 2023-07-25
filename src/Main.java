import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Main {

    public static void main(String[] args) {


        Grid grid = new Grid(27, 16);
        grid.init();
        Picture scenario = new Picture(10, 10, "resources/Scenarios/Scenario1.png");
        scenario.draw();

        Rectangle rectanglee = new Rectangle(50, 25, 210, 55);
        rectanglee.fill();
        rectanglee.setColor(Color.RED);

        Rectangle rectangle = new Rectangle(52, 28, 205, 50);
        rectangle.fill();
        rectangle.setColor(Color.BLACK);

        Rectangle rectanglef = new Rectangle(1200, 25, 210, 55);
        rectanglef.fill();
        rectanglef.setColor(Color.BLUE);

        Rectangle rectangleg = new Rectangle(1202, 28, 205, 50);
        rectangleg.fill();
        rectangleg.setColor(Color.BLACK);

        Player player = new Player(new Picture(1170, 440, "resources/BlueArcher/BlueArcherLeft.png"));
        player.draw();

        PlayerTwo player2 = new PlayerTwo(new Picture(170, 440, "resources/RedArcher/RedArcherRight.png"));
        player2.draw();

        Handler handler = new Handler(player);
        HandlerTwo handler2 = new HandlerTwo(player2);

        System.out.println("Player Y:" + player.getY());
        System.out.println("Grid Height" + grid.getHeight());

        if (player.getY() == 40) {
            System.out.println("Colide");
        }

    }
}