package com.javarush.test.level21.lesson02.task01;

/* Определяем адрес сети
1) Даны IP-адрес и маска подсети, необходимо вычислить адрес сети - метод getNetAddress.
Используйте операцию поразрядной конъюнкции (логическое И).
Пример:
IP-адрес:       11000000 10101000 00000001 00000010 (192.168.1.2)
Маска подсети:  11111111 11111111 11111110 00000000 (255.255.254.0)
Адрес сети:     11000000 10101000 00000000 00000000 (192.168.0.0)
2) Реализовать метод print, который выведет в консоль данные в двоичном коде
3) Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        int lenIp = ip.length;
        int lenMask = mask.length;
        byte[] netAddress = new byte[4];
        byte a, b;
        int c;
        if (lenIp != 4 && lenMask != 4) {
            System.out.println("Fault!!!");
        } else {
            for (int i = 0; i < lenIp; i++) {
                a = ip[i];
                b = mask[i];
                c = (byte) a & b;
                netAddress[i] = (byte) c;
            }
        }
        return netAddress;
    }

    public static void print(byte[] bytes) {
        int len = bytes.length;
        String a;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i++) {
            a = Integer.toBinaryString(bytes[i]);
            if (a.length() < 8) {
                for (int j = 0; j < 8 - a.length(); j++) {
                    str.append("0");
                }
                str.append(a);
            } else {
                str.append(Integer.toBinaryString(bytes[i]).substring(24,32));
            }
            str.append(" ");
        }
        System.out.println(str);
    }
}
