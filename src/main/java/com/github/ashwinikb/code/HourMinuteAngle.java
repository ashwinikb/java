/**
 * 
 */
package com.github.ashwinikb.code;

/**
 * @author ashwini
 *
 */
public class HourMinuteAngle {

	public static int angle(double h, double m) {
		
		if(h<0 || m<0 && h>12 || m > 60) {
			System.out.println("Wrong Input");
		}
		
		if(h == 12)
			h = 0;
		if(m == 60)
			m = 0;
		//Calculate the angle with 12 as reference.
		int hourAngle = (int) ((h*60 + m) * 0.5);
		int minAngle = (int) (m * 6);  
		
		int angle = Math.abs(hourAngle-minAngle);
		angle = Math.min(360-angle, angle);
			
		return angle;
		
	}

}
