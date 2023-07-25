import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private final Picture player1;
    private int direction = 4;

    private PlayerTwo player2;

    private ScorePlayer1 scorePlayer1 = new ScorePlayer1();

    public Player(Picture player) {
        this.player1 =player;
        scorePlayer1.scores(4);
    }

    public void draw(){
        player1.draw();
    }

    public void moveRight() {
        player1.translate(40,0);
        checkMapLimits();
    }

    public void moveLeft() {
        player1.translate(-40,0);
        System.out.println(player1.getX());
        checkMapLimits();
    }

    public void moveUp() {
        player1.translate(0,-40);
        System.out.println(player1.getY());
        checkMapLimits();
    }
    public void moveDown() {
        player1.translate(0,40);
        checkMapLimits();
    }

    public void down(){
        player1.load("resources/BlueArcher/BlueArcherDown.png");
        direction = 1;
    }

    public void up(){
        player1.load("resources/BlueArcher/BlueArcherUp.png");
        direction = 2;
    }


    public void right(){
        player1.load("resources/BlueArcher/BlueArcherRight.png");
        direction = 3;
    }

    public void left(){
        player1.load("resources/BlueArcher/BlueArcherLeft.png");
        direction = 4;
    }

    public int getX(){
        return player1.getX();
    }

    public int getY(){
        return player1.getY();
    }

    public void shoot(){
        //create different arrows depending on the direction of the player
        int playerX = player1.getX();
        int playerY = player1.getY();
        switch (direction){
            case 1:
                //down
                //create a new picture and delete the previous one and spawn it in the right place
                Picture arrowDown = new Picture(playerX + 40, playerY + 85,"resources/Arrows/Blue/BlueArrowDown.png");
                arrowDown.draw();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (arrowDown.getY() < 840){
                            arrowDown.translate(0, 1);

                            if(arrowDown.getX() == player2.getX())



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
                Picture arrowUp = new Picture(playerX +46, playerY -40,"resources/Arrows/Blue/BlueArrowUp.png");
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
                Picture arrowRight = new Picture(playerX +84, playerY +45,"resources/Arrows/Blue/BlueArrowRight.png");
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
                Picture arrowLeft = new Picture(playerX -39, playerY +40,"resources/Arrows/Blue/BlueArrowLeft.png");
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

    public void checkMapLimits(){
        if (player1.getX() < 50){
            player1.translate(40,0);
        }
        if (player1.getX() > 1300){
            player1.translate(-40,0);
        }
        if (player1.getY() < 80){
            player1.translate(0,40);
        }
        if (player1.getY() > 800){
            player1.translate(0,-40);
        }
    }

    public void checkColission(){


    }
}
