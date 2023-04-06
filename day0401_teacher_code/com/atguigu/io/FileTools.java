package com.atguigu.io;

import java.io.File;

public class FileTools {

    /*
    用于删除非空目录
     */
    public static void forceDir(File dir){

        //dir可能是一个文件，可能是一个空目录，也可能是一个非空目录
        if(dir.isDirectory()){//如果是非空目录，先删除它的下一级，再删除自己
            //删除目录的下一级
            //先获取它的下一级
            File[] allSubFile = dir.listFiles();
            for (File sub : allSubFile) {//sub代表dir的下一级，下一级可能是一个文件，可能是一个空目录，也可能是一个非空目录
                //删除sub
                forceDir(sub);
            }
        }
        dir.delete();//删除自己，自己可以是是一个文件，可以是一个空目录
    }
    public static long getDirectoryLength(File dir){
        if(dir.isFile()){
            return dir.length();
        }else if(dir.isDirectory()){
            //把该文件夹下的所有下一级的大小累加起来
            long sum = 0;
            //先获取它的下一级
            File[] allSubFile = dir.listFiles();
            for (File sub : allSubFile) {//sub代表dir的下一级，下一级可能是一个文件，可能是一个空目录，也可能是一个非空目录
//                sum += sub的大小;
                sum += getDirectoryLength(sub);
            }

            return sum;
        }
        return 0;
    }
}
