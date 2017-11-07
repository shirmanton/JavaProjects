import java.util.Scanner;

public class MyClass {
    private String[] str = new String[2];
    private int[][] letters = {{65  ,66  ,67  ,69  ,72  ,75  ,77  ,79  ,80  ,84  ,88  ,97  ,99  ,101 ,111 ,112 ,120 },
                               {1040,1042,1057,1045,1053,1050,1052,1054,1050,1058,1061,1072,1089,1077,1086,1088,1093}};
    public void setStrings(){
        Scanner scanner = new Scanner(System.in);
        str[0] = scanner.nextLine();
        str[1] = scanner.nextLine();
    }
    public boolean equalsStrings(){
        if(str[0].length()!=str[1].length()) return  false;
        layer: for(int k = 0; k<str[0].length();k++){
            if (str[0].charAt(k)==str[1].charAt(k)) break;
            for(int i =0; i <2;i++) {
                for(int j =0; j<17;j++) {
                    if(str[0].charAt(k)==letters[i][j]){
                        if(i==0 && str[1].charAt(k)==letters[1][j]) break layer;
                        else if (i==1 && str[1].charAt(k)==letters[0][j]) break layer;
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
