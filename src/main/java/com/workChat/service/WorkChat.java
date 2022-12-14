package com.workChat.service;

import com.workChat.entity.GroupChat;
import com.workChat.entity.User;

import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public interface WorkChat {
    //创建员工账号
    int addUnitIdUser(String name,String pwd,int unitId);
    //根据id返回用户
    User getIdUser(int id);
    //根据单位编号返回用户集合 黄为东
    List<User> getUnitIdUser(int unitId);

    //通过单位编号返回GroupChat集合
    List<GroupChat> getUnitIdGroupChat(int unitId);
}
