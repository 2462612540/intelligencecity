import com.ShanghaiUniversity.pojo.Barrel;
import com.shanghaiuniversity.manager.service.impl.BarrelServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * Copyright (C), 2018-2020
 * FileName: Barreltest
 * Author:   xjl
 * Date:     2020/5/12 21:50
 * Description:
 */

public class Barreltest {

    @Test
    public void test() {
        BarrelServiceImpl barrelService = new BarrelServiceImpl();
        List<Barrel> all = barrelService.findAll();
        for (Barrel b : all) {
            System.out.println(b.getId());
        }

    }
}
