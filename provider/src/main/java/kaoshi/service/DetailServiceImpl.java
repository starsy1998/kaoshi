package kaoshi.service;

import com.alibaba.dubbo.config.annotation.Service;
import kaoshi.mapper.DetailMapper;
import kaoshi.pojo.Detail;
import kaoshi.pojo.Sort;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
//指定类型
@Service(interfaceClass = DetailService.class)
public class DetailServiceImpl implements DetailService {
    //注入
    @Resource
    private DetailMapper detailMapper;

    public List<Detail> selectDetailBySortId(Integer sortId) {
        return detailMapper.selectDetailBySortId(sortId);
    }

    public List<Detail> selectDetailByTitle(String title) {
        return detailMapper.selectDetailByTitle(title);
    }
    //事务
    @Transactional //在页面判断如果大于0就是添加成功
    public int addDetail(Detail detail) {
        return detailMapper.addDetail(detail);
    }

    public List<Sort> selctAllSort() {
        return detailMapper.selctAllSort();
    }


}
