package main.boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BOJ_10814 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i += 1) {
            String input = sc.nextLine();
            String[] split = input.split(" ");
            int age = Integer.parseInt(split[0]);
            String name = split[1];

            Member member = new Member(i, age, name);
            members.add(member);
        }

        Collections.sort(members, new Comparator<>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age != o2.age) {
                    return o1.age - o2.age;
                }
                return o1.id - o2.id;
            }
        });

        members.forEach(member -> {
            System.out.println(member.toString());
        });
    }


    static class Member {

        private final int id;
        private final int age;
        private final String name;

        public Member(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}
