package com.pan.main;

import com.beust.jcommander.Parameter;

/**
 * Created by zhangyong on 2017/8/11.
 */
public class CommandParameter {

    @Parameter(names = { "-origin"}, description = "origin png  waiting input secret info")
    public String originPgnPath;

    @Parameter(names = { "-input"}, description = "input info file")
    public String secretInputPath;

    @Parameter(names = { "-outpng"}, description = "writed input file info to generate new png out path")
    public String outPgnPath;

    @Parameter(names = { "-readinput"}, description = "check write input file result to new file")
    public String outInputResultPath;

}
