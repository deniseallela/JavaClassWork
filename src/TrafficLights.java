import javafx.scene.effect.Light;

import javax.swing.*;
import java.awt.*;

public class TrafficLights {
    public static void main(String[] args) throws InterruptedException {
         /*A Jframe is an extension of the
        class java.awt.It is a window that has
        a close,minimize and maximize button
        and a border around it...
        * */
        JFrame frame = initializeFrame();
        Light lightit = new Light();
        frame.add(lightit);
        while (true) {
            lightit.incrementValue();
            //colors will change after every 500 milliseconds
            Thread.sleep(500);
            lightit.swamEm();
        }
    }
//function call for initialize JFrame
            /*private means that this elements are
            only accessed from where they have
        been declared*/

    private static JFrame initializeFrame() {
        //define JFrame properties
        JFrame frame = new JFrame();
        frame.setTitle("TRAFFIC LIGHT");
        //set size for the frame
        frame.setSize(250, 400);
        /*set it to work such that when one
         * clicks on the close button it will exit the interface*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

    static class Light extends JPanel {
        //serialVersionUID is a universal identifier for a resizeable class
        /*private means that this elements are only accessed from where they have
        been declared*/
        private static final long serialVersionUID = 1L;
        private int jValue = 0;
        private int jDistance = 90;
        private int topLightHeight = 10;
        private Color jRed = Color.red;
        private Color jYellow = Color.black;
        private Color jGreen = Color.black;

        Light() {

        }
        public void paintComponent(Graphics g) {
            defineLight(g);
        }

        public int getValue() {
            return this.jValue;
        }

        public void setLighDistance(int distance) {
            this.jDistance = distance;
        }
        public void incrementValue() {
            if (this.jValue == 25) {
                this.jValue = -1;
            }
            this.jValue = this.jValue + 1;
        }
        public void swamEm() {
            if (this.jValue == 0) {
                this.jYellow = Color.black;
                this.jRed = Color.red;
            }
            if (this.jValue == 10) {
                this.jRed = Color.black;
                this.jYellow = Color.yellow;
            }
            if (this.jValue==15){
                this.jRed=Color.black;
                this.jYellow=Color.black;
                this.jGreen=Color.green;
            }
            if (this.jValue==20){
                this.jGreen=Color.black;
                this.jYellow=Color.yellow;
            }
            repaint();
        }
        public void defineLight(Graphics g){
            g.setColor(this.jRed);
            g.fillRoundRect(80,this.topLightHeight,
                    80,80,70,70);
            g.setColor(this.jYellow);
            g.fillRoundRect(80,this.topLightHeight+
                            this.jDistance,
                    80,80,70,70);
            g.setColor(this.jGreen);
            g.fillRoundRect(80,this.topLightHeight+2*
                            this.jDistance,
                    80,80,70,70);
        }

    }
}

