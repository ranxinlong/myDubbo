package com.rxl.dubbo.service;

import com.rxl.dubbo.mudel.UserAddress;

import java.util.List;

/**
 * ClassName: UserService
 * Description: UserService service impl
 *
 * @author ranxinlong@cirdb.cn
 * @version 1.0.0
 * @date 2021/07/04
 */
public interface UserService {

    /**
     * 根据用户id获取用户信息
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
