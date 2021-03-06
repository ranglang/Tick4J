package com.gorkemgok.tick4j.model.function;

public class Unit implements IFunction {

	public String getSymbol() {
		return "I";
	}

	public double calculate(double value, String param, double... dparams) {
		return value;
	}

	public IFunction reverseFunction() {
		return new Unit();
	}

}
