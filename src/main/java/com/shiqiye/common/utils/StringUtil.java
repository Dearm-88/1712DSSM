package com.shiqiye.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * 
 * @ClassName: StringUtil 
 * @Description: �ַ���������
 * @author: ASUS
 * @date: 2020��2��27�� ����9:42:56
 */
public class StringUtil {
	//����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
	public static boolean hasLength(String src){
		if(src!=null  && src.length()>0) {
			return true;
		}
		return false;
	
	}
	//����2���ж�Դ�ַ���	
	public static boolean hasText(String src){
		if(src!=null && src.trim().length()>0) {
			return true;
		}
		return false;
	
	}
	
	public static String randomChineseString() {
	     String str = null;
       int highPos, lowPos;
       Random random = new Random();
       highPos = (176 + Math.abs(random.nextInt(49)));//���룬0xA0��ͷ���ӵ�16����ʼ����0xB0=11*16=176,16~55һ�����֣�56~87��������
       random=new Random();
       lowPos = 161 + Math.abs(random.nextInt(95));//λ�룬0xA0��ͷ����Χ��1~94��
       byte[] bArr = new byte[2];
      
       bArr[0] = (new Integer(highPos)).byteValue();
       bArr[1] = (new Integer(lowPos)).byteValue();
       try {
           str = new String(bArr, "GB2312");   //��λ����ϳɺ���
       } catch (UnsupportedEncodingException e) {
           e.printStackTrace();
       }
           return str;
   }
	
	
	//����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
	public static String randomChineseString(int length){
		String str="";
		for (int i = 0; i <length; i++) {
			str+=randomChineseString();
		}
		return str;
	
	}
	//����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
	public static String generateChineseName(){
		String[] str= {"��","Ǯ","��","��","��","��","֣","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʩ","��","��","��","��","��","��","κ","��","��","��","л","��","��","��","ˮ","�","��","��","��","��","��","��","��","��","��","³","Τ","��","��","��","��","��","��","��","��","Ԭ","��","ۺ","��","ʷ","��","��","��","�","Ѧ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʱ","��","Ƥ","��","��","��","��","��","Ԫ","��","��","��","ƽ","��","��","��","��","��","Ҧ","��","տ","��","��","ë","��","��","��","��","��","�","��","��","��","��","̸","��","é","��","��","��","��","��","��","ף","��","��","��","��","��","��","ϯ","��","��","ǿ","��","·","¦","Σ","��","ͯ","��","��","÷","ʢ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","֧","��","��","��","¬","Ī","��","��","��","��","��","��","Ӧ","��","��","��","��","��","��","��","��","��","��","��","��","ʯ","��","��","ť","��","��","��","��","��","��","½","��","��","��","��","�","��","��","�L","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɽ","��","��","��","�","��","ȫ","ۭ","��","��","��","��","��","��","��","��","��","��","��","б","��","��","��","��","��","��","��","ղ","��","��","Ҷ","��","˾","��","۬","��","��","��","ӡ","��","��","��","��","ۢ","��","��","��","��","��","��","׿","��","��","��","��","��","��","��","��","��","��","˫","��","ݷ","��","��","̷","��","��","��","��","��","��","��","Ƚ","��","۪","Ӻ","�S","�","ɣ","��","�","ţ","��","ͨ","��","��","��","��","ۣ","��","��","ũ","��","��","ׯ","��","��","��","��","��","Ľ","��","��","ϰ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","»","��","��","ŷ","�","��","��","ε","Խ","��","¡","ʦ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɳ","ؿ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","Ȩ","��","��","��","��","��","��","��","��","��","��","۳","Ϳ","��","��","˧","��","��","��","��","��","��","��","Ĳ","��","٦","��","��","ī","��","��","��","��","��","��","١","��ٹ","˾��","�Ϲ�","ŷ��","�ĺ�","���","����","����","����","�ʸ�","ξ��","����","�̨","��ұ","����","���","����","����","̫��","����","����","����","��ԯ","���","����","����","����","Ľ��","����","����","˾ͽ","˾��","آ��","˾��","��","��","�ӳ�","���","��ľ","����","����","���","����","����","����","�ذ�","�й�","�׸�","����","�θ�","����","����","����","����","��","��","����","΢��","����","����","����","����","�Ϲ�"};
		 //���� �����������ȡһ��
		  String name1 = str[RandomUtil.random(0, str.length-1)];
		  //����1-2���������
		  String name2 = randomChineseString(RandomUtil.random(1,2));
		  
		return name1 + name2;
	}

}
