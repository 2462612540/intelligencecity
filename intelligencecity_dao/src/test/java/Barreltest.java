import com.ShanghaiUniversity.mapper.BarrelMapper;
import com.ShanghaiUniversity.pojo.Barrel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Copyright (C), 2018-2020
 * FileName: Barreltest
 * Author:   xjl
 * Date:     2020/5/12 21:50
 * Description:
 */

public class Barreltest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
    }

    @Test
    public void test() {
        BarrelMapper bean = applicationContext.getBean(BarrelMapper.class);

        Barrel barrel = bean.selectByPrimaryKey(1);
        System.out.println(barrel.getLocation());
    }
}
