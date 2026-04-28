package Programmers.Lv2.방문길이_49994;

import java.util.*;

class Solution {
    public int solution(String dirs) {
        int x = 0;
        int y = 0;
        int answer =0;
        HashSet<String> set = new HashSet<>();
        for(char d : dirs.toCharArray()){
            int nx = x;
            int ny = y;

            if(d=='U') ny++;
            else if(d=='D') ny--;
            else if(d=='R') nx++;
            else if(d=='L') nx--;

            if(ny>5 || ny<-5 || nx>5 || nx<-5){
                continue;
            }

            String path = x + "," + y + "," + nx + "," + ny;
            String path1 = nx + "," + ny + "," + x + "," + y;

            if(!set.contains(path)||!set.contains(path1)) answer++;

            set.add(path);
            set.add(path1);

            x = nx;
            y = ny;
        }
        return answer;
    }
}

