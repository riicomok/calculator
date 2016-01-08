import cn.com.raymon.service.CalculatorService;
import cn.com.raymon.service.impl.CalculatorServiceImpl;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Riico on 2016/1/8.
 */
public class TestCalByOp {

    @Resource
    private CalculatorServiceImpl calculatorServiceImpl;

    @Test
    @SuppressWarnings("unchecked")
    public void testCalByOp(){
        try {
            String str = calculatorServiceImpl.cal2("6*");
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
