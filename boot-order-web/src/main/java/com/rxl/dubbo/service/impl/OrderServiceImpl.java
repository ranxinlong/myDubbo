package com.rxl.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rxl.dubbo.mudel.UserAddress;
import com.rxl.dubbo.service.IOrderService;
import com.rxl.dubbo.service.UserService;
import org.springframework.stereotype.Service;

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

    @Reference
    private UserService userService;

    @Override
    public List<UserAddress> addOrder() {
        List<UserAddress> addressList = userService.getUserAddressList("1");
        return addressList;
    }
}
