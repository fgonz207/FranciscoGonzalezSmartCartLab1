/**
 * 
 */
package com.FG.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author fgonzalezrod
 *
 */
public class UltrasonicSensor   implements SelfCheckCapable {
	
	public void GetDistance() {
		// Gets distance with obstacles
		 
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "UltrasonicSensor";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
