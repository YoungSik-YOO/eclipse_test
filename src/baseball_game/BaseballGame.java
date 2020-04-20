package baseball_game;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	/* 예상 번호 생성 */
	public static void initNumber(LinkedList<int[]> initlist) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i==j) continue;		/* 첫번째와 두번째 번호 중복시 스킵 */
				for(int k=1;k<=9;k++) {
					if(j==k || i==k) continue;		/* 두번째와 세번째 또는 첫번째와 세번째 번호 중복시 스킵 */
					int[] element = new int[3];		/* 각 회전마다 배열 주소 새로 생성하기 위하여 선언 */ 
					element[0] = i;		/* 첫번째 번호 설정 */
					element[1] = j;		/* 두번째 번호 설정 */
					element[2] = k;		/* 세번째 번호 설정 */
					initlist.add(element);		/* 링키지리스트에 요소 삽입 */
				}
			}
		}
	}
	
	/* 번호 판벙 */
	public static void jdgNumber(int strike, int ball, int[] number) {
		
	}
	
	/* 번호 생성 */
	public static void mkNumber(int[] number) {
		Random rand = new Random();
		
		for(int i=0;i<3;i++) {
			number[i] = rand.nextInt(9) + 1;
			if(i > 0 && number[i] == number[0]) i--;
			if(i > 1 && number[i] == number[1]) i--;
		}
	}

	public static void main(String[] args) {
		LinkedList<int[]> list = new LinkedList<int[]>(); 
		int[] num = new int[3];
		
		initNumber(list);
		num = (int[])list.getFirst();
		System.out.println(num[0] + "," + num[1] + "," + num[2]);
		mkNumber(num);
		System.out.println(num[0] + "," + num[1] + "," + num[2]);
	}
}
