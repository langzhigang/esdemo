package cn.lzg.esdemo;

/**
 * 用于es查询的dto
 * 
 * @author lzg
 * @date 2016年6月12日
 */
public class GoodsFilter2ES {
	private String regionId; // 园区UUID

	private String queryStr; // 条件

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getQueryStr() {
		return queryStr;
	}

	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
	}
}
