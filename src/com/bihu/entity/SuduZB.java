package com.bihu.entity;

import com.bihu.utils.CommonUtils;

public class SuduZB extends ZB{
	public void buff(JueSe juese){
		int value = CommonUtils.random(2,6);
		juese.setPlace(juese.getPlace()+value);
		if(juese.getPlace()>GameMap.MAP_LENGTH){
			juese.setPlace(GameMap.MAP_LENGTH-1);
		}
	}
}
