package test;
public class Greater implements IComparable{
public int compareTo (int x, int y, int z) {
if(x>y && y>z) return x;
else if(y>x && y>z) return y;
else return z;
}
}