package com.simprints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<SimprintsValue> values = new ArrayList<>();
		
		//Creating Values
		SimprintsValue value1 = new SimprintsValue("Relentless Commitment to Impact");
		SimprintsValue value2 = new SimprintsValue("Robust as Fudge");
		SimprintsValue value3 = new SimprintsValue("Be Surprisingly Bold");
		SimprintsValue value4 = new SimprintsValue("Get Back Up");
		SimprintsValue value5 = new SimprintsValue("Make it Happen");
		SimprintsValue value6 = new SimprintsValue("Don't be a Jerk");
		SimprintsValue value7 = new SimprintsValue("Confront the Grey");
		SimprintsValue value8 = new SimprintsValue("Laugh Together, Grow Together");
		
		//Adding valus to a list.
		values.add(value1);
		values.add(value2);
		values.add(value3);
		values.add(value4);
		values.add(value5);
		values.add(value6);
		values.add(value7);
		values.add(value8);
	
		//Sorting values based on ASCII sum.
		Collections.sort(values);
		
		//Printing Values for illustration
		for(SimprintsValue value:  values)
		{
			//Overidden toString() prints the desired format.
			System.out.println(value);
		}
	}
}
