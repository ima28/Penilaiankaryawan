package com.example.sistempenilaiankaryawan.Model;

public class nilai {

    public String Email;
    public String Pass;

    public nilai (String email, String pass) {
        this.Email = Email;
        this.Pass = Pass;
    }

    public String getNama() {
        return Email;
    }

    public void setNama(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Pass;
    }

    public void setPassword(String password) {
        this.Pass = password;
    }
}
