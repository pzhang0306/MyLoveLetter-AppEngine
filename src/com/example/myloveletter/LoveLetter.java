/* Copyright (c) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.myloveletter;

import java.util.Date;

import com.google.appengine.api.datastore.Key;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoveLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Key key;
    private String content;
    private String sender;
    private String receiver;
    private Date loveLetterDate;
    
    public Key getKey() {
        return key;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String Content) {
        this.content = Content;
    }

    public String getSender() {
        return sender;
    }
    public void setSender(String Sender) {
        this.sender = Sender;
    }

    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String Receiver) {
        this.receiver = Receiver;
    }
    
    public Date getLoveLetterDate() {
        return loveLetterDate;
    }
    public void setLoveLetterDate(Date date) {
    	this.loveLetterDate = date;
    }
}

