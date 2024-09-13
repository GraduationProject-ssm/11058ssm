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


import com.dao.RemenjianzhiDao;
import com.entity.RemenjianzhiEntity;
import com.service.RemenjianzhiService;
import com.entity.vo.RemenjianzhiVO;
import com.entity.view.RemenjianzhiView;

@Service("remenjianzhiService")
public class RemenjianzhiServiceImpl extends ServiceImpl<RemenjianzhiDao, RemenjianzhiEntity> implements RemenjianzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemenjianzhiEntity> page = this.selectPage(
                new Query<RemenjianzhiEntity>(params).getPage(),
                new EntityWrapper<RemenjianzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemenjianzhiEntity> wrapper) {
		  Page<RemenjianzhiView> page =new Query<RemenjianzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemenjianzhiVO> selectListVO(Wrapper<RemenjianzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemenjianzhiVO selectVO(Wrapper<RemenjianzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemenjianzhiView> selectListView(Wrapper<RemenjianzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemenjianzhiView selectView(Wrapper<RemenjianzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
