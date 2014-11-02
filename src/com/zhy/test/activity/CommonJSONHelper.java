package com.zhy.test.activity;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;

public class CommonJSONHelper {

	/**
	 * 通过网络请求获取JSON字符串
	 * @param uri 链接地址
	 */
	public static String getJSON(String uri) {
		String json = null;

		try {
			// 模拟一个浏览器客户端
			HttpClient httpClient = new DefaultHttpClient();
			// 设置请求的超时时间
			HttpParams httpParams = httpClient.getParams();
			HttpConnectionParams.setConnectionTimeout(httpParams,CommonConfig.TIMEOUT);
			// 设置浏览器代理，解决请求时认为是机器人问题
			String userAgent = "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2) Gecko/20100115 Firefox/3.6";
			HttpProtocolParams.setUserAgent(httpParams, userAgent);
			// 创建GET请求（可以使用HttpPost）
			HttpGet httpGet = new HttpGet(uri);
			// 使用客户端请求服务器，并得到服务器端的响应
			HttpResponse httpResponse = httpClient.execute(httpGet);
			// 判断响应是否成功
			if (httpResponse != null && httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				HttpEntity httpEntity = httpResponse.getEntity();
				if(httpEntity != null){
					json = EntityUtils.toString(httpEntity,"UTF-8");
				}
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}
}
