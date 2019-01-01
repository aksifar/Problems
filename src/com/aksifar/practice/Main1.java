package com.aksifar.practice;

import java.util.List;
import java.util.stream.Collectors;

import com.aksifar.Util.PersonUtil;
import com.aksifar.model.Person;

public class Main1 {
	
	public static void main(String[] args) {
		
		List<Person> list = PersonUtil.getPersonList();
		long count = list.stream().count();
		
//		list.stream().distinct().forEach(p -> System.out.println(p));
		
		List<Person> collect = list.stream().filter(s -> s.getAge()>30).collect(Collectors.toList());
		collect.stream().forEach(s -> System.out.println(s));
		
		
	}
}

