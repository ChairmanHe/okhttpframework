package com.paul.okhttpframework.okhttp.manager;


import com.paul.okhttpframework.constant.URLConstant;
import com.paul.okhttpframework.okhttp.bean.RequestBean;

import java.util.Map;

/**
 * 请求数据管理类
 */
public class RequestBeanManager {

	private final static String TAG = RequestBeanManager.class.getSimpleName();

	/**
	 * 根据不同的tag获得不同的请求bean
	 * @param tag
	 * @param params
	 * @return
	 */
	public static RequestBean getRequestBean(int tag, Map<String, String> params) {
		switch (tag) {
			case URLConstant.TAG_GET_HEALTH_NEWS_LIST:
				return getHealthNewsList(params);
			case URLConstant.TAG_GET_HEALTH_NEWS_LOAD_MORE:
				return getHealthNewsList(params);

		default:
			return null;
		}
	}

	public static RequestBean getHealthNewsList(Map<String, String> params) {

		RequestBean requestBean = new RequestBean();
		requestBean.setMethod(URLConstant.GET);
		requestBean.setUrl(URLConstant.URL_GET_HEALTH_LORE_LIST); //
		requestBean.setParams(params);
		return requestBean;

	}
}