import com.ShanghaiUniversity.pojo.Barrel;
import com.shanghaiuniversity.manager.service.BarrelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Copyright (C), 2018-2020
 * FileName: Barreltest
 * Author:   xjl
 * Date:     2020/5/12 21:50
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class Barreltest {

    @Autowired
    private BarrelService barrelService;

    @Test
    public void test() {
        List<Barrel> all = barrelService.findAll();
        for (Barrel b : all) {
            System.out.println(b.getId());
        }

    }
}
