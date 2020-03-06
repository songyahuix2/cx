package jdbc.jdbc03.jdbctemplate.dao;

import jdbc.jdbc02.page.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @date 8/17/2019 - 12:46 PM
 */
public class JdbcTemplate<T> {
private RowMapper<T> rowMapper;
public JdbcTemplate(RowMapper<T> rowMapper){
    this.rowMapper = rowMapper;
}
public T selectForObject(String sql,Object... args){
    T object = null;
    Connection connection = DBConnection.getConnection();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try{
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
    }
    catch (SQLException e){
        e.printStackTrace();
    }
    finally {
        DBConnection.closeConnection(pstmt, rs);
    }
    return object;
}
public List<T> selectList(String sql,Object... args){
    List<T > list = new ArrayList<>();
    T object = null;
    ResultSet rs = null;
    Connection connection = DBConnection.getConnection();
    PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            if(args!=null){
                for(int i = 0;i<args.length;i++){
                    pstmt.setObject(i+1,args[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()){
                object = rowMapper.mapper(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
return list;

}
public int update(String sql,Object[] arr){
    Connection connection = DBConnection.getConnection();
    PreparedStatement preparedStatement = null;
    try {
       preparedStatement = connection.prepareStatement(sql);
       if(arr!=null){
           for(int i=0;i<arr.length;i++){
           preparedStatement.setObject(i+1,arr[i]);
           }
       }

    } catch (SQLException e) {
        e.printStackTrace();
        return 0;
    }
    return 1;
}
}
