package lotto;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto {

	public static void main(String[] args) {
		Random random = new Random();
		int count = Integer.parseInt(JOptionPane.showInputDialog("������ ������ �Է��ϼ���."));
		//String path = JOptionPane.showInputDialog("Enter a path");
		for (int k = 0; k < count; k++) {
			int[] luckyNumber = new int[6];
			luckyNumber[0] = random.nextInt(44) + 1;
			for (int i = 1; i < luckyNumber.length; i++) {
				luckyNumber[i] = random.nextInt(45) + 1;

				for (int j = 0; j < i; j++) {
					if (luckyNumber[i] == luckyNumber[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(luckyNumber);
			System.out.println(Arrays.toString(luckyNumber));
		}
		
		System.out.println("���Ű��� : "+count*1000+"�� �Դϴ�.");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = format.format(System.currentTimeMillis());
		System.out.println(now);

	}

}
