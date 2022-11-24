/*
 * package stack;
 * 
 * public class IfBalanceExp { public static void main(String[] args) throws
 * Exception {
 * 
 * String inputString = "{}"; System.out.println(checkBalanceExp(inputString));
 * }
 * 
 * 
 * @SuppressWarnings("unchecked") public static <T> boolean
 * checkBalanceExp(String inputString) throws Exception{
 * 
 * @SuppressWarnings("rawtypes")
 * 
 * MyStack balanceStack = new MyStack<T>(); if (inputString.length() <= 0) {
 * return true; }
 * 
 * boolean checkBalance = true; for (int i = 0; i < inputString.length(); i++) {
 * 
 * char c=inputString.charAt(i); if(c=='(' || c=='{' || c=='[') {
 * balanceStack.push(c); continue; }
 * 
 * if(balanceStack.isEmpty()) //if stack is empty return true return true; char
 * remainder; //else popping the element switch(c) {
 * 
 * case ')': remainder =(char) balanceStack.pop(); if(remainder=='{' ||
 * remainder=='[') {return false;} break; case '}': remainder=(char)
 * balanceStack.pop(); if(remainder=='(' || remainder=='[') {return false;}
 * break; case ']': remainder=(char) balanceStack.pop(); if(remainder=='{' ||
 * remainder=='(') {return false;} break; }
 * 
 * } return balanceStack.isEmpty();
 * 
 * }
 * 
 * }
 */