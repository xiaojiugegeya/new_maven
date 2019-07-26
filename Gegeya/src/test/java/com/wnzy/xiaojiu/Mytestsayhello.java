package com.wnzy.xiaojiu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Mytestsayhello {
@Test
public void saytest(){
		Sayhellotime say=new Sayhellotime();
		String result=say.hellowtime("zhongwu");
		assertEquals("hello,xiaojiu,zhongwu",result);
	} 
	
}
