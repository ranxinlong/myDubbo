package com.rxl.dubbo.mudel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: UserAddress
 * Description: UserAddress service impl
 *
 * @author ranxinlong@cirdb.cn
 * @version 1.0.0
 * @date 2021/07/04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {
    private static final long serialVersionUID = 3875896409195463184L;

    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;

}
