/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.uscourts.ao.cmso.cmecf.lib;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MarkBuck
 */
@Schema(description = "Class representing the asset returned from the inside server.")
public class RTPBeamResponse implements Serializable {
        
    @Schema(description = "asset content, base64 encoded if binary asset.", example = "This page is reserved for the court's public calendar information link.")
    private String content;
    @Schema(description = "HTTP status.", example = "200")
    private int status;
    @Schema(description = "HTTP response headers.", example = "{\"Server\":[\"Apache\"],\"vary\":[\"Origin\"],\"Connection\":[\"close\"],\"Pragma\":[\"No-cache\"],\"Date\":[\"Tue, 09 Jun 2020 18:45:19 GMT\"],\"Access-Control-Expose-Headers\":[\"Access-Control-Allow-Origin,Access-Control-Allow-Credentials\"],\"Cache-Control\":[\"no-store\",\"no-cache, max-age=0\"],\"Access-Control-Allow-Credentials\":[\"true\"],\"Set-Cookie\":[\"JSESSIONID=8E71F49466155D3E6DA0DB5D0449EB70; Path=/cmecf; Secure\"],\"Expires\":[\"Tue, 09 Jun 2020 18:45:19 GMT\"],\"Content-Length\":[\"883\"],\"Content-Type\":[\"text/html; charset=UTF-8\"]}")
    private Map<String, List<String>> headers;

    /**
     * Get the value of headers
     *
     * @return the value of headers
     */
    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    /**
     * Set the value of headers
     *
     * @param headers new value of headers
     */
    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}

