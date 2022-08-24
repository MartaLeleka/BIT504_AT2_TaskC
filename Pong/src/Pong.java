import java.awt.Color;

import javax.swing.JFrame;
public class Pong extends JFrame {
private final static String WINDOW_TITLE = "Pong";
private final static int WINDOW_WIDTH = 600;
private final static int WINDOW_HEIGHT = 600;

public Pong() {
	setTitle(WINDOW_TITLE);
	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setResizable(false);
    add(new PongPannel());
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}

public static void main(String[] args) {      
javax.swing.SwingUtilities.invokeLater(new Runnable() {
	public void run() {
		new Pong();
		}
	});
}
}
