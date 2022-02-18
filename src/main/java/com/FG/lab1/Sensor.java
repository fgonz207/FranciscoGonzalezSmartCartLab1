/**
 * 
 */
package com.FG.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author fgonzalezrod
 *
 */
public class Sensor implements GenericComponent {
	
	private String type;
	private String manufacturer;
	private InfraRedSensor myinfraredsensor;
	private UltrasonicSensor myUltrasonicsensor;
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Sensor";
	}
	
	
	public Sensor() {
		myinfraredsensor = new InfraRedSensor();
		myUltrasonicsensor = new UltrasonicSensor();
	}
	
	@Override
	
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myinfraredsensor, myUltrasonicsensor); // add all your sub components
		return internalComponents;
	} 
	 
}
