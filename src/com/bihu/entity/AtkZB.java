package com.bihu.entity;

public class AtkZB extends ZB{
	public void buff(JueSe juese){
		int atk = juese.getAtk();
		atk = atk+5;
		juese.setAtk(atk);
	}
}
