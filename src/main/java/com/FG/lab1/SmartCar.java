/**
 * 
 */
package com.FG.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.EmptyComponent;
import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * My SmartCar class
 * @author fgonzalezrod
 *
 */
public class SmartCar implements GenericComponent {
	
	private String color;
	private String model;
	private Battery mybattery;
	private Sensor mysensor;
	private Horn myHorn;
	
	public SmartCar() {
		mybattery = new Battery();
		mysensor = new Sensor();
		myHorn = new Horn();
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, mybattery, mysensor, myHorn); // add all your sub components
		return internalComponents;
	}
	
	
	public void moveForward() {
		// Move forward the car
	}
	
	public void moveBackwards() {
		// Move the car backwards
	}
	
	public void spin() {
		// Spin the car
	}
	
	public void turnLeft() {
		// Turn the car to the left
	}
	
	public void receiveComunication() {
		// Receives signal from the operator
	}
	
	public void performSystemCheck() {
		// Performs a system check
		
	 
	
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			// TODO Auto-generated method stub

		System.out.println("Hello Cohort 46! I'm Francisco");
		
		}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "MyFreenove";
	}


	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	}

	

