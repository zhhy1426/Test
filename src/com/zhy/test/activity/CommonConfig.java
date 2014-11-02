package com.zhy.test.activity;

public class CommonConfig {
	/**
	 * 超时时间
	 */
	public static final int TIMEOUT = 5000;
	/**
	 * 分类接口
	 */
	public static final String URL_CATEGORY = "http://app.nuomi.com/naserver/home/homepage?logpage=Home&cityid=%s&appid=android&tn=android&terminal_type=android&device=Genymotion+Google+Nexus+S+-+4.1.1+-+API+16+-+480x800&channel=1006900a&v=5.0.2&os=SDK16&location=0&cuid=477AD5CF1A3CC8B6073AD245387DCAA7000000000000000&uuid=ffffffff-bcbf-43b9-9c1c-96300033c587&timestamp=1410866512822&swidth=480&sheight=728&net=wifi&sign=d19662517af1fc33c387f9aa1b6344d1";
	/**
	 * 猜你喜欢接口
	 */
	public static final String URL_LIKE = "http://app.nuomi.com/naserver/search/likeitem?logpage=Home&cityid=%s&appid=android&tn=android&terminal_type=android&device=Genymotion+Google+Nexus+S+-+4.1.1+-+API+16+-+480x800&channel=1006900a&v=5.0.2&os=SDK16&location=0&cuid=477AD5CF1A3CC8B6073AD245387DCAA7000000000000000&uuid=ffffffff-bcbf-43b9-9c1c-96300033c587&timestamp=1410866512845&swidth=480&sheight=728&net=wifi&sign=d6dc9a24e2a74a0750443bbc19acfe1a";
	/**
	 * 全部团购接口
	 */
	public static final String URL_TUAN_LIST = "http://app.nuomi.com/naserver/search/commonitem?logpage=CateList&locate_city_id=0&page_idx=%s&location=0&bizarea_list=0&sort_type=0&goods_per_page=15&fst_cattag_id=0&appid=android&tn=android&terminal_type=android&device=Genymotion+Google+Nexus+S+-+4.1.1+-+API+16+-+480x800&channel=1006900a&v=5.0.2&os=SDK16&cityid=300210000&cuid=477AD5CF1A3CC8B6073AD245387DCAA7000000000000000&uuid=ffffffff-bcbf-43b9-9c1c-96300033c587&timestamp=1411024201362&swidth=480&sheight=728&net=wifi&sign=6d72fd5841a40b4a9a5d6800e25ee602";
	/**
	 * 商品详情接口
	 */
	public static final String URL_TUAN_DETAIL = "http://app.nuomi.com/naserver/item/ItemDetailPage?city_id=300210000&logpage=DealDetail&tinyPicHeight=0&tinyPicWidth=204&s=03ee7a98f5817edbaeade39b4a90b8b1&deal_id=%s&appid=android&tn=android&terminal_type=android&device=Genymotion+Google+Nexus+S+-+4.1.1+-+API+16+-+480x800&channel=1006900a&v=5.0.2&os=SDK16&cityid=300210000&location=0&cuid=477AD5CF1A3CC8B6073AD245387DCAA7000000000000000&uuid=ffffffff-bcbf-43b9-9c1c-96300033c587&timestamp=1411094014849&swidth=480&sheight=728&net=wifi&sign=3205a";

	/**
	 * Bundle传值
	 */
	public static final String BUNDLE_DATATUANLIST = "DataTuanList";
	public static final String EXTRA_BUNDLE = "bundle";
	
	/**
	 * Intent普通传值
	 */
	public static final String EXTRA_CITY = "city";
	
	/**
	 * SQL语句
	 */
	public static final String SQL_INSERT_TUAN = "INSERT INTO table_tuan(deal_id, image, brand_name, short_title, sale_count, groupon_price, market_price) VALUES(?, ?, ?, ?, ?, ?, ?)";
	public static final String SQL_QUERY_TUAN_BY_DEAL_ID = "SELECT * FROM table_tuan WHERE deal_id = ?";
}
