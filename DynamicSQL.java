class DynamicSQL{
public static void main(String args[]){
String os = "android";
StringBuffer sql =new StringBuffer("hello");  // 5 + 16 = 21
/*if(os.length()>0){
 sql = sql + " and os='"+os+"'";
}*/
System.out.println(sql.length());
System.out.println(sql.capacity());
sql.append("ghjgfjhggjghjgjgh");
System.out.println(sql.length());
System.out.println(sql.capacity());
sql.append("hghghgh");
System.out.println(sql.length());
System.out.println(sql.capacity());

}
}