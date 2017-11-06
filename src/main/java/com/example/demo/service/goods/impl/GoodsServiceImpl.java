package com.example.demo.service.goods.impl;

import com.example.demo.domain.mapper.goods.GoodsMapper;
import com.example.demo.domain.model.goods.Goods;
import com.example.demo.service.goods.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lk
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public PageInfo<Goods> findByPage() {
        PageHelper.startPage(1, 20);
        return new PageInfo<>(goodsMapper.findAll());
    }
}
