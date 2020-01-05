package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 811. Subdomain Visit Count
 *
 * @author zhangzhe
 */
public class SubdomainVisitCountSolution {

    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        CollectionUtils.printList(subdomainVisits(cpdomains));
    }

    private static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> resMap = new HashMap<>();
        for (String str : cpdomains) {
            String[] s = str.split(" ");
            int time = Integer.valueOf(s[0]);
            str = s[1];
            while (str != null) {
                resMap.merge(str, time, Integer::sum);
                int i = str.indexOf(".");
                if(i > 0) {
                    str = str.substring(str.indexOf(".") + 1);
                } else {
                    str = null;
                }
            }
        }

        List<String> resList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : resMap.entrySet()) {
            resList.add(entry.getValue() + " " + entry.getKey());
        }
        return resList;
    }

}
