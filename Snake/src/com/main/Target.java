package com.main;

import java.awt.Color;
import java.awt.Graphics;

public class Target {
	// -- Attributes -- //
	private int x, y; // Defines the position of the target
	private Color color;	// Defines the color of the target
	private int size = 36; // Defines the size of the target
	
	// -- Constructor -- //
	public Target(Color c) {
		this.color = c;
		this.x = (int) ((Math.round(Math.random() * 31.0)) * 36);
		this.y = (int) ((Math.round(Math.random() * 18.0)) * 36);
	}
	
	// -- Methods -- //
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.size, this.size);
	}
}
