package id.ukdw.srmmobile.data.model.api.request;

import lombok.Data;

@Data
public class SignupRequest {

    private String serverAuthCode;
    private String nomorInduk;
    private String provider;
    private String role;
    private String idToken;


    public SignupRequest(String provider, String idToken, String authCode) {
        this.provider=provider;
        this.idToken=idToken;
        this.serverAuthCode= authCode;
    }

    public SignupRequest(String provider, String authCode, String nomorInduk, String role) {
        this.provider=provider;
        this.serverAuthCode= authCode;
        this.nomorInduk = nomorInduk;
        this.role=role;

    }
}
