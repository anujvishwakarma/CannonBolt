package com.example.cadmus.cannonBolt.Controller.UserController;

import com.example.cadmus.cannonBoltUtility.GenericResponse;
import com.example.cadmus.cannonBolt.DaoLayer.UserRepository;
import com.example.cadmus.cannonBolt.Model.Address;
import com.example.cadmus.cannonBolt.Model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<GenericResponse> createUser(@RequestBody User user) throws JsonProcessingException {
        userRepository.save(user);
        return new ResponseEntity<GenericResponse>(
                new GenericResponse(user, "UserCreated", HttpStatus.CREATED.getReasonPhrase()),
                HttpStatus.OK);
    }

    @PostMapping(value = "/get", produces = "application/json")
    @ResponseBody
    public ResponseEntity<GenericResponse> getUser(@RequestParam int id) throws JsonProcessingException {
        Optional<User> user = userRepository.findById(id);
        return new ResponseEntity<GenericResponse>(
                new GenericResponse(user.get(), "UserCreated", HttpStatus.CREATED.getReasonPhrase()),
                HttpStatus.OK);
    }

    @PostMapping("/address")
    public String addAddress(){
        Optional<User> user = userRepository.findById(6);
        Address address = new Address();
        address.setUserId(user.get().getId());
        address.setAddress1("Mahant Shivala");
        address.setAddress2("Hedg");
        List<Address> addressList = user.get().getAddressList();
        addressList.add(address);
        user.get().setAddressList(addressList);
        userRepository.save(user.get());
        return "Created";
    }
}
