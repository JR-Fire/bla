package javaEssentials.examples;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ExampleApplet extends Applet {
//	<HTML> 
//	 <BODY> 
//	 <APPLET CODE=SimpleApplet.class WIDTH=200 HEIGHT=100> 
//	 </APPLET> 
//	 </BODY> 
//	 </HTML>
	private ExampleIO IoWrapper;

	public void init() {
		IoWrapper = new ExampleIO("I'm a simple applet!");
		setBackground(Color.cyan);
	}

	public void start() {
		System.out.println("Starting...");
	}

	public void stop() {
		System.out.println("Stopping...");
	}

	public void destroy() {
		System.out.println("Unloading...");
	}

	public void paint(Graphics g) {
		System.out.println("Painting...");
		
		g.setColor(Color.blue);
		g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);
		g.setColor(Color.red);
		g.drawString(IoWrapper.getText(), 15, 25);
		
		System.out.println("Done.");
	}
}
