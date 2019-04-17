package com.itheima.state;

/**
 * 房间空闲状态
 * @author 周思聪
 * @date 2019/4/8 23:25
 */
public class FreeState implements State {
    @Override
    public void handler() {
        System.out.println("房间空闲状态,欢迎预定");
    }
}
