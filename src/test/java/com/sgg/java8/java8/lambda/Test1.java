package com.sgg.java8.java8.lambda;

import org.junit.jupiter.api.Test;
import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Test1 {
    //原来的匿名内部类
    @Test
    public void test1(){
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> treeSet=new TreeSet<>(com);

        TreeSet<Integer> treeSet2=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
    }

    //现在的 Lambda 表达式
    @Test
    public void test2(){
        Comparator<Integer> com=(x,y)->Integer.compare(x,y);
        TreeSet<Integer> ts=new TreeSet<>(com);
    }
}
