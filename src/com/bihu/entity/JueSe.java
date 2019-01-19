package com.bihu.entity;
import java.util.*;

import com.bihu.utils.CommonUtils;
public class JueSe {
	private int atk;
	private String name;
	private int hp;
	private int place=-1;
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	public static int zhiShaiZi() {
		return CommonUtils.random(1, 6);
	}

//	public static int zhiShaiZi(int a,int b){
//		return CommonUtils.random(1, 6);
//	}
	public void gongji(GuaiWu wu){
		int hp = wu.getHp();
		wu.setHp(hp-atk);
		if(wu.getHp()<0){
			wu.setHp(0);
		}
	}
	public String toString(){
		return "姓名"+name+"\n攻击力："+atk+"\nHP:"+hp+"\n当前位置"+place;
		
	}
}











