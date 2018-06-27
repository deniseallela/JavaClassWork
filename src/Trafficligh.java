import java.awt.*;
import javax.swing.*;
public class Trafficligh {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = initializeFrame();
        Light l1 = new Light();
        frame.add(l1);
        while (true) {
            l1.incrementValue();
            Thread.sleep(500);
            l1.swapEm();
        }
    }
    private static JFrame initializeFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("OUR TRAFFIC LIGHT SYSTEM");
        frame.setSize(250, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

    static class Light extends JPanel{
        private static final long serialVersionUID = 1L;
        private int mValue = 0;
        private int mDistance = 90;
        private int topLightHeight = 10;
        private Color mRed = Color.red;
        private Color mYellow = Color.black;
        private Color mGreen = Color.black;
        Light() {
        }

        public void paintComponent(Graphics g) {
            defineLight(g);
        }
        public int getValue() {
            return this.mValue;
        }
        public void setLighDistance(int distance) {

            this.mDistance = distance;
        }

        public void incrementValue() {
            if (this.mValue == 25) {
                this.mValue = -1;
            }

            this.mValue = this.mValue + 1;
        }

        public void swapEm() {
            if (this.mValue == 0) {
                this.mYellow = Color.black;
                this.mRed = Color.red;

            }

            if (this.mValue == 10) {
                this.mRed = Color.black;
                this.mYellow = Color.yellow;

            }
            if (this.mValue == 15) {
                this.mRed = Color.black;
                this.mYellow = Color.black;
                this.mGreen = Color.green;
            }
            if (this.mValue == 20) {
                this.mGreen = Color.black;
                this.mYellow = Color.yellow;

            }
            repaint();

        }

        public void defineLight(Graphics g) {

            g.setColor(this.mRed);
            g.fillRoundRect(80, this.topLightHeight, 80, 80, 70, 70);


            g.setColor(this.mYellow);
            g.fillRoundRect(80, this.topLightHeight + this.mDistance, 80, 80, 70, 70);

            g.setColor(this.mGreen);
            g.fillRoundRect(80, this.topLightHeight + 2 * this.mDistance, 80, 80, 70, 70);

        }

    }
}