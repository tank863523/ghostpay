package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.PaymentOrder;
import generator.service.PaymentOrderService;
import generator.mapper.PaymentOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【payment_order(支付订单表)】的数据库操作Service实现
* @createDate 2023-07-18 16:19:09
*/
@Service
public class PaymentOrderServiceImpl extends ServiceImpl<PaymentOrderMapper, PaymentOrder>
    implements PaymentOrderService{

}




