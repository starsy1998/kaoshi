package kaoshi.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import kaoshi.pojo.Detail;
import kaoshi.pojo.Sort;
import kaoshi.service.DetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class DetailController {
    @Reference
    private DetailService detailService;
    /**
     * 查询所有/根据类型ID查询Detail
     */
    @RequestMapping("/selectDetailBySortId.json")
    public List<Detail> selectDetailBySortId(Integer sortId){
        return detailService.selectDetailBySortId(sortId);
    }
    /**
     * 根据标题精确Detail
     */
    @RequestMapping("/selectDetailByTitle.do")
    public int selectDetailByTitle(String title){
        List<Detail> list = detailService.selectDetailByTitle(title);
        //如果查到标题
        if (list.size()>0){
            return 1;
        }
        return 0;
    }
    /**
     * 新增Detail
     */
    @RequestMapping("/addDetail.do")
    public int addDetail(Detail detail){
        //创建时间
        detail.setCreateDate(new Date());
        return detailService.addDetail(detail);
    }

    /**
     * 查询所有分类
     */
    @RequestMapping("/selctAllSort.json")
    public List<Sort> selctAllSort(){
        return detailService.selctAllSort();
    }
}

