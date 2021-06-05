public class P1008 {
    public static void main(String args[]){
        for(int i0 = 1 ; i0 < 10 ; i0 ++){
            for(int i1 = 1 ; i1 < 10 ; i1 ++){
                if(i1 == i0)
                    continue;
                for(int i2 = 1 ; i2 < 10 ; i2 ++){
                    if(i2 == i0 || i2 == i1)
                        continue;
                    for(int i3 = 1 ; i3 < 10 ; i3 ++){
                        if(i3 == i0 || i3 == i1 || i3 ==i2)
                            continue;
                        for(int i4 = 1 ; i4 < 10 ; i4 ++){
                            if(i4 == i0 || i4 == i1 || i4 == i2 || i4 == i3)
                                continue;
                            for(int i5 = 1 ; i5 < 10 ; i5 ++){
                                if(i5 == i0 || i5 == i1 || i5 == i2 || i5 == i3 || i5 == i4)
                                    continue;
                                for(int i6 = 1 ; i6 < 10 ; i6 ++){
                                    if(i6 == i0 || i6 == i1 || i6 == i2 || i6 == i3 || i6 == i4 || i6 == i5)
                                        continue;
                                    for(int i7 = 1 ; i7 < 10 ; i7 ++){
                                        if(i7 == i0 || i7 == i1 || i7 == i2 || i7 == i3 || i7 == i4 || i7 == i5 || i7 == i6)
                                            continue;
                                        for(int i8 = 1 ; i8 < 10 ; i8 ++){
                                            if(i8 == i0 || i8 == i1 || i8 == i2 || i8 == i3 || i8 == i4 || i8 == i5 || i8 == i6 || i8 == i7)
                                                continue;
                                            int a = i0 * 100 + i1 * 10 + i2;
                                            int b = i3 * 100 + i4 * 10 + i5;
                                            int c = i6 * 100 + i7 * 10 + i8;
                                            if(a * 2 == b && a * 3 == c){
                                                System.out.println(a + " " + b + " " + c);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
