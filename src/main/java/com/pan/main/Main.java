package com.pan.main;

import java.io.IOException;

import com.beust.jcommander.JCommander;
import com.pan.utils.PngUtil;

public class Main {


    public static void main(String[] args) throws IOException {
        CommandParameter commandParameter = new CommandParameter();
        JCommander.newBuilder()
                .addObject(commandParameter)
                .build()
                .parse(args);
        String errorMsg = null;
        if (commandParameter == null) {
            errorMsg = "命令有误";
        }
        if (commandParameter.originPgnPath == null) {
            errorMsg = "请输入待写入信息的原始图片地址";
        }

        if (commandParameter.secretInputPath == null) {
            errorMsg = "请输入要向图片写入信息的文件地址";
        }

        if (commandParameter.outPgnPath == null) {
            errorMsg = "写完信息输出新图片的地址";
        }


        if (commandParameter.outInputResultPath == null) {
            errorMsg = "输入从新生成的图片中读取写入信息的文件地址，方便校验取出";
        }
        if (errorMsg != null) {
            System.out.println(errorMsg);
            System.exit(1);
        }
        //原始图片
        String originalPngFilePath = args[0];
        //向图片写入的数据
        String inputTextFilePath = args[1];
        //修改后的图片
        String outPngFilePath = args[2];
        //解密后信息输出
        String outTextFilePath = args[3];
        PngUtil.writeFileToPng(commandParameter.originPgnPath, commandParameter.secretInputPath, commandParameter.outPgnPath);
        PngUtil.readFileFromPng(commandParameter.outPgnPath, commandParameter.outInputResultPath);

//		String resourcePath = Main.class.getResource("").getPath()+"resource/";
//        String resourcePath="/Users/zhangyong/Documents/GitHub/study-test/src/main/resources/";
//        System.out.println(args[0]+"--"+args[1]);
//
//
//
//		/*4λ*/
//		PngUtil.writeFileToPng(resourcePath + "calendar_ring_docked.png",
//						resourcePath + "screct.txt", resourcePath + "calendar_ring_dockedout.png");
//		PngUtil.readFileFromPng(resourcePath + "calendar_ring_dockedout.png", resourcePath + "sound_wavscrect1.txt");
//
//		/*24λ*/
//		PngUtil.writeFileToPng(resourcePath + "calendar_ring_docked.png",
//		resourcePath + "screct.txt", resourcePath + "calendar_ring_dockedout.png");
//		PngUtil.readFileFromPng(resourcePath + "calendar_ring_dockedout.png", resourcePath + "calendar_ring_dockedscrect.txt");
//
//		/*32λ*/
//		PngUtil.writeFileToPng(resourcePath + "month.png",
//				resourcePath + "screct.txt", resourcePath + "monthout.png");
//		PngUtil.readFileFromPng(resourcePath + "monthout.png", resourcePath + "monthscrect.txt");
    }


}
