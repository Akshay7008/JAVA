package com.gen;

public class Genric<T> {

	private T var1;

	public Genric(T var1) {
		this.var1 = var1;

	}

	public T getVar1() {
		return var1;
	}

	public void setVar1(T var1) {
		this.var1 = var1;
	}

	@Override
	public String toString() {
		return "Genric [var1=" + var1 + "]";
	}

}
