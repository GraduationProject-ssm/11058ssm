package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianzhijiedanEntity;
import com.entity.view.JianzhijiedanView;

import com.service.JianzhijiedanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 兼职接单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
@RestController
@RequestMapping("/jianzhijiedan")
public class JianzhijiedanController {
    @Autowired
    private JianzhijiedanService jianzhijiedanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianzhijiedanEntity jianzhijiedan, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			jianzhijiedan.setShangjiabianhao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			jianzhijiedan.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JianzhijiedanEntity> ew = new EntityWrapper<JianzhijiedanEntity>();
		PageUtils page = jianzhijiedanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianzhijiedan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianzhijiedanEntity jianzhijiedan, HttpServletRequest request){
        EntityWrapper<JianzhijiedanEntity> ew = new EntityWrapper<JianzhijiedanEntity>();
		PageUtils page = jianzhijiedanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianzhijiedan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianzhijiedanEntity jianzhijiedan){
       	EntityWrapper<JianzhijiedanEntity> ew = new EntityWrapper<JianzhijiedanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianzhijiedan, "jianzhijiedan")); 
        return R.ok().put("data", jianzhijiedanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianzhijiedanEntity jianzhijiedan){
        EntityWrapper< JianzhijiedanEntity> ew = new EntityWrapper< JianzhijiedanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianzhijiedan, "jianzhijiedan")); 
		JianzhijiedanView jianzhijiedanView =  jianzhijiedanService.selectView(ew);
		return R.ok("查询兼职接单成功").put("data", jianzhijiedanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianzhijiedanEntity jianzhijiedan = jianzhijiedanService.selectById(id);
        return R.ok().put("data", jianzhijiedan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianzhijiedanEntity jianzhijiedan = jianzhijiedanService.selectById(id);
        return R.ok().put("data", jianzhijiedan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianzhijiedanEntity jianzhijiedan, HttpServletRequest request){
    	jianzhijiedan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianzhijiedan);

        jianzhijiedanService.insert(jianzhijiedan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianzhijiedanEntity jianzhijiedan, HttpServletRequest request){
    	jianzhijiedan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianzhijiedan);

        jianzhijiedanService.insert(jianzhijiedan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JianzhijiedanEntity jianzhijiedan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianzhijiedan);
        jianzhijiedanService.updateById(jianzhijiedan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianzhijiedanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JianzhijiedanEntity> wrapper = new EntityWrapper<JianzhijiedanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiabianhao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = jianzhijiedanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
