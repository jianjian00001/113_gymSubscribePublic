package com.dao;

import com.entity.ChangdiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangdiView;

/**
 * 场地 Dao 接口
 *
 * @author 
 */
public interface ChangdiDao extends BaseMapper<ChangdiEntity> {

   List<ChangdiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
