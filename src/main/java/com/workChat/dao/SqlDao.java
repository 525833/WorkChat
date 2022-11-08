package com.workChat.dao;

import com.workChat.entity.GroupChat;
import com.workChat.entity.User;

import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public interface SqlDao {
    //通过单位编号创建员工账号
    int addUnitIdUser(int UnitId);
    //根据id返回用户
    User getIdUser(int id);
    //根据单位编号返回用户集合
    List<User> getUnitIdUser(int UnitId);
    //通过单位编号返回GroupChat集合
    List<GroupChat> getUnitIdGroupChat(int unitId);
}
