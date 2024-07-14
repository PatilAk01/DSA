package Assignment;

import java.util.Scanner;

public class infixTOpostfix {
	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter infix operation : ");
		        String str = sc.nextLine();

		        String ans = "";

		        Stack_char stk = new Stack_char();
		        stk.create_stack(str.length());

		        for(int i = 0; i < str.length(); i++){
		            if(str.charAt(i) >= 'a' && str.charAt(i)<= 'z'){
		                ans = ans + str.charAt(i); 
		            }
		            else if(str.charAt(i) == '('){
		                stk.push(str.charAt(i)); 
		            }
		            else if(str.charAt(i) == ')'){
		                while(!stk.is_empty()){
		                    if(stk.peek() == '('){
		                        stk.pop();
		                        break;
		                    }
		                    ans = ans + stk.pop(); 
		                }
		            }
		            else {
		                if(stk.is_empty()){
		                    stk.push(str.charAt(i)); 
		                }
		                else if(Precedence(str.charAt(i)) > Precedence(stk.peek())){
		                    stk.push(str.charAt(i));
		                }
		                else{
		                    while(!stk.is_empty() && Precedence(str.charAt(i)) <= Precedence(stk.peek())) { 
		                        ans = ans + stk.pop(); 
		                    }
		                    stk.push(str.charAt(i)); 
		                }
		            }
		        }
		        while(!stk.is_empty()){
		            ans = ans + stk.pop(); 
		        }
		        System.out.println(ans); 
		    }
		    public static int Precedence(int i){
		        if(i == '^'){
		            return 3;
		        }
		        else if(i == '/' || i == '*'){
		            return 2;
		        }
		        else if(i == '+' || i =='-'){
		            return 1;
		        }
		        return 0;
		    }
		}