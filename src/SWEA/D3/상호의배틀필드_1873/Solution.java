package SWEA.D3.상호의배틀필드_1873;

import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int h = sc.nextInt();
            int w = sc.nextInt();

            int srow =-1;
            int scol = -1;
            char action = ' ';

            char[][] list = new char[h][w];

            //현재 탱크 위치확인
            for(int i =0; i<h; i++){
                String str = sc.next();
                for(int j =0; j<w; j++){
                    list[i][j] = str.charAt(j);
                    if(list[i][j]=='^'||list[i][j]=='v'||list[i][j]=='<'||list[i][j]=='>'){
                        srow = i;
                        scol = j;
                        action = list[i][j];
                    }
                }
            }

            int n = sc.nextInt();
            char[] answer = new char[n];
            String str = sc.next();
            for(int i =0; i<str.length(); i++){

                answer[i] = str.charAt(i);
            }

            for(int i =0; i<answer.length; i++){
                if(answer[i] == 'U'){
                    action = '^';
                    if(srow > 0 && list[srow -1][scol] == '.'){
                        list[srow][scol] = '.';
                        srow -= 1;
                    }
                    list[srow][scol] = '^';
                }
                else if(answer[i] == 'D'){
                    action = 'v';
                    if(srow + 1 < h && list[srow +1][scol] == '.'){
                        list[srow][scol] = '.';
                        srow += 1;
                    }
                    list[srow][scol] = 'v';

                }
                else if(answer[i] == 'L'){
                    action = '<';
                    if(scol > 0 && list[srow][scol -1] == '.'){
                        list[srow][scol] = '.';
                        scol -= 1;
                    }
                    list[srow][scol] = '<';

                }
                else if(answer[i] == 'R'){
                    action = '>';
                    if(scol + 1 <w && list[srow][scol+1] == '.'){
                        list[srow][scol] = '.';
                        scol +=1;
                    }
                    list[srow][scol] = '>';

                }

                else if(answer[i] == 'S'){
                    if(action =='^'){
                        for(int x =srow -1; x>=0; x--){
                            if(list[x][scol] == '#') break;
                            if(list[x][scol] == '*') {
                                list[x][scol] = '.';
                                break;
                            }
                        }
                    }
                    else if(action == 'v'){
                        for(int x =srow+1; x<h; x++){
                            if(list[x][scol] == '#') break;
                            if(list[x][scol] == '*') {
                                list[x][scol] = '.';
                                break;
                            }
                        }
                    }
                    else if(action == '<'){
                        for(int y =scol -1; y>=0; y--){
                            if(list[srow][y] == '#') break;
                            if(list[srow][y] == '*') {
                                list[srow][y] = '.';
                                break;
                            }
                        }
                    }
                    else if(action == '>'){
                        for(int y =scol+1; y<w; y++){
                            if(list[srow][y] == '#') break;
                            if(list[srow][y] == '*') {
                                list[srow][y] = '.';
                                break;
                            }
                        }
                    }
                }
            }
            System.out.print("#"+test_case+" ");
            for(int i =0; i<h;i++){
                for(int j = 0; j<w; j++){
                    System.out.print(list[i][j]);
                }
                System.out.println();
            }
        }
    }

}
