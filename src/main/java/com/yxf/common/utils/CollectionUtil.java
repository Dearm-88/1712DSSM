package com.yxf.common.utils;

import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: ���ϵĴ�����
 * @author: charles
 * @date: 2020��3��26�� ����10:45:33
 */
public class CollectionUtil {
	/**
	 * 
	 * @Title: isEmpty 
	 * @Description: �жϼ����Ƿ���ֵ������
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection==null || collection.isEmpty();
		//return collection==null || collection.size()==0;
		
	}

}
