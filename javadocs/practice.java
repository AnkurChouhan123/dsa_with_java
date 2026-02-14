//import java.sql.SQLOutput;
//import java.util.*;
//public class practice {
//    public static void main(String[] args) {
//         String s="AB-DE+F*/";
////         System.out.println(infixToPostfix(s)); + a * b - ^ d c e
////         System.out.println(infixToPrefix(s));
////         System.out.println(postfixToInfix(s));
////         System.out.println(prefixToInfix(s));
////          System.out.println(postfixToPrefix(s));
//        double a=0x123;
//        System.out.println(a);
//    }
//
//
//    static String infixToPostfix(String s){
//        Stack<Character>st=new Stack<>();
//        StringBuilder ans=new StringBuilder();
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9'){
//                ans.append(ch);
//            }
//            else if(ch=='('){
//                st.push('(');
//            }
//            else if(ch==')'){
//
//                while(!st.isEmpty()&&st.peek()!='('){
//                    ans.append(st.pop());
//                }
//                st.pop();
//            }
//            else{
//                while(!st.isEmpty()&&priority(ch)<=priority(st.peek())){
//                    ans.append(st.pop());
//                }
//                st.push(ch);
//            }
//
//        }
//        while(!st.isEmpty()){
//            ans.append(st.pop());
//        }
//        return ans.toString();
//    }
//    static String infixToPrefix(String s){
//        Stack<Character>st=new Stack<>();
//        StringBuilder ans=new StringBuilder();
//        s=reverse(s);
//        s=s.replace('(','@');
//        s=s.replace(')','#');
//        s=s.replace('@',')');
//        s=s.replace('#','(');
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(ch>='A'&&ch<='Z'||
//            ch>='a'&&ch<='z'||
//            ch>='0'&&ch<='9'){
//                ans.append(ch+" ");
//            }
//            else if(ch=='('){
//                st.push(ch);
//            }
//            else if(ch==')'){
//                while(!st.isEmpty()&&st.peek()!='('){
//                    ans.append(st.pop()+" ");
//                }
//                st.pop();
//            }
//            else{
//                if(st.isEmpty()){
//                    st.push(ch);
//                }
//                else if(ch=='^'||priority(ch)>priority(st.peek())){
//                    st.push(ch);
//                }
//                else {
//                    while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
//                        ans.append(st.pop()+" ");
//                    }
//                    st.push(ch);
//                }
//            }
//        }
//        while(!st.isEmpty()){
//            ans.append(st.pop()+" ");
//        }
//        return ans.reverse().toString();
//    }
//    static String postfixToInfix(String s){
//
//        Stack<StringBuilder>st=new Stack<>();
//       // st.push(new StringBuilder());
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(ch>='A'&&ch<='Z'||
//            ch>='a'&&ch<='z'||
//            ch>='0'&&ch<='9'){
//                StringBuilder sb=new StringBuilder();
//                sb.append(ch);
//                st.push(sb);
//                System.out.println(st);
//            }
//            else{
//                StringBuilder t1=st.pop();
//                StringBuilder t2=st.pop();
//                StringBuilder newSb=new StringBuilder();
//                newSb.append('(');
//                newSb.append(t2);
//                newSb.append(ch);
//                newSb.append(t1);
//                newSb.append(')');
//                st.push(newSb);
//            }
//        }
//        return st.peek().toString();
//
//      }
//    static String prefixToInfix(String s){
//        Stack<StringBuilder>st=new Stack<>();
//        for(int i=s.length()-1;i>=0;i--){
//            char ch=s.charAt(i);
//            if(ch>='A'&&ch<='Z'|| ch>='a'&&ch<='z'|| ch>='0'&&ch<='9'){
//                StringBuilder sb=new StringBuilder();
//                sb.append(ch);
//                st.push(sb);
//                System.out.println(st);
//            }
//            else{
//                StringBuilder t1=st.pop();
//                StringBuilder t2=st.pop();
//                StringBuilder sb=new StringBuilder();
//                sb.append('(');
//                sb.append(t1);
//                sb.append(ch);
//                sb.append(t2);
//                sb.append(')');
//                st.push(sb);
//            }
//
//        }
//        return st.peek().toString();
//    }
//    static String postfixToPrefix(String s){
//        Stack<StringBuilder>st=new Stack<>();
//        for(int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if(ch>='A'&&ch<='Z'||
//            ch>='a'&&ch<='z'||
//            ch>='0'&&ch<='9'){
//                StringBuilder sb=new StringBuilder();
//                sb.append(ch);
//                st.push(sb);
//            }
//            else{
//                StringBuilder t1=st.pop();
//                StringBuilder t2=st.pop();
//                st.push(new StringBuilder(ch+""+t2+t1));
//            }
//        }
//        return st.peek().toString();
//    }
//    static String prefixToPostfix(String s){
//        Stack<StringBuilder>st=new Stack<>();
//        for(int i=s.length()-1;i>=0;i--){
//            char ch=s.charAt(i);
//            if(ch>='A'&&ch<='Z'||
//                    ch>='a'&&ch<='z'||
//                    ch>='0'&&ch<='9'){
//                StringBuilder sb=new StringBuilder();
//                sb.append(ch);
//                st.push(sb);
//            }
//            else{
//                st.push(new StringBuilder(st.pop()+""+st.pop()+ch));
//            }
//        }
//        return st.peek().toString();
//    }
//
//    static int priority(char ch){
//        if(ch=='^'){
//            return 3;
//        }
//        else if(ch=='*'||ch=='/'){
//            return 2;
//        }
//        else if(ch=='+'||ch=='-'){
//            return 1;
//        }
//        else{
//            return -1;
//        }
//    }
//    static String reverse(String s){
//        StringBuilder sb=new StringBuilder(s);
//        return sb.reverse().toString();
//    }
//
//
//}
