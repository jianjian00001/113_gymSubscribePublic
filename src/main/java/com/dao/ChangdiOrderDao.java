package com.dao;

import com.entity.ChangdiOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangdiOrderView;

/**
 * 场地预约 Dao 接口
 *
 * @author 
 */
public interface ChangdiOrderDao extends BaseMapper<ChangdiOrderEntity> {

   List<ChangdiOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
