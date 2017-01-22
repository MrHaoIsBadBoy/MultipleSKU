package com.yifeng.multiplesku;

/**
 * Created by 胡逸枫 on 2017/1/16.
 */

public interface SKUInterface {
    /**
     * 选中属性
     * @param attr
     */
    void selectedAttribute(String[] attr);


    /**
     * 取消属性选择
     * @param attr
     */
    void uncheckAttribute(String[] attr);

}
