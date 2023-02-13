package com.simpli.java.work;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> stringQueue = new PriorityQueue<>();
		
		stringQueue.add("Ram");
		stringQueue.add("John");

		stringQueue.add("Tom");

		stringQueue.add("Kim");
		
		System.out.println("Thenelements in queue :: "+stringQueue);
		System.out.println("The head of queue :: "+stringQueue.element());
		System.out.println("Thenelements in queue peekm:: "+stringQueue.peek());
		System.out.println("Thenelements in queue  remove:: "+stringQueue.remove());
		System.out.println("Thenelements in queue poll :: "+stringQueue.poll());


		Set <String> hashSet = new HashSet<>();
		hashSet.add("Alex");
		

		

	}

}
