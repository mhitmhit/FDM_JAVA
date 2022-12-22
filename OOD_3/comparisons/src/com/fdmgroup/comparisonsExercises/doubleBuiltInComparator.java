package com.fdmgroup.comparisonsExercises;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class doubleBuiltInComparator {
	
	Queue<Double> myQueue = new PriorityQueue<Double>(Collections.reverseOrder());
	
	public void addToQueue(Double value) {
		myQueue.add(value);
	}
	
	public Queue<Double> getQueue(){
		return myQueue;
	}
}
