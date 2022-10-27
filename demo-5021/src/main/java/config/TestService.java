package config;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("qsJdbcTemplate")
    private JdbcTemplate qsJdbcTemplate;

    @GlobalTransactional(rollbackFor = Exception.class)
    public void test1() throws Exception {
        String sql = "INSERT INTO test1 VALUES (?,?)";
        Object[] objects = {1, 1};
        String xid = RootContext.getXID();
        System.out.println(xid);
//        smartDAO.update("", sql, objects);
        jdbcTemplate.update(sql,objects);
//        qsSmartDAO.update("", sql, objects);
        qsJdbcTemplate.update(sql, objects);
        String xxid = RootContext.getXID();
        System.out.println(xxid);
//        restTemplate.getForObject("http://localhost:8080/Clearing/test2", String.class);
    }
}
