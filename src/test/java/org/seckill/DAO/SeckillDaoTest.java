package org.seckill.DAO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SecKill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入DAO实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void queryById()  throws Exception{
        long id=1000;
        SecKill secKill=seckillDao.queryById(id);
        System.out.println(secKill.getName());
        System.out.println(secKill);

    }

    @Test
    public void queryAll()  throws Exception{
        List<SecKill> secKillList = seckillDao.queryAll(0,100);
        for(SecKill secKill:secKillList){
            System.out.println(secKill);
        }
    }

    @Test
    public void reduceNumber() throws Exception{
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000,killTime);
        System.out.println("updateCounr= "+ updateCount);
    }
}