package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 690. Employee Importance
 *
 * @author zhangzhe
 */
public class EmployeeImportanceSolution {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.id = 1;
		employee.importance = 5;
		employee.subordinates = new ArrayList<>(Arrays.asList(2, 3));
		employees.add(employee);

		employee = new Employee();
		employee.id = 2;
		employee.importance = 3;
		employee.subordinates = new ArrayList<>();
		employees.add(employee);

		employee = new Employee();
		employee.id = 3;
		employee.importance = 3;
		employee.subordinates = new ArrayList<>();
		employees.add(employee);

		System.out.println(getImportance(employees, 1));

	}

	private static int getImportance(List<Employee> employees, int id) {
		if(employees == null || employees.size() == 0) {
			return 0;
		}
		Map<Integer, Employee> employeeMap = employees.stream()
				.collect(Collectors.toMap(e -> e.id, Function.identity()));

		int ans = 0;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(id);

		while (!queue.isEmpty()) {
			int n = queue.poll();
			Employee employee = employeeMap.get(n);
			ans += employee.importance;
			if(employee.subordinates != null) {
				queue.addAll(employee.subordinates);
			}
		}

		return ans;
	}

}
