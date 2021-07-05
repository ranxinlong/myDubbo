package com.example.gmallorderweb.controller;

import com.example.gmallorderweb.service.IOrderService;
import com.rxl.dubbo.mudel.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: OrderController
 * Description: OrderController service impl
 *
 * @author ranxinlong@cirdb.cn
 * @version 1.0.0
 * @date 2021/07/04
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService service;

    @GetMapping("/addOrder")
    public List<UserAddress> addOrder(){
        return service.addOrder();
    }
}
