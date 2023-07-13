import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable((false));
        /* takes all the componeents and fits them */
        this.pack();
        this.setVisible(true);
        /*makes the window appear in the center of your screen */
        this.setLocationRelativeTo(null);
    }
}
