/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getstream;

/**
 *
 * @author haris
 */
public class GetData {
    private String URL;
    private String FileName;
    private String AudioLocation;
    
    
    public GetData(String url, String filename, String audiolocation){
        this.URL = url;
        this.FileName = filename;
        this.AudioLocation = audiolocation;
    }
    public String getURL(){
        return URL;
    }
    public String getFileName(){
        return FileName; 
    }
    public String getAudioLocation(){
        return AudioLocation;
    }
   
}
