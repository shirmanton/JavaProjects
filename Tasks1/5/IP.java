public class IP {
    private String[] address = {"192.168.0.35", "192.168.0.58"};
    private String mask = "255.255.255.0";

    public void setAdress(String[] adress) {
        this.address = adress;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getMask() {
        return mask;
    }

    public String[] getAdress() {
        return address;
    }

    public int[][] convertAddress(){
        int[][] binaryNum = new int[3][4];
        String str="";
        String[] addressesAndMask = {address[0],address[1],mask};
        int j  = 0;
        for(int i =0;i<3;i++) {
            for (int k = 0; k < addressesAndMask[i].length(); k++) {
                if (addressesAndMask[i].charAt(k) != 46) {
                    str += addressesAndMask[i].charAt(k);
                } else {
                    binaryNum[i][j] = Integer.parseInt(str);
                    str = "";
                    j++;
                }
                if (k == addressesAndMask[i].length() - 1) {
                    binaryNum[i][j] = Integer.parseInt(str);
                    str = "";
                    j=0;
                }
            }
        }
        return binaryNum;
    }

    public boolean checkAddresses(){
        int[][] binaryNum = convertAddress();
        int[][] result = new int[2][4];
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                result[i][j]=binaryNum[i][j]&binaryNum[2][j];
            }
        }
        for(int j=0;j<4;j++){
            if (result[0][j]!=result[1][j]) return false;
        }
        return true;
    }

}
