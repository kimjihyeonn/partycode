package ��ӿ���;

import java.text.DecimalFormat;

/*
 * �ݾ׿� õ���� ���� �޸� �ֱ� Ŭ����
 * 
 */

public class Utils {
	//����(static) �޼ҵ� ����
	public static String toNumberFormat(long Amount) {
		DecimalFormat df= new DecimalFormat("#,###");
		return df.format(Amount);
	}

}
