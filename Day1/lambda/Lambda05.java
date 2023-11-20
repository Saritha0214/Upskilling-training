package com.lambda;

import java.util.Arrays;
import java.util.*;
import java.util.function.Consumer;

public class Lambda05 {
	
	static List<String> List=Arrays.asList("gracely","akhila","sravani", "maheswari","snehitha");
    public static String processWords(List<String> list, Consumer<List<String>> c) 
    {
        c.accept(list);
        return list.toString();
    }
    public static void main(String[] args) {
        Consumer<List<String>> c=lis->
        {
            for(int i=0;i<lis.size();i++)
            {
                String word=List.get(i);
                lis.set(i," "+word.charAt(0));
            }
        };
        System.out.println(processWords(List, c));
    }
}