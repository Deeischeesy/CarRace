import javax.swing.*;
import java.awt.image.BufferedImage;


public class CarRaceGUI extends JFrame{

    public static int frameWidth;
    public static int frameHeight;
    public static final long secInNanosec = 1000000000L;
    public static final long milisecInNanosec = 1000000L;
    private final int GAME_FPS = 60;
    private final long GAME_UPDATE_PERIOD = secInNanosec / GAME_FPS;
    public static enum GameState{STARTING, VISUALIZING, GAME_CONTENT_LOADING, MAIN_MENU, OPTIONS, PLAYING, GAMEOVER, DESTROYED}
    public static GameState gameState;
    private long gameTime;
    // It is used for calculating elapsed time.
    private long lastTime;

    // The actual game
    //private Game game;
    private BufferedImage BettingCarMenuImg;

    public CarRaceGUI(){

     super();

    gameState = GameState.VISUALIZING;

    //We start game in new thread.
    Thread gameThread = new Thread() {
        @Override
        public void run(){
            GameLoop();
        }

        private void GameLoop() {
        }
    };
        gameThread.start();



         //sets the title for the frame
        this.setTitle("Racing Bets");
        //setting the size for the frame
        if(true){
            //disabling decorations for the frame
            this.setUndecorated(true);
            //set the frame to full screen
            this.setExtendedState(this.MAXIMIZED_BOTH);
        }
        else{
            //size of the frame
            this.setSize(800,600);
            //put frame in the center of the screen
            this.setLocationRelativeTo(null);
            this.setResizable(false);
        }

        //exit the application when the user presses the exit button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);




    }

}