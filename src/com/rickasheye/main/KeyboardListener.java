package com.rickasheye.main;
// Simple Java Game Engine Template
// Created by Zackary (Firal) Misso
// This code is free to use

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyboardListener implements KeyListener{
	private boolean[] keys; // the list of keys that could be pressed
	
	public KeyboardListener(){
		keys=new boolean[256];
	}
	
	// what happens when a key is pressed
	public void keyPressed(KeyEvent event){
		keys[event.getKeyCode()]=true;
                    
   	}
	
	// what happens when a key is released
	public void keyReleased(KeyEvent event){
		keys[event.getKeyCode()]=false;
	}
	
	// what happens when a key is typed
	public void keyTyped(KeyEvent event){
		// does nothing for now
	}
	
	// toString method included for the testing system
	public String toString(){
		return "";
		// implement
	}
	
	// returns if a specified key is being pressed
	public boolean isKeyPressed(int key){return keys[key];}
	// returns if a specified key is not being pressed
	public boolean isKeyReleased(int key){return !keys[key];}
}
