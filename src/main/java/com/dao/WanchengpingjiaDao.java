package com.dao;

import com.entity.WanchengpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanchengpingjiaVO;
import com.entity.view.WanchengpingjiaView;


/**
 * 完成评价
 * 
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface WanchengpingjiaDao extends BaseMapper<WanchengpingjiaEntity> {
	
	List<WanchengpingjiaVO> selectListVO(@Param("ew") Wrapper<WanchengpingjiaEntity> wrapper);
	
	WanchengpingjiaVO selectVO(@Param("ew") Wrapper<WanchengpingjiaEntity> wrapper);
	
	List<WanchengpingjiaView> selectListView(@Param("ew") Wrapper<WanchengpingjiaEntity> wrapper);

	List<WanchengpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<WanchengpingjiaEntity> wrapper);
	
	WanchengpingjiaView selectView(@Param("ew") Wrapper<WanchengpingjiaEntity> wrapper);
	
}
