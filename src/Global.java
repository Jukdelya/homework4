public class Global {
    int a =5;
    int[] number = new int[6];
public void Math(){
    int b =40;
    int c = b/a;
    System.out.println(c);
}
public void Math2(){
    for(int i=0; i<number.length; i++) {
        number[i] = i * 2;
        System.out.println(number[i]);
    }
}
}
