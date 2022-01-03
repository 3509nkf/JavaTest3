import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;









		public class EmployeeDAO {
			

			// JavaからMySQLに接続する
			public Connection getConnection() throws ClassNotFoundException, SQLException {
				// ドライバのクラスをJava上で読み込む
				Class.forName("com.mysql.jdbc.Driver");

				// DBと接続する
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost/testdb?useSSL=false&useUnicode=true&characterEncoding=utf8", "root",
						"ご自身で設定したrootのパスワード");
				return con;
			}

			// JavaとMySQLの接続を切る
			public void closeConnection(Connection con) {
				// 接続を閉じる
				
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						System.err.println("データベース切断時にエラーが発生しました。");
						e.printStackTrace();
					}
				}

			}


			// Employee情報の更新をおこなうメソッド
			public int update(Employee employee) {
				try {

					// DBと接続する
					Connection con = this.getConnection();

					// あいまいなSQL文準備
					String sql = "UPDATE employees SET employee_name=? WHERE employee_id=?";

					// あいまいなままSQL実行準備
					PreparedStatement pstmt = con.prepareStatement(sql);

					// バインド処理（あいまいな部分をつぶす）
					pstmt.setString(1, employee.getEmployeeName());
					pstmt.setInt(2, employee.getEmployeeId());

					// UPDATE文実行
					int num = pstmt.executeUpdate();

		                        return num; 


				} catch (ClassNotFoundException e) {
					System.err.println("JDBCドライバのロードに失敗しました。");
					e.printStackTrace();
				} catch (SQLException e) {
					System.err.println("データベースに異常が発生しました。");
					e.printStackTrace();
				} finally {
					           Connection con = null;
		                       this.closeConnection(con);
		                      
				}
				return 0;

			
			
			
			
		}
	 
	}

