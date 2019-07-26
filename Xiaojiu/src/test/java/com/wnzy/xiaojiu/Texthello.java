package com.wnzy.xiaojiu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Texthello {
	@Test
public void stayhellow(){
	hellow he=new hellow();
	String result= he.say("xiaojiu");
	assertEquals("hello,xiaojiu",result);
	
}
}
