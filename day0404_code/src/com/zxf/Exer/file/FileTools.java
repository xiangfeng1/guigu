package com.zxf.Exer.file;

import java.io.*;

public class FileTools {
    //用于删除非空目录
    public static void forceDir(File dir){
        //dir可能是一个文件，可能是一个空目录，也可能是一个非空目录
        if(dir.isDirectory()){
            //如果是非空目录，先删除它的下一级，再删除自己
            //删除目录的下一级
            //先获取它的下一级
            File[] files = dir.listFiles();
            for (File sub : files) {//sub代表dir的下一级，下一级可能是一个文件，可能是一个空目录，也可能是一个非空目录
                //删除sub
                forceDir(sub);
            }
        }
        dir.delete();//删除自己，自己可以是一个文件，可以是一个空目录
    }


    public static long getDirectoryLength(File dir){
        //按照java的好习惯来说，对于引用数据类型的参数，最好都加非空判断
        /*
        * if(dir==null){
          return 0;
           }
        */
        if (dir != null&& dir.isFile()) {
            return dir.length();
        } else if (dir !=null&& dir.isDirectory()) {
            //把该文件夹下的所有下一级的大小累加起来
            long sum=0;
            //先获取它的下一级
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    sum+=getDirectoryLength(file);
                }
            }
            return sum;
        }
        return 0;
    }

    public static void copyFileNoBuffer(File srcFile,File destFile) throws IOException {
        if (srcFile == null||destFile==null) {
            return;
        }
        if (srcFile.isDirectory()||destFile.isDirectory()) {
            return;
        }

        //从srcFile里面读数据，写到destFile文件中
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        byte[] data = new byte[1024 * 8];
        int len;
        while((len= fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        fos.close();
        fis.close();
    }


public static void copyFile(File srcFile,File destFile) throws FileNotFoundException {
    if (srcFile == null||destFile==null) {
        return;
    }
    if (srcFile.isDirectory()||destFile.isDirectory()) {
        return;
    }
    FileInputStream fis = new FileInputStream(srcFile);
    FileOutputStream fos = new FileOutputStream(destFile);
    

}






}


