import java.util.*;
public class ReverseWords {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                String[] words = s.split(" ");
                System.out.println(words.length);
                for(int i = words.length - 1; i >= 0; i--){
                        if(words[i]!=""){
                                if(i!=0){
                                        System.out.print(words[i] + " ");
                                }
                                else{
                                        System.out.print(words[i]);
                                }
                        }
                }
        }
    
}
