package com.ug11.soal1;

public class EmailException extends UserException{
    private String email;
    private String formatemail;

    public String formatemail{
        int formatemail = email "@ukdw.com";
    }

    public String email{
        if (email != formatemail){
            System.out.println( "format email tidak valid" );
        }
    }
}
