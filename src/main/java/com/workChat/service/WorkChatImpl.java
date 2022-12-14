package com.workChat.service;

import com.workChat.dao.SqlDao;
import com.workChat.dao.SqlDaoImpl;
import com.workChat.entity.GroupChat;
import com.workChat.entity.User;

import java.util.List;

/**
 * @author 谢世杰
 * @version 1.0
 */
public class WorkChatImpl implements WorkChat{
    @Override
    public int addUnitIdUser(String name,String pwd,int unitId) {
        SqlDao sqlDao = new SqlDaoImpl();
        return sqlDao.addUnitIdUser(name,pwd,unitId);
    }

    @Override
    public User getIdUser(int id) {
        SqlDao sqlDao = new SqlDaoImpl();
        return sqlDao.getIdUser(id);
    }

    @Override
    public List<User> getUnitIdUser(int unitId) {
        SqlDao sqlDao = new SqlDaoImpl();
        return null;
    }

    @Override
    public List<GroupChat> getUnitIdGroupChat(int unitId) {
        return null;
    }
}
