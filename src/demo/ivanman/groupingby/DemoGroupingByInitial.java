package demo.ivanman.groupingby;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoGroupingByInitial {
	
	/*
	 * | 要保人 | 保單號碼   | 險種代碼   | 保險金額 (元)   |
	 * |-------|---------|----------|--------------|
	 * | 王〇明 | P100001  | L001     | 1,000,000    |
	 * | 王〇明 | P100002  | L002     | 500,000      |
	 * | 王〇明 | P100003  | H001     | 800,000      |
	 * | 王〇明 | P100004  | A001     | 1,200,000    |
	 * | 王〇明 | P100005  | C002     | 600,000      |
	 * | 劉〇聰 | P100006  | L001     | 1,500,000    |
	 * | 劉〇聰 | P100007  | H002     | 700,000      |
	 * | 劉〇聰 | P100008  | A003     | 900,000      |
	 * | 張〇婷 | P100009  | C001     | 1,100,000    |
	 * | 陳〇偉 | P100010  | L003     | 750,000      |
	 */
	public static void main(String[] args) {
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
	}
}
