package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import object.Settle;
import object.TestData;

public class Main01 {

	public static void main(String[] args) {
		List<Settle> list = TestData.getTestData();

		setIndex(list);

		addBusinessLevelCalc(list);

		list = sort(list);

		print(list);
	}

	private static void print(List<Settle> list) {
		for (Settle s : list) {
			System.out.println(s.toString());
		}
	}

	public static void setIndex(List<Settle> list) {
		long i = 1L;
		String businessNamePrev = "";
		for (Settle s : list) {
			if (s.getBusinessTypeClassName().equals(businessNamePrev)) {
				i++;
				s.setIndex(i);
			} else {
				i = 1L;
				s.setIndex(i);
			}
			businessNamePrev = s.getBusinessTypeClassName();
		}
	}

	public static void addBusinessLevelCalc(List<Settle> list) {

		List<String> bssecKeyList = new ArrayList<String>();
		bssecKeyList.add("九州支店");
		bssecKeyList.add("山本支店");

		List<String> businessKeyList = new ArrayList<String>();
		businessKeyList.add("土木");
		businessKeyList.add("建築");

		Settle s = null;
		for (String bssecKey : bssecKeyList) {
			for (String businessKey : businessKeyList) {
				s = new Settle();
				s.setBssecName(bssecKey);
				s.setBusinessTypeClassName(businessKey);
				s.setRegion("完了");
				list.add(s);
				s = new Settle();
				s.setBssecName(bssecKey);
				s.setBusinessTypeClassName(businessKey);
				s.setRegion("進行中");
				list.add(s);
				s = new Settle();
				s.setBssecName(bssecKey);
				s.setBusinessTypeClassName(businessKey);
				s.setRegion("その他");
				list.add(s);
				s = new Settle();
				s.setBssecName(bssecKey);
				s.setBusinessTypeClassName(businessKey);
				s.setRegion("合計");
				list.add(s);
			}
			s = new Settle();
			s.setBssecName(bssecKey);
			s.setRegion("完了");
			list.add(s);
			s = new Settle();
			s.setBssecName(bssecKey);
			s.setRegion("進行中");
			list.add(s);
			s = new Settle();
			s.setBssecName(bssecKey);
			s.setRegion("その他");
			list.add(s);
			s = new Settle();
			s.setBssecName(bssecKey);
			s.setRegion("合計");
			list.add(s);
		}

	}

	public static List<Settle> sort(List<Settle> list) {

		Comparator<Settle> comparator = Comparator

				.comparing(Settle::getBssecName,
						Comparator.nullsLast(Comparator.naturalOrder()))

				.thenComparing(Settle::getBusinessTypeClassName,
						Comparator.nullsLast(Comparator.naturalOrder()))

				.thenComparing(Settle::getRegion,
						Comparator.nullsFirst(Comparator.naturalOrder()))

				.thenComparing(Settle::getIndex);

		return list.stream().sorted(comparator).collect(Collectors.toList());

	}

}
