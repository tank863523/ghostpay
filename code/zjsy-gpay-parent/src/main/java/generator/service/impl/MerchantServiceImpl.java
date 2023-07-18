package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Merchant;
import generator.service.MerchantService;
import generator.mapper.MerchantMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【merchant(商家表)】的数据库操作Service实现
* @createDate 2023-07-18 16:19:09
*/
@Service
public class MerchantServiceImpl extends ServiceImpl<MerchantMapper, Merchant>
    implements MerchantService{

}




