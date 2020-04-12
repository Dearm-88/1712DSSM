package com.yxf.common.utils;

import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 集合的处理类
 * @author: charles
 * @date: 2020年3月26日 上午10:45:33
 */
public class CollectionUtil {
	/**
	 * 
	 * @Title: isEmpty 
	 * @Description: 判断集合是否有值。。。
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection==null || collection.isEmpty();
		//return collection==null || collection.size()==0;
		
	}

}
