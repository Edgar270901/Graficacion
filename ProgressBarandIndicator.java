import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;

public class ProgressBarandIndicator extends JApplet {
  private JProgressBar pb = new JProgressBar();

  private JSlider sb = new JSlider(JSlider.HORIZONTAL, 0, 100, 60);

  public void init() {
    Container cp = getContentPane();
    cp.setLayout(new GridLayout(2, 1));
    cp.add(pb);
    sb.setValue(0);
    sb.setPaintTicks(true);
    sb.setMajorTickSpacing(20);
    sb.setMinorTickSpacing(5);
    sb.setBorder(new TitledBorder("Deslizame"));
    pb.setModel(sb.getModel()); // Share model
    cp.add(sb);
  }

  public static void main(String[] args) {
    run(new ProgressBarandIndicator(), 300, 200);
  }

  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
    applet.init();
    applet.start();
    frame.setVisible(true);
  }
} ///:~
