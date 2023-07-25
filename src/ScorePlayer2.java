import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class ScorePlayer2 {

    private int player2Score = 5;

    public void getplayer2Score() {
        this.player2Score = player2Score;
    }





    public void Scores(int player2Score){
        switch (player2Score){
            case 0:
                Text text5 = new Text(140,50,"");
                text5.grow(50,30);
                text5.setColor(Color.WHITE);
                text5.draw();
                break;
            case 1:
                Text text = new Text(155,50,"❤");
                text.grow(20,30);
                text.setColor(Color.WHITE);
                text.draw();
                break;

            case 2:
                Text text1 = new Text(145,50,"❤❤");
                text1.grow(50,30);
                text1.setColor(Color.WHITE);
                text1.draw();
                break;

            case 3:
                Text text2 = new Text(160,50,"❤❤❤");
                text2.grow(50,30);
                text2.setColor(Color.WHITE);
                text2.draw();
                break;

            case 4:
                Text text3 = new Text(130,50,"❤❤❤❤");
                text3.grow(50,30);
                text3.setColor(Color.WHITE);
                text3.draw();
                break;

                case 5:
                Text text4 = new Text(140,50,"❤❤❤❤❤");
                text4.grow(50,30);
                text4.setColor(Color.WHITE);
                text4.draw();
        }
    }



    public void resetScores() {
        player2Score = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(player2Score);
    }

}
