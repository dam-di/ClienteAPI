/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Rafa
 */
public class MyRequest {
    private String route;
    private String method;
    private Object data;

    public MyRequest(String route, String method, Object data) {
        this.route = route;
        this.method = method;
        this.data = data;
    }

    public String getRoute() {
        return route;
    }

    public String getMethod() {
        return method;
    }

    public Object getData() {
        return data;
    }
}
