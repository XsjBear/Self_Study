package com.self_study.service;


import java.util.ArrayList;

import com.self_study.bean.ShareExperienceBean;
import com.self_study.bean.UserInfoBean;

public interface IShareExperienceService {

	
	/**
	 * 根据userid查询出对应的分享
	 * @param shareExperience
	 * @return
	 */
	public ArrayList<ShareExperienceBean> selectByUserId(UserInfoBean userInfo);
	

	/**
	 * 添加分享经验
	 * @return
	 */
	public int addExperience(ShareExperienceBean shareExperience);
	
	
	
}