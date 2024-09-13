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


import com.dao.WanchengpingjiaDao;
import com.entity.WanchengpingjiaEntity;
import com.service.WanchengpingjiaService;
import com.entity.vo.WanchengpingjiaVO;
import com.entity.view.WanchengpingjiaView;

@Service("wanchengpingjiaService")
public class WanchengpingjiaServiceImpl extends ServiceImpl<WanchengpingjiaDao, WanchengpingjiaEntity> implements WanchengpingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanchengpingjiaEntity> page = this.selectPage(
                new Query<WanchengpingjiaEntity>(params).getPage(),
                new EntityWrapper<WanchengpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanchengpingjiaEntity> wrapper) {
		  Page<WanchengpingjiaView> page =new Query<WanchengpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WanchengpingjiaVO> selectListVO(Wrapper<WanchengpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WanchengpingjiaVO selectVO(Wrapper<WanchengpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WanchengpingjiaView> selectListView(Wrapper<WanchengpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanchengpingjiaView selectView(Wrapper<WanchengpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
