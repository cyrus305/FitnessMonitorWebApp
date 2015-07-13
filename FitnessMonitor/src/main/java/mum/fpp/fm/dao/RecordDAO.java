package mum.fpp.fm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class RecordDAO {

	public void saveRecord(FitnessRecord record) {
		Connection conn = FMDataSource.getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			final String sql = "INSERT INTO fm_records (weight, calories, exdate) VALUES (?, ?, ?)";
			pstm = conn.prepareStatement(sql);
			pstm.setDouble(1, record.getWeight());
			pstm.setInt(2, record.getCalories());
			pstm.setString(3, LocalDate.now().toString());
			pstm.execute();
			System.out.println("New record inserted");
		} catch (SQLException e) {
			System.out.println("Insert failed");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
			}
			try {
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}

		}

	}

	public ArrayList<FitnessRecord> readRecordsByDate() {
		Connection conn = FMDataSource.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<FitnessRecord> list = new ArrayList<FitnessRecord>();
		try {
			stmt = conn.createStatement();
			final String sql = "SELECT id, weight, calories, exdate, extimestamp FROM fm_records";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				FitnessRecord fr = new FitnessRecord();
				fr.setWeight(rs.getDouble("weight"));
				fr.setCalories(rs.getInt("calories"));
				fr.setExdate(rs.getString("exdate"));
				list.add(fr);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}

		}
		return list;
	}

	public void readRecordsByDay() {

	}

	public void readRecordsByWeek() {

	}
	
//	public static void main(String[] args) {
//		RecordDAO dao = new RecordDAO();
//		for(FitnessRecord f :dao.readRecordsByDate()){
//			System.out.println(f);
//		}
//	}

}
