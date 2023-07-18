package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.EntityCard;
import generator.service.EntityCardService;
import generator.mapper.EntityCardMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【entity_card(实体卡管理表)】的数据库操作Service实现
* @createDate 2023-07-18 16:19:09
*/
@Service
public class EntityCardServiceImpl extends ServiceImpl<EntityCardMapper, EntityCard>
    implements EntityCardService{

}




