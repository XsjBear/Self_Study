package com.self_study.service;

import java.util.ArrayList;

import com.self_study.bean.FriendBean;
import com.self_study.bean.FriendInfoBean;
import com.self_study.bean.StudyFriendInfoBean;
import com.self_study.bean.UserInfoBean;

public interface IStudyFriendService {

	/**
	 * 按照session中的用户信息中的userid查找出friend表中关于当前用户的相关信息
	 * @param userInfoBean	session中存储的用户信息
	 * @return	friend表中关于此user的相关信息
	 */
	public FriendInfoBean selectByUserId(UserInfoBean userInfoBean);
	
	/**
	 *插入相关信息
	 * @param firendBean
	 * @return
	 */
	public int addFriendInfo(FriendBean firendBean);
	
	/**
	 *更新相关信息
	 * @param firendBean
	 * @return
	 */
	public int updataFriendInfo(FriendBean firendBean);
	
	/**
	 * 查询出friend表中所有的用户
	 * @return
	 */
	public ArrayList<StudyFriendInfoBean> selectAll(UserInfoBean userInfo);
	
	
}
