package com.example.flight.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.entity.Flight;
import com.example.flight.entity.User;
import com.example.flight.exception.InvalidUserException;
import com.example.flight.exception.NoAvailableFlightException;
import com.example.flight.service.FlightService;



@RestController
public class ServiceController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/flightList")
    public List<Flight> getList()
    {
        return flightService.getList();
    }

@GetMapping("/flights/search/{depart}/{arival}")
    public List<Flight> getAllFlight(@PathVariable String depart, @PathVariable String arival) throws NoAvailableFlightException
    {
        List<Flight> list = flightService.getAllFlight(depart, arival);
        if(list.isEmpty()){
            throw new NoAvailableFlightException("Flight is not available.Sorry For inconvenience");
        }else{
            return list;
        }
    }

    @PostMapping("/flights/book/{flightNo}")
    public Flight bookFlight(@PathVariable long flightNo, @RequestBody User user) throws InvalidUserException, NoAvailableFlightException
    {
        if(user.getName() == null || user.getFlightNo() == 0)
        {
            throw new InvalidUserException("Invalid user.");
        }else{
            return flightService.bookTicket(flightNo, user);
        }
    }

    @GetMapping("/userList")
    public List<User> getUserList()
    {
        return flightService.userList();
    }
}
