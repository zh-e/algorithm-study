package com.zhe.leetcode.easy;

/**
 * 1108. Defanging an IP Address
 *
 * @author zhangzhe
 */
public class DefangingAnIPAddressSolution {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    private static String defangIPaddr(String address) {
        if (address == null || address.isEmpty()) {
            return address;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = address.toCharArray();
        for (int i = 0, len = chars.length; i < len; i++) {
            if(chars[i] == '.') {
                sb.append("[.]");
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
