/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Rafa
 */
public class MyResponse {
    public String Data;
    public boolean resultOk;

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public boolean isResultOk() {
        return resultOk;
    }

    public void setResultOk(boolean resultOk) {
        this.resultOk = resultOk;
    }

    public MyResponse() {
    }
}
