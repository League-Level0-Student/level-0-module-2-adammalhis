package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {

		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		String Bob = JOptionPane.showInputDialog(null, "Which animal do you want?");
		/* 2. Make it so that the user can keep entering new animals. */
		if (Bob.equals("Cat")) {
			playNoise(meowFile);
		}
		if (Bob.equals("Cow")) {
			playNoise(mooFile);
		}
		if (Bob.equals("Duck")) {
			playNoise(quackFile);
		}
		if (Bob.equals("Dog")) {
			playNoise(woofFile);
		}
		if (Bob.equals("llama")) {
			playNoise(llamaFile);

		}

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
