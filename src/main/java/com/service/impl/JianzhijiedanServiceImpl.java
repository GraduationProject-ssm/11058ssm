package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianzhijiedanDao;
import com.entity.JianzhijiedanEntity;
import com.service.JianzhijiedanService;
import com.entity.vo.JianzhijiedanVO;
import com.entity.view.JianzhijiedanView;

@Service("jianzhijiedanService")
public class JianzhijiedanServiceImpl extends ServiceImpl<JianzhijiedanDao, JianzhijiedanEntity> implements JianzhijiedanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhijiedanEntity> page = this.selectPage(
                new Query<JianzhijiedanEntity>(params).getPage(),
                new EntityWrapper<JianzhijiedanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhijiedanEntity> wrapper) {
		  Page<JianzhijiedanView> page =new Query<JianzhijiedanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhijiedanVO> selectListVO(Wrapper<JianzhijiedanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhijiedanVO selectVO(Wrapper<JianzhijiedanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhijiedanView> selectListView(Wrapper<JianzhijiedanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhijiedanView selectView(Wrapper<JianzhijiedanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
