package demoweb.service;

import java.sql.SQLException;
import java.util.List;

import demoweb.bean.Student;
import demoweb.dao.StudentDao;

public class StudentService {
	StudentDao dao=new StudentDao();
	/**
	 * 查询所有学生信息
	 * @return
	 */
	public List<Student> selectAllStudent(){
		List<Student> list=null;
		try {
			list = dao.selectAllStudent();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 添加学生信息
	 */
	public int addStudent(Student stu) {
		int res=0;
		try {
			res = dao.addStudent(stu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * 删除学生信息
	 * @param sno
	 * @return
	 */
	public int deleteStudent(int sno) {
		int res=0;
		try {
			res = dao.deleteStudent(sno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	public Student selectOne(int sno) {
		Student stu=null;
		try {
			stu = dao.selectOne(sno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}
	public int updateStudent(Student stu) {
		int res=0;
		try {
			res = dao.updateStudent(stu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
}
