package org.yuanxing.bootpay.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.yuanxing.bootpay.bean.Video;

import java.util.List;

/**
 * @author yuanxing
 * @version 0.0.1
 * @create 2019-07-05 17:23
 * @see (1)
 */
public interface TestMapper {

    @Select("SELECT * FROM video")
    @Results({
            @Result(column = "create_time",property = "createTime")
    })
    List<Video> findAll();
}
