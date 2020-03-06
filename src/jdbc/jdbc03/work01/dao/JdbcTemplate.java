package jdbc.jdbc03.work01.dao;

import jdbc.jdbc03.work01.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @date 8/17/2019 - 8:53 PM
 */
public class JdbcTemplate<T> {
    private RowMapper<T> rowMapper;
public JdbcTemplate(RowMapper<T> rowMapper) {
    this.rowMapper = rowMapper;
}
public JdbcTemplate(){
}
public T selectForObject(String sql,Object... args){
    T object = null;
    Connection connection = DBConnection.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
        try {
            pstmt = connection.prepareStatement(sql);
            if(args!=null){
                for(int i = 0;i<args.length;i++){
                    pstmt.setObject(i+1,args[i]);
                }
            }
            rs = pstmt.executeQuery();
            if(rs.next()){
                object = rowMapper.mapper(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DBConnection.closeConnection(rs,pstmt);
        }
        return  object;
}
public List<T> selectForList(String sql,Object[] arr){
    List<T> list = new ArrayList<>();
    T object;
    Connection connection = DBConnection.getConnection();
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    try {
        preparedStatement = connection.prepareStatement(sql);
        if(arr!=null){
            for(int i = 0;i<arr.length;i++){

        preparedStatement.setObject(i+1,arr[i]);
            }

        }
        rs = preparedStatement.executeQuery();
        while (rs.next()){
            object = rowMapper.mapper(rs);
            list.add(object);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    finally {
        DBConnection.closeConnection(rs,preparedStatement);
    }
    return list;
}
public int update(String sql,Object... arr){
    int row = 0;
    Connection connection = DBConnection.getConnection();
    PreparedStatement preparedStatement = null;
    try {
        preparedStatement = connection.prepareStatement(sql);
        if(arr!=null){
            for(int i=0;i<arr.length;i++){
                preparedStatement.setObject(i+1,arr[i]);
            }
          row = preparedStatement.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return 0;
    }
    finally {
        DBConnection.closeConnection(preparedStatement);
    }
    return row;
}
}
