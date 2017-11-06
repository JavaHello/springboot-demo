package com.example.demo.web.controller;

import com.example.demo.domain.model.goods.Goods;
import com.example.demo.service.goods.GoodsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lk
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @RequestMapping("/page")
    @ResponseBody
    public PageInfo<Goods> pageInfo(){
        return goodsService.findByPage();
    }
}
