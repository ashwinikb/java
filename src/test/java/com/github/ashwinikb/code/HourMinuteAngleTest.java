/**
 * 
 */
package com.github.ashwinikb.code;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * @author ashwini
 *
 */
public class HourMinuteAngleTest {
	
	@Test
	public void test() {
		double h = 4;
		double m = 30;
		int result = HourMinuteAngle.angle(h, m);
		assertEquals(result,45);
		System.out.println(result);
	}

}
