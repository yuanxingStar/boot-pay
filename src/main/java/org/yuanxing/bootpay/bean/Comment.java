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
public class Comment implements Serializable {

    private Integer id;
    /**
     * 内容
     */
    private String content;

    private Integer userId;
    /**
     * 用户头像
     */
    private String headImg;
    /**
     * 昵称
     */
    private String name;
    /**
     * 评分，10分满分
     */
    private Double point;
    /**
     * 点赞数
     */
    private Integer up;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 订单id
     */
    private Integer orderId;
    /**
     * 视频id
     */
    private Integer videoId;

    private static final long serialVersionUID = 1L;


}