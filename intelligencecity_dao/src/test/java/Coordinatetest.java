import com.ShanghaiUniversity.mapper.CoordinateMapper;
import com.ShanghaiUniversity.pojo.Coordinate;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Copyright (C), 2018-2020
 * FileName: Coordinatetest
 * Author:   xjl
 * Date:     2020/5/13 9:53
 * Description: 测试
 */

public class Coordinatetest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
    }

    @Test
    public void test() {
        CoordinateMapper bean = applicationContext.getBean(CoordinateMapper.class);
        List<Coordinate> coordinates = bean.selectByExample(null);
        for (Coordinate coordinate : coordinates) {
            System.out.println(coordinate.getLatitude() + "###########" + coordinate.getLongitude());
        }
    }
}
