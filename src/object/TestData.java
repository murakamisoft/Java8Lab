package object;

import java.util.ArrayList;
import java.util.List;

public class TestData {

	public static List<Settle> getTestData() {
		List<Settle> list = new ArrayList<Settle>();
		Settle s = new Settle();
		s.setBssecName("九州支店");
		s.setBusinessTypeClassName("土木");
		list.add(s);

		s = new Settle();
		s.setBssecName("九州支店");
		s.setBusinessTypeClassName("土木");
		list.add(s);

		s = new Settle();
		s.setBssecName("九州支店");
		s.setBusinessTypeClassName("土木");
		list.add(s);

		s = new Settle();
		s.setBssecName("九州支店");
		s.setBusinessTypeClassName("建築");
		list.add(s);

		s = new Settle();
		s.setBssecName("九州支店");
		s.setBusinessTypeClassName("建築");
		list.add(s);

		s = new Settle();
		s.setBssecName("山本支店");
		s.setBusinessTypeClassName("土木");
		list.add(s);

		s = new Settle();
		s.setBssecName("山本支店");
		s.setBusinessTypeClassName("土木");
		list.add(s);

		s = new Settle();
		s.setBssecName("山本支店");
		s.setBusinessTypeClassName("建築");
		list.add(s);

		s = new Settle();
		s.setBssecName("山本支店");
		s.setBusinessTypeClassName("建築");
		list.add(s);

		s = new Settle();
		s.setBssecName("山本支店");
		s.setBusinessTypeClassName("建築");
		list.add(s);

		return list;
	}

}
