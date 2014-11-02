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
	 * ͨ�����������ȡJSON�ַ���
	 * @param uri ���ӵ�ַ
	 */
	public static String getJSON(String uri) {
		String json = null;

		try {
			// ģ��һ��������ͻ���
			HttpClient httpClient = new DefaultHttpClient();
			// ��������ĳ�ʱʱ��
			HttpParams httpParams = httpClient.getParams();
			HttpConnectionParams.setConnectionTimeout(httpParams,CommonConfig.TIMEOUT);
			// ��������������������ʱ��Ϊ�ǻ���������
			String userAgent = "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2) Gecko/20100115 Firefox/3.6";
			HttpProtocolParams.setUserAgent(httpParams, userAgent);
			// ����GET���󣨿���ʹ��HttpPost��
			HttpGet httpGet = new HttpGet(uri);
			// ʹ�ÿͻ�����������������õ��������˵���Ӧ
			HttpResponse httpResponse = httpClient.execute(httpGet);
			// �ж���Ӧ�Ƿ�ɹ�
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
