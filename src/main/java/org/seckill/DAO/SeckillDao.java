package org.seckill.DAO;

import org.seckill.entity.SecKill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影像行数为>1，表示更新的记录行数
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     *根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    SecKill queryById(long seckillId);

    /**
     * 根据偏移量查询商品列表
     * @param offset
     * @param limit
     * @return
     */
    List<SecKill> queryAll(int offset, int limit);


}
