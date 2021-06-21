package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


import business.Item;
import interfaces.DAO;

public class ItemDB implements DAO<Item> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/item_db";
		String username = "item_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}
	
	@Override
	public Item get(int id) {
		Item item = null;
		String sql = "select * from item where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				item = getItemFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}

	@Override
	public List<Item> getAll() {
		List<Item> items = new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from item");
			while(rs.next()) {
				// for each row, parse an item
				Item item = getItemFromRow(rs);
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return items;
	}

	private Item getItemFromRow(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String desc = rs.getString(2);
		Item item = new Item(id, desc);
		return item;
	}

	@Override
	public boolean add(Item item) {
		boolean success = false;
		String sql = "insert into item (description) values (?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, item.getDescription());
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Item item) {
		boolean success = false;
		String sql = "update item set description = ? where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, item.getDescription());
			ps.setInt(2, item.getId());
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean delete(Item item) {
		boolean success = false;
		String sql = "delete from item where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, item.getId());
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

}
