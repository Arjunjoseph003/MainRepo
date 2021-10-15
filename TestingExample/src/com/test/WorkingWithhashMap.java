package com.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class WorkingWithhashMap {

	public static void main(String[] args) {

		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(10, "java");
		mp.put(20, "sql");
		mp.put(30, "oops");
		mp.put(40, "Sql");
		mp.put(50, "oracle");
		mp.put(60, "DB");
		mp.put(10, "selenium");
		mp.put(50, "psql");
		mp.put(40, "Hadoop");

		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("keys :"+entry.getKey());
			System.out.println("Values :"+entry.getValue());
		}
	}

}
