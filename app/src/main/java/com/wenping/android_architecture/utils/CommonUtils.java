package com.wenping.android_architecture.utils;

/**
 * Created by Administrator on 2016/4/28.
 */
public class CommonUtils {

    /**
     * Ensures that an object reference passed as a parameter to the calling method is not null.
     * 确保将对象引用传递给调用方法的参数不为空
     * @param reference an object reference
     * @return the non-null reference that was validated
     * @throws NullPointerException if {@code reference} is null
     */
    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }


}
