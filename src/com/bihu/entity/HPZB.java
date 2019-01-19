package com.bihu.entity;

public class HPZB extends ZB{
	public void buff(JueSe juese){
		int hp = juese.getHp();
		hp=hp+130;
		juese.setHp(hp);
	}
}
