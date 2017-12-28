package jp.co.unitTest.util;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class StringUtilTest {

	@Test
	public void testNormal() {
		byte[] bytes = new byte[3];
		bytes[0] = 0x00;
		bytes[1] = 0x01;
		bytes[2] = 0x02;
		String actual = StringUtil.toHexString(bytes);
		assertThat(actual, is("000102"));
	
	}
	
	@Test
	public void testNormal2() {
		byte[] bytes = new byte[3];
		bytes[0] = -1;
		bytes[1] = 0x15;
		bytes[2] = (byte)0xff;
		String actual = StringUtil.toHexString(bytes);
		assertThat(actual, is("ff15ff"));
		
	}

}
