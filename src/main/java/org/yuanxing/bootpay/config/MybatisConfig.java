package org.yuanxing.bootpay.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuanxing
 * @version 0.0.1
 * @create 2019-07-05 16:46
 * @see (1) mybatis 配置类
 */

@Configuration
@MapperScan("org.yuanxing.bootpay.mapper")  //配置mapper映射
public class MybatisConfig {
}
