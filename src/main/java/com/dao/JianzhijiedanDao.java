package com.dao;

import com.entity.JianzhijiedanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhijiedanVO;
import com.entity.view.JianzhijiedanView;


/**
 * 兼职接单
 * 
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public interface JianzhijiedanDao extends BaseMapper<JianzhijiedanEntity> {
	
	List<JianzhijiedanVO> selectListVO(@Param("ew") Wrapper<JianzhijiedanEntity> wrapper);
	
	JianzhijiedanVO selectVO(@Param("ew") Wrapper<JianzhijiedanEntity> wrapper);
	
	List<JianzhijiedanView> selectListView(@Param("ew") Wrapper<JianzhijiedanEntity> wrapper);

	List<JianzhijiedanView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhijiedanEntity> wrapper);
	
	JianzhijiedanView selectView(@Param("ew") Wrapper<JianzhijiedanEntity> wrapper);
	
}
