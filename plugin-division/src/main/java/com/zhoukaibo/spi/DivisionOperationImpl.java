package com.zhoukaibo.spi;

public class DivisionOperationImpl implements IOperation {

	public DivisionOperationImpl() {
		System.out.println("division construct");
	}

	@Override
    public int operation(int numberA, int numberB) {
	    System.out.println("Operation: division");
        return numberA / numberB;
    }
}