package com.ripper.ComponentDemo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service(value="wemz")
public class SgtPeppers implements CompactDisc {

	private String title = "唱片标题";

	private String attist = "the song";

	private String name = "王二麻子";

	public void play() {
		System.out.println("playing " + title + attist);

	}

	public void getName() {
		System.out.println(name);
	}

}
