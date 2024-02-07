package com.example.flight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.flight.entity.Flight;
import com.example.flight.entity.User;
import com.example.flight.exception.NoAvailableFlightException;

@Service
public class FlightService {
    public static List<Flight> flightList = new ArrayList<>();
    public static List<User> userList = new ArrayList<>();

    static{
        flightList.add(new Flight(101,"Kolkata","Mumbai","12/2/2014",2));
        flightList.add(new Flight(102,"Kolkata","delhi","12/2/2014",1));
        flightList.add(new Flight(103,"Malda","Mumbai","12/2/2014",1));
        flightList.add(new Flight(104,"Delhi","Mumbai","12/2/2014",1));
        flightList.add(new Flight(105,"Jainagar","Mumbai","12/2/2014",1));
    }

    public List<Flight> getList()
    {
        return flightList;
    }


    public List<Flight> getAllFlight(String depart, String arival)
    {
        List<Flight> avaFlights = new ArrayList<>();
        for(Flight flight : flightList)
        {
            if(flight.getDeparture().equals(depart) && flight.getArival().equals(arival))
            {
                avaFlights.add(flight);
            }
        }
        return avaFlights;
    }

    public Flight bookTicket(long flightNo, User user) throws NoAvailableFlightException
    {
        for(Flight flight : flightList)
        {
            if(flight.getFlightNo() == flightNo)
            {
                if(flight.getSetsAvailable() == 0)
                {
                    throw new NoAvailableFlightException("Sorry sets are not available.");
                }else
                {
                    flight.setSetsAvailable(flight.getSetsAvailable() - 1);
                    userList.add(user);
                    return flight;
                }
            }
        }
        throw new NoAvailableFlightException("Sorry Fight is not availavle.");
    }
    
    public List<User> userList()
    {
        return userList;
    }
}

