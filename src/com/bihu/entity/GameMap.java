package com.bihu.entity;

import com.bihu.utils.CommonUtils;

public class GameMap {
	public static final int MAP_LENGTH=30;
	private int[] map=new int[MAP_LENGTH];
	private static GameMap instance=new GameMap();
	
	public static GameMap getInstance(){//???
		return instance;
	}
	
	private GameMap(){
		int count =MAP_LENGTH/4;
		for (int i = 0; i < count; i++) {
			int n=CommonUtils.random(0, MAP_LENGTH-1);
			if(map[n]!=0){
				i--;//抵消已经有东西的i++；
			}else{
				map[n]=1;
			}
			
		}
		for (int i = 0; i < count; i++) {
			int n=CommonUtils.random(0,MAP_LENGTH-1);
			if(map[n]!=0){
				i--;
			}else{
				map[n]=2;
			}
		}
	}
	public int getType(int index){
		return map[index];
		
	}
}
