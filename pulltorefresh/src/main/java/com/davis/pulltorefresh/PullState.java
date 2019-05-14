package com.davis.pulltorefresh;

/**
 * Created by Administrator on 2019/4/17.
 */

public class PullState {
    /**
     * 静止状态，即未下拉刷新也未上拉加载
     */
    public static final int STATE_NULL = 0;
    /**
     * 下拉刷新状态
     */
    public static final int STATE_DOWN = 1;
    /**
     * 上拉加载状态
     */
    public static final int STATE_UP = 2;
}
