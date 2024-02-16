package com.zhe.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 929. Unique Email Addresses
 *
 * @author zhangzhe
 */
public class UniqueEmailAddressesSolution {

    public static void main(String[] args) {
//        String[] emails = {"test.email+alex@leetcode.com",
//                "test.e.mail+bob.cathy@leetcode.com",
//                "testemail+david@lee.tcode.com"};

        String[] emails = {"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"};

//        String[] emails = {"fg.r.u.uzj+o.pw@kziczvh.com",
//                "r.cyo.g+d.h+b.ja@tgsg.z.com",
//                "fg.r.u.uzj+o.f.d@kziczvh.com",
//                "r.cyo.g+ng.r.iq@tgsg.z.com",
//                "fg.r.u.uzj+lp.k@kziczvh.com",
//                "r.cyo.g+n.h.e+n.g@tgsg.z.com",
//                "fg.r.u.uzj+k+p.j@kziczvh.com",
//                "fg.r.u.uzj+w.y+b@kziczvh.com",
//                "r.cyo.g+x+d.c+f.t@tgsg.z.com",
//                "r.cyo.g+x+t.y.l.i@tgsg.z.com",
//                "r.cyo.g+brxxi@tgsg.z.com",
//                "r.cyo.g+z+dr.k.u@tgsg.z.com",
//                "r.cyo.g+d+l.c.n+g@tgsg.z.com",
//                "fg.r.u.uzj+vq.o@kziczvh.com",
//                "fg.r.u.uzj+uzq@kziczvh.com",
//                "fg.r.u.uzj+mvz@kziczvh.com",
//                "fg.r.u.uzj+taj@kziczvh.com",
//                "fg.r.u.uzj+fek@kziczvh.com"};

        System.out.println(numUniqueEmails(emails));
    }

    private static int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        for (String str : emails) {
            String[] emailStr = str.split("@");
            String localName = emailStr[0];
            String addrName = emailStr[1];
            int index = localName.indexOf("+");
            if (index > 0) {
                localName = localName.substring(0, localName.indexOf("+"));
            }
            localName = localName.replaceAll("\\.", "");
            set.add(localName + "@" + addrName);
        }
        return set.size();
    }

}

