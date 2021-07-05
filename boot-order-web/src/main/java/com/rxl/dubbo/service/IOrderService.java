package com.rxl.dubbo.service;

import com.rxl.dubbo.mudel.UserAddress;

import java.util.List;

/**
 * ClassName: IOrderService
 * Description: IOrderService service impl
 *
 * @author ranxinlong@cirdb.cn
 * @version 1.0.0
 * @date 2021/07/04
 */
public interface IOrderService {

    /**
     * 新增订单
     * @return
     */
    List<UserAddress> addOrder();
}
