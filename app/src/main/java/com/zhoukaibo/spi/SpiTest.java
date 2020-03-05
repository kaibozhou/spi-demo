package com.zhoukaibo.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * SPI Demo.
 *
 */
public class SpiTest {

	public static void main(String[] args) {
		ServiceLoader<IOperation> operations = ServiceLoader.load(IOperation.class);

		int numberA = 6;
		int numberB = 3;
		System.out.println("NumberA: " + numberA + ", NumberB: " + numberB);
		Iterator<IOperation> iterator = operations.iterator();
		while (iterator.hasNext()) {
			IOperation operation = iterator.next();
			System.out.println(operation.operation(numberA, numberB));
		}
	}
}
