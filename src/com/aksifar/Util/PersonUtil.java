package com.aksifar.Util;

import java.util.ArrayList;
import java.util.List;

import com.aksifar.model.Person;

public class PersonUtil {

	private static Person p1 = new Person(1, "Ankit", 31);
	private static Person p2 = new Person(2, "Ankita", 27);
	private static Person p3 = new Person(3, "Tanay", 28);
	private static Person p4 = new Person(4, "Arindam", 31);
	private static Person p5 = new Person(5, "John", 50);
	private static Person p6 = new Person(6, "Jenny", 29);
	
	public static List<Person> getPersonList()
	{
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		return list;
	}
}
