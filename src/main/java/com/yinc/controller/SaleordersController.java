package com.yinc.controller;



import com.yinc.dataConfig.DataSourceNames;
import com.yinc.dataConfig.DynamicDataSource;
import com.yinc.service.SaleordersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单/退货单 前端控制器
 * </p>
 *
 * @author yinC
 * @since 2021-03-11
 */
@RestController
@RequestMapping("/saleorders")
public class SaleordersController {

    @Autowired
    private SaleordersService saleordersService;

    @RequestMapping(value = "getOrder")
    public String getOrder(){

        /**
         * 显示指定数据源
         */
        DynamicDataSource.setDataSource(DataSourceNames.SECOND);
        int count = saleordersService.count(null);
        return String.valueOf(count);
    }

}
