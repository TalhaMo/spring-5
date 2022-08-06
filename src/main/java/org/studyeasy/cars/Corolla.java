package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

public class Corolla implements Car {

	@Autowired
	@Qualifier("engineType")
	Engine engine ;



	/*
	public void setEngine(Engine engine) {
		engine.type="new v8 engine";
		this.engine = engine;
	}*/




	@Override
	public String specs() {
		String specs="sedan from toyota with engine type as "+engine.type();
		return specs;
	}

}
