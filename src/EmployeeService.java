import java.sql.SQLException;

	
	
	/**
	 * 社員情報の登録/変更/制限をおこなう業務ロジッククラス
	 * 
	 * @author user
	 *@version 2.1
	 *@since 1.0
	 */

	public class EmployeeService {
		public static void main(String[] args) throws Exception{
			EmployeeDAO employeeDao = new EmployeeDAO();
			employeeDao.getConnection();
		}
		
		/**社員情報にアクセスするためのDao */
		private EmployeeDAO employeeDao;
		
		/**
		 * 社員情報を更新する
		 * 
		 * @param employeeId 更新対象の社員 ID
		 * @param employeeName 更新後の社員名
		 * @return 更新した件数
		 * @throws SQLException 更新時にエラーが発生した場合
		 */
		public int updateEmployee(int employeeId, String employeeName) throws SQLException {
			Employee employee= new Employee();
			employee.setEmployeeId(employeeId);
			employee.setEmployeeName(employeeName);
			return this.employeeDao.update(employee);
		}

	}

