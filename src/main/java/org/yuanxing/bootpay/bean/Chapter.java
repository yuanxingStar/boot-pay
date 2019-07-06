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
public class Chapter implements Serializable {
    private Integer id;

    /**
     * 视频主键
     */
    private Integer videoId;
    /**
     * 章节名称
     */
    private String title;
    /**
     * 章节顺序
     */
    private Integer ordered;
    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;


}