package badcoin;


public class Main{

    public static void main(String [] args){
        String name = "Daniel Tsarev";
        System.out.println(name);
        Hash h = new Hash("SHA-256");
        System.out.println(Hash.strToHexHash(name));
//        Hash h = new Hash("SHA-256");
//
//        byte [] hash = h.strToHash(name);
//        System.out.println(h.bytesToHex(hash));
//
//        System.out.println(h.strToHexHash(name));
//        Block b = new Block("My name jeff");

//        Wallet w = new Wallet();
//        String sign = w.signString(name);
    }

}
