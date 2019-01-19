package com.bihu.entity;

public class GuaiWu {
	private int hp;
	private String name;
	private int atk;
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public void gongJi(JueSe juese){
		int hp=juese.getHp();
		hp = hp-atk;
		juese.setHp(hp);
		if (juese.getHp()<0){
			juese.setHp(0);
		}
	}
}
