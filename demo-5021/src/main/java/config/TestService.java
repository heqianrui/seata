package config;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @GlobalTransactional(rollbackFor = Exception.class)
    public void test1() throws Exception {
        String xxid = RootContext.getXID();
        System.out.println(xxid);
    }
}
