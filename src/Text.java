
public class Text {
    public static void main(String[] args) {
        fun(new fang());
        fun(new tuo());
    }

    private static void fun(tu a) {
        a.hua();
    }

}
class tu{
    public void hua(){
        System.out.println("画");
    }
}
class fang extends tu{
    @Override
    public void hua() {
        System.out.println("画方");
    }
}
class tuo extends tu{
    @Override
    public void hua() {
        System.out.println("画椭");
    }
}
