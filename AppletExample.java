import java.applet.Applet;
import java.awt.Graphics;

// To run this code, save it as AppletExample.java and run it in an applet viewer
public class AppletExample extends Applet {

    @Override
    public void init() {
        System.out.println("Applet initialized.");
    }

    @Override
    public void start() {
        System.out.println("Applet started.");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 20, 20); // Draw text on applet window
    }

    @Override
    public void stop() {
        System.out.println("Applet stopped.");
    }

    @Override
    public void destroy() {
        System.out.println("Applet destroyed.");
    }
}
