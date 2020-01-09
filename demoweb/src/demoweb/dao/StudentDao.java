package demoweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demoweb.bean.Student;
import demoweb.util.JDBCUtil;


public class StudentDao {
	public List<Student> selectAllStudent() throws SQLException{
		Statement sta=JDBCUtil.getStatement();
		//4、执行sql
		String sql="select * from student";
		ResultSet res = sta.executeQuery(sql);
		List<Student> list=new ArrayList<Student>();
		//5、获取结果
		while(res.next()) {
			Student student=new Student();
			int sno = res.getInt("sno");
			student.setSno(sno);
			String sname = res.getString("sname");
			student.setSname(sname);
			int sage=res.getInt("sage");
			student.setSage(sage);
			String ssex=res.getString("ssex");
			student.setSsex(ssex);
			list.add(student);
		}
		//6、关闭资源
		JDBCUtil.close(res);
		return list;
	}
	public int addStudent(Student stu) throws SQLException {
		Statement sta = JDBCUtil.getStatement();
		//4、执行sql
		String sql="insert into student values("+stu.getSno()+",'"+stu.getSname()+"',"+stu.getSage()+",'"+stu.getSsex()+"')";
		int res = sta.executeUpdate(sql);
		//关闭资源
		JDBCUtil.close();
		return res;
	}
	public int deleteStudent(int sno) throws SQLException {
		Statement sta = JDBCUtil.getStatement();
		//4、执行sql
		String sql="delete from student where sno="+sno;
		int res = sta.executeUpdate(sql);
		//关闭资源
		JDBCUtil.close();
		return res;
	}
	public Student selectOne(int sno1) throws SQLException {
		Statement sta = JDBCUtil.getStatement();
		String sql="select * from student where sno="+sno1;
		ResultSet res = sta.executeQuery(sql);
		Student student=null;
		while(res.next()) {
			student=new Student();
			int sno = res.getInt("sno");
			student.setSno(sno);
			String sname = res.getString("sname");
			student.setSname(sname);
			int sage=res.getInt("sage");
			student.setSage(sage);
			String ssex=res.getString("ssex");
			student.setSsex(ssex);
		}
		//6、关闭资源
		JDBCUtil.close(res);
		return student;
	}
	public int updateStudent(Student stu) throws SQLException {
		Statement sta = JDBCUtil.getStatement();
		String sql="update student set sname='"+stu.getSname()+"',sage="+stu.getSage()+",ssex='"+stu.getSsex()+"' where sno="+stu.getSno();
		int res = sta.executeUpdate(sql);
		//关闭资源
		JDBCUtil.close();
		return res;
	}
}
