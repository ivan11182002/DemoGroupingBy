package demo.ivanman.groupingby;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoGroupingByIComplete {
	
	/*
	 * | 要保人 | 保單號碼   | 險種代碼   | 保險金額 (元)   |
	 * |-------|---------|----------|--------------|
	 * |       | P100001  | L001     | 1,000,000    |
	 * |       | P100002  | L002     | 500,000      |
	 * | 王〇明  | P100003  | H001     | 800,000      |
	 * |       | P100004  | A001     | 1,200,000    |
	 * |       | P100005  | C002     | 600,000      |
	 * |-------|---------|----------|--------------|
	 * |       | P100006  | L001     | 1,500,000    |
	 * | 劉〇聰  | P100007  | H002     | 700,000      |
	 * |       | P100008  | A003     | 900,000      |
	 * |-------|---------|----------|--------------|
	 * | 張〇婷  | P100009  | C001     | 1,100,000    |
	 * | 陳〇偉  | P100010  | L003     | 750,000      |
	 */
	public static void main(String[] args) {
		Map<String, List<InsuranceInfo>> insInfosByOwner = new HashMap<>();
		
		List<InsuranceInfo> insurances = getInsuranceData();	// 取得資料
		for (InsuranceInfo insInfo : insurances) {
			String owner = insInfo.getOwner();	// 要保人
			List<InsuranceInfo> list = insInfosByOwner.get(owner);	// 取得該要保人的資料清單
			if(list == null) {
				list = new ArrayList<>();
				insInfosByOwner.put(owner, list);	// 建立該要保人的分組資料
			}
			list.add(insInfo);	// 將該筆資料加入清單(此清單所屬的要保人在#33行時決定)
		}
	}
	
	public static List<InsuranceInfo> getInsuranceData() {
		List<InsuranceInfo> insuranceInfos = new ArrayList<>();
		Collections.addAll(insuranceInfos, 
				new InsuranceInfo("王〇明", "P100001", "L001", 1_000_000),
	            new InsuranceInfo("王〇明", "P100002", "L002", 500_000),
	            new InsuranceInfo("王〇明", "P100003", "H001", 800_000),
	            new InsuranceInfo("王〇明", "P100004", "A001", 1_200_000),
	            new InsuranceInfo("王〇明", "P100005", "C002", 600_000),
	            new InsuranceInfo("劉〇聰", "P100006", "L001", 1_500_000),
	            new InsuranceInfo("劉〇聰", "P100007", "H002", 700_000),
	            new InsuranceInfo("劉〇聰", "P100008", "A003", 900_000),
	            new InsuranceInfo("張〇婷", "P100009", "C001", 1_100_000),
	            new InsuranceInfo("陳〇偉", "P100010", "L003", 750_000)
		);
		return insuranceInfos;
	}
}
