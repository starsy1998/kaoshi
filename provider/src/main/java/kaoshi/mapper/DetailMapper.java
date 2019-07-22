package kaoshi.mapper;
import kaoshi.pojo.Detail;
import kaoshi.pojo.Sort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DetailMapper {


    /**
     * 1.查询所有 /根据类型ID查询Detail
     */
    List<Detail> selectDetailBySortId(@Param("sortId") Integer sortId);
    /**
     * 2.根据标题精确查询Detail
     */
    List<Detail> selectDetailByTitle(String title);
    /**
     * 3.新增Detail
     */
    int addDetail(Detail detail);
    /**
     * 4查询所有分类
     */
    List<Sort> selctAllSort();
}
