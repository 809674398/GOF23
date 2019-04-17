package com.itheima.state;

/**
 * 房间被预定状态
 * @author 周思聪
 * @date 2019/4/8 23:26
 */
public class BookedState implements State {
    @Override
    public void handler() {
        System.out.println("房间已经被预定,等待入住");
    }
}
