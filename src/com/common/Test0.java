package com.common;

import com.alibaba.fastjson.JSONObject;
import com.common.node.word.Word;
import com.common.node.word.real.verb.Show;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test0 {
    public static void main(String[] args) {
        //要进行快速排序的数组
        int[] a = new int[20];

    }

    void sort(int[] a,int begin,int end){
        //如果就一个元素
        if(begin == end){
            return;
        }

        //如果就两个个元素
        if(begin+1 == end){
            //比较以及交换
            return;
        }

        //定义两个指针
        int first = begin;
        int second = end-1;

        while (first<second){
            //从前往后找到一个比a[a.length-1]大的元素
            for (;first<second;first++){
                if(a[first]>a[end]){
                    break;
                }
            }

            //从后往前找到一个比a[a.length-1]小的元素
            for (;second>first;second--){
                if(a[second]<a[begin]){
                    break;
                }
            }

            //交换两个元素
            int k = a[second];
            a[second] = a[first];
            a[first] = k;
        }
        int place;
        //循环之后，first=second ，判断它和最后一位的大小关系以决定最后一位的位置
        if(a[first]>a[end]){
            int k = a[first];
            a[first] = a[end];
            a[end] = k;
            place = first ;
        }else {
            int k = a[first+1];
            a[first+1] = a[end];
            a[end] = k;
            place = first +1;
        }

        //到这里，就已经确定了原来a[0]的位置了，接下来就需要对于原a[0]前后两个数组进行排序
        sort(a,begin,place-1);
        sort(a,place+1,end);

    }
}
