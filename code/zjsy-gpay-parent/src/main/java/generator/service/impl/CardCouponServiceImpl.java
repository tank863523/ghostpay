package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.CardCoupon;
import generator.service.CardCouponService;
import generator.mapper.CardCouponMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【card_coupon(卡卷管理表)】的数据库操作Service实现
* @createDate 2023-07-18 16:19:09
*/
@Service
public class CardCouponServiceImpl extends ServiceImpl<CardCouponMapper, CardCoupon>
    implements CardCouponService{

}




