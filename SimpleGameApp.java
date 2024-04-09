import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleGameApp extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private int playerX, playerY;
    private int enemyX, enemyY;
    private int score;

    public SimpleGameApp() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        playerX = 200;
        playerY = 250;
        enemyX = 100;
        enemyY = 50;
        score = 0;

        timer = new Timer(10, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(playerX, playerY, 20, 20);
        g.setColor(Color.RED);
        g.fillRect(enemyX, enemyY, 20, 20);
        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 10, 20);
    }

    public void actionPerformed(ActionEvent e) {
        if (playerY <= enemyY + 20 && playerY + 20 >= enemyY && playerX <= enemyX + 20 && playerX + 20 >= enemyX) {
            score++;
            enemyX = (int) (Math.random() * 380);
            enemyY = 0;
        }
        enemyY += 2;
        if (enemyY > 300) {
            enemyX = (int) (Math.random() * 380);
            enemyY = 0;
        }
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            if (playerX > 0) {
                playerX -= 5;
            }
        } else if (key == KeyEvent.VK_RIGHT) {
            if (playerX < 380) {
                playerX += 5;
            }
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Game App");
        SimpleGameApp game = new SimpleGameApp();
        //frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


