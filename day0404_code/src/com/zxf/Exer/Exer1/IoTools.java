package com.zxf.Exer.Exer1;

import java.io.*;

public class IoTools {
    public static void TestCopy(File a,File b) throws IOException {
        if(a == null || b == null){
            return;
        }
        if(a.isDirectory() || b.isDirectory()){
            return;
        }
            FileInputStream fileInputStream = new FileInputStream(a);
            FileOutputStream fileOutputStream = new FileOutputStream(b);
            byte[] c=new byte[1024*1024*1024];
             int len;
           while((len=fileInputStream.read(c))!=-1){
               fileOutputStream.write(c,0,len);
           }

        }
    public static void copyFileToDirectory(File srcFile, File destDir) throws IOException {
        if(srcFile == null || destDir == null){
            return;
        }
        if(srcFile.isDirectory() || destDir.isFile()){
            return;
        }
        if(!destDir.exists()){//如果destDir文件夹不存在，就创建它
            destDir.mkdirs();
        }
        //构造器：File(File parent, String child)
        File destFile = new File(destDir, srcFile.getName());
        TestCopy(srcFile, destFile);
    }

        public static void TestCut(File srcFile,File destFile) throws IOException {
            if (srcFile == null||destFile==null) {

            }

            if (srcFile.isFile()&&destFile.isFile()) {
                TestCopy(srcFile,destFile);
            }else if (srcFile.isDirectory()&&destFile.isFile()) {
                return;
            } else if (srcFile.isFile() && destFile.isDirectory()){
                copyFileToDirectory(srcFile,destFile);
            } else if (srcFile.isFile()&&destFile.isDirectory()) {
                TestCopy(srcFile,destFile);
            }else {
                File file = new File(destFile,srcFile.getName());
                file.mkdir();
                File[] files = srcFile.listFiles();
                for (File file1 : files) {
                    TestCut(file1,file);
                }
            }
        }
}
