package psupickanumber;

import javax.swing.UIManager;

public class Startup {

    public static void main(String[] args) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // do nothing, this can safely be ignored because
            // it will fall back to the basic metal L&F if something
            // goes wrong. This is also a rare example of a scenario
            // where the catch clause could be safely eliminated.
        }

        // It's always a good idea to start up a GUI on it's own thread
        // after all pending threads are processed.
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    System.out.println("hello");    
//                    new PickANumberGUI().setVisible(true);
                        new PickANumberDropDownGUI();
                }
        });
    }
}
