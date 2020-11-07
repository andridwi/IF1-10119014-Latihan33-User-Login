package if1.pkg10119014.latihan33.user.login;



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */

public class IF110119014Latihan33UserLogin {    
private static String userName;
private static String passWord;
private static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Masukan Username = ");
    userName = scanner.next();
    System.out.print("Masukan password = ");
    passWord = scanner.next();
    
    User user = new User();
    User.pengecekanLogin(userName, passWord);

    }
}