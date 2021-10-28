package ru.netology.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.manager.TicketManager;
import ru.netology.repository.TicketRepository;

import static org.junit.jupiter.api.Assertions.*;

public class TicketManagerTest {
    Ticket t1 = new Ticket(1, 100, "DME", "IST", 320);
    Ticket t2 = new Ticket(2, 150, "DME", "BKK", 660);
    Ticket t3 = new Ticket(3,  120, "SVO", "DOH", 360);
    Ticket t4 = new Ticket(4, 200, "SVO", "JFK", 700);
    Ticket t5 = new Ticket(5, 145, "DME", "BKK", 660);

    TicketManager manager = new TicketManager(new TicketRepository());

    //метод добавления этих продуктов перед каждым тестом
    @BeforeEach
    public void setUp() {
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
    }

    @Test
    public void shouldSearchSortedDmeBkk() {
        Ticket[] expected = new Ticket[]{t5, t2};
        Ticket[] actual = manager.search("DME", "BKK");
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchTicket() {
        Ticket[] expected = new Ticket[]{t3};
        Ticket[] actual = manager.search("SVO","DOH");
        assertArrayEquals(expected, actual);
    }
}
