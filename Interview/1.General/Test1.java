public class Test1 {
public static void main(String[] args)
{
Boolean flag = null;
try {
if (flag) {
while (true) {
}
} else {
System.exit(1);
}
} finally {
System.out.println(“In Finally”);
}
}
}