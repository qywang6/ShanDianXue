package com.bihu.entity;

public abstract class ZB {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void buff(JueSe juese);
}
