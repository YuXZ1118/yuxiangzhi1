/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: springbootAndSpringmvc
 * Author:   admin
 * Date:     2018/4/17 15:47
 * Description: demo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yuxiangzhi.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈demo〉
 *
 * @author admin
 * @create 2018/4/17
 * @since 1.0.0
 */
@RestController
public class springbootAndSpringmvc {
    @Autowired
    //  获取配置文件中的值
    Environment environment;
    @RequestMapping("/demo")
    public String get(@RequestParam int a){
        return "helloSpringboot"+a+"\t"+environment.getProperty("url");
    }
}
