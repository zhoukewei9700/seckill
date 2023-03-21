package org.seckill.DAO;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

    /**
     * 插入购买明细,可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入的结果及数量
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据秒杀id查询successkilled并携带秒杀对象
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
