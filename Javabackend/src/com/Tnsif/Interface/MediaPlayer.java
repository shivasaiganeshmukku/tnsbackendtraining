package com.Tnsif.Interface;
//demo for interface of playable
public class MediaPlayer implements Playable,Recordable {

	@Override
	public void record() {
		System.out.println("media is recording");
		
	}

	@Override
	public void Play() {
		System.out.println("media is playing");
		
	}

}
