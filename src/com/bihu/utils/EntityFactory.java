package com.bihu.utils;

import com.bihu.entity.AtkZB;
import com.bihu.entity.GuaiWu;
import com.bihu.entity.HPZB;
import com.bihu.entity.JueSe;
import com.bihu.entity.SuduZB;
import com.bihu.entity.ZB;

public class EntityFactory {
	public static JueSe newJuese(String name){
		JueSe juese = new JueSe();
		int atk = CommonUtils.random(30,50);
		int hp = CommonUtils.random(100,400);
		juese.setName(name);
		juese.setAtk(atk);
		juese.setHp(hp);
		return juese;
	}
	public static GuaiWu newGuaiWu(){
		int value = CommonUtils.random(3);
		GuaiWu gw = new GuaiWu();
		switch (value) {
		case 0:
			gw.setName("¶À½ÇÊÞ");
			gw.setAtk(CommonUtils.random(30,50));
			gw.setHp(CommonUtils.random(100,180));
			break;
			
		case 1:
			gw.setName("Ð¡Ç¿");
			gw.setAtk(CommonUtils.random(20,35));
			gw.setHp(CommonUtils.random(100,180));
			break;
		case 2:
			gw.setName("Åå¶÷");
			gw.setAtk(CommonUtils.random(5,100));
			gw.setHp(CommonUtils.random(20,50));
		}
		return gw;
	}
	public static ZB newZhenBao(){
		int value = CommonUtils.random(3);
		ZB zb = null;
		switch(value){
			case 0:
				zb = new AtkZB();
				zb.setName("powerbuff");
				break;
			case 1:
				zb = new HPZB();
				zb.setName("HPbuff");
				break;
			case 2:
				zb = new SuduZB();
				zb.setName("speedbuff");
		}
		return zb;
	}
}










