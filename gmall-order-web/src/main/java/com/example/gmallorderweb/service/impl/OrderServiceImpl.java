package com.example.gmallorderweb.service.impl;

import com.example.gmallorderweb.service.IOrderService;
import com.rxl.dubbo.mudel.UserAddress;
import com.rxl.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: OrderServiceImpl
 * Description: OrderServiceImpl service impl
 *
 * @author ranxinlong@cirdb.cn
 * @version 1.0.0
 * @date 2021/07/04
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private UserService userService;

    @Override
    public List<UserAddress> addOrder() {
        List<UserAddress> addressList = userService.getUserAddressList("1");
        return addressList;
    }
}
