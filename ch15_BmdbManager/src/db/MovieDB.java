package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;
import interfaces.DAO;

public class MovieDB implements DAO<Movie> {
	
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}

	@Override
	public Movie get(int id) {
		Movie movie = null;
		String sql = "select * from movie where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				movie = getMovieFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movie;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from movie");
			while(rs.next()) {
				// for each row, parse an item
				Movie movie = getMovieFromRow(rs);
				movies.add(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return movies;
	}
	
	private Movie getMovieFromRow(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String title = rs.getString(2);
		int year = rs.getInt(3);
		String rating = rs.getString(4);
		String director = rs.getString(5);
		Movie movie = new Movie(id, title, year, rating, director);
		return movie;
	}

	@Override
	public boolean add(Movie movie) {
		boolean success = false;
		String sql = "insert into movie (title, rating, year, director) values (?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, movie.getTitle());
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
	public boolean update(Movie movie) {
		boolean success = false;
		String sql = "update movie set title = ? where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, movie.getTitle());
			ps.setInt(2, movie.getId());
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
	public boolean delete(Movie movie) {
		boolean success = false;
		String sql = "delete from movie where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, movie.getId());
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
