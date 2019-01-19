package com.bihu.utils;

import java.util.Scanner;

import com.bihu.entity.GameMap;
import com.bihu.entity.GuaiWu;
import com.bihu.entity.JueSe;
import com.bihu.entity.ZB;

public class ViewUtils {
	private static boolean GameOver=false;
	private static Scanner in= CommonUtils.getScanner();
	 public static void startGame(){
		 System.out.println("***欢迎进入夺命筛子游戏***");
			System.out.println("***请输入玩家昵称***");
//			Scanner in = new Scanner(System.in);
			String name = in.next();
			JueSe juese = EntityFactory.newJuese(name );
			System.out.println(juese.toString());
			do{
				zhiShaiZi(juese);
			}while(!GameOver);{
				sop("*****游戏结束*****");	
			}
	 }
	private static void zhiShaiZi(JueSe juese) {
		System.out.println("***是否开始掷筛子？（y/n）***");
		String inputText=in.nextLine();
		if (inputText.equals("y")){
				int value = JueSe.zhiShaiZi();
				juese.setPlace(juese.getPlace()+value);
				if(juese.getPlace()>GameMap.MAP_LENGTH-1){
					juese.setPlace(GameMap.MAP_LENGTH-1);
				}
				System.out.println("掷了个"+value+"点，前进后的位置是"+(juese.getPlace()+1));
				int type =GameMap.getInstance().getType(juese.getPlace());
				switch (type) {
				case 0:
					break;
				case 1:
					ZB zb = EntityFactory.newZhenBao();
					System.out.println("踩到珍宝"+zb.getName()+"开启外挂");
					zb.buff(juese);
					break;
				case 2:
					GuaiWu gw = EntityFactory.newGuaiWu();
					System.out.println("遇到怪物"+gw.getName()+"进攻");
					do{
						juese.gongji(gw);
						gw.gongJi(juese);						
					}while(juese.getHp()>0&&gw.getHp()>0);
					if(gw.getHp()==0){
						System.out.println("干掉怪物");
					}else{
						System.out.println("角色over,游戏结束");
						GameOver=true;
					}
					break;
				}
				System.out.println(juese.toString());//???
				if(juese.getPlace()==GameMap.MAP_LENGTH-1){
					GameOver=true;
					System.out.println("游戏结束");
				}
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}















