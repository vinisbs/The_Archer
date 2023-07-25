import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class ScorePlayer1 {
    private int player1Score = 4;



    public void getplayer1Score() {
        this.player1Score = player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public void updateScores() {
        this.player1Score --;
    }



    public void scores(int player1Score){

            switch (player1Score){
                case 0:
                    Text text5 = new Text(1300,50,"");
                    text5.grow(50,30);
                    text5.setColor(Color.WHITE);
                    text5.draw();
                    break;
                case 1:
                    Text text = new Text(1300,50,"❤");
                    text.grow(20,30);
                    text.setColor(Color.WHITE);
                    text.draw();
                    break;

                case 2:
                    Text text1 = new Text(1300,50,"❤❤");
                    text1.grow(50,30);
                    text1.setColor(Color.WHITE);
                    text1.draw();
                    break;

                case 3:
                    Text text2 = new Text(1300,50,"❤❤❤");
                    text2.grow(50,30);
                    text2.setColor(Color.WHITE);
                    text2.draw();
                    break;

                case 4:
                    Text text3 = new Text(1280,50,"❤❤❤❤");
                    text3.grow(50,30);
                    text3.setColor(Color.WHITE);
                    text3.draw();
                    break;

                case 5:
                    Text text4 = new Text(1300,50,"❤❤❤❤❤");
                    text4.grow(50,30);
                    text4.setColor(Color.WHITE);
                    text4.draw();
                    break;
            }
        }
    }


