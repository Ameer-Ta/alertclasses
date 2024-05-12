package com.alertautomation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratordemo {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add("amar");
		l.add("pune");
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}

}
