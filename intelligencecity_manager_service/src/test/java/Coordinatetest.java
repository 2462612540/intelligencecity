import com.ShanghaiUniversity.mapper.CoordinateMapper;
import com.ShanghaiUniversity.pojo.Coordinate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Copyright (C), 2018-2020
 * FileName: Coordinatetest
 * Author:   rhb
 * Date:     2020/5/13 23:58
 * Description: 测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class Coordinatetest {

    @Autowired
    private CoordinateMapper coordinateMapper;


    @Test
    public void test() {
        List<Coordinate> coordinates = coordinateMapper.selectByExample(null);
        for (Coordinate coordinate : coordinates) {
            System.out.println(coordinate.getLatitude() + "###########" + coordinate.getLongitude());
        }
    }
}
