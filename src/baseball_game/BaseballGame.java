package baseball_game;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	/* ���� ��ȣ ���� */
	public static void initNumber(LinkedList<int[]> initlist) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i==j) continue;		/* ù��°�� �ι�° ��ȣ �ߺ��� ��ŵ */
				for(int k=1;k<=9;k++) {
					if(j==k || i==k) continue;		/* �ι�°�� ����° �Ǵ� ù��°�� ����° ��ȣ �ߺ��� ��ŵ */
					int[] element = new int[3];		/* �� ȸ������ �迭 �ּ� ���� �����ϱ� ���Ͽ� ���� */ 
					element[0] = i;		/* ù��° ��ȣ ���� */
					element[1] = j;		/* �ι�° ��ȣ ���� */
					element[2] = k;		/* ����° ��ȣ ���� */
					initlist.add(element);		/* ��Ű������Ʈ�� ��� ���� */
				}
			}
		}
	}
	
	/* ��ȣ �Ǻ� */
	public static void jdgNumber(int strike, int ball, int[] number) {
		
	}
	
	/* ��ȣ ���� */
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
