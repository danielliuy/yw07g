/**
 * Copyright (c) 2010-2017 http://www.ibookstar.com All Rights Reserved.
 */

package cn.daniel.utils;

import javax.persistence.Table;

/**
 * Describe the file in a sentence.
 *
 * @author liuyong 2017/11/14 0014 13:35
 * @version V2.0
 */
public class EntityUtils {

    /**
     * 获得表名
     *
     * @param clazz 映射到数据库的po类
     *
     * @return String
     */

    @SuppressWarnings("unchecked")
    public static String getTableName(Class clazz) {
        Table annotation = (Table) clazz.getAnnotation(Table.class);
        if (annotation != null) {
            return annotation.name();
        }
        return null;
    }


    /**
     * 获得列名
     *
     * @param clazz 映射到数据库的po类
     * @param name  第几列
     *
     * @return String
     */

    @SuppressWarnings("unchecked")
    public static String getColumnName(Class clazz, String name) {
        try {
            new Exception("---貌似java属性如果用注解形式的话 属性和 数据库字段名一致 因为项目没有需要用 写出没有进过有效验证 所以暂未放出 如果谁想用或者有着方面的需求 可以给我留评论");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
