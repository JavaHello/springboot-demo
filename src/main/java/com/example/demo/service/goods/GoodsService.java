package com.example.demo.service.goods;

import com.example.demo.domain.model.goods.Goods;
import com.github.pagehelper.PageInfo;

/**
 * @author lk
 */
public interface GoodsService {

    /**
     * 分页查找商品
     * @return 商品列表
     */
    PageInfo<Goods> findByPage();
}
