import com.ShanghaiUniversity.pojo.Coordinate;
import com.shanghaiuniversity.manager.service.impl.CoordinateServiceImpl;
import org.junit.Test;

/**
 * Copyright (C), 2018-2020
 * FileName: coordinatetest
 * Author:   xjl
 * Date:     2020/5/12 21:37
 * Description: 测试
 */

public class coordinatetest {
    @Test
    public void test() {
        CoordinateServiceImpl coordinateService = new CoordinateServiceImpl();
        Coordinate one = coordinateService.findOne(1);

        System.out.println(one.toString());

    }
}
