import java.util.List;

public class Employee {
		public String name;
		public Integer age;
		public List<String> licenses;
		public Integer employeeId;
		public String EmployeeName;
		
		void setName(String name) {
			this.name = name;
			
		}
		
		void setAge(Integer age) {
			this.age = age;
		}
		
		void setLicenses(List<String> licenses) {
			this.licenses = licenses;;
			
		}
		
		void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		
		void setEmployeeName(String EmployeeName) {
			this.EmployeeName = EmployeeName;
		}
		
		public String getName() {
			return name;
		}
		
		public int getId() {
			return employeeId;
		}
		
		public String getEmployeeName() {
			return "佐藤";
		}
		
		public int getEmployeeId() {
			return 3;
		}
		
		
		

	}



