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
		 System.out.println("***��ӭ�������ɸ����Ϸ***");
			System.out.println("***����������ǳ�***");
//			Scanner in = new Scanner(System.in);
			String name = in.next();
			JueSe juese = EntityFactory.newJuese(name );
			System.out.println(juese.toString());
			do{
				zhiShaiZi(juese);
			}while(!GameOver);{
				sop("*****��Ϸ����*****");	
			}
	 }
	private static void zhiShaiZi(JueSe juese) {
		System.out.println("***�Ƿ�ʼ��ɸ�ӣ���y/n��***");
		String inputText=in.nextLine();
		if (inputText.equals("y")){
				int value = JueSe.zhiShaiZi();
				juese.setPlace(juese.getPlace()+value);
				if(juese.getPlace()>GameMap.MAP_LENGTH-1){
					juese.setPlace(GameMap.MAP_LENGTH-1);
				}
				System.out.println("���˸�"+value+"�㣬ǰ�����λ����"+(juese.getPlace()+1));
				int type =GameMap.getInstance().getType(juese.getPlace());
				switch (type) {
				case 0:
					break;
				case 1:
					ZB zb = EntityFactory.newZhenBao();
					System.out.println("�ȵ��䱦"+zb.getName()+"�������");
					zb.buff(juese);
					break;
				case 2:
					GuaiWu gw = EntityFactory.newGuaiWu();
					System.out.println("��������"+gw.getName()+"����");
					do{
						juese.gongji(gw);
						gw.gongJi(juese);						
					}while(juese.getHp()>0&&gw.getHp()>0);
					if(gw.getHp()==0){
						System.out.println("�ɵ�����");
					}else{
						System.out.println("��ɫover,��Ϸ����");
						GameOver=true;
					}
					break;
				}
				System.out.println(juese.toString());//???
				if(juese.getPlace()==GameMap.MAP_LENGTH-1){
					GameOver=true;
					System.out.println("��Ϸ����");
				}
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}















