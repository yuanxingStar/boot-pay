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
public class Episode implements Serializable {
    private Integer id;
    /**
     * 集标题
     */
    private String title;
    /**
     * 第几集
     */
    private Integer num;
    /**
     * 时长 分钟，单位
     */
    private String duration;
    /**
     * 封面图
     */
    private String coverImg;
    /**
     * 视频id
     */
    private Integer videoId;
    /**
     * 集概述
     */
    private String summary;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 章节主键id
     */
    private Integer chapterId;

    private static final long serialVersionUID = 1L;


}