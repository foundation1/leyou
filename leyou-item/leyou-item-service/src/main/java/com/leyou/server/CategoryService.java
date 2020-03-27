package com.leyou.server;

import com.leyou.item.entity.CategoryEntity;
import com.leyou.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * [Description]:
 *
 * @author : xh
 * @date : 2020-03-26 17:00
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据父节点查询子节点
     *
     * @param
     * @return
     * @Author xh
     * @Date 2020/3/26
     * @Time 17:23
     **/
    public List<CategoryEntity> queryCategoryByPid(Long pid) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setParentId(pid);
        return this.categoryMapper.select(categoryEntity);
    }
}
