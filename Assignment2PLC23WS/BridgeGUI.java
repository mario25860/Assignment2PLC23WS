package Assignment2PLC23WS;
public class BridgeGUI {

    private static void nap(int ms) {
	try {
	    Thread.sleep(ms);
	} catch (InterruptedException e) {}
    }


    public static void main(String[] a) {
	final CarWindow win = new CarWindow();

	win.pack();
	win.setVisible(true);

	new Thread(new Runnable() {
		public void run() {
		    while (true) {
			nap(25);
			win.repaint();
		    }
		}
	    }).start();
    }

}
