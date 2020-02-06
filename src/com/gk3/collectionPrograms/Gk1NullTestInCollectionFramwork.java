package com.gk3.collectionPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Gk1NullTestInCollectionFramwork {

	public static void main(String[] args) {
		
		// Tip: Only Tree related Collections won't allow null insertion.
		
		// 1. ArrayList
		List<String> arrayListOfStr = new ArrayList<String>();
		arrayListOfStr.add(null);
		arrayListOfStr.add(null);
		arrayListOfStr.add(null);
		arrayListOfStr.add("Gk1");
		System.out.println("1. ArrayList: " + arrayListOfStr);

		// 2. LinkedList
		List<String> LinkedListListOfStr = new LinkedList<String>();
		LinkedListListOfStr.add(null);
		LinkedListListOfStr.add(null);
		LinkedListListOfStr.add(null);
		LinkedListListOfStr.add("Gk1");
		System.out.println("2. LinkedList: " + LinkedListListOfStr);

		// 3. HashSet
		Set<String> hashSetVals = new HashSet<String>();
		hashSetVals.add("Gk1");
		hashSetVals.add(null);
		hashSetVals.add(null);
		hashSetVals.add(null);
		hashSetVals.add("Gk2");
		System.out.println("3. HashSet: " + hashSetVals);

		// 4. LinkedHashSet
		Set<String> LinkedHashSetVals = new LinkedHashSet<String>();
		LinkedHashSetVals.add("Gk1");
		LinkedHashSetVals.add(null);
		LinkedHashSetVals.add(null);
		LinkedHashSetVals.add(null);
		LinkedHashSetVals.add("Gk2");
		System.out.println("4. LinkedHashSetVals: " + LinkedHashSetVals);

		// 5. TreeSet
		Set<String> treeSetVals = new TreeSet<String>();
		treeSetVals.add("Gk1");
		// treeSetVals.add(null); // Even Single Null is not Possible in treeset.
		treeSetVals.add("Gk2");
		System.out.println("5. TreeSet: " + treeSetVals);

		// 6. Map - HashMap
		Map<String, Integer> hashMapvals = new HashMap<String, Integer>();
		hashMapvals.put("Gk1", 1);
		hashMapvals.put("Gk1", 2);
		hashMapvals.put("Gk2", 2);
		hashMapvals.put("Gk3", 2);
		hashMapvals.put(null, 2);
		hashMapvals.put(null, 3);
		hashMapvals.put(null, 4);
		System.out.println("6. HashMap: " + hashMapvals);
		
		// 7. LinkedHashMap.
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("Gk1", 1);
		linkedHashMap.put("Gk1", 2);
		linkedHashMap.put("Gk2", 2);
		linkedHashMap.put("Gk3", 2);
		linkedHashMap.put(null, 2);
		linkedHashMap.put(null, 3);
		linkedHashMap.put(null, 4);
		System.out.println("7. LinkedHashMap: " + linkedHashMap);
		
		// 8. TreeMap
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("Gk1", 1);
		treeMap.put("Gk1", 2);
		treeMap.put("Gk2", 2);
		treeMap.put("Gk3", 2);
		/*treeMap.put(null, 2); // Null Inserion is not possible only in tree collections.
		treeMap.put(null, 3);
		treeMap.put(null, 4);*/
		System.out.println("7. LinkedHashMap: " + treeMap);
		
		
		
	}

}
