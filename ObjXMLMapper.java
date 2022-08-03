package com.jaxb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class ObjXMLMapper {
    private static final String FILE_NAME = "userinfo.xml";
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;
    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }
    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }
    // Converting object graph to XML (marshalling)
    public void objToXML() throws IOException, JAXBException {
        // call to get object graph
       UserListContainer userList = getUsers();
        try (FileOutputStream os = new FileOutputStream(FILE_NAME)) {            
            this.marshaller.marshal(userList, new StreamResult(os));        
        } 
    }
   // Converting XML to an object graph (unmarshalling) 
    public void XMLToObj() throws IOException, JAXBException {
       UserListContainer userList = new UserListContainer();
       System.out.println("Reading from the generated xml");
        try (FileInputStream is = new FileInputStream(FILE_NAME)) {            
            userList = (UserListContainer)this.unmarshaller.unmarshal(new StreamSource(is));        
        } 
        userList.getUserList().forEach(System.out::println);
    }
    
    public UserListContainer getUsers(){
        List<User> users = getListOfUsers();
        UserListContainer userList = new UserListContainer();
        userList.setUserList(users);
        return userList;
    }
    // Dummy method for adding List of Users
    private List<User> getListOfUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Jack", "Reacher", "abc@xyz.com"));
        users.add(new User(2, "Remington", "Steele", "rs@cbd.com"));
        users.add(new User(3, "Jonathan", "Raven", "jr@sn.com"));
        return users;
    }
}