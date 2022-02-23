public class triangle{
    public static void main(String[] args){
        Drawtriangle(10);
    }

    public static char[] arrayOfsymbol(int i) {
        char[] lineofstring = new char[i];
        for (int var = 0; var < i; var = var + 1) {
            lineofstring[var] = 'x';
        }
        return lineofstring;
    }

    public static void Drawtriangle(int N){
        for (int cnt = 1; cnt <= N; cnt += 1){
            System.out.println(arrayOfsymbol(cnt));
        }
    }
}
