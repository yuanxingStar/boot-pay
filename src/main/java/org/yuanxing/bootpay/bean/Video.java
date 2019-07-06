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
public class Video implements Serializable {


    private Integer id;

    /**
     *  视频标题
     */
    private String title;

    /**
     * 概述
     */
    private String summary;
    /**
     * 封面图
     */
    private String coverImg;

    /**
     * 观看数
     */
    private Integer viewNum;

    /**
     * 价格,分
     */
    private Integer price;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 0表示未上线，1表示上线
     */
    private Integer online;
    /**
     * 默认8.7，最高10分
     */
    private Double point;

    private static final long serialVersionUID = 1L;


}