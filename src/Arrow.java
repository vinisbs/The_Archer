import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Arrow {

    private int speed = 10;

    private int direction;

    private Picture arrow;

    public Arrow(Picture arrow,int direction) {
        this.direction = direction;

        this.arrow = arrow;
    }

    public void draw() {

        arrow.draw();
    }

    public void move() {

        switch (direction) {

            case 0:
                arrow.translate(speed, 0);
                break;
            case 1:
                arrow.translate(-speed, 0);
                break;
            case 2:
                arrow.translate(0, -speed);
                break;
            case 3:
                arrow.translate(0, speed);
                break;
        }
    }


}
