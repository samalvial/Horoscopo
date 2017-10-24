package com.example.sebastianmunozalvial.horoscopo;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sebastianmunozalvial on 23-10-17.
 */

public class usuario implements Parcelable {

    private String nombre;
    private String email;
    private String pass;

    public usuario() {
    }

    public usuario(String nombre, String email, String pass) {
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    protected usuario(Parcel in) {
        nombre = in.readString();
        email = in.readString();
        pass = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(email);
        dest.writeString(pass);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<usuario> CREATOR = new Parcelable.Creator<usuario>() {
        @Override
        public usuario createFromParcel(Parcel in) {
            return new usuario(in);
        }

        @Override
        public usuario[] newArray(int size) {
            return new usuario[size];
        }
    };
}
