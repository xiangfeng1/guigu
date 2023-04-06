package com.zxf.Exer.Exer1;



import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    @Test
        public void Test() throws IOException {
        File file = new File("day0404_code\\src\\com\\zxf\\Exer\\Exer1\\1.txt");
        File file2 = new File("day0404_code\\src\\com\\zxf\\Exer\\Exer1\\2.txt");
        IoTools.TestCopy(file,file2);
    }
    @Test
    public void voidTest02() throws IOException {
        File file = new File("E:\\feiQ");
        File file2 = new File("E:\\a");
        IoTools.TestCut(file,file2);
    }

}
