public class Runner {
    private int[] a ;
    private String[]b;
    public Runner(String[] b,int []a) {
        this.a = a;
        this.b = b;

}
public String first(){
        int min =a[0];
        String name1=b[0];
        for (int i=0;i<a.length;i++){
            if (min>a[i]){
                min=a[i];
                name1=b[i];
            }
        }
        return  name1 +" " + min;
}
public String Second(){
    int min =a[0];
    String name1=b[0];
    for (int i=0;i<a.length;i++){
        if (min>a[i]){
            min=a[i];
            name1=b[i];
        }
    }
    int min2=a[0]-min;
    String min2name=b[0];
    for (int i=0;i<a.length;i++){
        if (min2>a[i]-min){
            min2=a[i];
            min2name=b[i];
        }
    }
    return min2name+" "+min2;
}
public String third () {
    int min = a[0];
    String name1 = b[0];
    for (int i = 0; i < a.length; i++) {
        if (min > a[i]) {
            min = a[i];
            name1 = b[i];
        }
    }
    int min2 = a[0] - min;
    String min2name = b[0];
    for (int i = 0; i < a.length; i++) {
        if (min2 > a[i] - min) {
            min2 = a[i];
            min2name = b[i];
        }
    }
    int min3 = a[0] - min2;
    String min3name = b[0];
    for (int i = 0; i < a.length; i++){
        if (min3>a[i]-min2 && a[i]-min2>0) {
            min3=a[i]-min2;
            min3name=b[i];
        }}
        min3+=min2;

    return min3name +" "+ min3;
}
public void cahracter(){
        int A=0;
        int B=0;
        int C=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>=200&&a[i]<=299){
                A++;
            } else if (a[i]>=300&&a[i]<=399) {
                B++;
            }else {
                C++;
            }

        }
    System.out.println("A->"+A);
    System.out.println("B->"+B);
    System.out.println("C->"+C);
}


public void c(){
    System.out.println("Birinci:"+first()+"'");
    System.out.println("ikincisi:"+Second()+"'");
        System.out.println("Üçüncü:"+third()+"'");
        cahracter();
}




}
