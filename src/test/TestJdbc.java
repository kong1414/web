import com.kongww.web.Util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: QiuGuanLin
 * @Description:
 * @Date: 14:29 2018/10/12
 */
public class TestJdbc {

    @Test
    public void test() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 获得连接:
            conn = JDBCUtils.getConnection();
            // 编写SQL:
            String sql = "select * from user";
            // 预编译SQL:
            pstmt = conn.prepareStatement(sql);
            // 设置参数
            // 执行SQL:
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " + rs.getString("username") + "  " + rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, pstmt, conn);
        }
    }
}
