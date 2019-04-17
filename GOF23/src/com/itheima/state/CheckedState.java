package com.itheima.state;

/**
 * 房间已入住状态
 * @author 周思聪
 * @date 2019/4/8 23:27
 */
public class CheckedState implements State{
    @Override
    public void handler() {
        System.out.println("房间已经入住");
    }
}
