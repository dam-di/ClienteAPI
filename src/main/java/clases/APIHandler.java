/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Rafa
 */
public class APIHandler {
    private static final String URL = "http://localhost:5000";
    
    public static MyResponse EjecutarConsulta(MyRequest myRequest){
        MyResponse myResponse = new MyResponse();
        ObjectMapper mapper = new ObjectMapper();
        //mapper.setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_SNAKE_CASE);
        String urlAPI = URL + myRequest.getRoute();
        
        try{
            
            String jsonRequest = mapper.writeValueAsString(myRequest);
            System.out.println("jsonRequest"+jsonRequest);
            HttpClient client = new DefaultHttpClient();
            StringEntity se = new StringEntity(jsonRequest);

            HttpPost method = new HttpPost(urlAPI);
            method.setEntity(se);
            se.setContentType(new BasicHeader("Content-Type", "application/json"));
            HttpResponse response = client.execute(method);

            /*Checking response */
            if (response != null) {
                //InputStream in = response.getEntity().getContent(); //Get the data in the entity
                String responseString = EntityUtils.toString(response.getEntity());
                System.out.println("La respuesta que recibo de la API: "+responseString);
                myResponse = new ObjectMapper().readValue(responseString, MyResponse.class);
                       
            }
        }catch(Exception e){
        
        }  
        
        return myResponse;
    }
    
}
