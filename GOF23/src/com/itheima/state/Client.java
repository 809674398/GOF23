package com.itheima.state;

/**
 * 客户端
 * @author 周思聪
 * @date 2019/4/8 23:29
 */
public class Client {
    public static void main(String[] args) {
        RoomContext roomContext = new RoomContext();
        roomContext.setState(new CheckedState());
        roomContext.setState(new BookedState());
    }
}
