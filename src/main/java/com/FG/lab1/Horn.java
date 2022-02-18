/**
 * 
 */
package com.FG.lab1;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author fgonzalezrod
 *
 */
public class Horn implements SelfCheckCapable {

	private int size;
	private int power;
	
	public void move() {
		// move the wheels
		
	}
	
	public void throttle() {
		// accelerate the car
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "horn";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}	
	
}
