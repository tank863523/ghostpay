package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Account;
import generator.service.AccountService;
import generator.mapper.AccountMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【account(账户表)】的数据库操作Service实现
* @createDate 2023-07-18 16:19:09
*/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService{

}




