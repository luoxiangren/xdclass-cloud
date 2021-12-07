import ru.yandex.clickhouse.ClickHouseConnection;
import ru.yandex.clickhouse.ClickHouseDataSource;
import ru.yandex.clickhouse.settings.ClickHouseProperties;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestClickhouse {
    public static void main(String[] args) {

        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "select * from haylou_report.test_chproxy_dfs";

        Connection connection = getConn();
        try {
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsmd = results.getMetaData();

            while(results.next()){
                Map<String, Object> row = new HashMap<>();
                for(int i = 1; i <= rsmd.getColumnCount(); i++){
                    row.put(rsmd.getColumnName(i), results.getObject(rsmd.getColumnName(i)));
                }
                list.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }

    public static Connection getConn() {

        String username = "haylou_ck";
        String password = "";
        String address = "jdbc:clickhouse://172.16.20.102:9090";
        String db = "haylou_report";
        int socketTimeout = 600000;

        ClickHouseProperties properties = new ClickHouseProperties();
        properties.setUser(username);
        properties.setPassword(password);
        properties.setDatabase(db);
        properties.setSocketTimeout(socketTimeout);
        ClickHouseDataSource clickHouseDataSource = new ClickHouseDataSource(address, properties);

        ClickHouseConnection conn = null;
        try {
            conn = clickHouseDataSource.getConnection();
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
