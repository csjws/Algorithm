package Programmers.Lv3.단어변환_43163;

import java.util.*;
class Solution {
    class node{
        String word;
        int cnt;

        node(String word, int cnt){
            this.word = word;
            this.cnt = cnt;
        }
    }

    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        ArrayDeque<node> q = new ArrayDeque<>();

        q.offer(new node(begin,0));

        while(!q.isEmpty()){
            node cur = q.poll();

            if(cur.word.equals(target)){
                return cur.cnt;
            }

            for(int i =0; i<words.length; i++){
                if(visited[i]) continue;

                if(check(cur.word, words[i])){
                    visited[i] = true;
                    q.offer(new node(words[i],cur.cnt+1));
                }
            }
        }
        return 0;
    }

    static boolean check(String word1, String word2){
        int diff =0;

        for(int i =0; i< word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i)){
                diff++;
            }
        }

        return diff == 1;
    }

}
