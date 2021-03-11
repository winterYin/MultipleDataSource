package com.yinc.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yinc.entity.Saleorders;
import com.yinc.mapper.SaleordersMapper;
import com.yinc.service.SaleordersService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单/退货单 服务实现类
 * </p>
 *
 * @author yinC
 * @since 2021-03-11
 */
@Service
public class SaleordersServiceImpl extends ServiceImpl<SaleordersMapper, Saleorders> implements SaleordersService {

}
