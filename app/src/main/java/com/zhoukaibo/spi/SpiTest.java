package com.zhoukaibo.spi;

import java.util.ServiceLoader;

/**
 * SPI Demo.
 *
 * Author: [Kaibo](https://zhoukaibo.com)
 */
public class SpiTest {

	public static void main(String[] args) {
		ServiceLoader<IOperation> operations = ServiceLoader.load(IOperation.class);

		int numberA = 6;
		int numberB = 3;
		System.out.println("NumberA: " + numberA + ", NumberB: " + numberB);
		for (IOperation operation : operations) {
			System.out.println(operation.operation(numberA, numberB));
		}
	}
}
