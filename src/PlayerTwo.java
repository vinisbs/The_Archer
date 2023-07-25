import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PlayerTwo {

    private Picture player2;

    private Player player1;

    private int direction = 3;

    ScorePlayer2 scorePlayer2 = new ScorePlayer2();

    private int score = 5;


    private Arrow arrow;

    public PlayerTwo(Picture player) {
        this.player2 =player;
        scorePlayer2.Scores(4);
    }

    public void draw(){
        player2.draw();
    }

    public void moveRight() {
        player2.translate(40,0);
        checkMapLimits();
    }

    public void moveLeft() {
        player2.translate(-40,0);
        checkMapLimits();
    }

    public void moveUp() {
        player2.translate(0,-40);
        checkMapLimits();
    }

    public void moveDown() {
        player2.translate(0,40);
        checkMapLimits();
    }

    public void down(){
        player2.load("resources/RedArcher/RedArcherDown.png");
        direction = 1;
    }

    public void up(){
        player2.load("resources/RedArcher/RedArcherUp.png");
        direction = 2;
    }

    public void right(){
        player2.load("resources/RedArcher/RedArcherRight.png");
        direction = 3;
    }

    public void left(){
        player2.load("resources/RedArcher/RedArcherLeft.png");
        direction = 4;
    }
    public void checkMapLimits(){
        if (player2.getX() < 50){
            //o player nao pode passar a parede
            player2.translate(40,0);
        }
        if (player2.getX() > 1300){
            player2.translate(-40,0);
        }
        if (player2.getY() < 80){
            player2.translate(0,40);
        }
        if (player2.getY() > 800){
            player2.translate(0,-40);
        }
    }
    public void shoot(){
        //create different arrows depending on the direction of the player
        int playerX = player2.getX();
        int playerY = player2.getY();
        switch (direction){
            case 1:
                //down
                //create a new picture and delete the previous one and spawn it in the right place
                Picture arrowDown = new Picture(playerX + 40, playerY + 85,"resources/Arrows/Red/RedArrowDown.png");
                arrowDown.draw();


                //use setY to view the arrow in the right place

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (arrowDown.getY() < 840){
                            arrowDown.translate(0, 1);
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        arrowDown.delete();
                    }
                }).start();

                break;
            case 2:
                //up
                Picture arrowUp = new Picture(playerX +46, playerY -40,"resources/Arrows/Red/RedArrowUp.png");
                arrowUp.draw();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (arrowUp.getY() > 80){
                            System.out.println(arrowUp.getY());
                            arrowUp.translate(0, -1);
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        arrowUp.delete();
                    }
                }).start();
                break;
            case 3:
                //right
                Picture arrowRight = new Picture(playerX +84 , playerY +45,"resources/Arrows/Red/RedArrowRight.png");
                arrowRight.draw();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (arrowRight.getX() < 1340){
                            System.out.println(arrowRight.getX());
                            arrowRight.translate(1, 0);
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        arrowRight.delete();
                    }
                }).start();
                break;
            case 4:
                //left
                Picture arrowLeft = new Picture(playerX -39, playerY +40,"resources/Arrows/Red/RedArrowLeft.png");
                arrowLeft.draw();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (arrowLeft.getX() > 50){
                            System.out.println(arrowLeft.getX());
                            arrowLeft.translate(-1, 0);
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        arrowLeft.delete();
                    }
                }).start();


                break;
        }
    }

    public int getX(){
        return player2.getX();
    }

    public int getY(){
        return player2.getY();
    }

    public int setX(int x){
        return player2.getX();
    }

    public int setY(int y){
        return player2.getY();
    }



    public void checkCollision(){

    }


}
