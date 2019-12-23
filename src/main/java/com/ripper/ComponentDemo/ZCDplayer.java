package com.ripper.ComponentDemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ZCDplayer implements MediaPlayer {

	public void play() {
		System.out.println("playing 唱片标题" + "the song");
	}

	// private CompactDisc cd;

	// @Autowired
	// public ZCDplayer(CompactDisc cd) {
	// this.cd = cd;
	// }
	//
	// public void play() {
	// cd.play();
	// }
}
