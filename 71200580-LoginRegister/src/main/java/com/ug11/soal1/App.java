package com.ug11.soal1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )throws  PasswordException, UsernameException, EmailException, LoginException, UserException;

    {
        System.out.println( "Selamat Datang di Toko Tasya" );
        System.out.println( "Silakan daftarkan diri kamu untuk dapat mengakses menu di Toko Tasya" );

        while (true){
            Scanner user = new Scanner(System.in);
            System.out.println("Username: ");
            String username = user.nextLine();
            try{
                if (username.isEmpty()){
//                    throw new UsernameException(1);
                }else if (username.length()<5){
//                    throw new UsernameException(2);
                    System.out.println("Maaf, username minimal harus terdiri dari 6 karakter");
                }
                break;
//            }catch (UsernameException e){
//                System.out.println("Maaf, username minimal harus terdiri dari 6 karakter");
            }
        }
    }
}
