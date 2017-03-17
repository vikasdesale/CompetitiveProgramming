public class DigitExample{

public static boolean isDigit(char c){
int x=(int)c-(int)'0';
if(x<0||x>9){
return false;
}
return true;

}

public static boolean isOnlyDigit(String s){

for(int i=0;i<s.length();i++){
if(!isDigit(s.charAt(i))){
return false;
}
}
return true;
}

public static void main(String[] args) {
String s="098234";
System.out.println(isOnlyDigit(s));


}

}