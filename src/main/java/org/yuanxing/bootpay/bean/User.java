package org.yuanxing.bootpay.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    private Integer id;
    /**
     *  微信openid
     */
    private String openid;
    /**
     * 昵称
     */
    private String name;
    /**
     * 头像
     */
    private String headImg;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 用户签名
     */
    private String sign;
    /**
     * 0表示女，1表示男
     */
    private Byte sex;
    /**
     * 城市
     */
    private String city;
    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;


}