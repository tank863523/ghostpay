package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.PaymentRecord;
import generator.service.PaymentRecordService;
import generator.mapper.PaymentRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【payment_record(收支明细表)】的数据库操作Service实现
* @createDate 2023-07-18 16:19:09
*/
@Service
public class PaymentRecordServiceImpl extends ServiceImpl<PaymentRecordMapper, PaymentRecord>
    implements PaymentRecordService{

}




