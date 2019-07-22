package kaoshi.service;

import kaoshi.pojo.Detail;
import kaoshi.pojo.Sort;

import java.util.List;

public interface DetailService {

    /**
     * 查询所有/根据类型ID查询Detail
     */
    List<Detail> selectDetailBySortId(Integer sortId);
    /**
     * 根据标题精确查询Detail
     */
    List<Detail> selectDetailByTitle(String title);
    /**
     * 新增Detail
     */
    int addDetail(Detail detail);
    /**
     * 查询所有分类
     */
    List<Sort> selctAllSort();
}
