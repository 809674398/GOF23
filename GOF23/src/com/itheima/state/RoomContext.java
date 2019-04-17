package com.itheima.state;

/**
 * 房间状态统一管理类
 * @author 周思聪
 * @date 2019/4/8 23:28
 */
public class RoomContext {
    private State state;

    public void setState(State s){
        System.out.println("房间状态改变");
        state = s;
        state.handler();
    }
}
