package javaoopsconcepts;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaEncapsulation1 {

	public static void main(String[] args) {

		JavaEncapsulation j = new JavaEncapsulation();
		j.setEmpId(123456);
		j.setEmpName("Arjun");
		j.setEmpPhoneNo(9874563211l);

		JavaEncapsulation j1 = new JavaEncapsulation();

		j1.setEmpId(654321);
		j1.setEmpName("Arun");
		j1.setEmpPhoneNo(978456123l);

		JavaEncapsulation j2 = new JavaEncapsulation();
		j2.setEmpId(456987);
		j2.setEmpName("Avinash");
		j2.setEmpPhoneNo(8974563212l);

		List<JavaEncapsulation> li = new ArrayList<>();
		li.add(j);
		li.add(j1);
		li.add(j2);

		for (int i = 0; i < li.size(); i++) {
			System.out.println("\n Employee Information : " + (i + 1));
			System.out.println(li.get(i).getEmpId());
			System.out.println(li.get(i).getEmpName());
			System.out.println(li.get(i).getEmpPhoneNo());

			Set<JavaEncapsulation> s = new LinkedHashSet();
			s.add(j);
			s.add(j1);
			s.add(j2);

			for (JavaEncapsulation ja : s) {
				System.out.println("Employee id : " + ja.getEmpId());
				System.out.println("Employee name : " + ja.getEmpName());
				System.out.println("Employee PhNo : " + ja.getEmpPhoneNo());
			}

			Map<Integer, JavaEncapsulation> m = new LinkedHashMap();
			m.put(1, j);
			m.put(2, j1);
			m.put(3, j2);

			Set<Entry<Integer, JavaEncapsulation>> entrySet = m.entrySet();
			for (Entry<Integer, JavaEncapsulation> e : entrySet) {

				System.out.println("SI.NO : " + e.getKey());
				System.out.println("Employee ID : " + e.getValue().getEmpId());
				System.out.println("Employee Name : " + e.getValue().getEmpName());
				System.out.println("Employee PHNO : " + e.getValue().getEmpPhoneNo());

			}

		}

	}

}
