/**
 * 
 */
package com.FG.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author fgonzalezrod
 *
 */
public class Battery implements SelfCheckCapable {

	private String type;
	private int capacity;
	
	public void showCharge() {
		// Capture the level of battery
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Battery";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
