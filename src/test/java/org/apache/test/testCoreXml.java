package org.apache.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.test
 * @ClassName: testCoreXml
 * @Author: xpj
 * @Date: 2021/4/26 上午 11:04
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-core.xml")
public class testCoreXml {

    @Autowired
    DruidDataSource dataSource;
    @Test
    public void testDataSourice(){
        System.out.println(dataSource);
    }

    @Autowired
    SqlSessionFactoryBean sqlSession;
    @Test
    public void testSession(){
        System.out.println(sqlSession);
    }

    @Autowired
    MapperScannerConfigurer configurer;
    @Test
    public void testConfigurer(){
        System.out.println(configurer);
    }
}
