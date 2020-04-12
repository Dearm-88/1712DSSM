package com.yxf.common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Random;

/**
 * 
 * @ClassName: StringUtil
 * @Description: �ַ�������������
 * @author: charles
 * @date: 2020��3��26�� ����8:54:43
 */
public class StringUtil {

	// ����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
	public static boolean hasLength(String src) {
		return null != src && src.length() > 0;
	}

	// ����2���ж�Դ�ַ����Ƿ���ֵ �ո�Ҳ��ûֵ
	public static boolean hasText(String src) {
		return null != src && src.trim().length() > 0;
	}

	// ����һ����������ĺ��� ��������
	public static String randomChineseString() {

		String str = null;
		int highPos, lowPos;
		Random random = new Random();
		highPos = (176 + Math.abs(random.nextInt(39)));// ���룬0xA0��ͷ���ӵ�16����ʼ����0xB0=11*16=176,16~55һ�����֣�56~87��������
		random = new Random();
		lowPos = 161 + Math.abs(random.nextInt(93));// λ�룬0xA0��ͷ����Χ��1~94��

		byte[] bArr = new byte[2];

		bArr[0] = (new Integer(highPos)).byteValue();
		bArr[1] = (new Integer(lowPos)).byteValue();
		try {
			str = new String(bArr, "GB2312"); // ��λ����ϳɺ���
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

	// ����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
	public static String randomChineseString(int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomChineseString());
		}
		return sb.toString();
	}

	// ����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
	public static String generateChineseName() {
		// �й��ټ���
		String[] str = { "��", "Ǯ", "��", "��", "��", "��", "֣", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "ʩ", "��", "��", "��", "��", "��", "��", "κ", "��", "��", "��", "л", "��", "��", "��", "ˮ", "�", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "³", "Τ", "��", "��", "��", "��", "��", "��", "��", "��", "Ԭ", "��", "ۺ",
				"��", "ʷ", "��", "��", "��", "�", "Ѧ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"ʱ", "��", "Ƥ", "��", "��", "��", "��", "��", "Ԫ", "��", "��", "��", "ƽ", "��", "��", "��", "��", "��", "Ҧ", "��", "տ",
				"��", "��", "ë", "��", "��", "��", "��", "��", "�", "��", "��", "��", "��", "̸", "��", "é", "��", "��", "��", "��", "��",
				"��", "ף", "��", "��", "��", "��", "��", "��", "ϯ", "��", "��", "ǿ", "��", "·", "¦", "Σ", "��", "ͯ", "��", "��", "÷",
				"ʢ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "֧", "��", "��", "��",
				"¬", "Ī", "��", "��", "��", "��", "��", "��", "Ӧ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"ʯ", "��", "��", "ť", "��", "��", "��", "��", "��", "��", "½", "��", "��", "��", "��", "�", "��", "��", "�L", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ɽ", "��", "��",
				"��", "�", "��", "ȫ", "ۭ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "б", "��", "��", "��", "��",
				"��", "��", "��", "ղ", "��", "��", "Ҷ", "��", "˾", "��", "۬", "��", "��", "��", "ӡ", "��", "��", "��", "��", "ۢ", "��",
				"��", "��", "��", "��", "��", "׿", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "˫", "��", "ݷ", "��", "��",
				"̷", "��", "��", "��", "��", "��", "��", "��", "Ƚ", "��", "۪", "Ӻ", "�S", "�", "ɣ", "��", "�", "ţ", "��", "ͨ", "��",
				"��", "��", "��", "ۣ", "��", "��", "ũ", "��", "��", "ׯ", "��", "��", "��", "��", "��", "Ľ", "��", "��", "ϰ", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "»", "��", "��", "ŷ", "�", "��", "��", "ε", "Խ", "��", "¡", "ʦ", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ɳ", "ؿ", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "Ȩ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "۳", "Ϳ", "��", "��", "˧",
				"��", "��", "��", "��", "��", "��", "��", "Ĳ", "��", "٦", "��", "��", "ī", "��", "��", "��", "��", "��", "��", "١",
				"��ٹ", "˾��", "�Ϲ�", "ŷ��", "�ĺ�", "���", "����", "����", "����", "�ʸ�", "ξ��", "����", "�̨", "��ұ", "����", "���", "����",
				"����", "̫��", "����", "����", "����", "��ԯ", "���", "����", "����", "����", "Ľ��", "����", "����", "˾ͽ", "˾��", "آ��", "˾��",
				"��", "��", "�ӳ�", "���", "��ľ", "����", "����", "���", "����", "����", "����", "�ذ�", "�й�", "�׸�", "����", "�θ�", "����",
				"����", "����", "����", "��", "��", "����", "΢��", "����", "����", "����", "����", "�Ϲ�" };
		// 1 �������������ȡһ������
		String name1 = str[RandomUtil.random(0, str.length - 1)];
		// 2 ��ȡ����
		String name2 = randomChineseString(RandomUtil.random(1, 2));

		return name1 + name2;
	}

	/**
	 * 
	 * @Title: isEmail
	 * @Description: //�ж��Ƿ��������ʽ
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmail(String src) {
		// ������� num2222@126.com
		String reg = "\\w+\\@\\w+\\.\\w+";
		return src.matches(reg);

	}

	/**
	 * 
	 * @Title: isPhoneNumber
	 * @Description: �Ƿ��ֻ���
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isPhoneNumber(String src) {
		// �������
		String reg = "^1[3|4|5|7|8]\\d{9}$";
		return src.matches(reg);

	}

	/**
	 * 
	 * @Title: isNumber
	 * @Description: �Ƿ����������� ���� ��������С��
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);

	}
	
	/**
	 * ����˵����ʵ���жϴ�����ַ����Ƿ�Ϊ����http��url��ַ
	 */
	public static boolean isHttpUrl(String src){
		try {
			URL url = new URL(src);
			url.openStream();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("���ǺϷ���url");
		return false;
	
	}
}
