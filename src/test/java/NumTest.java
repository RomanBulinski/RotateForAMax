import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumTest {

    @Test
    public void Test2(){
        Main main = new Main();
        assertEquals( 85821534, main.maxRot(38458215 ) );
    }

    @Test
    public void Test3(){
        Main main = new Main();
        assertEquals( 68957, main.maxRot(56789 ) );
    }

}
