package com.tjl.sample.security;

import com.tjl.util.MDUtil;

public class MDMain {
    public static void main(String[] args) {
        String str = "454566";
        System.out.println(MDUtil.getMessageDigest(str.getBytes(), "md5"));
    }
}